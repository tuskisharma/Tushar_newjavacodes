package MethodOverriding;

public class BrandsOfTV extends Electronics {
	public static void main(String[] args) {
		Electronics bt=new BrandsOfTV();
		bt.TV();
	}
public void TV() {
	System.out.println("oneplus brand is selected");
}
}
