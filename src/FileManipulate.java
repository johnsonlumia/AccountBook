import java.io.*;

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
 *
 * @author Renjie Zhu
 * @version 0.0
 * @since 7/19/17
 */

class FileManipulate {

    private String information = "";

    private String message = "";

    private String path = "";

    private String filename = "";

    /**
     * constructor
     *
     * When new objects of FileManipulate is created,
     * a new file is created accordingly.
     *
     * Default constructor
     */

    FileManipulate() {
        setMessage("no message");
        setPath("/Users/renjiezhu/Desktop/");
        setFilename("default.txt");
        newFile(getMessage(), getPath(), getFilename());
    }

    /**
     * constructor
     *
     * When new objects of FileManipulate is created,
     * a new file is created accordingly.
     *
     * @param message new object with a single message at default *filepath*
     */

    FileManipulate(String message) {
        setMessage(message);
        setPath("/Users/renjiezhu/Desktop/");
        setFilename("default2.txt");
        newFile(getMessage(), getPath(), getFilename());
    }

    /**
     * constructor
     *
     * When new objects of FileManipulate is created,
     * a new file is created accordingly.
     *
     * @param message new object with a single message
     * @param path path of the created file
     * @param filename filename of the created file
     */

    FileManipulate(String message, String path, String filename) {
        setMessage(message);
        setPath(path);
        setFilename(filename);
        newFile(getMessage(), getPath(), getFilename());
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

    protected String getInformation() {
        return information;
    }

    protected void setInformation(String information) {
        this.information = information;
    }

    /**
     * create a new file and write basics
     *
     * a private method called only by constructors when new objects are created.
     *
     * @param message new object with a single message
     * @param path path of the created file
     * @param filename filename of the created file
     */
    private void newFile(String message, String path, String filename) {
        String filepath = path + filename;

        try {
            File writeFile = new File(filepath);
            boolean isCreated = writeFile.createNewFile();
            if (isCreated) {
                System.out.println("New file created at: " + filepath);
            }
            BufferedWriter out = new BufferedWriter(new FileWriter(writeFile));
            out.write(message);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    protected void writeFile() {
        String filepath = getPath() + getFilename();

        try {
            File writeFile = new File(filepath);
            BufferedWriter out = new BufferedWriter(new FileWriter(writeFile, true));
            out.append(getMessage());
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // read the file after it is written to refresh the content in information
        readFile();
    }

    protected void readFile() {
        String filepath = getPath() + getFilename();

        // store the content of the file in the field information
    }

    @Override
    public String toString() {
        return "Message written at" + getPath() + getFilename();
    }
}
