/*
    LEET CODE #9

*/

export const palindromeNumber = (x:number):boolean=>{
    // convert the number to a string then an array 
    const arr = Array.from(String(x), Number);
    console.log(arr);
    if(arr.length==1) return true;
    if(arr.length==2){
        if(arr[0]!==arr[1]) return false;
    }
    // complex long strings 
    const arryLen = arr.length/2;
    console.log(arryLen);
    for(let i=0;i<arryLen/2;i++){
        for(let j=arr.length-1;j>=arryLen/2;j--){
            // debugging purpose 
                if(arr[i]!==arr[j])
                {
                    console.log(`i: ${i}`);
                    console.log(`j: ${j}`);
                    return false;
                }
        }
        console.log(`$i : ${i}`);
    }
    return true;
}