import java.util.*;
public class string_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str ="Karan";
        int n=str.length();
        
        System.out.println(str);
        
        char find= 'a';
        int f=search(str,find);
        if(f==-1){
            System.out.print("String not found");
        }
        else{
            System.out.println(find+" String found at position "+f);
        }
    }
    static int search(String str,char find){
       /* for(int i=0;i<5;i++){
            if(find == str.charAt(i)){
                return i;
            }
        }
        return -1;
*/
        for(char ch  : str.toCharArray()) {
            if(ch == find){
                return 1;
            }
       }

        return -1;
    }
}
