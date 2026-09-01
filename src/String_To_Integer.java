public class String_To_Integer {
    public static void main(String[] args) {
        String s="42";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        int sign = 1;
        int num = 0;
        String str = s.trim();
        if(str.charAt(0)=='-'){
            sign =-1;
        }
        if(str.charAt(0) != '-' && str.charAt(0) != '0' && Character.isDigit(str.charAt(0))){
            num = num*10 + (str.charAt(0) - '0');
        }
        int i=1;
        while(i<=str.length()-1){
            if(str.charAt(i) == '0' && num==0){
                i++;
            }
            else if(Character.isDigit(str.charAt(i))){
                num = num*10 + (str.charAt(i) - '0');
                i++;
            } else{
                break;
            }
        }
        return sign==-1?-num:num;
    }

}
