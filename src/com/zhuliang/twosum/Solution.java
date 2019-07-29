package com.zhuliang.twosum;

import AddTwoNumbers.ListNode;

import java.util.Stack;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int numA = convertToNumber ( l1 );
        int numB = convertToNumber ( l2 );
        return  numberToNodeList ( numA + numB );
    }


    public static int[] twoSum(int[] numbers, int target) {
        int indexA = 0;
        int indexB = indexA + 1;
        int[] res = new int[]{};
        while (indexA < numbers.length - 1 && indexB < numbers.length) {
            if ( numbers[indexB] + numbers[indexA] == target ) {
                res = new int[]{indexA, indexB};
                break;
            } else {
                indexB++;
                if ( indexB == numbers.length ) {
                    indexA++;
                    indexB = indexA + 1;
                    continue;
                }
            }
        }
        return res;

    }

    public static int convertToNumber(ListNode pos1) {
        Stack s = new Stack ( );
        ListNode node = pos1;
        int res = 0;
        while (true) {
            if ( node != null ) {
                s.push ( node );
                node = node.next;
            } else break;
        }
        while (!s.empty ( )) {
            ListNode l = (ListNode) s.pop ( );
            res = res * 10 + l.val;
        }
        return res;
    }

    public static ListNode numberToNodeList(int num) {
        ListNode l = null;
        ListNode last = l;
        while (num!=0) {
            int pos1 = num % 10;
            ListNode n = new ListNode ( pos1 );
            if ( l == null ) {
                l = n;
                last = n;
            } else {
                last.next = n;
                last = n;
            }
            num = num/10;
        }

        return l;
    }
}
