// Ek function banao jo string ko uppercase me convert kare.
let str = "GourAV kumar"
function convertUppercase(s) {
    let res = "";  
for(let i=0; i<str.length; i++)  {
    let ch = s.charCodeAt(i);
    if(ch>=97 && ch<=122) {
        res = res + String.fromCharCode(ch- 32);
    }
    else {
        res = res + s[i];
    }
}
return res;
}
console.log(convertUppercase(str));
