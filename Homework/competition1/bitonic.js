f=(a,i=1,b)=>a[0]<a[1]&&!!(i>a.length-2?b:a[i]==a[i+1]||(c=a[i]<a[i+1])&&b?!1:f(a,i+1,!c))

console.log('Should be true: ' + f([1, 2, 1]))
console.log('Should be true: ' + f([1, 5, 7, 9, 8, 2]))
console.log('Should be true: ' + f([3, 4, 5, 1]))

console.log('Should be false: ' + f([]))
console.log('Should be false: ' + f([1, 2]))
console.log('Should be false: ' + f([2, 1]))
console.log('Should be false: ' + f([1, 2, 1, 2]))
console.log('Should be false: ' + f([1, 3, 5, 7]))
console.log('Should be false: ' + f([7, 5, 3, 1]))
console.log('Should be false: ' + f([1, 5, 5, 2]))
console.log('Should be false: ' + f([5, 2, 1, 3]))