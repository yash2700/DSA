public class CountElementOccurence {
    public static int countElementOccurence(int[] a,int target){
        int i=findIndex(a,target,true);
        int j=findIndex(a,target,false);
        if(i==-1 || j==-1 )
            return -1;
        return (j-i+1);
    }
    public static int findIndex(int[] a,int target,boolean firstOccurence){
            int res=-1;
            int start=0;
            int end=a.length-1;
            while (start<=end){
                int mid=start+(end-start)/2;
                if(a[mid]>target) end=mid-1;
                else if(a[mid]<target) start=mid+1;
                else{
                    res=mid;
                    if(firstOccurence) end=mid-1;
                    else start=mid+1;
                }
            }
            return res;
    }
    public static void main(String[] args) {
        int[] a={5,5,51,2,3,6,6,6,1,1,};
        System.out.println(countElementOccurence(a,6));
    }
}
