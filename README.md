# antlr4-rddl
An ANTLR4 grammar for RDDL files.

## Installation
The `antlr4ng` package is required for `TypeScript` code generation. It can be installed via
```zsh
npm i
```

For the generation of `Java` code, the [ANTLR4 grammar syntax support](https://marketplace.visualstudio.com/items?itemName=mike-lischke.vscode-antlr4) package is used. To adopt the folder structure as specified in this repository, you must add the following to your `settings.json` 
```zsh
  "antlr4.generation": {
    "outputDir": "../../generated/Java",
    "mode": "external",
    "listeners": true,
    "visitors": true
  }
```

## Code Generation
`Java` code is automatically generated as soon as one of the `.g4` files is saved.

For `TypeScript` code, either run 
```zsh
npm run build
```
or use the following command
```zsh
antlr4ng -Dlanguage=TypeScript -o src/main/generated/TypeScript/ -visitor -listener -Xexact-output-dir src/main/grammar/antlr4/RDDLLexer.g4 src/main/grammar/antlr4/RDDLParser.g4
```

## Further Development and Resources
- [ ] Grammar refactoring using [AntlrVSIX](https://github.com/kaby76/AntlrVSIX)
- [ ] Dependency locking with [shrinkwrap](https://docs.npmjs.com/cli/v10/commands/npm-shrinkwrap)
- [ ] Add [unittests](https://github.com/antlr/antlr4/blob/master/doc/antlr-project-testing.md)

## References
- [Repository of grammars written for ANTLR v4](https://github.com/antlr/grammars-v4/tree/master)