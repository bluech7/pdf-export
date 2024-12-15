public class Main {

    public static void main(String[] args) throws Exception {
        String pdfTemplate = "pdf_g.htm";
        String outputPath = "C://Users//ingri//Desktop//pdf-export//src//main//resources//out.pdf";

        PdfGenerator pdfGenerator = new PdfGenerator();
        pdfGenerator.generatePdf(pdfTemplate, outputPath);
    }
}
