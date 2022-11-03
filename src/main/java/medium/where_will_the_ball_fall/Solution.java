package medium.where_will_the_ball_fall;

public class Solution {

    public int[] findBall(int[][] grid) {
        int[] balls = new int[grid[0].length];

        for (int i = 0 ; i < balls.length; i++) balls[i] = i;

        for (int i = 0; i < grid.length; i++){
            for (int j = balls[0]; j < balls.length; j++) {

            }
        }

        return null;
    }


    /* // [1, 2, -1, -1, 3]
        [
        [1 ,  1,  1, -1, -1],
        [1 ,  1,  1, -1, -1],
        [-1, -1, -1,  1,  1],
        [1 ,  1,  1,  1, -1],
        [-1, -1, -1, -1, -1]
        ]

        // [1, -1, -1, -1, -1]
     */
}

