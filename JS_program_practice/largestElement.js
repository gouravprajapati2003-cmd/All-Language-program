// Ek function banao jo array ka largest element return kare
function largestElement(n) {
    let largest = n[0];
    for(let i=0; i<=n.length; i++) {
        if(n[i] > largest) {
            largest = n[i];
        }
    }
    return largest;
}
let arr = [12, 5, 34, 45, 25];
console.log(largestElement(arr));