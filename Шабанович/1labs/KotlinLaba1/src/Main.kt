package main

// Абстрактный класс цветка
abstract class AbstractFlower
{
    var height: Int = 0

    abstract fun grow()
    abstract fun releaseLeaf(): Leaf
    abstract fun releaseBud(): Bud
    abstract fun wither()
}

// Класс Роза
class Rose : AbstractFlower()
{
    override fun grow()
    {
        println("Роза растет.")
        height += 10
    }

    override fun releaseLeaf(): Leaf
    {
        println("Роза выпускает лист.")
        return Leaf(5)
    }

    override fun releaseBud(): Bud
    {
        println("Роза выпускает бутон.")
        return Bud("Розовый")
    }

    override fun wither()
    {
        println("Роза засохла.")
        height = 0
    }
}

// Класс Гладиолус
class Gladiolus : AbstractFlower()
{
    override fun grow()
    {
        println("Гладиолус растет.")
        height += 8
    }

    override fun releaseLeaf(): Leaf
    {
        println("Гладиолус выпускает лист.")
        return Leaf(7)
    }

    override fun releaseBud(): Bud
    {
        println("Гладиолус выпускает бутон.")
        return Bud("Красный")
    }

    override fun wither()
    {
        println("Гладиолус засох.")
        height = 0
    }
}

// Класс Лист
class Leaf(val length: Int)
{
    fun destroy()
    {
        println("Лист разрушен.")
    }
}

// Класс Бутон
class Bud(val scent: String)
{
    val petal = Petal("Красный")

    fun dropPetals()
    {
        println("Бутон сбросил лепестки.")
    }

    fun destroy()
    {
        println("Бутон разрушен.")
    }
}

// Класс Лепесток
class Petal(val color: String)
{
    fun destroy()
    {
        println("Лепесток разрушен.")
    }
}

// Класс Человек
class Human(val name: String)
{
    fun waterFlower(flower: AbstractFlower)
    {
        println("$name поливает цветок.")
        flower.grow()
    }

    fun smellFlower(flower: AbstractFlower)
    {
        println("$name понюхал цветок.")
    }

    fun plantFlower(flower: AbstractFlower)
    {
        println("$name посадил цветок.")
    }
}

// Основная функция
fun main()
{
    val human = Human("Иван")
    val rose = Rose()
    val gladiolus = Gladiolus()

    // Человек сажает цветок
    human.plantFlower(rose)

    // Человек поливает цветок
    human.waterFlower(rose)

    // Цветок выпускает лист и бутон
    val leaf = rose.releaseLeaf()
    val bud = rose.releaseBud()

    // Человек нюхает цветок
    human.smellFlower(rose)

    // Засыхание
    rose.wither()

    // Уничтожение листа и бутона
    leaf.destroy()
    bud.dropPetals()
    bud.destroy()

    // Сажаем и поливаем Гладиолус
    human.plantFlower(gladiolus)
    human.waterFlower(gladiolus)
    gladiolus.releaseLeaf()
    gladiolus.releaseBud()
}



/*
// models/AbstractFlower.kt
package models

// Абстрактный класс цветка
abstract class AbstractFlower {
    var height: Int = 0

    abstract fun grow()
    abstract fun releaseLeaf(): Leaf
    abstract fun releaseBud(): Bud
    abstract fun wither()
}

// models/Rose.kt

class Rose : AbstractFlower() {
    override fun grow() {
        println("Роза растет.")
        height += 10
    }

    override fun releaseLeaf(): Leaf {
        println("Роза выпускает лист.")
        return Leaf(5)
    }

    override fun releaseBud(): Bud {
        println("Роза выпускает бутон.")
        return Bud("Розовый")
    }

    override fun wither() {
        println("Роза засохла.")
        height = 0
    }
}

// models/Gladiolus.kt

class Gladiolus : AbstractFlower() {
    override fun grow() {
        println("Гладиолус растет.")
        height += 8
    }

    override fun releaseLeaf(): Leaf {
        println("Гладиолус выпускает лист.")
        return Leaf(7)
    }

    override fun releaseBud(): Bud {
        println("Гладиолус выпускает бутон.")
        return Bud("Красный")
    }

    override fun wither() {
        println("Гладиолус засох.")
        height = 0
    }
}


// models/Leaf.kt

class Leaf(val length: Int) {
    fun destroy() {
        println("Лист разрушен.")
    }
}

// models/Bud.kt

class Bud(val scent: String) {
    val petal = Petal("Красный")

    fun dropPetals() {
        println("Бутон сбросил лепестки.")
    }

    fun destroy() {
        println("Бутон разрушен.")
    }
}

// models/Petal.kt

class Petal(val color: String) {
    fun destroy() {
        println("Лепесток разрушен.")
    }
}

// models/Human.kt

class Human(val name: String) {
    fun waterFlower(flower: AbstractFlower) {
        println("$name поливает цветок.")
        flower.grow()
    }

    fun smellFlower(flower: AbstractFlower) {
        println("$name понюхал цветок.")
    }

    fun plantFlower(flower: AbstractFlower) {
        println("$name посадил цветок.")
    }
}

fun main() {
    val human = Human("Иван")
    val rose = Rose()
    val gladiolus = Gladiolus()

    // Человек сажает цветок
    human.plantFlower(rose)

    // Человек поливает цветок
    human.waterFlower(rose)

    // Цветок выпускает лист и бутон
    val leaf = rose.releaseLeaf()
    val bud = rose.releaseBud()

    // Человек нюхает цветок
    human.smellFlower(rose)

    // Засыхание
    rose.wither()

    // Уничтожение листа и бутона
    leaf.destroy()
    bud.dropPetals()
    bud.destroy()

    // Сажаем и поливаем Гладиолус
    human.plantFlower(gladiolus)
    human.waterFlower(gladiolus)
    gladiolus.releaseLeaf()
    gladiolus.releaseBud()
}
*/