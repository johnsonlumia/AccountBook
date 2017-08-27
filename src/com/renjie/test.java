package com.renjie;

/**
 * AccountBook testing main function.
 *
 * just for testing
 *
 *
 * @author Renjie Zhu
 * @version 0.0
 * @since 7/19/17
 */
public class test {
    public static void main(String[] args) {

        FileManipulate
                file1 = new FileManipulate("Hello World");
//                file2 = new com.renjie.FileManipulate(),
//                file3 = new com.renjie.FileManipulate("com.renjie.test", "/Users/renjiezhu/Desktop/", "default3.txt");
//
//        file3.setMessage("go ahead and append");
//        file3.writeFile();

        Event event1 = new Event();
        file1.setMessage(event1.toString());
        file1.writeFile();
    }
}
