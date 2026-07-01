let products = [
    { id: 101, name: "Laptop", price: 50000 },
    { id: 102, name: "Mobile", price: 20000 }
]
let getProducts = (id) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
         let product = products.find(product => product.id === id)   
         if(product) {
            resolve(product)
         } else {
            reject("Product Not Found...")
         }
        }, 3000);
    })
}
async function printPrice() {
    try {
        console.log(await getProducts(101));
    } catch (error) {
        console.log(error);
    }
}
printPrice();