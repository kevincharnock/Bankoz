package br.com.kevin.bank.Agencies;

public class Agency {

    private int agencyCode;
    private String agencyName;

    public String createAgency(){
        return this.getAgencyCode()+" "+ getAgencyName();
    }

    public int getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(int agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
}
