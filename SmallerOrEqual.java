public class SmallerOrEqual {
    public static int smallerOrEqualElements(int[] a,int target){
        int ans=-1;
        int start=0;
        int end=a.length-1;

        while (start<=end){
            int mid=(start+end)/2;
            if(a[mid]<target){
                ans=mid;
                start=mid+1;
            }
            else if(a[mid]>target) end=mid-1;
            else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans+1;
    }
    public static void main(String[] args) {
        int[] a={1, 2,5,5};
        System.out.println(smallerOrEqualElements(a,3));
    }
}
