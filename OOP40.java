package BIT01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OOP40 {
	public static void main(String[] args) {
        JFrame f=new JFrame("GAME");
        f.setSize(300, 300);
        f.setLocation(500, 400);
        
        JButton b=new JButton("클릭");
        
        JButton b1=new JButton("클릭");
        TextArea ta=new TextArea(10, 30);
        
        Container c=f.getContentPane();
        c.add(b, BorderLayout.NORTH);
        
        c.add(b1, BorderLayout.SOUTH);
        c.add(ta, BorderLayout.CENTER);
        
        f.setVisible(true);
	}
}
/*
 프로그램에서 동작,기능을 만들려면 : 함수(function:기능) < 메서드(method:방법)
 - 메서드(행위,동작)를 만드는 방법
 + 형식(머리:프로토타입,원형,정의부 + 몸:바디,구현부)
 
      ①       ②     ③       ④        ⑤ 
    접근제어자 [한정자] 리턴타입 메서드이름(매개변수리스트){
    
        ⑥ 구현부   
        
        ⑦ 리턴여부  return 10; 
   }
      
   ① 접근제어자 : public(허용★), private(막는다), protected, default
   ② 한정자(제한을 두는것) : static, final
   ③ 리턴타입 : 메서드가 동작한 후에 만들어내는 결과값의 자료형(데이터 타입)
                  메서드가 동작한 후에 데이터를 리턴하는 타입 
                  메서드가 리턴을 하지 않는경우 --> void      
   ④ 메서드이름 : 동작을 알아볼수있도록 이름을 만들면 된다. 
   ⑤ 매개변수리스트 : 메서드가 외부로부터 데이터를 받을때 사용하는 부분
*/