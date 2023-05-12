// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     int removeDuplicates(vector<int> &nums)
//     {
//         set<int> s;
//         for (int i = 0; i < nums.size(); i++)
//         {
//             s.insert(nums[i]);
//         }
//         return s.size();
//     }
// };

// int main()
// {
//     Solution s;
//     vector<int> nums;
//     nums.push_back(0);
//     nums.push_back(0);
//     nums.push_back(1);
//     nums.push_back(1);
//     nums.push_back(1);
//     nums.push_back(2);
//     nums.push_back(3);
//     nums.push_back(3);
//     cout << s.removeDuplicates(nums);
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     int lengthOfLastWord(string s)
//     {
//         int cnt = 0;
//         for (int i = s.length(); i >= 0; i--)
//         {
//             if (s[s.length() - 1] == ' ')
//             {
//                 continue;
//             }
//             if (s[i] != ' ')
//             {
//                 cnt++;
//             }
//             else
//             {
//                 break;
//             }
//         }
//         return cnt;
//     }
// };

// int main()
// {
// }

#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    vector<int> plusOne(vector<int> &digits)
    {
        int n = digits.size() - 1;
        digits[n] += 1;
        int i = n;
        while (digits[i] < 10)
        {
            digits[i] += 1;
            i--;
        }
        return digits;
    }
};

int main()
{
    Solution s;
    vector<int> v;
    v.push_back(1);
    v.push_back(2);
    v.push_back(3);
    s.plusOne(v);
}