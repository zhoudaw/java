package com.zdw.java;
import org.junit.Test;
import java.io.*;
/**
 * 转换流
 * 1.属于字符流
 * InputStreamReader 将一个字节的输入流转换为字符的输入流
 * OutputStreamWriter 将一个字符的输出流转换为字节的输出流
 * 2.作用：提供字节流与字符流之间的转换
 * <p>
 * 3.解码： 字节，字节数组 --->字符数组 ，字符串
 * 编码： 字符数组，字符串 ---> 字节，字节数组
 * <p>
 * 4.字符集
 */
public class InputStreamReaderTest {
    @Test
    public void test1() {
        InputStreamReader isr = null; //使用系统默认
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
            // 参数2指明字符集，具体使用哪个字符集，取决于文件保存时候的字符集
            isr = new InputStreamReader(fis, "UTF-8");
            char[] cbuf = new char[20];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test2() {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File file1 = new File("hello.txt");
            File file2 = new File("hello_gbk.txt");
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);
            isr = new InputStreamReader(fis, "utf-8");
            osw = new OutputStreamWriter(fos, "gbk");
            char[] cbuf = new char[20];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                osw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
