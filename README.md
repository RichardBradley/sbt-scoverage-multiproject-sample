# sbt-scoverage-multiproject-sample

See https://github.com/scoverage/sbt-scoverage/issues/87

If I run

    sbt clean coverage test
    sbt coverage test
    sbt coverageAggregate

then I don't get any report for the "util" project: "No subproject data to aggregate, skipping reports"

I've found a workaround for my case:

    sbt clean
    sbt "set coverageEnabled := true" "set coverageEnabled in util := true" test coverageReport
    sbt coverageAggregate

This will produce the correct report.

I found that running

    sbt clean coverage compile

would instrument the main project but not the "util" project, but running

    sbt clean coverage "set coverageEnabled in util := true" compile

would instrument the "util" project but not the main project.

Something is definitely up with the "coverage" command in multi-project builds.
