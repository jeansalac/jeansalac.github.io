import csv
import sys

data = []

def load_data():
    '''Arguments: None
    Return value: None
    Purpose: Loads the data from a file'''
    data.clear()
    with open('Data/dataset.csv', newline='') as f:
        reader = csv.reader(f)
        for row in reader:
            data.append(row)

def get_cell(row, column):
    '''Arguments: row (int), column (int)
    Return value: the value at that cell
    Purpose: get the value at a specified cell
    Raises: IndexError if row or column outside of bounds'''
    
    if row >= len(data):
        raise IndexError("Row argument invalid")
    if column >= len(data[0]):
        raise IndexError("Column argument invalid")
    return data[int(row)][int(column)]

def get_row_titles():
    '''Arguments: None
    Return: List of row titles
    Purpose: Get a list of the row titles
    '''
    row_titles = []
    for row in data:
        row_titles.append(row[0])
    return row_titles

def get_row_by_title(title):
    '''Arguments: title (string)
    Return value: list of values of a row based on the title (yes, a row, not a column as you would expect :) ); if row title isn't in table, returns empty list
    Purpose: to get a row based on the first value in that row
    '''
    for row in data:
        if row[0] == title:
            return row
    return []

def get_silly():
    '''Arguments: None
    Return value: 2
    Purpose: just a simple silly method
    '''
    return 2

def main():
    load_data()
    if len(sys.argv) != 3:
        print("Usage: python3 basic_cl.py row column")
        return
    try:
        row = int(sys.argv[1])
        column = int(sys.argv[2])
    except:
        print("Usage: python3 basic_cl.py row column")
        return
    if -3 <= row < 3 and -3 <= column <= 3:
        print(get_cell(row, column))
    else:
        print("Usage: python3 basic_cl.py row column")

if __name__=='__main__':
    main()