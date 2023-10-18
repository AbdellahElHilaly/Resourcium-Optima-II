# JSP in java

## definition

JSP is a technology that helps software developers create dynamically generated web pages based on HTML, XML, or other
document types. Released in 1999 by Sun Microsystems, JSP is similar to PHP and ASP, but it uses the Java programming
language.

## jsp life cycle

1. jsp translate to servlet
2. servlet init
3. servlet service
4. servlet destroy
5. jsp destroy

img: https://static.javatpoint.com/images/jspflow.JPG

## jsp tag

### directive tag

| Tag                            | Description                                     |
|--------------------------------|-------------------------------------------------|
| page                           | Specifies page-level attributes                 |
| include                        | Includes a file at the translation time         |
| taglib                         | Defines a tag library                           |
| tag                            | Declares a custom tag                           |
| attribute                      | Defines attributes for custom tags              |
| variable                       | Declares a scripting variable                   |
| import                         | Imports classes or packages                     |
| pageEncoding                   | Defines character encoding for the page         |
| isELIgnored                    | Controls EL evaluation                          |
| trimDirectiveWhitespaces       | Controls whitespace trimming in the output      |
| deferredSyntaxAllowedAsLiteral | Allows deferred syntax as literals              |
| contentType                    | Specifies response content type                 |
| buffer                         | Specifies the buffer size                       |
| errorPage                      | Specifies the error page for exceptions         |
| isErrorPage                    | Indicates if the page is an error page          |
| extends                        | Specifies the parent class for JSP pages        |
| session                        | Enables session tracking                        |
| language                       | Specifies the scripting language                |
| isThreadSafe                   | Declares whether the page is thread-safe        |
| isScriptingEnabled             | Controls scripting elements                     |
| isIncludePreludes              | Indicates if including page preludes is enabled |
| isDefaultContentType           | Specifies the default content type              |
| isBuffer                       | Enables or disables buffering                   |
| isSession                      | Controls session handling                       |
| isAutoFlush                    | Controls automatic flushing of the buffer       |


### action tag

| Tag             | Description                                                |
|-----------------|------------------------------------------------------------|
| jsp:include     | Includes a file at the request-time                        |
| jsp:useBean     | Declares a JavaBean                                        |
| jsp:setProperty | Sets the property of a JavaBean                            |
| jsp:getProperty | Gets the property of a JavaBean                            |
| jsp:forward     | Forwards the request to another page                       |
| jsp:plugin      | Generates browser-specific code to embed an applet or bean |
| jsp:element     | Defines a scripting variable                               |
| jsp:attribute   | Defines an attribute for a tag                             |
| jsp:body        | Defines the body of a tag                                  |
| jsp:text        | Inserts uninterpreted text into the JSP page               |
| jsp:attribute   | Defines an attribute for a tag                             |
