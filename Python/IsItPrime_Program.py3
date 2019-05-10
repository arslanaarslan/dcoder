def isItPrime(number, divider = 2):
	if number == divider:         
		return True     
	if (number % divider) == 0:        
		return False     
	return isItPrime(number, divider + 1) 
	
number = input("Number: ") 

if isItPrime(number):     
	print("Number is prime.") 
else:     
	print("Number is not prime.")