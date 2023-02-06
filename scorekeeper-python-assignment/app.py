import sys
print('Running in environment :' + sys.prefix)


def read_input():
    print("> q to quit")
    read = input()
    while read != 'q':
        print("I read :" + read)
        read = input()


## Main Method
print("**************************")
print("**    Scorekeeper       **")
print("**************************")
read_input()
print("*********END*****************")
