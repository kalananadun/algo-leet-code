/**
 * Main
 */
public class Main {
    public static int romanToInteger(String s){
        int result =0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch(c){
                case 'I':
                    result+=1;
                    break;
                case 'V':
                    if(i>0 && s.charAt(i-1)=='I'){
                        result = result + 4-1;
                    }else{
                        result += 5;
                    }
                    break;
                case 'X':
                    if(i>0 && s.charAt(i-1)=='I'){
                        result = result +9 -1; 
                    }
                    else{
                        result = result+10;
                    }
                    break;
                
                default:
                    break;
            }
        }
        return result;    
    }
    public static void main(String[] args) {
        // 
        System.out.println(romanToInteger("XXIV"));
    }
}
