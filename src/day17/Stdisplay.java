package day17;

import java.util.ArrayList;
import java.util.Scanner;
public class Stdisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<StInfo> arr = new ArrayList<StInfo>();
        String name;
        int age;
        /*
        ArrayList<String> str = new ArrayList<String>();
        String s = "Test";
        str.add(s);
        StInfo st = new StInfo();
        arr.add(st);
        arr.add(s);
        */
        while(true) {
                System.out.println("1.등록 2.확인");
                int num = input.nextInt();
                switch(num) {
                case 1:
                        StInfo s = new StInfo();
                        System.out.println("이름 입력");
                        name = input.next();
                        System.out.println("나이 입력");
                        age = input.nextInt();
                        
                        s.setAge(age); s.setName(name);
                        
                        arr.add(s);
                        System.out.println("등록 되었습니다");
                        break;
                case 2:
                        for(int i=0; i < arr.size() ; i++) {
                                StInfo ss = arr.get(i);
                                System.out.println("이름 : "+ss.getName());
                                System.out.println("나이 : "+ss.getAge());
                                System.out.println("--------------------");
                        }
                        break;
                }
        }
}
}





