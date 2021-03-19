package com.example.DailyPractice;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给出 R 行 C 列的矩阵，其中的单元格的整数坐标为 (r, c)，满足 0 <= r < R 且 0 <= c < C。
 * <p>
 * 另外，我们在该矩阵中给出了一个坐标为 (r0, c0) 的单元格。
 * <p>
 * 返回矩阵中的所有单元格的坐标，并按到 (r0, c0) 的距离从最小到最大的顺序排，
 * <p>
 * 其中，两单元格(r1, c1) 和 (r2, c2) 之间的距离是曼哈顿距离，|r1 - r2| + |c1 - c2|。（你可以按任何满足此条件的顺序返回答案。）
 */
public class November17 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new November17().allCellsDistOrder(3, 3, 1, 1)));
        int[][] ints = new int[3][];

        ints[0] = new int[1];
        System.out.println("ints = " + Arrays.deepToString(ints));
    }

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ret = new int[R * C][];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int[] ints = {i, j};
                ret[i * C + j] = ints;
//                ret[i+j] = ints;
            }
        }
        Arrays.sort(ret, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (Math.abs(a[0] - r0) + Math.abs(a[1] - c0)) - (Math.abs(b[0] - r0) + Math.abs(b[1] - c0));
            }
        });
        return ret;
    }
}
