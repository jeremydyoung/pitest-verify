# pitest-verify
Purpose: To execute simple examples of code that do not seem to be mutation coverable.

## Execute
`$ ./gradlew pitest`

## Report
You should find the pitest report in `build/reports/pitest`

## Alternate builds
To test with other build configurations, specify the build-X.gradle on the command line
`$ ./gradlew -b build-spock2.gradle pitest`

The default is the spock 1 configuration since it is compatible with bothe the Spock and junit 4 tests.
