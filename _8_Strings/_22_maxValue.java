package _8_Strings;

public class _22_maxValue {
    public static void main(String[] args) {
        String[] arr= {"7969786","532","74398","67432"};
        String maxStr=arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxStr=max(maxStr,arr[i]);
        }
        System.out.println(maxStr);
    }
    public static String max(String a,String b){
        String s=purify(a),t=purify(b);
        if(s.length()>t.length()) return a;
        if(s.length()<t.length()) return b;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        return a;
    }
    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
}
