package CompositeMethod;

import java.util.ArrayList;
import java.util.List;

public class AbsensiGrup implements AbsensiComponent {
    private List<AbsensiComponent> absensiList = new ArrayList<>();

    @Override
    public void doAbsensi() {
        for (AbsensiComponent absensi : absensiList) {
            absensi.doAbsensi();
        }
    }

    public void add(AbsensiComponent absensi) {
        absensiList.add(absensi);
    }

    public void remove(AbsensiComponent absensi) {
        absensiList.remove(absensi);
    }

    public AbsensiComponent getChild(int i) {
        return absensiList.get(i);
    }
}
