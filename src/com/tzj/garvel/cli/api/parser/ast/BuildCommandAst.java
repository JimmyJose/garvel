package com.tzj.garvel.cli.api.parser.ast;

import com.tzj.garvel.cli.api.parser.visitor.CLIAstVisitor;

public class BuildCommandAst extends CommandAst {
    @Override
    public void accept(final CLIAstVisitor visitor) {
        visitor.visit(this);
    }
}
