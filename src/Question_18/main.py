class Solution:

    def partion(self, nums,left,right):
        if left == right:
            return left
        base = left
        tmp = nums[base]
        while left < right:
            while left < right and nums[right] >= tmp:
                right -= 1
            nums[left] = nums[right]
            while left < right and nums[left] <= tmp:
                left += 1
            nums[right] = nums[left]
        nums[left] = tmp
        return left

    def quick_sort(self, nums, left, right):
        if left < right:
            base = self.partion(nums,left,right)
            if base -1 > left:
                self.quick_sort(nums,left,base-1)
            if base +1 < right:
                self.quick_sort(nums,base+1,right)


    def fourSum(self, nums, target):
        if len(nums) <= 3:
            return []
        self.quick_sort(nums,0,len(nums)-1)
        history = set()
        index_1 = 0
        index_4 = len(nums) - 1
        while index_1 + 2 < index_4:
            num_1 = nums[index_1]
            while index_1 + 2 < index_4:
                num_4 = nums[index_4]
                index_2 = index_1 + 1
                index_3 = index_4 - 1
                partial = num_1 + num_4
                while index_2 < index_3:
                    num_2 = nums[index_2]
                    num_3 = nums[index_3]
                    value = partial + num_2 + num_3
                    if value < target:
                        index_2 += 1
                    elif value > target:
                        index_3 -= 1
                    else:
                        var_tuple = (num_1, num_2, num_3, num_4)
                        if var_tuple not in history:
                            history.add(var_tuple)
                        else:
                            index_3 -= 1
                            index_2 += 1
                index_4 -= 1
            index_1 += 1
            index_4 = len(nums) - 1
        return [var for var in history]


if __name__ == '__main__':
    solution = Solution()
    nums = [-2,0,5,-1,-5,5,3]
    target = 0
    res = solution.quick_sort(nums, 0,len(nums)-1)
    print(nums)


