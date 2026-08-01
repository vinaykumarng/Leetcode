class Solution {
    public boolean squareIsWhite(String coordinates) {
        int first = 98-(int)coordinates.charAt(0);
        int second = 50-(int)coordinates.charAt(1);
        // System.out.printf("(%d,%d)", first,second);

        return (!((first+second)%2 == 0));
    }
}