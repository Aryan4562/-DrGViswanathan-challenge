class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        running_sum = 0
        ans = []

        for num in nums:
            running_sum = running_sum + num
            ans.append(running_sum)

        return ans    

            

