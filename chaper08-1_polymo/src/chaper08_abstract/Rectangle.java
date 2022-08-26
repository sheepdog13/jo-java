package chaper08_abstract;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다");
		}

	@Override
	public void print(String word) {
		System.out.println("사각형클래스에서 출력 :"+word);
		}
	
}
