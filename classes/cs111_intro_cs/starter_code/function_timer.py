# File: function_timer.py
# Purpose: Compare the runtime of different functions and see how they change with input size.
# Adapted by Jean Salac from materials by Profs. Anya Vostinar and Tanya Amert

import time


def avg_list(lst):
  ''' Return the mean of a list of integers. '''
  tot = 0
  for i in range(len(lst)):
    tot = tot + lst[i]
  return tot / len(lst)

def find_duplicates(items):
    duplicates = []
    for i in range(len(items)):
        for j in range(i + 1, len(items)):
            if items[i] == items[j]:
                duplicates.append(items[i])
    return duplicates

def get_first_item(items):
    if items:
        return items[0]
    else:
        return None

def find_max(items):
    max_val = items[0]
    for item in items:
        if item > max_val:
            max_val = item
    return max_val



def add(a, b):
  ''' Return the sum of two integers. '''
  tot = a + b
  return tot

def run_trials(input_size, num_trials):
    ''' Run trials of various functions and prints results '''
    list_of_numbers = list(range(input_size))

    time_find_max = 0
    time_add = 0
    time_find_duplicates = 0
    time_get_first_item = 0
    for i in range(num_trials):

        # Test time of avg_list
        print("Finding average of list of size", input_size)
        t = time.time()        
        avg_list(list_of_numbers)
        time_avg_list = (time.time() - t)

        #TODO: Uncomment the rest when you are ready to test the other functions! 
        # You may want to comment out some of the tests if they are taking a long time, 
        # especially for larger input sizes.



        # # Test time of find_duplicates
        # print("Finding duplicates in list of size", input_size)
        # t = time.time()
        # find_duplicates(list_of_numbers)
        # time_find_duplicates += (time.time() - t)

        # # Test time of get_first_item
        # print("Getting first item from list of size", input_size)
        # t = time.time()
        # get_first_item(list_of_numbers)
        # time_get_first_item += (time.time() - t)

        # # Test time of find_max
        # print("Finding max from list of size", input_size)
        # t = time.time()
        # find_max(list_of_numbers)
        # time_find_max += (time.time() - t)

        # Test time of add
        # print("Adding", 1, "and", input_size)
        # t = time.time()
        # add(1, input_size) #only changing one of the inputs
        # time_add += (time.time() - t)

    #print average results
    print("------------------------------------")
    print(f"Average time for avg_list with input size {input_size}: {time_avg_list / num_trials * 1000:.6f} milliseconds")
    
    #TODO: Remember to uncomment here when you are ready to test the other functions!
    # print("------------------------------------")
    # print(f"Average time for find_duplicates with input size {input_size}: {time_find_duplicates / num_trials * 1000:.6f} milliseconds")
    # print(f"Average time for get_first_item with input size {input_size}: {time_get_first_item / num_trials * 1000:.6f} milliseconds")
    # print(f"Average time for find_max with input size {input_size}: {time_find_max / num_trials * 1000:.6f} milliseconds")
    # print(f"Average time for add with input size {input_size}: {time_add / num_trials * 1000:.6f} milliseconds")
        


def time_of_functions():
    """
    Run trials of various functions and prints results
    """
    # Parameters
    input_size = 1000 #TODO: change this to 20, 50, 100, 500, 1000, etc to see how runtime changes with size
    num_trials = 10


    # Get data for this value of input_size
    print("Working on input size:", input_size)  
    run_trials(input_size, num_trials)



def main():
    time_of_functions()

if __name__ == "__main__":
    main()