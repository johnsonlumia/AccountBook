/**
 * File Manipulation class
 *
 * get message printed to a file at *path*
 * in the file *filename*
 *
 * methods:
 * newFile, writeFile, readFile
 *
 * Created by renjiezhu on 7/19/17.
 * @author Renjie Zhu
 * @version 0.0
 */

import java.io.*;

class FileManipulate {

    private String message = "";

    private String path = "";

    private String filename = "";

//    constructor

    FileManipulate() {
        setMessage("no message");
        setPath("/Users/renjiezhu/Desktop/");
        setFilename("default.txt");
    }

    FileManipulate(String message) {
        setMessage(message);
        setPath("/Users/renjiezhu/Desktop/");
        setFilename("default.txt");
    }

    FileManipulate(String message, String path, String filename) {
        setMessage(message);
        setPath(path);
        setFilename(filename);
    }

//    getter and setter

    protected String getMessage() {
        return message;
    }

    protected void setMessage(String message) {
        this.message = message;
    }

    protected String getPath() {
        return path;
    }

    protected void setPath(String path) {
        this.path = path;
    }

    protected String getFilename() {
        return filename;
    }

    protected void setFilename(String filename) {
        this.filename = filename;
    }

//    create a new file and write basics

    protected void newFile(String path, String filename) {
        String filepath = path + filename;

        try{
            File writeFile = new File(filepath);
            boolean isCreated = writeFile.createNewFile();
            if (isCreated) {
                System.out.println("New file created at: " + filepath);
            }
            BufferedWriter out = new BufferedWriter(new FileWriter(writeFile));
            out.write(this.getMessage());
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

//    todo: writeFile and readFile

    protected void writeFile() {

    }

    protected void readFile() {

    }

}
