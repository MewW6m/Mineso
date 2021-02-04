# クラス図

## BaseClassModel

```uml
@startuml

package UILayer <<Rectangle>>{
	class ViewModel
}
package AppLayer <<Rectangle>>{
	class Controller
	class Helper
	Controller <-right- ViewModel
	Controller -right-> Helper
}
package DomainLayer <<Rectangle>>{
	interface ServiceIF
	class ServiceImpl
	class Domain
	Helper -down-> ServiceIF
	Controller -down-> ServiceIF
	ServiceIF .down. Domain
	ServiceIF <|-right- ServiceImpl
}
package InfrastructureLayer <<Rectangle>>{
	interface RepositoryIF
	class RepositoryImpl
	Domain .down. RepositoryIF
	ServiceImpl -down-> RepositoryIF
	RepositoryIF <|-right- RepositoryImpl
}

@enduml
```

```mermaid

```
