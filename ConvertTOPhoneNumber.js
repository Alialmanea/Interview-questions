function createPhoneNumber(numbers, format){
  Format =  format;
  for(let i = 0; i < numbers.length; i++){
    Format = format.replace('x',numbers[i]);
  }
  return format;
}


print(createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0],'(xxx) -xxx-xxxx'));

