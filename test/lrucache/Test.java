package cache;

class Test {
    public static void main(String[] args){
        // (キー)整数・(値)文字列
        LRUCache<Integer, String> cache1 = new LRUCache<>(2);
        cache1.put(1, "Apple");
        cache1.put(2, "Banana");
        System.out.println(cache1.get(1)); // "Apple"
        cache1.put(3, "Orange");           // 容量超過により"Banana"を削除
        System.out.println(cache1.get(2)); // null

        // (キー)文字列・(値)整数
        LRUCache<String, Integer> cache2 = new LRUCache<>(3);
        cache2.put("A", 100);
        cache2.put("B", 200);
        cache2.put("C", 300);
        System.out.println(cache2.get("B")); // 200
        cache2.put("D", 400);                // "A"が削除
        System.out.println(cache2.get("A")); // null
    }
}