package newpackage;

public class Arrays {
	public static void main(String[] args) {
		int[] num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=40;
		System.out.println(num.length);
		System.out.println(num[2]);
		int[] num1= {10,20,30,50};
		System.out.println(num1.length);
		System.out.println(num1[2]);
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);
		}
	}

}
