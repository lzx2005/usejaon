package com.usejson.test;

/**
 * Created by Administrator on 2016/12/24 0024.
 */
public class Test {
    public static void main(String[] args) {
        String json =   "{\n" +
                        "    \"title\": \"Design Patterns\",\n" +
                        "    \"subtitle\": \"Elements of Reusable Object-Oriented Software\",\n" +
                        "    \"author\": [\n" +
                        "        \"Erich Gamma\",\n" +
                        "        \"Richard Helm\",\n" +
                        "        \"Ralph Johnson\",\n" +
                        "        \"John Vlissides\"\n" +
                        "    ],\n" +
                        "    \"year\": 2009,\n" +
                        "    \"weight\": 1.8,\n" +
                        "    \"hardcover\": true,\n" +
                        "    \"publisher\": {\n" +
                        "        \"Company\": \"Pearson Education\",\n" +
                        "        \"Country\": \"India\"\n" +
                        "    },\n" +
                        "    \"website\": null\n" +
                        "}\n" +
                        "\n";
        char[] s = json.toCharArray();
        for(int i=0;i<s.length;i++){
            System.out.println(i+"--->"+s[i]+"--->"+(int)s[i]);
        }
    }
}
