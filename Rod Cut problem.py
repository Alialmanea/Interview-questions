
def rodCut(price, n):
  if n == 0:
    return 0

  maxVal = float('-inf')   

  for i in range(1, n+1):
    cost = price[i-1] + rodCut(price, n-i)
    if maxVal < cost:
      maxVal = cost

  return maxVal    


def main():
  length = [1, 2, 3, 4, 5, 6, 7, 8]
  price = [1, 5, 8, 9, 10, 17, 17, 20]
  for i in length:
    print(i,"-->",rodCut(price,i))




main()  
