public class Add_Binary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
//    if the given length are equal
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char carry = '0';
        char value = '0';
        for(int i=a.length()-1;i>=0;i--){
            if((carry == '0' && a.charAt(i)== '1') || (carry == '1' && a.charAt(i)== '0')){
                value = '1';
                if(value == '1' && b.charAt(i) == '1'){
                    carry = '1';
                    value = '0';
                    sb.append(value);

                }
                if(value == '1' && b.charAt(i) == '0'){
                    sb.append(value);
                }
            }
            else if(carry == '1' && a.charAt(i) == '1'){
                carry = '1';
                value = '0';
                if((value == '0' && b.charAt(i) == '1') || (value == '1' && b.charAt(i) == '0')){
                    sb.append('1');
                }
                if((value == '0' && b.charAt(i) == '0')){
                    sb.append('0');
                }
            }
            else{
                sb.append(b.charAt(i));
            }
        }
        sb.append(carry);
        sb.reverse();
        return sb.toString();
    }
}
