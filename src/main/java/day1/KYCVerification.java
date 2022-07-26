package day1;

public class KYCVerification {

    private String taxNumber;
    private long personalIdNumber;
    private String documentType;
    private String documentNumber;

    public KYCVerification(String taxNumber, long personalIdNumber, String documentType, String documentNumber) {
        super();
        this.taxNumber = taxNumber;
        this.personalIdNumber = personalIdNumber;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public long getPersonalIdNumber() {
        return personalIdNumber;
    }

    public void setPersonalIdNumber(long personalIdNumber) {
        this.personalIdNumber = personalIdNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return "day1.KYCVerification{" +
                "taxNumber='" + taxNumber + '\'' +
                ", personalIdNumber=" + personalIdNumber +
                ", documentType='" + documentType + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                '}';
    }
}
