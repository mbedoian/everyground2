package models

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._

case class Member(memberId: Pk[Long], email: String)

object Member {

  val simple = {
    get[Pk[Long]]("memberId") ~
      get[String]("email") map {
      case memberId~email => Member(memberId, email)
    }
  }

  def findAll(): Seq[Member] = {
    DB.withConnection { implicit connection =>
      SQL("select member_id, email from member").as(Member.simple *)
    }
  }
//
//  def create(member: Member): Unit = {
//    DB.withConnection { implicit connection =>
//      SQL("insert into bar(name) values ({name})").on(
//        'name -> member.email
//      ).executeUpdate()
//    }
//  }

}