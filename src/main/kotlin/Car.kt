class Car {
    var wheels = listOf<Wheel>()
    private var doorLock: String = "locked"
    var fuel: Int = 15
        private set

    constructor() {}

    constructor(wheels: List<Wheel>) {
        this.wheels = wheels
    }

    fun unlockDoor(): Unit {
        doorLock = "unlocked"
    }

    class Wheel {

    }
}