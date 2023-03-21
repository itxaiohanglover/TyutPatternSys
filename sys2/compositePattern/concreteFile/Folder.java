package concreteFile;

import abstractFile.AbstractFile;

import java.util.ArrayList;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Folder extends AbstractFile {

    private ArrayList arrayList = new ArrayList();


    public void add(AbstractFile abstractFile) {

        arrayList.add(abstractFile);

    }


    public void remove(AbstractFile abstractFile) {

        arrayList.remove(abstractFile);

    }


    @Override
    public void display() {

        for (Object object : arrayList) {

            ((AbstractFile) object).display();

        }

    }
}
