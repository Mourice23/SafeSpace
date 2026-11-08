package reporter;

/**
 * A report of an incident at work. Extends Report (inheritance).
 * Author: MouriceOffor
 */
public class WorkplaceReport extends Report {

    private String employer;
    private String department;

    public WorkplaceReport(int reportId, String location, String date, String description,
            String employer, String department) {
        super(reportId, "Workplace", location, date, description);
        this.employer = employer;
        this.department = department;
    }

    public String getEmployer() { return employer; }
    public String getDepartment() { return department; }
    public void setEmployer(String employer) { this.employer = employer; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Employer: " + employer + " | Dept: " + department;
    }

    @Override
    public String toFileString() {
        return super.toFileString() + "," + employer + "," + department;
    }
}