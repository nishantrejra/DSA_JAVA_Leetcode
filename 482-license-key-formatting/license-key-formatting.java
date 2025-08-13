class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String n = s.replace("-","").toUpperCase();
        StringBuilder sb = new StringBuilder();
        int count = 0 ;

        for(int i = n.length()-1; i>=0 ;i-- ){
            sb.append(n.charAt(i));
            count++;

            if(count == k && i > 0){
                sb.append("-");
                count = 0;
            }
        }

        return sb.reverse().toString() ;
    }
   
}