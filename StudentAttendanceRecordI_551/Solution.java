package StudentAttendanceRecordI_551;

class Solution {
    public boolean checkRecord(String s) {

        if (s.contains("LLL")) {
            return  false;
        }
        int countA = 0;
        for (int i = 0; i< s.length();i++) {
            if (s.charAt(i) == 'A') {
                countA++;
            }
            if (countA >= 2) {
                return false;
            }
        }

        return true;
    }
}