package BinarySearch_278;

public class Solution extends VersionControl {
    //662351799
    public int firstBadVersion1(int n) {
        int j = 1;
        int k = n;
        int delimeter = 2;
        for (int i = n; i > j;  i--) {
            if (isBadVersion(i) == true) {
                if (isBadVersion(i - 1) == false) {
                    return i;
                }
                if (isBadVersion(i / 2)) {
                    i /= 2;
                    i++;
                } else {
                    k = n / delimeter;
                    k++;
                    delimeter *= 2;
                    if (!isBadVersion(j + k)) {
                        j += k;
                    }
                    if (isBadVersion(i - k)) {
                        i -= k;
                    }
                }
            }

        }
        return 1;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

class VersionControl {
    public boolean isBadVersion(int version) {
        if (version < 662351799) {
            return false;
        }
        return true;
    }
}