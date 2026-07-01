let students = [
    { id: 1, name: "Aman" },
    { id: 2, name: "Rahul" },
    { id: 3, name: "Priya" }
]
const getStudent = (id) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let student = students.find(student => student.id === id)
            if(student) {
                resolve(student)
            } else {
                reject("Student does not exist");
            }
        }, 5000);
    })
}
async function printStudent() {
    try {
        console.log((await getStudent(2)));
    } catch (error) {
        console.log(error);
    } 
}
printStudent();