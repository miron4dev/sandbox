int fib(int n) {
    int prev = 0, next = 1, result = 0;
    if (n == 0) {
        return 0;
    }

    for (int i = 2; i <= n; i++) {
        result = prev + next;
        prev = next;
        next = result;
    }
    return result;
}