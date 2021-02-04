# クラス図

### BaseClassModel


```uml
@startuml
' 新規登録・編集
Package User {
	class UserAppConfig

    package AppLayer <<Rectangle>>{
        class UserController {
        	-UserServiceIF userservice
        	+ModelAndView getUserPage()
        }
        class UserHelper
        UserController -right-> UserHelper
		UserAppConfig -[hidden]right> UserController
    }
    package DomainLayer <<Rectangle>>{
        interface UserServiceIF{
        	+void getUser()
        	+String getUserName()
        	+boolean getUserEnabled()
        	+String getUserMailAddres()
        	+String getUserDescription()
        	+String getUserImage()
        	+boolean getVisible()
        }
        class UserServiceImpl{
        	-UserDomain user
        	-UserRepositoryIF userRepository
        	+void getUser()
        	+String getUserName()
        	+boolean getUserEnabled()
        	+String getUserMailAddres()
        	+String getUserDescription()
        	+String getUserImage()
        	+boolean getVisible()
        }
        class UserDomain{
        	-int uId
        	-boolean userEnabled
        	-String userId
        	-String userName
        	-String userMailAddres
        	-String userDescription
        	-String userImage
        	-int[] tagList
        	-int[] followList
        	-int[] followerList
        	-boolean visible
        	-String designSettings
        }
        UserHelper -down-> UserServiceIF
        UserController -down-> UserServiceIF
        UserServiceIF .down. UserDomain
        UserServiceIF <|-right- UserServiceImpl
    }
	
    package InfrastructureLayer <<Rectangle>>{
        interface UserRepositoryIF{
        	+UserDomain selectUser()
        }
        class UserRepositoryImpl{
        	+UserDomain selectUser()
        }
        UserDomain .down. UserRepositoryIF
        UserServiceImpl -down-> UserRepositoryIF
        UserRepositoryIF <|-right- UserRepositoryImpl
    }
}
@enduml
```

<!--
```uml
@startuml
' トップ画面・ユーザー画面
Package Main {
    package UILayer <<Rectangle>>{
        class MainViewModel
    }
    package AppLayer <<Rectangle>>{
        class MainController
        class MainHelper
        MainController <-right- MainViewModel
        MainController -right-> MainHelper
    }
    package DomainLayer <<Rectangle>>{
        interface MainServiceIF
        class MainServiceImpl
        class MainDomain
        MainHelper -down-> MainServiceIF
        MainController -down-> MainServiceIF
        MainServiceIF .down. MainDomain
        MainServiceIF <|-right- MainServiceImpl
    }
	class MainAppConfig
	DomainLayer -[hidden]> MainAppConfig
	
    package InfrastructureLayer <<Rectangle>>{
        interface MainRepositoryIF
        class MainRepositoryImpl
        MainDomain .down. MainRepositoryIF
        MainServiceImpl -down-> MainRepositoryIF
        MainRepositoryIF <|-right- MainRepositoryImpl
    }
}
@enduml
```

```uml
@startuml
' ログイン機能
Package Login {
    package UILayer <<Rectangle>>{
        class LoginViewModel
    }
    package AppLayer <<Rectangle>>{
        class LoginController
        class LoginHelper
        LoginController <-right- LoginViewModel
        LoginController -right-> LoginHelper
    }
    package DomainLayer <<Rectangle>>{
        interface LoginServiceIF
        class LoginServiceImpl
        class LoginDomain
        LoginHelper -down-> LoginServiceIF
        LoginController -down-> LoginServiceIF
        LoginServiceIF .down. LoginDomain
        LoginServiceIF <|-right- LoginServiceImpl
    }
	class LoginAppConfig
	DomainLayer -[hidden]> LoginAppConfig
	
    package InfrastructureLayer <<Rectangle>>{
        interface LoginRepositoryIF
        class LoginRepositoryImpl
        LoginDomain .down. LoginRepositoryIF
        LoginServiceImpl -down-> LoginRepositoryIF
        LoginRepositoryIF <|-right- LoginRepositoryImpl
    }
}
@enduml
```

```uml
@startuml
' 新規登録・編集
Package User {
    package UILayer <<Rectangle>>{
        class UserViewModel
    }
    package AppLayer <<Rectangle>>{
        class UserController
        class UserHelper
        UserController <-right- UserViewModel
        UserController -right-> UserHelper
    }
    package DomainLayer <<Rectangle>>{
        interface UserServiceIF
        class UserServiceImpl
        class UserDomain
        UserHelper -down-> UserServiceIF
        UserController -down-> UserServiceIF
        UserServiceIF .down. UserDomain
        UserServiceIF <|-right- UserServiceImpl
    }
	class UserAppConfig
	DomainLayer -[hidden]> UserAppConfig
    package InfrastructureLayer <<Rectangle>>{
        interface UserRepositoryIF
        class UserRepositoryImpl
        UserDomain .down. UserRepositoryIF
        UserServiceImpl -down-> UserRepositoryIF
        UserRepositoryIF <|-right- UserRepositoryImpl
    }
}
@enduml
```

```uml
@startuml
' 新規登録・編集
Package UList {
    package UILayer <<Rectangle>>{
        class UListViewModel
    }
    package AppLayer <<Rectangle>>{
        class UListController
        class UListHelper
        UListController <-right- UListViewModel
        UListController -right-> UListHelper
    }
    package DomainLayer <<Rectangle>>{
        interface UListServiceIF
        class UListServiceImpl
        class UListDomain
        UListHelper -down-> UListServiceIF
        UListController -down-> UListServiceIF
        UListServiceIF .down. UListDomain
        UListServiceIF <|-right- UListServiceImpl
    }
	class UListAppConfig
	DomainLayer -[hidden]> UListAppConfig
    package InfrastructureLayer <<Rectangle>>{
        interface UListRepositoryIF
        class UListRepositoryImpl
        UListDomain .down. UListRepositoryIF
        UListServiceImpl -down-> UListRepositoryIF
        UListRepositoryIF <|-right- UListRepositoryImpl
    }
}
@enduml
```
-->
