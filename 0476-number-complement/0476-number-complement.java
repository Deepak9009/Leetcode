class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        else{
             int x = (int) (Math.log(num) / Math.log(2))+1;
             int m=(1<<x)-1;
                return m^num;
    }
}
}