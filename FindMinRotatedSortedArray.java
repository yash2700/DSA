//link to read   https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
public class FindMinRotatedSortedArray {
    public static int findMin(int[] a){
        int start=0;
        int end=a.length-1;
        if(a[start]<a[end]) return a[start];
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && a[mid]<a[mid-1]) return a[mid];
            if(mid<a.length && a[mid]>a[mid+1]) return a[mid+1];
            else if(a[mid]>a[end]) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
            int[] a={2,1};
        System.out.println(findMin(a));
    }
}
