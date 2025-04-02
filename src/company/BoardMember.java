package company;

// 役員は最大で5つの会社を管理できる（多重度1-5）
class BoardMember {
    private Company[] companiesManaging = new Company[5];

    public void setCompany(Company company, int position){
        this.companiesManaging[position] = company;
    }
}