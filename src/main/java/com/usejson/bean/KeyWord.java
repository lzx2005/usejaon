package com.usejson.bean;

/**
 * Created by Administrator on 2016/12/24 0024.
 */
public class KeyWord {
    public final static int leftBrace = (int)'{';
    public final static int rightBrace = (int)'}';
    public final static int leftBracket = (int)'[';
    public final static int rightBracket = (int)']';
    public final static int doubleQuotationMarks = (int)'"';
    public final static int quotationMarks = (int)'\'';
    public final static int colon = (int)':';
    public final static int space = (int)' ';
    public static void main(String[] args) {
        System.out.println(leftBrace);
        System.out.println(rightBrace);
        System.out.println(leftBracket);
        System.out.println(rightBracket);
        System.out.println(doubleQuotationMarks);
        System.out.println(quotationMarks);
        System.out.println(colon);
        System.out.println(space);
    }
}
