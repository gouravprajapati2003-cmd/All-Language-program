// Ek async function banao jo 2 second baad number ka double return kare
function getNumber(n) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            //let num = n*2;
            resolve(n*2);
        }, 2000);
    })
}
async function printNumber() {
    let num = await getNumber(10);
    console.log(num);    
}
printNumber();