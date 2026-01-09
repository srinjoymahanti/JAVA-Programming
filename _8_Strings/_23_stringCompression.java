package _8_Strings;

public class _23_stringCompression {
    public static void main(String[] args) {
        String s="aaaabbcccdeefff";
        char[] crr=s.toCharArray();
        String ans="";
        int i=0,j=0;
        while(j<s.length()){
            if(crr[i]==crr[j]) j++;
            else{
                ans+=crr[i];
                int len=j-i;
                if(len>1) ans+=len;
                i=j;
            }
        }
            ans+=crr[i];
            int len=j-i;
            if(len>1) ans+=len;


        System.out.print(ans);
    }
}
