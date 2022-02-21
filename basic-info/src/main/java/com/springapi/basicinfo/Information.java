package com.springapi.basicinfo;

public class Information {

    private String Id,Name,Company,Designation;

    public Information(String id, String name, String company, String designation) {
        super();
        Id = id;
        Name = name;
        Company = company;
        Designation = designation;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

}
