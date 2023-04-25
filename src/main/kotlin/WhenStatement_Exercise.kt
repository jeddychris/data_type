fun main(args: Array<String>) {
    println("Dial *544#")
    var num = readLine()!!.toString()

    println("Choose your Option available on *544#_Safaricom;  0-10/98")
        var number = readLine()!!.toInt()
        when (number) {
            0 -> println("Sh99=1GB 24hr")
            1 -> println("Data Deals")
            2 -> println("Daily Bundles")
            3 -> println("Weekly Bundles")
            4 -> println("GO MONTHLY")
            5 -> println("No Expiry")
            6 -> println("Video Bundles")
            7 -> println("Okoa Data")
            8 -> println("Lipa Mdogo")
            9 -> println("Data Plus NEW")
            10 -> println("Hot Minutes")
            98 -> println("More")

        }
}