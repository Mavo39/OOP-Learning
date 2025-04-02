package company;

// 従業員は1人につき、1~2社に勤務する
class Employee {
    private Company mainJob;
    private Company secondJob;

    public Employee(Company mainJob, Company secondJob){
        this.mainJob = mainJob;
        this.secondJob = secondJob;
    }
}