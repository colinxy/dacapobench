Custom fork of (https://github.com/dacapobench/dacapobench) just to
making testing jrewriter easier. Diff with
509d5539f9f48e438b3ca91c85d0dfb678c14880 to see what is changed.


0. install everything needed for [building dacapo](../README.md#building)
1. place `jrewriter.jar` in this directory (without the version number)
2. build a test, e.g. build `avrora` with `ant harness avrora`
3. run test, e.g. run `avrora` test with `java -Djava.system.class.loader=jrewriter.RewriterClassLoader -cp jrewriter.jar:dacapo.jar Harness avrora`

To see debug logging, add
`-Dorg.slf4j.simpleLogger.defaultLogLevel=debug` to JVM flag.  To get
dumped class files, update environment variables with `export
JREWRITER_DEBUG=1`.
