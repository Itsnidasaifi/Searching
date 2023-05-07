import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

    int arr[]={5,4,3,2,1};
    bubble(arr);
    System.out.println(Arrays.toString(arr));
        
    } 
    static void bubble(int arr[]){
        //runs the loop for it
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
// runs the j loop to perform sorting
            for(int j=1;j<arr.length-i;j++){
                //swapping is done here
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;


                }
            }
            if(!swapped){
                break;

        }
        
        }
    }

            
    
}
