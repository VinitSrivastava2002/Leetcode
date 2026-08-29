public class CompareVersion {
    public static void main(String[] args) {
        String version1 = "1.2";
        String version2 = "1.10";
        System.out.println(compareVersion(version1,version2));
    }
    public static int compareVersion(String version1, String version2) {
        int i=0,j=0;
        while(i<=version1.length()-1 || j<=version2.length()-1){
            int num1 = 0, num2 = 0;
            while(i<=version1.length()-1 && version1.charAt(i) != '.'){
                num1 = num1*10 + (version1.charAt(i++) - '.');
            }

            while(j<=version2.length()-1 && version2.charAt(j) != '.'){
                num1 = num1*10 + (version1.charAt(j++) - '.');
            }

            if(num1<num2){
                return -1;
            }
            if(num1>num2){
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
