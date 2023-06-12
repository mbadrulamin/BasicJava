package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("src/Test.txt");

        try(FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }




//        try(FileInputStream fileInputStream = new FileInputStream(file)) {
//
//            System.out.println("Total size to read in byte is: " + fileInputStream.available());
//
//            int content;
//            while((content = fileInputStream.read()) != -1){
//                //convert to char and display it
//                System.out.print((char) content);
//            }
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//
//        byte data[] = new byte[11];
//
//        System.out.println("Enter some characters: ");
//        System.in.read(data);
//        System.out.println("You entered: ");
//
//        for(int i = 0; i < data.length; i++){
//            System.out.print((char)data[i]);
//        }

    }
}
