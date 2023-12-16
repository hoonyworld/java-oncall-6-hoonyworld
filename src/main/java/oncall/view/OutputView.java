package oncall.view;

import oncall.domain.OncallSchedule;
import oncall.domain.OncallDay;

public class OutputView {

    public static void printOncallSchedule(OncallSchedule schedule) {
        for (OncallDay day : schedule.getSchedule()) {
            System.out.println(formatOncallDay(day));
        }
    }

    private static String formatOncallDay(OncallDay day) {
        String dateInfo = day.getDate();
        String employeeName = day.getEmployee().getNickname();
        return dateInfo + " " + employeeName;
    }
}
