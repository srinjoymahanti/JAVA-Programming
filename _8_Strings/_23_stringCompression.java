package _8_Strings;

public class _23_stringCompression {
    public static void main(String[] args) {
//        String s="aaaabbcccdeefff";
//        char[] crr=s.toCharArray();
        StringBuilder sb=new StringBuilder("aaaabbcccdeefff");
        char[] crr=sb.toString().toCharArray();
        StringBuilder ans=new StringBuilder("");
        int i=0,j=0;
        while(j<crr.length){
            if(crr[i]==crr[j]) j++;
            else{
//                ans+=crr[i];
//                int len=j-i;
//                if(len>1) ans+=len;
//                i=j;
                ans.append(crr[i]);
                int len=j-i;
                if(len>1) ans.append(len);
                i=j;
            }
        }
            ans.append(crr[i]);
            int len=j-i;
            if(len>1) ans.append(len);


        System.out.print(ans);
    }
}
