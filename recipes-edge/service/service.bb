inherit systemd

SUMMARY = "Install and start a systemd service"
SECTION = "examples"
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/:"

#here we specify the source we want to build
#SRC_URI = "file://test_systemd.sh"
SRC_URI = "file://clearblade.service"
#here we specify the source directory, where we can do all the building and expect sources to be placed
S = "${WORKDIR}"

SYSTEMD_SERVICE_${PN} = "clearblade.service"

#bitbake task
#created a directory /home/root for target install the script
do_install() {
             #install -d ${D}/home/root
             #install -m 0755 ${WORKDIR}/test_systemd.sh ${D}/home/root

             install -d ${D}${systemd_system_unitdir}
             install -m 0644 ${WORKDIR}/clearblade.service ${D}${systemd_system_unitdir}
}

#Pack the path
#FILES_${PN} += "/home/root"
FILES_${PN} += "${systemd_system_unitdir}"

REQUIRED_DISTRO_FEATURES= "systemd"

