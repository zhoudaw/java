package com.zdw.java2;

//import org.junit.Test;

/**
 * 获取两个字符串中最大相同的子串，
 * str1 ="abcwerthelloyuiodef" str2 ="cvhellobnm"
 * :将短的那个串进行长度依次递减的子串与比较长的串比较
 *
 */
public class StringDemo2 {
//    public String getMaxSameString(String str1,String str2){
//        if(str1!=null && str2!=null){
//            String maxStr =(str1.length()>= str2.length())?str1:str2;
//            String minStr =(str1.length()<str2.length())?str1:str2;
//            int length =minStr.length();
//            for (int i=0;i<length;i++){
//                for (int x=0,y=length-i;y<=length;x++,y++){
//                    String subStr=  minStr.substring(x,y);
//                    if(maxStr.contains(minStr)){
//                        return  subStr;
//                    }
//                }
//            }
//        }
//        return null;
//    }
//    @Test
//    public void testGetMaxSameString(){
//        String str1="abcwerthelloyuiodef";
//        String str2="cvhellobnm";
//        String str= getMaxSameString(str1,str2);
//        System.out.println(str);
//    }
}
