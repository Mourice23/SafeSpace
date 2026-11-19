package reporter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

//
//"Report 3 submitted", "Report 2 deleted")
//This gives a time stamp of all incidents
/*implemts saveable so its entries can be saved to and loaded from a file.
 *
 * Author: MouriceOffor
 */
public class ActivityLog implements Saveable {

    private ArrayList<String> entries = new ArrayList<>();

    // add time stamps
    public void addEntry(String action) {
        entries.add(LocalDateTime.now() + " - " + action);
    }

    public ArrayList<String> getEntries() {
        return entries;
    }

    // writes every log to activity.txt each line 
    @Override
    public void saveToFile() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("activitylog.txt"));
            for (String entry : entries) {
                writer.println(entry);
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Could not save the activity log: " + e.getMessage());
        }
    }

    //reads every entry from Activitylog.txt
    @Override
    public void loadFromFile() {
        File file = new File("activitylog.txt");
        if (!file.exists()) {
            return;
        }
        try {
            entries.clear();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                entries.add(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Could not load the activity log: " + e.getMessage());
        }
    }
}
