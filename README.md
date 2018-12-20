# Meta-Edge - Yocto Edge Layer

This layer currently contains edge-4.3.4 and contains a recipe (edgetest) that places the edge binary in to /usr/local/bin for the created image.

## Getting Started

1.) Make sure you are in the ~/poky directory or wherever "oe-init-build-env" is located.

2.) Run ```source oe-init-build-env```

3.) You should receive a message saying that you can now "bitbake" and "runqemu."

4.) Run ```bitbake core-image-sato``` to compile the core image

5.) Run ```runqemu qemux86-64 nographic``` to begin emulating the image that you compiled. "qemux86-64 can be change to the machine that you compile for. Set in the 

### Configurations

You can change the configurations of your image inside ~/poky/build/conf/local.conf

Some things you can change is what machine you're compiling for, change your distro, package management, and where you can add recipes to compile as well as features to add to your distro, such as systemd.

Recipe Configurations

Recipe files end with .bb or .bbappend file extension. They have a general format:

SUMMARY - summary of the recipe

SECTION - what section the recipe is located in

LICENSE - generally a MIT license

SRC_URI - where the source file(s) are coming from; can be a local file, http(s) link, git link, etc.

SRC_URI[md5sum] = "???"
SRC_URI[sha256sum] = "???" - a checksum for the your source uri

FILES_${PN} += "file/dir to be packaged"

do_configure() - any configuration you need to make to compile the source uri, if no configuration is needed you can leave blank or omit

do_compile() - any compilation steps need for the source uri, if no compilation is need you can leave blank or omit

do_install() - function to install the source code in to the image, usually done by first creating a directory and copying it over in to the image

```
do_install(){
        install -d $[D}/usr/local/bin
        install -m 0755 ${S} ${D}/usr/local/bin
   }
```
   
${S} is the directory where the source code is downloaded to

${D} is the highest level directory in the target image's file system

${PN} is the package name
