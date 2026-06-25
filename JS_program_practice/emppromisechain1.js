let employees = [
    {
        emp_Id: 100,
        emp_Name: 'Mukul',
        post: 'Professor',
        mobile_No: 78990032
    },
    {
        emp_Id: 101,
        emp_Name: 'Arpit',
        post: 'Teacher',
        mobile_No: 8900987
    },
    {
        emp_Id: 102,
        emp_Name: 'Rohan',
        post: 'Clerk',
        mobile_No: 78999000
    },
    {
        emp_Id: 103,
        emp_Name: 'Gourav',
        post: 'Developer',
        mobile_No: 81718888
    },
    {
        emp_Id: 104,
        emp_Name: 'Sumit',
        post: 'Driver',
        mobile_No: 70788675
    },
]
function getEmployee(id) {
    let pr = new Promise((resolve, reject) => {
        setTimeout(() => {
            let emp = employees.find((employee) => employee.emp_Id === id)
            if(!emp) {
                reject("Employee Not Found...") 
            } else {
                resolve(emp)
            }
        },3000)
    });
    return pr;
}
function getBasicSalary(post) {
    let pr = new Promise((resolve, reject) => {
        let basicSalary = 0;
        setTimeout(() => {
            if(post == 'Developer') {
                basicSalary = 50000;
            } else if(post == 'Teacher') {
                basicSalary = 40000
            } else if(post == 'Professor') {
                basicSalary = 35000;
            } else (
                basicSalary = 30000
            )
            resolve(basicSalary)
        }, 2000)
    });
    return pr;
}
getEmployee(100)
.then((result) => {
    console.log(result)
    return getBasicSalary(result.post)
})
.then((result) => {
    console.log(result)
})
.catch((error) => {
    console.log(error)
})