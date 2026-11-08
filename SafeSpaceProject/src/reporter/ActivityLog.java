package reporter;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Keeps a record of what happens in the Incident Reporter
 * Implements Saveable.
 *
 * Author: Mouriceoffor
 */
public class ActivityLog implements Saveable {
    
    //array to list entries

    private ArrayList<String> entries = new ArrayList<>();

    public void addEntry(String action) {
        entries.add(LocalDateTime.now() + " - " + action);
    }

    public ArrayList<String> getEntries() {
        return entries;
    }

    @Override
    public void saveToFile() {
        // write entries to activitylog.txt
    }

    @Override
    public void loadFromFile() {
        // ead entries from activitylog.txt
    }
}