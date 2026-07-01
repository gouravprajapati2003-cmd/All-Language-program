let accounts = [
    { id: 101, name: "Aman", accountNo: "ACC101" },
    { id: 102, name: "Rahul", accountNo: "ACC102" },
    { id: 103, name: "Priya", accountNo: "ACC103" }
];

// 2 sec baad account return karega
function getAccount(id) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let account = accounts.find(acc => acc.id === id);
            if (account) {
                resolve(account);
            } else {
                reject("Account Not Found");
            }
        }, 2000);
    });
}

// 1 sec baad balance return karega
function getBalance(account) {
    return new Promise((resolve) => {
        let balance = 0;
        setTimeout(() => {
           if(account.id == 101) {
            balance = 50000;
           }  else if(account.id == 102) {
            balance = 30000;
           } else {
            balance = 10000;
           }
            resolve(balance);
        }, 1000);
    });
}

async function showBalance(id) {
    try {
        let account = await getAccount(id);
        console.log("Account Holder:", account.name);

        let balance = await getBalance(account);
        console.log("Balance: ₹" + balance);
    } catch (error) {
        console.log(error);
    }
}

showBalance(102);