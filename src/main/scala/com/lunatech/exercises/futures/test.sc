import scala.util.Random

trait Animal
 class Dog extends Animal
{
  def dogName(): Unit = {
    print("hi I am sag")
  }
}
private class Cat extends Animal

object Animal{
  def apply (kind: String) = kind match{
    case "dog" => new Dog()
    case "cat" => new Cat()
  }
}

val dog: Dog = Animal("dog").asInstanceOf[Dog]
dog.dogName()


Thread.sleep(Random.nextInt(2000))
