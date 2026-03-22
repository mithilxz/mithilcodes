class Solution {
    public static int pageCount(int n, int p) {
        int frontTurns = p / 2;
        int backTurns = (n / 2) - (p / 2);
        
        return Math.min(frontTurns, backTurns);
    }

    public static void main(String[] args) {
        int n = 6;
        int p = 2;
        
        System.out.println(pageCount(n, p));
    }
}
