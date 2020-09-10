

public class Singleton private constructor(){

    private object HOLDER{
        val INSTANCE = Singleton()
    }

    companion object{
        val instance: Singleton by lazy {
            HOLDER.INSTANCE
        }
    }

    public fun show(){
        println("Singleton")
    }
}

object SingletonKotLin{
    public fun show(){
        println("SingletonDF")
    }
}


fun main(args: Array<String>) {
    Singleton.instance.sendMessage()
    SingletonKotLin.sendMessage()
}