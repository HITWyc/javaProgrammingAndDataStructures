package chapter2.section13;

/**
 * @author wangyc
 * @version 1.11
 * @description 通过调用System.currentTimeMillis()返回当前时间。
 * @data 2022/8/8 14:26
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes /  60;

        // Computer the current hour
        long currentHour = totalHours % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
        System.out.println("消耗的时间为" + (System.currentTimeMillis() - currentTimeMillis));
    }
}
