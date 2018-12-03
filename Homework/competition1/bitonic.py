def check_bitonic(in_list):
    if len(in_list) < 3 or in_list[0] >= in_list[1]:
        return False

    decreasing = False

    for i, val in enumerate(in_list[1:-1]):
        next_val = in_list[i + 2]
        if val == next_val or decreasing and val < next_val:
            return False
        elif not decreasing:
            decreasing = val > next_val
    return decreasing

print('Should be true: ' + str(check_bitonic([1, 2, 1])))
print('Should be true: ' + str(check_bitonic([1, 5, 7, 9, 8, 2])))
print('Should be true: ' + str(check_bitonic([3, 4, 5, 1])))

print('Should be false: ' + str(check_bitonic([])))
print('Should be false: ' + str(check_bitonic([1, 2])))
print('Should be false: ' + str(check_bitonic([2, 1])))
print('Should be false: ' + str(check_bitonic([1, 3, 5, 7])))
print('Should be false: ' + str(check_bitonic([7, 5, 3, 1])))
print('Should be false: ' + str(check_bitonic([1, 5, 5, 2])))
print('Should be false: ' + str(check_bitonic([5, 2, 1, 3])))

