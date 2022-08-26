package calculator;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	
	public Calculator(String title) {
		
		//기본 프로그램 설정(제목,크기,위치)
		this.setTitle(title);
		this.setSize(350, 450);
		this.setLocation(800, 280);
		
		//종료(EXIT_ON_CLOSE를 사용, 없으면 작업 프로세스에 남아서 메모리만 차지함.)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panel 선언
		JPanel p_all = new JPanel();
		JPanel p_cal = new JPanel();
		JPanel p_cont = new JPanel();
		
		//폰트 생성
		Font bold = new Font("맑은 고딕", Font.BOLD, 40);
		Font bt_bold = new Font("맑은 고딕", Font.BOLD, 30);
		//색깔 생성
		Color gray = new Color(204,204,204);
		Color white = new Color(255,255,255);
		Color light_blue = new Color(153,153,255);
		//p_all(전체적인 레이아웃) 설정
				this.add(p_all);
				p_all.setLayout(new FlowLayout());
			
				//p_cal 레이아웃
				p_cal.setLayout(new GridLayout(2,1));
				p_cal.setPreferredSize(new Dimension(290,80)); // 레이아웃 크기 설정
				JLabel process = new JLabel("",JLabel.RIGHT);
				JLabel result = new JLabel("0",JLabel.RIGHT);
				p_cal.add(process);
				p_cal.add(result);
				
				//p_cal 레이블 정렬
				process.setAlignmentX(RIGHT_ALIGNMENT);
				result.setAlignmentX(RIGHT_ALIGNMENT);
				
				//p_cal 폰트 적용
				result.setFont(bold);
				
				//p_cal 색상 적용
				process.setForeground(Color.gray);
				
				//p_cont 레이아웃
				p_cont.setLayout(new GridLayout(6,4));
				p_cont.setPreferredSize(new Dimension(290,300));
				
				//p_cont 1번줄
				JButton rem = new JButton("%");
				p_cont.add(rem);
				JButton ce = new JButton("CE");
				p_cont.add(ce);
				JButton c = new JButton("C");
				p_cont.add(c);
				JButton b_space = new JButton("←");
				p_cont.add(b_space);
				
				//p_cont 2번줄
				JButton frac = new JButton("¹/x");
				p_cont.add(frac);
				JButton squa = new JButton("x²");
				p_cont.add(squa);
				JButton root = new JButton("²√x");
				p_cont.add(root);
				JButton div = new JButton("÷");
				p_cont.add(div);
				
				//p_cont 3번줄
				JButton seven = new JButton("7");
				p_cont.add(seven);
				JButton eight = new JButton("8");
				p_cont.add(eight);
				JButton nine = new JButton("9");
				p_cont.add(nine);
				JButton mul = new JButton("×");
				p_cont.add(mul);
				
				//p_cont 4번줄
				JButton four = new JButton("4");
				p_cont.add(four);
				JButton five = new JButton("5");
				p_cont.add(five);
				JButton six = new JButton("6");
				p_cont.add(six);
				JButton minus = new JButton("-");
				p_cont.add(minus);
				
				//p_cont 5번줄
				JButton one = new JButton("1");
				p_cont.add(one);
				JButton two = new JButton("2");
				p_cont.add(two);
				JButton three = new JButton("3");
				p_cont.add(three);
				JButton plus = new JButton("+");
				p_cont.add(plus);
						
				//p_cont 6번줄
				JButton sign = new JButton("＋／－");
				p_cont.add(sign);
				JButton zero = new JButton("0");
				p_cont.add(zero);
				JButton point = new JButton(".");
				p_cont.add(point);
				JButton equal = new JButton("=");
				p_cont.add(equal);
				
				//p_cont 폰트 사이즈 설정
				zero.setFont(bt_bold);
				one.setFont(bt_bold);
				two.setFont(bt_bold);
				three.setFont(bt_bold);
				four.setFont(bt_bold);
				five.setFont(bt_bold);
				six.setFont(bt_bold);
				seven.setFont(bt_bold);
				eight.setFont(bt_bold);
				nine.setFont(bt_bold);
				
				//p_cont 버튼 배경색 설정
				rem.setBackground(gray);
				ce.setBackground(gray);
				c.setBackground(gray);
				b_space.setBackground(gray);
				frac.setBackground(gray);
				squa.setBackground(gray);
				root.setBackground(gray);
				div.setBackground(gray);
				mul.setBackground(gray);
				minus.setBackground(gray);
				plus.setBackground(gray);
				sign.setBackground(gray);
				point.setBackground(gray);
				
				equal.setBackground(light_blue);
				
				zero.setBackground(white);
				one.setBackground(white);
				two.setBackground(white);
				three.setBackground(white);
				four.setBackground(white);
				five.setBackground(white);
				six.setBackground(white);
				seven.setBackground(white);
				eight.setBackground(white);
				nine.setBackground(white);
				
				//전체내용
				p_all.add(p_cal);
				p_all.add(p_cont);
				
				//창 보이기 설정(true : 보임 , false 안보임)
				setVisible(true);
			}
			
			public static void main(String[] args) {
				// Corine의 계산기 실행
				new Calculator("계산기");
			}
	}



