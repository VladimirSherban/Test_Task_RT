class TestTask {
    static void main(String[] args) {

        int[] arr = [1, 3, 4, 5, 1, 5, 4]

        println filterArr(arr)
    }

    static Map<Integer, Integer> filterArr(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>()

        arr.each { k ->
            map[k] = map.getOrDefault(k, 0) + 1
        }

        return map
    }
}
