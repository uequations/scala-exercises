package exercise

import exercise.operand.Cov
import exercise.service.LongestContCovService
import org.slf4j.{Logger, LoggerFactory}

/*
Assume the days of current year is numbered 1 to 365.
A Coverage is defined as range of dates with a coverage start and end/term date. Eg: Cov(1, 30) means the person is
covered for something for Jan of this year.Problem: Given a series of coverage data for a person, we need to find the
longest continuous coverage. The coverage may have overlap and/or gaps in coverage.
*/

object Solution extends App {

  val logger: Logger = LoggerFactory.getLogger("Solution");

  val _coverages: List[Cov] = List(
    Cov(1, 20), Cov(21, 30), Cov(15, 25), Cov(28, 40), Cov(50, 60), Cov(61, 200))

  val longestContinuousCoverage: Cov = LongestContCovService(_coverages)

  logger.info(s"longest continuous coverage: ${longestContinuousCoverage}")
}


