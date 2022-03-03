package com.sinaon.bookseller.util;

/**
 * @Author ksinaon
 * @Created 2/17/2022 4:48 PM
 */
public class MyDebugger {

    public void miDebugger(Object object){

        System.out.println(" |> CLASS: " + object.getClass().getName() +
                "\n |> METHOD: " + Thread.currentThread().getStackTrace()[1].getMethodName() +
                "\n |> LINE: " + Thread.currentThread().getStackTrace()[1].getLineNumber());
    }
}
