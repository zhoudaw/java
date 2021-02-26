package com.zdw.java;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    @Test
    public void test2() throws IOException {
        //创建文件
        RandomAccessFile raf1 =new RandomAccessFile("hello.txt","rw");
        raf1.seek(3);  //将指针调到角标为3的位置
        //添加内容
        raf1.write("sss".getBytes());
        raf1.close();
    }
    /**
     * 使用 RandomAccessFile实现数据的插入效果
     */
    @Test
    public void test3() throws IOException{
        RandomAccessFile raf1 =new RandomAccessFile("hello.txt","rw");
        raf1.seek(3);  //将指针调到角标为3的位置
        //保存指针3后面的数据到 StringBuffer 中
        StringBuffer builder =new StringBuffer( (int)new File("hello.txt").length());
        byte[] buffer =new byte[20];
        int len;
        while ((len=raf1.read(buffer))!=-1){
            builder.append(new String(buffer,0,len));
        }
        //调回指针，写入'qwwert‘
        raf1.seek(10);
        raf1.write("qwwert".getBytes());
        //将StringBuilder 中的数据吸入到文件中
        raf1.write(builder.toString().getBytes());
        raf1.close();

    }
}
