package chap02_var;

public class Cast {
	public static void main(String[] args) {
	// 형변환
	// 축소변환 : double --> int 데이터가 사라질수 있다(소수점이하 사라짐)
	int i = (int)10.5;
	System.out.println(i);
	// 확대변환 : int --> double
	double d = (double) 10;
	System.out.println(d);
	// 실습 확대 변환
	// 328/5의 결과 확인
	System.out.println(328/5); // 65 > int/int > int형으로 출력
	// 65.6 > double/int > double형으로 출력(더 큰쪽으로 맞춤)
	// 65.6 > double/double > double형으로 출력
	System.out.println((double)328/(double)5);
	// 65.6 > double/int > double형으로 출력
	System.out.println(328.0/5);
	// 6 강제로 int로 형변환을 했기 때문에 결과가 int/int > int형으로 출력
	System.out.println((int)32.8/5);
	
	
	}

}
