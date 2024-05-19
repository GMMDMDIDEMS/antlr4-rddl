# antlr4-rddl
An ANTLR4 grammar for RDDL files.

## Installation
For TypeScript code generation the `antlr4ng` and `antlr4ng-cli` package are required. They can be installed via
```zsh
npm install antlr4ng antlr4ng-cli --save
```

## Commands
To automatically generate TypeScript code, use the following command
```zsh
npx antlr4ng -Dlanguage=TypeScript -o generated/ -visitor -listener -Xexact-output-dir ./RDDLLexer.g4 ./RDDLParser.g4
```

## Further Development and Resources
- [ ] Grammar refactoring using [AntlrVSIX](https://github.com/kaby76/AntlrVSIX)
- [ ] Dependency locking with [shrinkwrap](https://docs.npmjs.com/cli/v10/commands/npm-shrinkwrap)
- [ ] Add [unittests](https://github.com/antlr/antlr4/blob/master/doc/antlr-project-testing.md)

## References
- [Repository](https://github.com/antlr/grammars-v4/tree/master) of grammars written for ANTLR v4