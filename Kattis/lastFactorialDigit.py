for i in range(int(input())):
  print(__import__('math').factorial(int(input())) % 10)