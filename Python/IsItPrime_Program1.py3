def is_it_prime(number, divider = 2):
	if number == divider:         
		return True;
	if (number % divider) == 0:        
		return False;
	return is_it_prime(number, divider + 1);
	
number = int(input("Number: ")) 

if is_it_prime(number):     
	print("Number is prime.") 
else:     
	print("Number is not prime.")
