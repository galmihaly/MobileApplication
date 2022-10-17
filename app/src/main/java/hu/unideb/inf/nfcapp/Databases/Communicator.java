package hu.unideb.inf.nfcapp.Databases;

import java.util.List;

import hu.unideb.inf.nfcapp.Enums.SQLEnums;
import hu.unideb.inf.nfcapp.Models.MyLog;

public interface Communicator {

    String getLastLoginDate();

    String getLastLogoutDate();

    List<MyLog> getLogsbyDate(int i, int i2, int i3);

    Enum loginUser(String str, String str2);

    List<Integer> getGatePermissions();

}
