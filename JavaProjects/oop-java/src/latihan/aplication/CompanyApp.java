package latihan.aplication;

import latihan.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setNama("PT. PANDORADEV");

        //pemanggilan inner class
        Company.Employee employee = company.new Employee();
        employee.setNama("FAJAR");

        System.out.println( employee.getCompany());
        System.out.println(employee.getNama());

    }
}
