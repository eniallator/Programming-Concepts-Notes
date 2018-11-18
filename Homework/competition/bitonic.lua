local function checkBitonic(inTbl)
    if #inTbl < 3 or inTbl[1] > inTbl[2] then
        return false
    end

    decreasing = false

    for i, val in ipairs(inTbl) do
        if i ~= 1 and i ~= #inTbl then
            nextVal = inTbl[i + 1]
            if val == nextVal or decreasing and val < nextVal then
                return false
            elseif not decreasing then
                decreasing = val > nextVal
            end
        end
    end

    return decreasing
end

print('Should be true: ' .. tostring(checkBitonic({1, 2, 1})))
print('Should be true: ' .. tostring(checkBitonic({1, 5, 7, 9, 8, 2})))
print('Should be true: ' .. tostring(checkBitonic({3, 4, 5, 1})))

print('Should be false: ' .. tostring(checkBitonic({})))
print('Should be false: ' .. tostring(checkBitonic({1, 2})))
print('Should be false: ' .. tostring(checkBitonic({2, 1})))
print('Should be false: ' .. tostring(checkBitonic({1, 3, 5, 7})))
print('Should be false: ' .. tostring(checkBitonic({7, 5, 3, 1})))
print('Should be false: ' .. tostring(checkBitonic({1, 5, 5, 2})))
print('Should be false: ' .. tostring(checkBitonic({5, 2, 1, 3})))
