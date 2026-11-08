package reporter;

/**
 * innterface for any class that can save its data to a file and load it back.
 * implemented by ReportManager and ActivityLog.
 *
 * Author: Mouriceoffor
 */
public interface Saveable {

    void saveToFile();

    void loadFromFile();
}

