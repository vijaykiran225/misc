#! 
import random;
difficultyInput = input("Enter your difficulty [easy,med,hard]: ")
difficultyInput=difficultyInput.lower();

endValue=100;

if difficultyInput == "easy" :
	endValue=10
elif difficultyInput == "med" :
	endValue=100
elif difficultyInput == "hard" :
	endValue=500
else:
	print("unable to get difficulty, so going with medium .. Good luck")

number = random.randint(0,endValue);

attempts =1;
found = False;
while not found:
	userInput = int(input("Enter your input: "))	
	if userInput==number:
		print("found after ",attempts," attempts")
		found=True
	elif userInput<number:
		print("think higher")
	else :
		print("think lower")
	attempts+=1

