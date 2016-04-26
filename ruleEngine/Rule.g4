grammar Rule;

expr : expr '&' expr                # andExpr
     | expr '|' expr                # orExpr
     | QUESTION '=' REPLYOPTION     # questionReplyOption
     | QUESTION '=' VALUE           # questionValue
     | QUESTION '>' VALUE           # questionMoreThanValue
     | QUESTION '<' VALUE           # questionLessThanValue
     | SCORINGCATEGORY '=' VALUE    # scoringcategoryValue
     | SCORINGCATEGORY '>' VALUE    # scoringcategoryMoreThanValue 
     | SCORINGCATEGORY '<' VALUE    # scoringcategoryLessThanValue	 
     | '(' expr ')'                 # parens
     ;	
QUESTION : 'Q'INT ; 
SCORINGCATEGORY : 'S'INT ;
REPLYOPTION : 'C'INT ;

VALUE : [0-9]+ '.' [0-9]*
      | '.' [0-9]+
      | [0-9]+ 
      ;
INT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
