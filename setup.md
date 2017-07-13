# Setup Java, Netbeans etc.

## NetBeans

Install [NetBeans](https://netbeans.org/)

## Git

Git is included in Netbeans. Assuming you already have a Github account, see the [Netbeans Git Support](https://netbeans.org/kb/docs/ide/git.html) for setup instructions, or ask Steve to see his setup. The basic steps are:

1. Team -> Git -> Clone ...
2. Repository: https://github.com/steve-cqu/oop.git
3. Clone into: C:\Users\you\git
4. The above steps will pull (download) all files from the shared OOP repo into your hard drive in the git directory
5. Now you can open projects/code

### Working with Git

I recommend adding 4 Git shortcut buttons to the Toolbar. First, right click on the top toolbar and click _Customize_

![Customize toolbar](../images/netbeans-git-customize-toolbar.png)

Then Add the following from Git:
- Add
- Commit ...
- Pull from upstream
- Push to upstream

![Add from git](../images/netbeans-git-toolbar-drag-1.png)

You should have the four buttons on the right as follows:

![Toolbar buttons for Git](../images/netbeans-git-buttons-1.png)

Use the buttons when you have selected your project. The workflow is:

1. Add new files to Git only once (e.g. if the files have already been Added, no need to add again). This is a local only operation (only performed on your hard disk)
2. Commit ... when changes have been made (e.g. a file already added has been edited). Local only operation.
3. Pull from upstream to get the latest files from the Github Repository. This downloads latest files from  Github.
4. Push to upstream to put your edits on Github. This uploads latest files to Github.

An example:

- At start of the tutorial _Pull from upstream_
- Create new files and _add_ them
- As you make changes _Commit ..._ them. You can make multiple _Commits_ (e.g. one commit for each version)
- At the end of the tutorial, _Pull from upstream_ and then _Push to upstream_


## UML

[EasyUML](http://plugins.netbeans.org/plugin/55435/easyuml) is a plugin that allows you to draw UML diagrams (e.g. class diagrams) and then generate Java code from it. If EasyUML is not in the Netbeans Plugin Update Centre, then you can download it, unzip it, then add all the included plugins (the .nbm files).

For an example of use see this [Youtube video](https://www.youtube.com/watch?v=QME_S7gPnVI)

