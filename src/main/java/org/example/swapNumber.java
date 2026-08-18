package org.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.*;

public class swapNumber {

    public static void main(String[] args) throws IOException {

//      //------------------------------------------------- SwapNumber
        int a = 10, b = 20;
        System.out.println(a + " and " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " and " + b);

    }
}