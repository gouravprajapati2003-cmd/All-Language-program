let employees = [
    {
        emp_Id: 'E001',
        emp_Name: 'Gourav Kumar',
        post: 'CEO'
    },
    {
        emp_Id: 'E002',
        emp_Name: 'Amit Kumar',
        post: 'Director'
    },
    {
        emp_Id: 'E003',
        emp_Name: 'Dharmendra',
        post: 'Manager'
    },
    {
        emp_Id: 'E004',
        emp_Name: 'Suraj',
        post: 'HR'
    },
    {
        emp_Id: 'E005',
        emp_Name: 'Tanish',
        post: 'Team Leader'
    },
]
function getEmployee(id, callback) {
    setTimeout(() => {
        let emp = employees.find((employee) => employee.emp_Id === id)
        callback(emp)
    }, 3000)
}
function getBasicSalary(post, callback) {
    let basicSalary = 0;
    setTimeout(() => {
        if(post == 'CEO') {
            basicSalary = 100000;
        } else if(post == 'Director') {
            basicSalary = 80000;
        } else if(post == 'Manager') {
            basicSalary = 50000;
        } else if(post == 'HR') {
            basicSalary = 30000;
        } else {
            basicSalary = 20000;
        }
        callback(basicSalary);
    }, 2000)
}
function getCalculateSalary(basicSalary) {
    let grossSalary = 0;
    hra = basicSalary * .40;
    pf = basicSalary * .50;
    da = basicSalary * .30;
    fixedamount = 5000;
    grossSalary = basicSalary + hra + pf + da + fixedamount;
    console.log("Employee Gross Salary = ",grossSalary)
}
getEmployee('E001', (emp) => {
    console.log(emp)
    getBasicSalary(emp.post, (basicSalary) => {
        console.log("Employee Basic Salary = ",basicSalary)
        getCalculateSalary(basicSalary)
    })
})