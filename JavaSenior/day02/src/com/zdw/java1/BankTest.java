//package com.zdw.java1;
//
//public class BankTest {
//    public static void main(String[] args) {
//
//    }
//}
//
//class Bank {
//    private Bank() {
//    }
//
//    private static Bank instancs = null;
//
//    public static Bank getInstance() {
////        方式一：效率稍差
////        synchronized (Bank.class) {
////            if (instancs == null) {
////                instancs = new Bank();
////            }
////            return instancs;
////        }
////        方式二: ：效率稍高
//        if (instancs == null) {
//            synchronized (Bank.class) {
//                if (instancs == null) {
//                    instancs = new Bank();
//                }
//                return instancs;
//            }
//        }
//    }
//}
//
