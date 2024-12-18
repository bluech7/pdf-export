package model;

import lombok.Data;

import java.util.List;

@Data
public class LiquidAcceptanceManifest {
    private String manifestNumber;
    private String customerNumber;
    private String decalNumber;
    //checkboxes
    private boolean isResidentialSeptage;
    private boolean isSanitaryWaste;
    private boolean isLiftStationOrSewerLin;
    //Generator
    private String generatorName;
    private String generatorAddress;
    private String generatorPhoneNumber;
    //Transporter
    private String transporterCompanyName;
    private String transporterAddress;
    private String transporterPhoneNumber;
    private String njdepNumber;
    private String trailerLicenseNumber;
    private String trailerStateOfOrigin;
    private String trailerNumber;
    private String trailerCapacity;
    private String solidWasteAdminId;
    //Generator representative
    private String generatorRepresentativeName;
    private String generatorCertificationDate;
    //Transporter representative
    private String transporterRepresentativeName;
    private String transporterCertificationDate;
    //PVSC facility operator
    private String facilityOperatorName;
    private String receiptCertificationDate;
    private String receiptSampleId;
    private String receiptTimeIn;
    private String receiptDumpSite;
    //sources
    private List<WasteSource> wasteSources;
}
