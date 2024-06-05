EASY


  class Solution {

    public static void kushagra(String s, int[] ss){
        
        int[] ssk = new int[26];

        for(int i=0;i<s.length();i++){
            ssk[s.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            ss[i] = Math.min(ss[i],ssk[i]);
        }



    }


    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();

        if(words.length==0) return list;

        String aa = words[0];
        int[] ss = new int[26];

        for(int i=0;i<aa.length();i++){
            ss[aa.charAt(i)-'a']++;
        }

        for(int i=1;i<words.length;i++){
                kushagra(words[i],ss);


        }

        for(int i=0;i<26;i++){
            int kk = ss[i];
            

            while(kk!=0){
                String sss = "";
                sss = (char) (i+ 'a') + sss;
                list.add(sss);
                kk--;
            }
        }


        return list;

        
    }
}
