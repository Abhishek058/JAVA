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

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     vector<int> plusOne(vector<int> &digits)
//     {
//         int n = digits.size() - 1;
//         digits[n] += 1;
//         int i = n;
//         while (digits[i] < 10)
//         {
//             digits[i] += 1;
//             i--;
//         }
//         return digits;
//     }
// };

// int main()
// {
//     Solution s;
//     vector<int> v;
//     v.push_back(1);
//     v.push_back(2);
//     v.push_back(3);
//     s.plusOne(v);
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     int binDeci(string str)
//     {
//         int n = stoi(str);
//         int deci = 0;
//         int i = 0;
//         while (n != 0)
//         {
//             deci += n % 10 * pow(2, i);
//             n /= 10;
//             i++;
//         }
//         return deci;
//     }

//     int deciBin(int n)
//     {
//         int binaryNumber[100], num = n;
//         int i = 0;
//         int ans = 0;
//         while (n > 0)
//         {
//             binaryNumber[i] = n % 2;
//             n = n / 2;
//             i++;
//         }
//         for (int j = i - 1; j >= 0; j--)
//         {
//             ans = ans * 10 + binaryNumber[j];
//         }
//         return ans;
//     }
//     string addBinary(string a, string b)
//     {
//         int n = binDeci(a) + binDeci(b);
//         string str = to_string(deciBin(n));
//         return str;
//     }
// };

// int main()
// {
//     Solution s;
//     cout << s.addBinary("11", "1");
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     int addDigits(int num)
//     {
//         int res = 0;
//         while (num != 0)
//         {
//             res += num % 10;
//             num /= 10;
//         }
//         if(res<10){
//             return res;
//         }
//         return addDigits(res);
//     }
// };

// int main()
// {
//     Solution s;
//     cout << s.addDigits(38);
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     bool isAnagram(string s, string t)
//     {
//         if (s.length() != t.length())
//         {
//             return false;
//         }

//         unordered_map<char, int> charCount1;
//         unordered_map<char, int> charCount2;

//         for (char c : s) {
//             charCount1[c]++;
//         }
//         for (char c : t) {
//             charCount2[c]++;
//         }

//         if(charCount1 == charCount2){
//             return true;
//         }
//         return false;
//     }
// };

// int main()
// {
//     Solution s;
//     cout<<s.isAnagram("aacc", "ccac");
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     bool isVowel(char ch)
//     {
//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//         {
//             return true;
//         }
//         return false;
//     }
//     string reverseVowels(string s)
//     {
//         int i = 0;
//         int j = s.length() - 1;
//         while (i <= j)
//         {
//             if (isVowel(s[i]) && isVowel(s[j]))
//             {
//                 swap(s[i],s[j]);
//                 i++;
//                 j--;
//             }
//             else if (isVowel(s[i]) && !isVowel(s[j]))
//             {
//                 j--;
//             }
//             else if (!isVowel(s[i]) && isVowel(s[j]))
//             {
//                 i++;
//             }
//             else{
//                 i++;
//                 j--;
//             }
//         }
//         return s;
//     }
// };

// int main()
// {
//     Solution s;
//     cout << s.reverseVowels("leetcode");
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     bool wordPattern(string pattern, string s)
//     {
//         stringstream ss(s);
//         vector<string> words;
//         string word;
//         string patt = "";
//         while (ss >> word)
//         {
//             words.push_back(word);
//         }
//         if (words.size() != pattern.size()){
//             return false;
//         }

//     }
// };

// int main()
// {
//     Solution s;
//     cout << s.wordPattern("abba", "dog cat cat dog");
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution {
// public:
//     char findTheDifference(string s, string t) {
//         int a = 0, b = 0;
//         for(int i=0;i<s.length();i++){
//             a+=s[i];
//         }
//         for(int i=0;i<t.length();i++){
//             b+=t[i];
//         }
//         char res = b - a;
//         return res;
//     }
// };
// int main(){
//     Solution s;
//     cout<<s.findTheDifference("abcd","abcde");
// }

// #include <bits/stdc++.h>
// using namespace std;

// int singleNumber(vector<int> &nums)
// {
//     int n = nums.size();
//     int res = 0;
//     unordered_map<int, int> freq;
//     for (int e : nums)
//     {
//         freq[e]++;
//     }
//     for (const auto &pairs : freq)
//     {
//         if (pairs.second == 1)
//         {
//             res = pairs.first;
//         }
//     }
//     return res;
// }

// int main()
// {
//     vector<int> v = {4,1,2,1,2};
//     cout << singleNumber(v);
// }

// #include <bits/stdc++.h>
// using namespace std;

// int main()
// {
//     int arr[] = {1, 2, 3, 4, 5};
//     int m = 2;
//     int n = 4;
//     while (m != n)
//     {
//         swap(arr[m - 1], arr[n - 1]);
//         m++;
//         n--;
//     }
//     for (int i = 0; i < 5; i++)
//     {
//         cout << arr[i] << " ";
//     }
// }

// #include <bits/stdc++.h>
// using namespace std;

// bool check(vector<int> &v, int x)
// {
//     if (x == 1)
//     {
//         if (v[0] == 0)
//         {
//             return false;
//         }
//         v[0]--;
//     }
//     if (x == 2)
//     {
//         if (v[1] == 0)
//         {
//             return false;
//         }
//         v[1]--;
//     }
//     if (x == 3)
//     {
//         if (v[2] == 0)
//         {
//             return false;
//         }
//         v[2]--;
//     }
//     return true;
// }

// int main()
// {
//     vector<int> v = {1, 1, 0};
//     int m;
//     cin >> m;
//     for (int i = 0; i < m; i++)
//     {
//         int x;
//         cin >> x;
//         cout << check(v, x);
//     }
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     int lengthOfLongestSubstring(string s)
//     {
//         vector<set<char>> v;
//         int maxLen = 0;

//         for (int i = 0; i < s.length(); i++)
//         {
//             set<char> set;
//             set.insert(s[i]);
//             for (int j = i + 1; j < s.length(); j++)
//             {
//                 if (s[i] != s[j])
//                 {
//                     set.insert(s[j]);
//                 }
//                 else
//                 {
//                     break;
//                 }
//             }
//             v.push_back(set);
//             for (char ch : set)
//             {
//                 cout << ch << " ";
//             }
//             cout << endl;
//         }

//         // for (int i = 0; i < v.size(); i++)
//         // {
//         //     if (maxLen < v[i].size())
//         //     {
//         //         maxLen = v[i].size();
//         //     }
//         // }

//         // return maxLen;
//     }
// };

// int main()
// {
//     Solution s1;
//     s1.lengthOfLongestSubstring("abcabcbb");
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     bool isPalindrome(string str)
//     {
//         string reversed = str;
//         reverse(reversed.begin(), reversed.end());
//         return str == reversed;
//     }

//     string longestPalindrome(string s)
//     {
//         int n = s.length();
//         if (n == 1)
//         {
//             return s;
//         }

//         string longest = "";

//         for (int i = 0; i < n; i++)
//         {
//             for (int j = i + 1; j <= n; j++)
//             {
//                 string substr = s.substr(i, j - i);
//                 if (isPalindrome(substr) && substr.length() > longest.length())
//                 {
//                     longest = substr;
//                 }
//             }
//         }

//         return longest;
//     }
// };

// int main()
// {
//     Solution s;
//     cout << s.longestPalindrome("a");
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     string convert(string s, int numRows)
//     {
//         string str = "";
//         vector<string> arr(numRows, "");
//         for (int i = 0; i < s.length();)
//         {
//             for (int j = 0; j < numRows; j++)
//             {
//                 arr[j] += s[i++];
//             }
//             for (int j = numRows - 2; j > 0; j--)
//             {
//                 arr[j] += s[i++];
//             }
//         }
//         for (auto &x : arr)
//             str += x;
//         return str;
//     }
// };

// int main()
// {
//     Solution s;
//     cout << s.convert("PAYPALISHIRING", 3);
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Solution
// {
// public:
//     bool isAnagram(string s1, string s2)
//     {
//         sort(s1.begin(), s1.end());
//         sort(s2.begin(), s2.end());
//         if (s1 == s2)
//         {
//             return true;
//         }
//         return false;
//     }
//     void groupAnagrams(vector<string> &strs)
//     {
//         vector<set<string>> res;
//         for (int i = 0; i < strs.size(); i++)
//         {
//             set<string> v;
//             for (int j = 0; j < strs.size(); j++)
//             {
//                 if (isAnagram(strs[i], strs[j]))
//                 {
//                     v.insert(strs[j]);
//                     v.insert(strs[i]);
//                 }
//             }
//             res.push_back(v);
//         }

//         for (const auto &row : res)
//         {
//             for (const auto &element : row)
//             {
//                 std::cout << element << " ";
//             }
//             std::cout << std::endl;
//         }
//     }
// };

// int main()
// {
//     Solution s;
//     vector<string> strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//     s.groupAnagrams(strs);
// }

#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    int firstMissingPositive(vector<int> &nums)
    {
        int n = nums.size();

        auto it = find(nums.begin(), nums.end(), 1);
        if (it == nums.end())
        {
            return 1;
        }
        sort(nums.begin(), nums.end());

        int idx;
        for (int i = 0; i < n; i++)
        {
            if (nums[i] > 0)
            {
                idx = i;
                break;
            }
        }
        int j = 0;
        for (int i = idx; i < n - 1; i++)
        {
            if (nums[i] != ++j)
            {
                break;
            }
            else
            {
                continue;
            }
        }
        return j;
    }
};

int main()
{
    Solution s;
    vector<int> nums = {3, 4, -1, 1};
    cout << s.firstMissingPositive(nums);
}