# 递归
>递归：函数（方法）直接或间接调用自身。是一种常用的编程技巧

## 函数的递归调用过程
1. 如果递归调用没有终止，将会一直消耗栈空间 :最终导致栈内存溢出（Stack Overflow）
2. 所以必需要有一个明确的结束递归的条件 :也叫作边界条件、递归基
3. 注意：使用递归不是为了求得最优解，是为了简化解决问题的思路，代码会更加简洁
4. 递归求出来的很有可能不是最优解，也有可能是最优解

## 递归的基本思想
1. 拆解问题
    把规模大的问题变成规模较小的同类型问题
    规模较小的问题又不断变成规模更小的问题
    规模小到一定程度可以直接得出它的解

2. 求解
    由最小规模问题的解得出较大规模问题的解
    由较大规模问题的解不断得出规模更大问题的解
    最后得出原来问题的解

3. 凡是可以利用上述思想解决问题的，都可以尝试使用递归
    很多链表、二叉树相关的问题都可以使用递归来解决
     因为链表、二叉树本身就是递归的结构（链表中包含链表，二叉树中包含二叉树）

## 递归的使用套路
1. 明确函数的功能
    先不要去思考里面代码怎么写，首先搞清楚这个函数的干嘛用的，能完成什么功能？
2. 明确原问题与子问题的关系
    寻找 f(n) 与 f(n – 1) 的关系
3. 明确递归基（边界条件）
    递归的过程中，子问题的规模在不断减小，当小到一定程度时可以直接得出它的解
    寻找递归基，相当于是思考：问题规模小到什么程度可以直接得出解


# 动态规划：
>动态规划，简称DP，是求解最优化问题的一种常用策略
     
##通常的使用套路（一步一步优化）
1. 暴力递归（自顶向下，出现了重叠子问题） 
2. 记忆化搜索（自顶向下）
3. 递推（自底向上）

## 动态规划的常规步骤
>动态规划中的“动态”可以理解为是“会变化的状态”
1. 定义状态（状态是原问题，子问题的解）
>比如定义dp(i)的含义
2. 设置初始状态值(边界)）
>比如设置dp(0)的值
3. 确定状态转移方程）
>比如确定dp(n-1)跟dp(n)的关系
    
##动态规划的一些相关概念
1. 将复杂的原问题拆解成若干个简单的子问题
2. 每个子问题仅仅解决1次，并保存它们的解
3. 最后推导出原问题的解

##可以用动态规划来解决的问题，通常具备2个特点
1. 最优子结构（最优化原理）：通过求解子问题的最优解，可以获得原问题的最优解
2. 无后效性
<br>某阶段的状态一旦确定，则此后过程的演变不再受此前各状态及决策的影响（未来与过去无关）
<br>在推导后面阶段的状态时，只关心前面阶段的具体状态值，不关心这个状态是怎么一步步推导出来的

1. 练习1 – 找零钱
2. 练习2 – 最大连续子序列和
3. 练习3 – 最长上升子序列（LIS）
4. 练习4 – 最长公共子序列（LCS）
5. 练习5 – 最长公共子串
6. 练习6 – 0-1背包



