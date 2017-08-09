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

try:
	attempts = int(input("Enter your max attempts "))
	print("Good luck, you get ",attempts," number of attempts")
except Exception as e:
	print("something's not right. so you get only 10 attempts")
	attempts =10;
max_attempts=attempts
found = False;
while (not found) and (attempts >0):
	if attempts==1:
		print("your last chance, make it count")
	try:
		userInput = int(input("Enter your input: "))
	except Exception as e:
		print("enter properly !!")
		continue
	if userInput==number:
		print("found after ",attempts," attempts")
		found=True
	elif userInput<number:
		print("think higher")
	else :
		print("think lower")
	attempts-=1
	print("remaining attempts ",attempts)

if found:
	print("well done , random number was ",number)
	print("challenged for ",max_attempts," , achieved in ",max_attempts-attempts)
	print("percent of success",(1/max_attempts-attempts)*100)
else:
	print("unlucky, number was ",number)
