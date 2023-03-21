package concreteFile;

import abstractFile.AbstractFile;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class TextFile extends AbstractFile {

    @Override
    public void display(){

        System.out.println("浏览文本文件。");

    }
}
