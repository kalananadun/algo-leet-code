public class Main {
    public static boolean palindromeNumber(int x){
            char[] arr = String.valueOf(x).toCharArray();
            for(int i=0;i<arr.length/2;i++){
                if(arr[i] != arr[arr.length-1-i]){
                    return false;
                }
            }
            return true;

    }
    public static void main(String[] args) {
        
        boolean result = Main.palindromeNumber(121);
        System.out.println(result);
        
    } 
}
