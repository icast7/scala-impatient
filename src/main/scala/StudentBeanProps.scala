/**
  * Create Student class using Scala BeanProperties to implement the JavaBean spec
  *
  * Created by icastillejos on 6/15/16.
  */
import scala.beans.BeanProperty

class Student() {
  @BeanProperty var name : String = ""
  @BeanProperty var id : Long = 0
}