# Project Timadoro - Project Policy

* This is the PROJECT POLICY which is for the Project Timadoro.
* Every team member is entitled and bounded to the following project policy
* Updated by Kaveen Hyacinth with the Copy Request Courtesy of the Team Lead Shameera Carrim

## PROJECT TEAM
### Team Lead
* Shameera Carrim
  
### Members
* KH1010 - Kaveen Hyacinth
* KN1024 - Kavinda Nirushana
* RA1017 - Rishitha Adithya
* SN1018 - Sasani Nimasha
* SC1021 - Shameera Carrim
 
## BRANCH DECLARATION

When creating a new branch please use following policy

1.1 Use member code which is in the Members section as a prefix with underscore 
> As an instance when shameera creating a branch the prefix should be **SC1021_**

1.2 Use an intuitive single word name with a number optional in UPPERCASE
> AS an instance when creating a freature the branch can be **FEATURE-1** or **FEATURE** etc.

1.3 Use the combination of above 1.1 and 1.2 when creating a new branch
> When Shameera Carrim is creating a new feature branch it should be like **SC1021_FEATURE-1** etc.


## PACKAGE DECLARATION

1. Classes

    1.1. `Report` and `Timer` classes inside controller package
    
    1.2. `Profile`, `Task` and `Workspace` classes inside model package
    
    1.3. `DataConnector` and `Postman` classes inside gateway package

2. User Interfaces

    __All the following JFrames and JDialogs should be created inside the view package__

    2.1. JForms named `Welcome`, `Profile`, `NewWorkspace`, `AboutUs` and `Dashboard`
    
    2.2. Dialogs called `AddTask` and `EditPomodoro` for `Dashboard`


## GUIDE

  1. Please study the UMl diagrams which model the system and have a clear picture about the system
  2. Stick into the class declaration of the Class Diagram and can change if indeed
  3. Usually check the GITHUB and keep a clear workflow
  4. Please be strict with package declaration

## CONVENTIONS

1. Please stick into following rules when creating variables in classes

    1.1. Use cammelCase for Method Declarations
    
    1.2. Use PascalCase when creating properties/attributes
    
    1.2. Always use `this.` to refer the current class when neccessary

2. Follow these conventions when naming a frame and its components

    2.1. Use `frm` prefix to denote a _jframe_
    
    2.2. Use `dlg` prefix to denote a _jdialog_
    
    2.3. Use `pnl` prefix to denote a _jpanel_
    
    2.4. Use `lbl` prefix to denote a _jlabel_
    
    2.5. Use `txt` prefix to denote a _jtextfield_
    
    2.6. Use `btn` prefix to denote a _jbutton_
    
    2.7. Use `tbd` prefix to denote a _jtabbedpane_
    
    2.8. Use `tbl` prefix to denote a _jtable_

    __Apart from these components, please use an intuitive abbr. prefix to denote, when using a new component__


## GUI SIZE POLICY

__Followings uses [width, height] to denote the width and height__
__Neither JFrames nor JDialogs will be resizable__

1. 'Dashboard' JFrame -> __[1000, 700]__
2. Other JFrames -> __[700, 500]__
3. JDialog Frames -> __[600, 500]__

## THEAME CODES

> Will be updated soon
