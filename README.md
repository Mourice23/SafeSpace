# SafeSpace
Group N Gender Equality Project

## Integration notes (UI checkpoint)
Changes made by Mourice Offor so every section opens from the main landing page (`MainMenu`):

- **Support Resources (Dido):** moved the three resource screens (`resourcefindermenu`, `SearchResourceForm`, `addResourceForm`) into `SafeSpaceProject` as the `resources` package. The separate `ResourceFinderMenu` project folder was removed (still in Git history). The Support Resources button now opens the Resource Finder, and its "Back to Main Menu" buttons return to `MainMenu`.
- **Gender Pay Gap (Daniel):** moved the three pay gap screens (`EmployeeGUI`, `EmployeeRecordsGUI`, `GenderPayGapCalculatorGUI`) into a named package, `paygap` (they were loose in `src/` with a mismatched `package safespace;`). Added a Gender Pay Gap button on `MainMenu` and a "Back To Main Menu" button on `EmployeeGUI`.
- **Events & Volunteering button replaced:** no Events section was built, so that button now opens the Gender Pay Gap screens.
- All forms are still the NetBeans designer (drag-and-drop) forms; only the button-wiring handlers were written by hand.
