package com.tzj.garvel.cli.exception;

import com.tzj.garvel.cli.CLI;

/**
 * Construct useful messages from the Parser and/or Scanner exceptions.
 */
public class CLIErrorHandler {
    public static void errorAndExit(final String format) {
        System.err.println(format);
        CLI.displayUsageAndExit();
    }

    public static void exit() {
        System.err.println("Error: Invalid command!");
        CLI.displayUsageAndExit();
    }
}