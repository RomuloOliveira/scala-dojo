object Fibonacci {
    def main(args: Array[String]): Unit = {
        if (args.length != 1) {
            println(help())
            return
        }

        var num = args(0).toInt

        println(fib(num))
    }

    def help(): String = {
        return "Usage: scala Fibonacci [number]"
    }

    def fib(num: Int): Int = {
        if (num <= 0) return 0
        if (num == 1) return 1

        return fib(num - 1) + fib(num - 2)
    }
}