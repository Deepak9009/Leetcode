class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())  return false;
        int[] arr1=new int[26];
        int[] arr2=new int[26];
      int l1=s.length();
        int l2=t.length();
        for(int i=0;i<l1;i++){
            char ch=s.charAt(i);
            arr1[ch-'a']=arr1[ch-'a']+1;
        }
        for(int i=0;i<l2;i++){
            char ch=t.charAt(i);
            arr2[ch-'a']=arr2[ch-'a']+1;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
            
            }
            return true;
    }
}