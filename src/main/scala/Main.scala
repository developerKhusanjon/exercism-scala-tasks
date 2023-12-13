package dev.khusanjon

import scala.io.StdIn

class Main {

  def twoFer(name: String, like: Boolean) = {
    if (like) s"One for $name, one for me" else "One for you, one for me"
  }

  def leapYear(year: Int) = {
    year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)
  }

  def spaceAge(seconds: Long) = {
    seconds.toDouble/31_557_600
  }

  case class Student(name: String, grade: Int)
  def schoolGrade(students: Array[Student]) = {
    students.sortWith((s1, s2) => s1.grade > s2.grade || (s1.grade == s2.grade && s1.name.compareTo(s2.name) > 0))
  }

//  def hamming(dna: String, replica: String) = {
//    var dis = 0
//    (dna, replica).
//  }

  def main(args: Array[String]): Unit = {
    var name = StdIn.readLine()
    var likeIt = StdIn.readBoolean()
    println(twoFer(name, likeIt))
    println(spaceAge(1_000_000_000))
  }
}
