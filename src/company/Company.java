package company;

import java.util.ArrayList;

class Company {
    // 多くの従業員を雇うことができる(多重度*)
    private ArrayList<Employee> employees;

    // 会社は1~10人の役員で運営される(多重度1-10)
    private BoardMember[] boardMembers = new BoardMember[10];

    // 親会社（ないときはnull）(多重度0-1)
    private Company parentCompany;

    // 子会社を持つことができる(多重度*)
    private ArrayList<Company> subsidiaries;

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void setBoardMember(BoardMember boardMember, int position){
        this.boardMembers[position] = boardMember;
    }

    public void setParentCompany(Company company){
        this.parentCompany = company;
    }

    public void addSubsidiary(Company company){
        this.subsidiaries.add(company);
    }
}