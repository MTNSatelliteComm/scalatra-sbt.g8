# $name$ #

TODO: Implement

## Setup ##

To generate an IDEA project:
```sh
\$ cd $name;format="norm"$
\$ sbt gen-idea
```

To generate an Eclipse project:
```sh
\$ cd $name;format="norm"$
\$ sbt eclipse
```

## Build & Run ##

```sh
\$ cd $name;format="norm"$
\$ ./sbt
> container:start
```

Now open the site's [root page](http://localhost:8080/) in your browser.

## Test ##

```sh
\$ cd $name;format="norm"$
\$ sbt test
```
