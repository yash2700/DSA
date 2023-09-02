public class sortedInsertPosition {
    public static int insertPosition(int[] a,int target){
        int start=0;
        int end=a.length-1;

        while (start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]>target)  end=mid-1;
            else start=mid+1;
        }
        return start;

    }
    public static void main(String[] args) {
        int[] a={1,3,4,5};
        System.out.println(insertPosition(a,2));
    }
}
