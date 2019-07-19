package cn.xiaohuodui;

public class TestDay {
    public static void main(String[] args){
        for (Day day:Day.values()) {
            System.out.println("name:"+day.name()+
                    ",desc:"+day.toString());
        }
    }
}
