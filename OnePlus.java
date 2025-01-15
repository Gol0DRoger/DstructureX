class OnePlus {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Simple increment if not 9
                return digits; // No carry-over needed, so we are done
            } else {
                digits[i] = 0; // Set to 0 and continue the carry-over
            }
        }

        // If we reach here, it means all digits were 9, so we need to add a leading 1
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
