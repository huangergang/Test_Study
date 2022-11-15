package data_structure.demo;
import java.util.Calendar;

public interface SpentRuntime {

    long start = Calendar.getInstance().getTimeInMillis();
    long end = 0L;

    long runtime();

}
