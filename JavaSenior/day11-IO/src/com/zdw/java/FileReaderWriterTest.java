package com.zdw.java;

import org.junit.Test;

import java.io.*;

/**
 * 一.流的分类
 * 1.操作数据单位:字节流，字节流
 * 2.数据的流向：输入流,输出流
 * 3.流的角色：节点流.处理流
 * <p>
 * 二.流的体现结构
 * 抽象基类             节点流 (或文件流)               缓冲流（处理流的一种）
 * InputStream         FileInputStream              BufferedInputStream
 * OutputStream        FileOutputStream             BufferedOutputStream
 * Reader              FileReader                   BufferedReader
 * writer              FileWriter                   BufferedWriter
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.text"); //相较于当前工程
        System.out.println(file.getAbsoluteFile());
        File file1 = new File("day11-IO\\hello.text");
        System.out.println(file1.getAbsoluteFile());
    }

    /*



     */
    @Test
    public void testFileReader() {
        FileReader fr = null;
        try {
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("hello1.txt"); //相较于当前Module
            //2.提供具体的流
            fr = new FileReader(file);
            //3.数据的读入
            //read() :返回读入的一个字符。如果达到的文件末尾，返回-1
            //方式一
//      int data = fr.read();
//      while (data!=-1){
//         System.out.print((char) data);
//         data =fr.read();
//      }
//      方式二
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 对read() 操作升级: 使用read的重载方法
     */
    @Test
    public void testFileReader1() {
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("hello.txt");
            //2.FileReader流的实例化
            fr = new FileReader(file);
            //3.读入的操作
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                //错误写法
//                for (int i = 0; i < cbuf.length; i++) {
//                    System.out.print(cbuf[i]);
//                }
                //正确写法
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }
//                方式二:
                //错误写法
//                String str =new String(cbuf);
//                System.out.println(str);
                //正确写法
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                //4.资源的关闭
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 内存中写出数据到硬盘的文件里
     */
    @Test
    public void testFIleWriter() throws IOException {
        //1.提供File类的对象，指明写出到的文件
        File file = new File("hello1.txt");
        //2.提供FileWriter的对象用于数据写出
        FileWriter fw = new FileWriter(file, false);
        //3.写出的操作
        fw.write("I hava a dream! \n");
        //4.资源的关闭
        fw.write("you need to hava a fr122eeam!");
        fw.close();
    }

    /**
     *
     */
    @Test
    public void testFileReaderFileWriter() {
        //1.提供File类的对象，指明写出到的文件
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcFile = new File("hello.txt");
            File SrcFile2 = new File("hello2.txt");
            //2.创建输入流和输出的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(SrcFile2);
            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len; //记录每次读入到chaf数组中的字符的个数
            while ((len = fr.read(cbuf)) != -1) {
                //每次写出len个字符
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fr != null)
                        fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
