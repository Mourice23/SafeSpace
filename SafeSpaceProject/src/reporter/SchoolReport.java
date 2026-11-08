package reporter;

/**
 * A report of an incident at school. Extends Report (inheritance).
 * Author: MouriceOffor
 */
public class SchoolReport extends Report {

    private String schoolName;
    private String yearGroup;

    public SchoolReport(int reportId, String location, String date, String description,
            String schoolName, String yearGroup) {
        super(reportId, "School", location, date, description);
        this.schoolName = schoolName;
        this.yearGroup = yearGroup;
    }

    public String getSchoolName() { return schoolName; }
    public String getYearGroup() { return yearGroup; }
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }
    public void setYearGroup(String yearGroup) { this.yearGroup = yearGroup; }

    @Override
    public String getDetails() {
        return super.getDetails() + " | School: " + schoolName + " | Year: " + yearGroup;
    }

    @Override
    public String toFileString() {
        return super.toFileString() + "," + schoolName + "," + yearGroup;
    }
}