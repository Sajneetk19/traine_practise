import java.util.*;
public class array{

public static int average(int[] arr){
int sum=0;
int count=0;
for(int i=0;i<arr.length;i++){
if(arr[i]%2==0){
sum=sum+arr[i];
count++;
}
 int avg = sum / count;
}



public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
 if (count > 0) {
 System.out.println("average is: " + avg);
 } 
else {
 System.out.println("no even entered");
}
}
}

