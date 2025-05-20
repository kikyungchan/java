package ch15.lecture.p03map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        //map:entry(key,value)를 저장
        // 중복된 key 를 저장할 수 없음
        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("아침", "베이글");
        map.put("점심", "제육");
        map.put("저녁", "돈까스");
        map.put("저녁", "감자탕");// value 덮어씀
        System.out.println("map = " + map);
        //몇 개의 entry가 있는 지
        int size = map.size();
        System.out.println("size =" + size);
        boolean empty = map.isEmpty();
        System.out.println("empty = " + empty);

        // key가 있는 지 확인
        boolean b = map.containsKey("아침");
        System.out.println("b = " + b);
        boolean b1 = map.containsKey("간식");
        System.out.println("b1 = " + b1);

        //key로 value 얻기
        String v1 = map.get("아침");
        System.out.println("v1 = " + v1);
        String s = map.get("점심");
        System.out.println("s = " + s);
        String s1 = map.get("간식");
        System.out.println("s1 = " + s1);
        //key집합(set ) 얻기
        Set<String> strings = map.keySet();
        System.out.println("strings = " + strings);

        // entry 삭제
        String remove = map.remove("저녁");//지운 밸류 ㄹ턴
        System.out.println("map = " + map);
        System.out.println("remove = " + remove);
        String remove1 = map.remove("간식");
        System.out.println("remove1 = " + remove1);

        //value 들 얻기
        map.put("저녁", "베이글");
        Collection<String> values = map.values();
        System.out.println("values = " + values);

    }
}
