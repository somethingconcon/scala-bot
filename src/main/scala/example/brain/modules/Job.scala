package example.brain.modules

import bot.learn.{HumanMessage, Message, Reply}
import example.brain.BrainFunctions

trait Job extends BrainFunctions {
  val jobs: List[Reply] = List(
    Reply(HumanMessage(None, List(Message("I'm a programmer".r, None))), Set(passionReply _)),
    Reply(HumanMessage(None, List(Message("I dont have a job".r, None))), Set(ageReply _))
  )
}
