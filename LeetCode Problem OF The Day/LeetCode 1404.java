class Solution {
    public int numSteps(String s) {
        // Sabse asan - very easy
        int count = 0;
        int carry = 0;

        for(int i=s.length()-1;i>0;i--){
            int bit = s.charAt(i) - '0';
            if(bit==1 && carry==0){// odd hai
             count +=2;
             carry = 1;

            }
            else if(bit==1 && carry==1){
                
                count++;
            }
            else if(bit==0 && carry==0){
                count++;
                
            }
            else if(bit==0 && carry==1){
                count +=2;
                carry = 1;
            }
            


        }
        if(carry==1) count++;
        return count;
    }
}
