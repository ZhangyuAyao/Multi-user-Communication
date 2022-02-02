package com.hspedu.qqclient.view.utils;

import java.util.Scanner;

/**
 * @author Zhang Yu
 * @version 1.0
 */
public class Utility {
    public static String readString(int type) {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
