local function sort(inTbl, ascending, start, finish)
    start, finish = start or 1, finish or #inTbl
    for i = start, finish do
        for j = start, finish - i do
            if ascending and inTbl[j] > inTbl[j + 1] or not ascending and inTbl[j] < inTbl[j + 1] then
                inTbl[j], inTbl[j + 1] = inTbl[j + 1], inTbl[j]
            end
        end
    end
end

local tbl = {2, 6, 34, 8, 4, 5, 1, 13, 68, 9, 12, 23, 7, 3}
sort(tbl, true, 3, 10)

-- Turning it into a string and printing it

local s = ''
for _, val in pairs(tbl) do
    s = s .. (s == '' and '' or ', ') .. val
end

print('{' .. s .. '}')
