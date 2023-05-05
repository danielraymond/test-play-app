import sbt.Command

object CiCommands {
  def devComplete: Command = Command.command("devComplete") { state =>
    "clean" ::
      "scalafmt" :: "test:scalafmt" ::
      "coverage" :: "test" :: "coverageReport" :: "coverageAggregate" ::
      state
  }
}
