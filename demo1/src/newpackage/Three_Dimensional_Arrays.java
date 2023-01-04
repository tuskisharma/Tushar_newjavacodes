package newpackage;

public class Three_Dimensional_Arrays {
public static void main(String[] args) {
	int [][][] num=new int[2][3][2];
	int[][][]num1= {{{1,2},{3,4},{5,6}},{{8,9},{10,11},{13,15}}};
	for(int i=0;i<num1.length;i++) {
		for(int j=0;j<num1[i].length;j++) {
			for(int k=0;k<num[i][j].length;k++) {
				System.out.println(num1[i][j][k]);
			}
		}
	}
}
}
