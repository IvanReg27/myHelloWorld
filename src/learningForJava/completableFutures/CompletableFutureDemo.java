package learningForJava.completableFutures;

import java.awt.image.*;
import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.imageio.*;

public class CompletableFutureDemo {
    private static final Pattern IMG_PATTERN =
    Pattern.compile("[<]\\s*[iI][mM][gG]"
            + "\\s*[^>]*[sS][rR][cC]"
            + "\\s*[=]\\s*['\"]"
            + "([^'\"]*)['\"][^>]*[>]");
    private ExecutorService executor = Executors.newCachedThreadPool();
    private URL urlToProcess;

    public CompletableFuture<String> readPage(URL url) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                var countents = new String(url.openStream().readAllBytes(), StandardCharsets.UTF_8);
                System.out.println("Read page from " + url);
                return countents;
                }
            catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }, executor);
    }
    public List<URL> getImageURLs(String webpage) {
        try {
            var result = new ArrayList<URL>();
            Matcher matcher = IMG_PATTERN.matcher(webpage);
            while (matcher.find()) {
                var url = new URL(urlToProcess, matcher.group(1));
                result.add(url);
            }
            System.out.println("Found URLs: " + result);
            return result;
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
    public CompletableFuture<List<BufferedImage>>
    getImage(List<URL> urls) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                var result = new ArrayList<BufferedImage>();
                for (URL url : urls) {
                    result.add(ImageIO.read(url));
                    System.out.println("Loaded " + url);
                }
                return result;
            }
            catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }, executor);
    }
    public void saveImage(List<BufferedImage> images) {
        System.out.println("Saving " + images.size() + " images");
        try {
            for (int i = 0; i < images.size(); i++) {
                String filename = "/tmp/image" + (i + 1) + ".png";
                ImageIO.write(images.get(i), "PNG", new File(filename));
            }
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        executor.shutdown();
    }
    public void run(URL url)
        throws IOException, InterruptedException {
        urlToProcess = url;
        CompletableFuture.completedFuture(url)
                .thenComposeAsync(this::readPage, executor)
                .thenApply(this::getImageURLs)
                .thenCompose(this::getImage)
                .thenAccept(this::saveImage);
    }
    public static void main(String[] args)
        throws IOException, InterruptedException {
        new CompletableFutureDemo().run(new URL("https://www.traektoria.ru/"));
    }
}