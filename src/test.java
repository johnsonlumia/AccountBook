/**
 * AccountBook testing main function.
 *
 * just for testing
 *
 * Created by renjiezhu on 7/19/17.
 * @author Renjie Zhu
 * @version 0.0
 *
 */
public class test {
    public static void main(String[] args) {

        FileManipulate
                file = new FileManipulate("Hello World"),
                file2 = new FileManipulate(),
                file3 = new FileManipulate(" ", " ", " ");
        file.newFile(file.getPath(), file.getFilename());
    }
}
