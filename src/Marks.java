import java.util.Scanner;

class Marks{
    public double subAvg(int [][]a,int x){
        double sum=0;
        for(int[] i:a){
            sum+=i[x];
        }
        return sum/4;
    }
    public double stuAvg(int [][]a,int x){
        double sum=0;
        for(int i=0;i<5;i++){
            sum+=a[x][i];
        }
        return sum/5;
    }
}
public class Q3 {
    public static void main(String[] args) {
        int[][] a=new int[4][5];
        Marks obj = new Marks();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< a.length;i++){
            System.out.print("Enter marks of "+(i+1)+" student: ");
            for(int j=0;j<a[i].length;j++){
                a[i][j]= sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<5;i++){
            System.out.println("Average marks of subject "+(i+1)+" is "+obj.subAvg(a,i));
        }
        for(int i=0;i<a.length;i++){
            System.out.println("Average marks of student "+(i+1)+" is "+obj.stuAvg(a,i));
        }
    }
}
