import abstractFile.AbstractFile;
import concreteFile.Folder;
import concreteFile.ImageFile;
import concreteFile.TextFile;
import concreteFile.VideoFile;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Client4 {

    public static void main(String[] args) {
        AbstractFile obj1, obj2, obj3, obj4, obj5, obj6;

        Folder f1, f2, f3;


        obj1 = new ImageFile();

        obj2 = new TextFile();

        obj3 = new VideoFile();

        f1 = new Folder();

        f1.add(obj1);

        f1.add(obj2);

        f1.add(obj3);


        obj4 = new ImageFile();

        obj5 = new ImageFile();

        f2 = new Folder();

        f2.add(obj4);

        f2.add(obj5);


        obj6 = new VideoFile();

        f3 = new Folder();

        f3.add(f1);

        f3.add(f2);

        f3.add(obj6);


        f3.display();
    }
}
