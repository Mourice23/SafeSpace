package reporter;

import java.util.ArrayList;

/**
 * holds all reports in a arraylist and implements saveable
 * Checkpoint 2 UI only
 *
 * Author: Mouriceofor
 */
public class ReportManager implements Saveable {

    private ArrayList<Report> reports = new ArrayList<>();
    private ActivityLog log = new ActivityLog();

    public void addReport(Report report) {
        // TODO Checkpoint 3
    }

    public ArrayList<Report> search(String keyword) {
        // TODO Checkpoint 3
        return new ArrayList<>();
    }

    public boolean deleteReport(int reportId) {
        // TODO Checkpoint 3
        return false;
    }

    @Override
    public void saveToFile() {
        // TODO Checkpoint 3
    }

    @Override
    public void loadFromFile() {
        // TODO Checkpoint 3
    }
}