package w5;

class Report {
    public void generateReport() {
        System.out.println("Generate Report");
    }
}

class PdfExporter {
    public void export(Report report) {
        report.generateReport();
        System.out.println("Exported to PDF");
    }
}

class ExcelExporter {
    public void export(Report report) {
        report.generateReport();
        System.out.println("Exported to Excel");
    }
}

public class Qn4 {
    public static void main(String[] args) {
        Report report = new Report();        // create report
        PdfExporter pdf = new PdfExporter(); // create exporter

        pdf.export(report);         
    }
}
