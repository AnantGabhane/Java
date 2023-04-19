        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * NumSum(n / 10);