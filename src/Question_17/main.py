class Solution:
    mapping = {
        '2': ['a','b','c'],
        '3': ['d','e','f'],
        '4': ['g','h','i'],
        '5': ['j','k','l'],
        '6': ['m','n','o'],
        '7': ['p','q','r','s'],
        '8': ['t','u','v'],
        '9': ['w','x','y','z']
    }

    def letterCombinations(self, digits: str):
        left = []
        for x in digits:
            if x in Solution.mapping:
                values = Solution.mapping[x]
                left = self.connect_digital(left, values)
        return left

    def connect_digital(self, left, right):
        res = []
        l_len = len(left)
        if l_len == 0:
            for value in right:
                res.append(value)
            return res
        for index in range(l_len):
            for value in right:
                res.append(left[index] + value)
        return res

solution = Solution()
var = solution.letterCombinations("23")
print(var)

