class Solution {
    public int countDaysTogether(
            String arriveAlice, String leaveAlice,
            String arriveBob, String leaveBob) {

        int aliceStart = dayOfYear(arriveAlice);
        int aliceEnd = dayOfYear(leaveAlice);
        int bobStart = dayOfYear(arriveBob);
        int bobEnd = dayOfYear(leaveBob);

        int overlapStart = Math.max(aliceStart, bobStart);
        int overlapEnd = Math.min(aliceEnd, bobEnd);

        return Math.max(0, overlapEnd - overlapStart + 1);
    }

    private int dayOfYear(String date) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int total = day;
        for (int i = 0; i < month - 1; i++) {
            total += daysInMonth[i];
        }

        return total;
    }
}