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
        
        JButton b=new JButton("Ŭ��");
        
        JButton b1=new JButton("Ŭ��");
        TextArea ta=new TextArea(10, 30);
        
        Container c=f.getContentPane();
        c.add(b, BorderLayout.NORTH);
        
        c.add(b1, BorderLayout.SOUTH);
        c.add(ta, BorderLayout.CENTER);
        
        f.setVisible(true);
	}
}
/*
 ���α׷����� ����,����� ������� : �Լ�(function:���) < �޼���(method:���)
 - �޼���(����,����)�� ����� ���
 + ����(�Ӹ�:������Ÿ��,����,���Ǻ� + ��:�ٵ�,������)
 
      ��       ��     ��       ��        �� 
    ���������� [������] ����Ÿ�� �޼����̸�(�Ű���������Ʈ){
    
        �� ������   
        
        �� ���Ͽ���  return 10; 
   }
      
   �� ���������� : public(����), private(���´�), protected, default
   �� ������(������ �δ°�) : static, final
   �� ����Ÿ�� : �޼��尡 ������ �Ŀ� ������ ������� �ڷ���(������ Ÿ��)
                  �޼��尡 ������ �Ŀ� �����͸� �����ϴ� Ÿ�� 
                  �޼��尡 ������ ���� �ʴ°�� --> void      
   �� �޼����̸� : ������ �˾ƺ����ֵ��� �̸��� ����� �ȴ�. 
   �� �Ű���������Ʈ : �޼��尡 �ܺηκ��� �����͸� ������ ����ϴ� �κ�
*/