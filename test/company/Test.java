package company;

class Test {
    public static void main(String[] args){
        Company company1 = new Company();
        Company company2 = new Company();

        Employee employee = new Employee(company1, company2);

        company1.addEmployee(employee);
        company2.addEmployee(employee);

        BoardMember boardMember = new BoardMember();
        company1.setBoardMember(boardMember, 0);

        boardMember.setCompany(company2, 0);

        company1.addSubsidiary(company2);
        company2.setParentCompany(company1);
    }
}

