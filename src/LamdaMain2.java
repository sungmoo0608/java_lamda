
/*
 * 
interface Printable{
	void print(String s);
}
*/

//람다란? 인터페이스 구현을 화살표 함수로


interface Add{
	int add(int num1,int num2);
}



public class LamdaMain2 {

	public static void main(String[] args) {
		
		Printable prn = (s) -> System.out.println(s);
		prn.print("람다 완성");
		
		Add add = (int num1,int num2) -> {
			return num1+num2;
		};
		
		int hap = add.add(5,6);
		System.out.println(hap);

	}

}
