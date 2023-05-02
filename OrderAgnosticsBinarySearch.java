public class OrderAgnosticsBinarySearch {
    public static void main(String[] args) {
        
        int arr[]={90,67,56,44,33,12,10,9,6};
        int target=67;
        int ans=orderAgnosticsBinarySearch(arr, target);
        System.out.println("found at index "+ans);
    }
    static int orderAgnosticsBinarySearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    
}
