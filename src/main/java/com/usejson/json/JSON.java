package com.usejson.json;

import com.usejson.bean.KeyWord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiZhengxian on 2016/12/24 0024.
 */
public class JSON {
    private String text;
    private char[] ch;

    private List<JSONObject> jsonObjectList;
    private List<JSONArray> jsonArrayList;
    public void parseJson(String text){
        this.text = text;
        this.ch = text.toCharArray();
        this.jsonObjectList = new ArrayList<>();
        read(this.ch,0,ch.length-1);
    }

    //递归
    private void read(char[] chars,int start,int end){
        char ch = chars[0];
        switch ((int)ch){
            case KeyWord.leftBrace:
                if(chars[chars.length-1]!=KeyWord.rightBrace){
                    throw new RuntimeException("need '}' to end a jsonObect");
                }
                //开始一个新的JSONObect
                startReadObject(chars,start+1,end-1);
                break;
            case KeyWord.rightBrace:
                //结束一个JSONObect
                break;
            case KeyWord.leftBracket:
                //开始一个JSONArray
                break;
            case KeyWord.rightBracket:
                //结束一个JSONArray
                break;
            default:
                //普通字符
        }
    }

    private void startReadObject(char[] chars, int start, int end) {
        //skip space
        for(;;){
            if(chars[start]!=KeyWord.space){
                break;
            }
            start++;
        }

    }

    private void parseArray(JSONArray jsonArray) {
    }

    private void parseObject(JSONObject jsonObject) {
        for(;;){

        }
    }

    private void next(){
    }
}
