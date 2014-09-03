package controllers

import play.api._
import play.api.mvc._
import anorm._
import play.api.db.DB
import play.api.Play.current
import models.Member
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;


object Members extends Controller {


  def index = Action {
    val members = Member.findAll()

    val ret = Json.toJson(members);

//    Ok(json).as("application/json")
    Ok(ret.toString()).as("application/json")
  }

  def findById(id: Long) = Action {
    Ok("Got A Member" + id)
  }

  def create() = TODO

  def update(id: Long) = TODO

  def delete(id: Long) = TODO

}