public class FloorNumber {
    public static void main(String[] args) {
        int arr[]={12,23,45,56,67,78,89};
        int target=47;
        int ans=searchingBinary(arr, target);
        System.out.println("found at index "+ans);
        
    }
    static int searchingBinary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;

            }
            else if(arr[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return end;


    }
    
    
    
    }
    

