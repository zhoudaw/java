package com.zdw.java;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 一.流的分类
 * 1.操作数据单位:字节流，字节流
 * 2.数据的流向：输入流,输出流
 * 3.流的角色：节点流.处理流
 *
 * 二.流的体现结构
 * 抽象基类             节点流 (或文件流)               缓冲流（处理流的一种）
 * InputStream         FileInputStream              BufferedInputStream
 * OutputStream        FileOutputStream             BufferedOutputStream
 * Reader              FileReader                   BufferedReader
 * writer              FileWriter                   BufferedWriter
 *
 */
public class FileReaderWriterTest {
   public static void main(String[] args) {
      File file =new File("hello.text"); //相较于当前工程
      System.out.println(file.getAbsoluteFile());
      File file1 =new File("day11-IO\\hello.text");
      System.out.println(file1.getAbsoluteFile());
   }
   /*



    */
   @Test
   public void testFileReader() throws IOException {
      //1.实例化File类的对象，指明要操作的文件
      File file =new File("hello.txt"); //相较于当前Module
      //2.提供具体的流
      FileReader fr= new FileReader(file);
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
      while ((data = fr.read())!=-1){
         System.out.print((char) data);
      }
      //4.流的关闭操作
      fr.close();
   }
}
