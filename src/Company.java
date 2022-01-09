import java.util.Scanner;

public class Company {
    int[] products;
    Company(int a,int b,int c){
        products = new int[4];
        products[0]=a;
        products[1]=b;
        products[2]=c;
        products[3]=a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company[] salesman = new Company[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter sales of 3 items sold by salesman %d : ",i+1);
            salesman[i] = new Company(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Total Sales by Salesman %d = %d",i+1,salesman[i].products[3]);
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            int a=0;
            System.out.printf("Total Sales of item %d = ",i+1);
            for (int j = 0; j < 5; j++) {
                a+=salesman[j].products[i];
            }
            System.out.print(a);
            System.out.println();
        }
    }
}
