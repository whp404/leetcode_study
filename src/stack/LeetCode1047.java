package stack;

import javax.xml.stream.events.Characters;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LeetCode1047 {

    public static  String removeDuplicates(String s) {
        Deque stack = new ArrayDeque();
        for (int i = 0; i < s.length(); i++) {
            Character t = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(t);
            }else{

                //注意这个peek 分不清peek 具体含义
                if(stack.peek().equals(t)){
                    stack.pop();
                }else{
                    stack.push(t);
                }
            }
        }
        System.out.println(stack.toString());
        StringBuffer sbd = new StringBuffer("");
        //想要避免翻转 拼接的时候注意下！！！
        while(!stack.isEmpty()){
            sbd.append(stack.poll());
        }
        //还要注意翻转！！！
        return sbd.reverse().toString();

    }


}
