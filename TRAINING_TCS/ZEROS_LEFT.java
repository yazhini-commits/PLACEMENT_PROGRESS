import java.util.*;
public class ZEROS_LEFT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int s=sc.nextInt();
        int[] arr= new int[s];
        System.out.println("Enter elements: ");
        for(int i =0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        //Arrays.sort(arr);
        //for(int i =0;i<s;i++){
         //   System.out.print(arr[i]);
        //}
        int c=0;
        
        for(int i =0;i<s;i++){
            if(arr[i]==0){
                c++;
            }
            

        }
        for(int i =0;i<c;i++){
            arr[i]=0;
        }
        for(int i=c;i<s;i++){
            arr[i]=1;
        }
        for(int i =0;i<s;i++){
            System.out.print(arr[i]);
        }


        

    }
}