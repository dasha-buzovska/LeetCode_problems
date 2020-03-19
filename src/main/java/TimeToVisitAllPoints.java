public class TimeToVisitAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int differenceX = Math.abs(points[i+1][0] - points[i][0]);
            int differenceY = Math.abs(points[i+1][1] - points[i][1]);
            result += Math.max(differenceX, differenceY);
        }
        return result;
    }
}
