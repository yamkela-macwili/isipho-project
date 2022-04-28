//Store the applicant's details
//And return them to the DataAccess class 
package com.gmail.yamkela22y;

/**
 * @author YAMKELA MACWILI
 */
public class Gift {

    private String lName;
    private String fName;
    private String vill;
    private String cellNo;

    public Gift(String fName, String lName, String vill, String cellNo) {
        this.fName = fName;
        this.lName = lName;
        this.vill = vill;
        this.cellNo = cellNo;
    }

    Gift() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Gift(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the name
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the name to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName
     *
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the vill
     */
    public String getVill() {
        return vill;
    }

    /**
     * @param vill the code to set
     */
    public void setvill(String vill) {
        this.vill = vill;
    }

    /**
     * @return the price
     */
    public String getcellNo() {
        return cellNo;
    }

    /**
     * @param cellNo the price to set
     */
    public void setcellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    @Override
    public String toString() {
        return "Name: " + fName + "\nSurname: " + lName + "\nVillage: " + vill + "\ncell Number: " + cellNo + "\n\n";
    }
}
