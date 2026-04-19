<h1 align="center">☕ DSA in Java — Striver's A-Z Sheet</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=flat-square&logo=java" />
  <img src="https://img.shields.io/badge/Sheet-Striver's%20A--Z-blueviolet?style=flat-square" />
  <img src="https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square" />
  <img src="https://img.shields.io/badge/Problems%20Solved-0-blue?style=flat-square" />
</p>

<p align="center">
  Solving <strong>Striver's A-Z DSA Sheet</strong> problems daily in Java — organized by topic and difficulty.
  <br/>
  Built to sharpen problem-solving skills and maintain consistency.
</p>

---

## 📂 Repository Structure

```
DSA-Java/
├── 01-Arrays/
│   ├── Easy/
│   ├── Medium/
│   └── Hard/
├── 02-BinarySearch/
├── 03-Strings/
├── 04-LinkedList/
├── 05-Recursion/
├── 06-BinaryTrees/
├── 07-BST/
├── 08-Graphs/
├── 09-DynamicProgramming/
├── 10-Stacks-Queues/
├── 11-Heaps/
└── 12-Tries/
```

Each `.java` file contains:

- Problem statement (as a comment)
- Approach explanation
- Time & Space complexity
- Clean solution code

---

## 📊 Progress Tracker

| #   | Topic               | Easy  | Medium | Hard  | Total |
| --- | ------------------- | ----- | ------ | ----- | ----- |
| 01  | Arrays              | 0     | 0      | 0     | 0     |
| 02  | Binary Search       | 0     | 0      | 0     | 0     |
| 03  | Strings             | 0     | 0      | 0     | 0     |
| 04  | Linked List         | 0     | 0      | 0     | 0     |
| 05  | Recursion           | 0     | 0      | 0     | 0     |
| 06  | Binary Trees        | 0     | 0      | 0     | 0     |
| 07  | BST                 | 0     | 0      | 0     | 0     |
| 08  | Graphs              | 0     | 0      | 0     | 0     |
| 09  | Dynamic Programming | 0     | 0      | 0     | 0     |
| 10  | Stacks & Queues     | 0     | 0      | 0     | 0     |
| 11  | Heaps               | 0     | 0      | 0     | 0     |
| 12  | Tries               | 0     | 0      | 0     | 0     |
|     | **Total**           | **0** | **0**  | **0** | **0** |

---

## 🧩 Solution Template

Every solution follows this format:

```java
// Problem  : Two Sum
// Difficulty: Easy
// Topic     : Arrays
// Source    : Striver's A-Z DSA Sheet
// Link      : https://leetcode.com/problems/two-sum/
//
// Approach  : Use a HashMap to store seen values and check complement.
// Time      : O(n)  |  Space: O(n)

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## 🚀 How to Run

```bash
# Compile
javac filename.java

# Run
java ClassName
```

> Requires Java 8 or above. Recommended IDE: VS Code with the Java Extension Pack.

---

## 📌 Resources

- 🔗 [Striver's A-Z DSA Sheet](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/)
- 📺 [Striver's YouTube Channel](https://www.youtube.com/@takeUforward)
- ☕ [Java Documentation](https://docs.oracle.com/en/java/)

---

## 📜 License

This repository is for personal learning and practice. Feel free to use the code as a reference.

---

<p align="center">
  Made with caffiene and consistency — one problem at a time.
</p>
