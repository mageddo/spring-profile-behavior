### Spring Profile Properties resolution order

* Spring read first `application.properties` first, Then `config/application.properties`, then `application-default.properties`
* The last readed will override the previous properties
* If you create a gradle module with a .properties then make it as
dependency from another module and this module has a .properties at the same path
then this file will replace the module dependency property (not merge)