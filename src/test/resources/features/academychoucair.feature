# Autor:Roberto
@stories
Feature: Academy Choucair
As a user,I want to learn how to automatein screeanplay at the choucair Academy with the automation course
@scenario1
Scenario: Search for automation course
        Given than  wants to learn automation at the academy choucair
         | strUser         | strPassword         |
         | IngresaTuUsuario| IngresaTuContraseña |

       When he search for the course on the choucair academy plataform
        | strCourse                             |
        |  recursos Automatización  Bancolombia |

       Then he finds th course called resourses
        | strCourse                             |
        |  recursos Automatización  Bancolombia |







