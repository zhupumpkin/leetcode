
class Solution:
    def fabs(self,num):
        if num > 0:
            return num
        else:
            return -num

    def threeSumClosest(self, nums, target):
        min_delta = 999999999
        fabs_min_delta = min_delta
        length = len(nums)
        nums.sort()
        for index in range(length):
            var = nums[index]
            left = index + 1
            right = length - 1
            while left < right:
                delta_value = var + nums[left] + nums[right] - target
                if delta_value == 0:
                    return delta_value + target
                if delta_value < 0:
                    left += 1
                    if delta_value > -fabs_min_delta:
                        min_delta = delta_value
                        fabs_min_delta = self.fabs(min_delta)
                else:
                    right -= 1
                    if delta_value < fabs_min_delta:
                        min_delta = delta_value
                        fabs_min_delta = min_delta
        return min_delta + target


if __name__ == "__main__":
    nums = [0,2,1,-3]
    target = 1
    solution = Solution()
    result = solution.threeSumClosest(nums,target)
    print(result)
