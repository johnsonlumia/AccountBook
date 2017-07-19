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
                file = new FileManipulate("Hello World"),
                file2 = new FileManipulate(),
                file3 = new FileManipulate("test", "/Users/renjiezhu/Desktop/", "default3.txt");

        file.setMessage("go ahead and append");
        file.writeFile();
    }
}
