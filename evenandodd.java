public class evenandodd {
    public static void main(String[] args) {
                int arr[]={10,20,30,40,50};

                int evencount =0;
                int oddcount=0;

                for (int i = 0; i < arr.length; i++) {
                     if(arr[i] % 2 ==0){
                        evencount++;
                     }else{
                        oddcount++;
                     }
                    
                    
                }

        System.out.println("Even numbers count: " + evencount );
        System.out.println("Odd numbers count: " + oddcount );
    }
    
}
