package reporter;

/**
 * Parent class for all incident reports.
 * Author: MOffor
 */
public class Report {

    private int reportId;
    private String type;
    private String location;
    private String date;
    private String description;

    public Report(int reportId, String type, String location, String date, String description) {
        this.reportId = reportId;
        this.type = type;
        this.location = location;
        this.date = date;
        this.description = description;
    }

    public int getReportId() { return reportId; }
    public String getType() { return type; }
    public String getLocation() { return location; }
    public String getDate() { return date; }
    public String getDescription() { return description; }

    public void setReportId(int reportId) { this.reportId = reportId; }
    public void setType(String type) { this.type = type; }
    public void setLocation(String location) { this.location = location; }
    public void setDate(String date) { this.date = date; }
    public void setDescription(String description) { this.description = description; }

    public String getDetails() {
        return "Report #" + reportId + " | " + type + " | " + location + " | " + date + " | " + description;
    }

    public String toFileString() {
        return reportId + "," + type + "," + location + "," + date + "," + description;
    }
}