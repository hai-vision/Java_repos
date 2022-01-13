package com.hai.collection_.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hai
 * @date 2022/1/13
 * version 1.0
 */
public class HashSetSource {
    public static void main(String[] args) {
        // 使用Set接口的实现子类，创建HashSet对象
        Set set = new HashSet();

        // 首次添加元素
        // 初始化table表长为16
        // threshold（临界值）：12

        set.add("ball");

        // 再次添加元素
        set.add("messi");

        // 当添加重复元素
        set.add("ball");
        for(int i = 3; i <= 12; i++){
            set.add(i);
        }
        System.out.println(set.size());
        // 当添加元素后，数组长度达到临界值
        set.add("jack");



        /*
            1. 调用add方法
                public boolean add(E e) { // e: ball
                    return map.put(e, PRESENT)==null;
                }

            2. 实现put方法
                2.1 通过调用 hash(key)， 获取相应的hash值。 key: ball
                public V put(K key, V value) {
                    return putVal(hash(key), key, value, false, true);
                }

                hash(key)
                return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);

            3. 调用putVal()方法
                final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {

                    // 定义一个 tab数组，数组的内容为 Node<K, V>
                    Node<K,V>[] tab; Node<K,V> p; int n, i;

                    // 首次执行添加操作，tab == null
                    // 执行 resize()操作, 即扩容操作

                    if ((tab = table) == null || (n = tab.length) == 0)
                        n = (tab = resize()).length;

                    // 将table表长与hash值做与运算，得到相应的索引（数组下标），通过下标得到表中的Node元素
                    // 将表中的Node元素赋给 p
                    // 判断 p 是否 null(如该位置没有元素，则将 key 放入其中)
                    if ((p = tab[i = (n - 1) & hash]) == null)
                        tab[i] = newNode(hash, key, value, null);

                    // 当前位置已有元素时，利用equals方法一次比较链表元素是否相同
                    else {
                        Node<K,V> e; K k;
                        // 如果传入 key的哈希值与当前Node的哈希值并且关键字的内容相同，则不添加
                        if (p.hash == hash &&
                            ((k = p.key) == key || (key != null && key.equals(k))))
                            e = p;
                        // 判断 p 是不是红黑树
                        else if (p instanceof TreeNode)
                            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);

                        // 当哈希值相同，并且与当前位关键字的内容不同
                        else {
                            // 利用for循环，将传入的 key 依次与单链表上的key比较
                            for (int binCount = 0; ; ++binCount) {
                                // 若遍历到单链表的末尾都未有相同的key, 则将传入的key 插入到链表末尾
                                // 先比较当前索引的下一位置
                                if ((e = p.next) == null) {
                                    p.next = newNode(hash, key, value, null);
                                    // 把新结点插入到链表的末尾后，立即判断当前单链表的结点个数是否等于8时，如果等于则进行树化（红黑树）
                                    // 树化的条件
                                    // 1. 单条链表的长度等于8
                                    // 2. table表的容量大于等于64
                                    //    2.1 当单链表的表长等于，但table表的容量小于64，则不会立即树化
                                    //    2.2 首先会将table表进行扩容，直到table表的容量等于64，才会树化
                                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                        treeifyBin(tab, hash);
                                    break;
                                }
                                // 如果 单链表上的Node元素的哈希值和关键字内容与传入的一致，则不添加
                                if (e.hash == hash &&
                                    ((k = e.key) == key || (key != null && key.equals(k))))
                                    break;
                                // 后移，更新e的位置
                                p = e;
                            }
                        }
                        if (e != null) { // existing mapping for key
                            V oldValue = e.value;
                            if (!onlyIfAbsent || oldValue == null)
                                e.value = value;
                            afterNodeAccess(e);
                            return oldValue;
                        }
                    }
                    ++modCount;
                    // 当table表长达到临界值时，则table表进行扩容（扩二倍）
                    if (++size > threshold)
                        resize();
                    afterNodeInsertion(evict);
                    return null;
                }

                     */

    }
}
