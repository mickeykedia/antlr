# ANTLR

ANTLR is a program which generates another program (NewProgram). The NewProgram can be used to parse through a language whose 'grammar' was the input to ANTLR. So basically ANTLR reads in a set of rules on how a language is structured (what are its constituents - and how to match them) and creates a program which will read through the 'language' and parse it. 

Parse it ? When I say parse it - i mean that ANTLR will provide you with tools to "do" things as the language is being parsed. So for example I define a grammar such that :

## Grammar Example: 

    expr : expr & expr
                | ID '=' INT
                | expr 'or' expr 
                | INT 
                ; 
 
        ID : [a-zA-Z]+ ; 
        INT : [0-9]+ ; 

; 

In this grammar there are two types of tokens - ID and INT, and there is one rule - called expr. 

## Lexers and Parsers 

Technically in ANTLR - a lexer reads through character streams to create tokens. and a parser reads tokens to parse rules. Also tokens have names starting with a capital letter, and rules have names starting with a small letter. 


So, lets assume that a NewProgram reads in an expression - 'mayank = 23' 

it will create a parse tree -       expr 
                                         /          |          \  
                                   mayank   '='         23  

ANTLR then gives two types of tools to read through this tree. One is a tree walker which will walk the entire tree (however big it is - imagine nested expressions, etc) and allow you to define when you want to execute certain actions. 

The other tool is a visitor. Which allows you to define the next step for a method which enters a particular node in the tree. So here - you could cut down on the tree walk - if enough information has been read to parse the input. 


# ANTLR is awesome

There are other brilliant things that ANTLR can do : 

- you can define an action (to perform) in Java code / or some basic ANTLR actions - in the grammar. This action can be associated with a rule or a token. (page 46, the ANTLR book)
- ANTLR is utilized to create the compiler of java (in java). 
- ANTLR can read according to two different types of grammars on the same page. This happens frequently in XML parsing where reading inside the '< />' brackets is fundamentally different from outside. check - (page 50, the ANTLR book)
- ANTLR can also slightly alter the input stream (according to a pre specified rule) and just spit out the output stream. With minimal interference. (Check page 52, the ANTLR book)
- Some times ANTLR can do something called 'parsing with Semantic predicates'. Where certain rules of parsing the language can have variables which are read in the language itself. 
    - Example: read ; 2 9 10 3 1 2 3 will work in the following way.   
    The first number says to match the two subsequent numbers, 9 and 10. The 3 following the 10 says to match three more as a sequence. Our goal is a grammar called Data that groups 9 and 10 together and then 1, 2, and 3 like this: (read page 48, the ANTLR book )



 
