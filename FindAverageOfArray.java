public class FindAverageOfArray {
    public static void main(String[] args) {
        double sum=0.0;
        int arr[]={1,7,3,4,9,7};
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg=(sum/arr.length);
        System.out.println(avg);

    }
    
}
