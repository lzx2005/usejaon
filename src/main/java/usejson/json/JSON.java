package usejson.json;

import com.usejson.bean.KeyWord;

/**
 * Created by LiZhengxian on 2016/12/24 0024.
 */
public class JSON {
    private String text;
    private char[] chars;
    private int index;
    public void parseJson(String text){
        this.text = text;
        this.chars = text.toCharArray();
        this.index = 0;
        read();
    }

    private void read(){
        for(;;){
            char ch = chars[index];
            switch ((int)ch){
                case KeyWord.leftBrace:
                    //开始一个新的JSONObect
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
                case KeyWord.doubleQuotationMarks:
                    //开始一个key或者value
                    break;
                case KeyWord.colon:
                    //key和value的分隔符
                    break;
                case KeyWord.space:
                    //空格需要跳过，或者不处理
                    break;
                default:
                    //普通字符
            }
            index++;
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
