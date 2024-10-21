import java.util.Scanner;
class practiseques{

    public static void pairSum(int[] arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
     boolean found=false;
       for(int j=i+1;j<n;j++){
           if(arr[i]+arr[j]==5){
          System.out.println(arr[i]+","+arr[j]);
            }
       }
       
    }
      if(!found){
       System.out.println("not found");
}
} 
     public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
      System.out.println("Enter array elements:");
      arr[i]=sc.nextInt();
     }
      
      pairSum(arr);
    }
}


