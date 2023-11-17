package org.example;

import java.security.cert.CertStore;

public class Main {
    public static void main(String[] args) {
        //перехватываем и обрабатываем исключения в разных блоках catch
        try {
            ...
        } catch (ExceptionType1 e) {
            handleException(e);
        } catch (ExceptionType2 e) {
            handleException(e);
        }
        try {
            ...
        } catch (ExceptionType1 | ExceptionType2) {
            handleException(e);
        }
    }
}