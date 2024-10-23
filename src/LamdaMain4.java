import java.util.function.Predicate;

public class LamdaMain4 {

	public static void main(String[] args) {

		//예상하다.예측하다.
		Predicate<String> predicate = (String s) -> {
			boolean isTrue = false;
			
			isTrue = s.startsWith("A");
			
			return isTrue;
		};
		
		System.out.println(predicate.test("Banana"));
		System.out.println(predicate.test("Apple"));
		
		//짝수이면 True 홀수이면 False
		Predicate<Integer> predicate2 = (Integer i) -> {
			
			if(i%2==0)
				return true;
			return false;
			
		};
		
		System.out.println(predicate2.test(4));
		System.out.println(predicate2.test(5));
		
		int[] arrNums = {4,3,2,1};
		
		for (int num:arrNums) {
			System.out.println("숫자 : " + num + " 짝수 " + predicate2.test(num));
			System.out.println("============================================");
			System.out.println("숫자 : " + num + " 짝수 " + isEven(num,predicate2));
		}
		
	}
	
	public static boolean isEven(int num, Predicate<Integer> p) {
		return p.test(num);
	}

}