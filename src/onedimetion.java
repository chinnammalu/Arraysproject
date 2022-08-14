import java.util.Scanner;

public class onedimetion {

	public static void main(String[] args) {
   int[] arr=new int[5];
   Scanner scan=new Scanner(System.in);
   for(int i=0;i<arr.length;i++) {
	   System.out.println("enter values.......");
	   arr[i]=scan.nextInt();
   }
		
   for(int i=0;i<arr.length;i++) {
	   System.out.println("display values......."+arr[i]);

   }
   int[] arrr=new int[5];
   int[] arr2=new int[] {1,2,3};
   //single dimention array//it is represents multiple  data items as a list
   //mutli dimention array//it is represents multiple data items as table format .table consist of rows and columns
   int[][] arrrr=new int[2][3];
   for(int i=0;i<arrrr.length;i++) {
	   for(int j=0;j<arrrr.length;j++) {
		   System.out.println("enter........");
		   arrrr[i][j]=scan.nextInt();
		   
	   }
   }
   int j;
   int i;
   for(i=0;i<2;i++) {
	   for(j=0;j<3;j++) {
		   System.out.println("elements are...."+arrrr[i][j]+"\t");
	   }
	   
   }
	}

}
