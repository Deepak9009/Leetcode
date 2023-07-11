class Solution {
    public int findComplement(int num) {
       int x = (int) (Math.log(num) / Math.log(2))+1;
        int m=(1<<x)-1;
        return m^num;
    }
}