package com.inheritingExceptions;

class SimpleException extends Exception {
    public static class InheritingException {
        public void f() throws SimpleException {
            System.out.println("Бросаем SimpleException из f()");
            System.out.println("Бросаем SimpleException_2 из g()");
            throw new SimpleException();
        }
            public void g() throws SimpleException {
                System.out.println("Бросаем SimpleException_2 из g()");
                throw new SimpleException();
            }
        public static void main(String[] args) {
            InheritingException sed = new InheritingException();
            try {
                sed.f();
                sed.g();
            } catch (SimpleException e) {
                System.out.println("Перехватываем SimpleException!");
                System.out.println("Перехватываем SimpleException_2!");
            }
        }
    }
}