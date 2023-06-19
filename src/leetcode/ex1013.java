package leetcode;

class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int val = 0;
        // ++, -- 일 경우 X에서 +,- 하기
        // String 타입이므로 equals로 비교
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("x++")) {
                val++;
            }
            if (operations[i].equals("++x")) {
                val++;
            }
            if (operations[i].equals("x--")) {
                val--;
            }
            if (operations[i].equals("--x")) {
                val--;
            }
        }
        return val;
    }
}
