# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "https://github.com/ClearBlade/Edge/releases/download/4.3.4/edge-linux-386.tar.gz;subdir=${BP}"
SRC_URI[md5sum] = "f60f3be42dfc53ed09a8f71d690c06a3"
SRC_URI[sha256sum] = "168bfb0c18ec296864b86f2ab9787e336c813fcc9778d5cf4b5cfdde07ab9986"

inherit bin_package

INSANE_SKIP_${PN} += "already-stripped"

