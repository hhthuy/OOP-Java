package phan02;
/**
 * Thao tac voi cac toan tu quan he, toan tu so sanh trong NNLT Java
 * @author HongThuy
 *
 */
public class Bai05 {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		System.out.println("Value1 == Value2: " + (value1 == value2));
		System.out.println("Value1 != Value2: " + (value1 != value2));
		System.out.println("Value > Value2: " + (value1 > value2));
		System.out.println("Value < Value2: " + (value1 < value2));
		System.out.println("Value <= Value2: " + (value1 <= value2));
		System.out.println("Value <= Value2 && Value == Value2: " + (value1 <= value2 && value1 == value2));
		System.out.println("Value <= Value2 || Value == Value2:  " + (value1 <= value2 && value1 == value2));
	}

}
