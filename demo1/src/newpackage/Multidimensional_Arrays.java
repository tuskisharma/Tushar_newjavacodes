package newpackage;

public class Multidimensional_Arrays {
public static void main(String[] args) {
	int [][] num=new int[2][3];
	num [0][0]=2;
	num [0][1]=3;
	num [0][2]=4;
	num [1][0]=5;
	num [1][1]=6;
	num [1][2]=7;
	System.out.println(num[1][1]);
	int [][]num1= {{2,3,4},{5,6,7}};
	for(int i=0;i<num1.length;i++) {
		for(int j=0;j<num1[i].length;j++) {
			System.out.println(num1[i][j]);
		}
	}
}
}
