package io;

import java.io.*;

public class EX05 {
    public static void main(String[] args) throws Exception{

        OutputStream os = System.out;

        OutputStreamWriter osw = new OutputStreamWriter(os);
        //  2byte 처리 스트림
        //  OutbutStream 보다 향상된 처리 스트림

        osw.write(44032);   // 가
        osw.flush();

        osw.write("Hello World!!!");
        osw.flush();


    }
}
