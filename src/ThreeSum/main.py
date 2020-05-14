

class Solution:
    def threeSum(self, nums):
        result = []
        length = len(nums)
        if not nums or length < 3:
            return result

        nums.sort()
        result = [

        ]
        history = {}
        for index in range(length):
            var = nums[index]
            if nums[index] > 0:
                break
            left = index + 1
            right = length - 1
            while left < right:
                value = var + nums[left] + nums[right]
                if value > 0:
                    right -= 1
                    continue
                elif value < 0:
                    left += 1
                    continue
                else:
                    ready = (var, nums[left], nums[right])
                    if self.check_result_not_exist(ready,history):
                        history[ready] = None
                        result.append(ready)
                    left += 1
                    right -= 1

        return result

    def check_result_not_exist(self,ready,history):
        if ready not in history:
            return True
        else:
            return False



if __name__ == "__main__":
    nums =  [-1, 0, 1, 2, -1, -4]
    solution = Solution()
    result = solution.threeSum(nums)
    print(result)
