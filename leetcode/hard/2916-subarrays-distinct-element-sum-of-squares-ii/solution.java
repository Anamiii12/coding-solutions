class Solution {
    static final long MOD = 1_000_000_007L;

    class SegmentTree {
        int n;
        long[] sum;
        long[] squareSum;
        long[] lazy;

        SegmentTree(int n) {
            this.n = n;
            sum = new long[4 * n];
            squareSum = new long[4 * n];
            lazy = new long[4 * n];
        }

        void apply(int node, int left, int right, long val) {
            long len = right - left + 1L;

            squareSum[node] = (
                squareSum[node]
                + 2L * val % MOD * sum[node] % MOD
                + val * val % MOD * len % MOD
            ) % MOD;

            sum[node] = (sum[node] + val * len) % MOD;
            lazy[node] = (lazy[node] + val) % MOD;
        }

        void push(int node, int left, int right) {
            if (lazy[node] == 0 || left == right) {
                return;
            }

            int mid = left + (right - left) / 2;

            apply(node * 2, left, mid, lazy[node]);
            apply(node * 2 + 1, mid + 1, right, lazy[node]);

            lazy[node] = 0;
        }

        void update(int ql, int qr) {
            if (ql > qr) return;
            update(1, 0, n - 1, ql, qr);
        }

        void update(int node, int left, int right, int ql, int qr) {
            if (ql <= left && right <= qr) {
                apply(node, left, right, 1);
                return;
            }

            push(node, left, right);

            int mid = left + (right - left) / 2;

            if (ql <= mid) {
                update(node * 2, left, mid, ql, qr);
            }

            if (qr > mid) {
                update(node * 2 + 1, mid + 1, right, ql, qr);
            }

            sum[node] = (
                sum[node * 2] + sum[node * 2 + 1]
            ) % MOD;

            squareSum[node] = (
                squareSum[node * 2] + squareSum[node * 2 + 1]
            ) % MOD;
        }

        long getSquareSum() {
            return squareSum[1];
        }
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;

        SegmentTree tree = new SegmentTree(n);
        int[] lastSeen = new int[100001];
        java.util.Arrays.fill(lastSeen, -1);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int previous = lastSeen[nums[i]];

            tree.update(previous + 1, i);

            ans = (ans + tree.getSquareSum()) % MOD;

            lastSeen[nums[i]] = i;
        }

        return (int) ans;
    }
}
