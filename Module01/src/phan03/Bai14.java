package phan03;
/**
 * VCT Xuar ra tong cac so la boi so cua 79 tu 1 dem 100)
 * @author HP
 *
 */
public class Bai14 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%7 == 0) {
				sum += i;
			}
		}System.out.println("Tong cac so la boi so cua 7 la: " + sum);
	
}
}
