class Solution {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder(5000);
        StringBuilder temp = new StringBuilder(5000);
        res.append("1"); 
        for(int i = 1 ; i < n ; i++){
            int j1 = 0 , j2 = 0 ;
            temp.setLength(0);
            while(j2 < res.length()){
                if(res.charAt(j1) != res.charAt(j2)){
                    temp.append((char)('0' + (j2 - j1))).append(res.charAt(j1));
                    j1 = j2 ;
                    continue ;
                }
                j2++ ;
            }
            temp.append(j2 - j1).append(res.charAt(j1));
            res.setLength(0);
            res.append(temp);
        }
        return res.toString();
    }
}
