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

SRC_URI = "https://github.com/ClearBlade/Edge/releases/download/4.3.4/edge-linux-amd64.tar.gz;subdir=${BP}"
SRC_URI[md5sum] = "ea11fc93ce7e7297f6ddcf4d945b182c"
SRC_URI[sha256sum] = "f37cfd76d2a7eaebbac3af10248d8dc1600d329f6e8fc92d14e2d9e163312952"

inherit bin_package

INSANE_SKIP_${PN} += "already-stripped"

