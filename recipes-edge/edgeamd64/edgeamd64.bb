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

SRC_URI = "https://github.com/ClearBlade/Edge/releases/download/4.3.4/edge-darwin-amd64.tar.gz;subdir=${BP}"
SRC_URI[md5sum] = "8dab72b5bb9d176949c437b38a2cd77e"
SRC_URI[sha256sum] = "696b403e296c323abea4bdf9e73749d72415689805ab287cd0b746995b87ce9f"

#inherit bin_package

INSANE_SKIP_${PN} += "already-stripped"
