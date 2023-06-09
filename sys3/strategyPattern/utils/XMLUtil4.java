package utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class XMLUtil4 {
    public static Object getBean(){

        try {

            //创建文档对象

            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = dFactory.newDocumentBuilder();

            Document doc;

            doc = builder.parse(new File("sys3/strategyPattern/utils/config.xml"));



            NodeList nl = doc.getElementsByTagName("className");

            Node classNode=nl.item(0).getFirstChild();

            String cName=classNode.getNodeValue();

            //通过类名生成实例对象并将其返回

            Class c=Class.forName(cName);

            Object obj=c.newInstance();

            return obj;

        }catch (Exception e){

            e.printStackTrace();

            return null;

        }

    }

}
