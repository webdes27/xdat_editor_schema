package etoa4_p3

import acmi.l2.clientmod.util.defaultio.DefaultIO
import groovy.beans.Bindable
import groovy.transform.CompileStatic

@Bindable
@DefaultIO
@CompileStatic
class StatusIconCtrl extends DefaultProperty {
    Boolean noClip = false
    Boolean noTooltip = false
    int align
    Boolean alarmBelow24Hour = false

    // @formatter:off
    @Deprecated boolean getUnk100() { noClip }
    @Deprecated void setUnk100(boolean unk100) { this.noClip = unk100 }

    @Deprecated boolean getUnk101() { noTooltip }
    @Deprecated void setUnk101(boolean unk101) { this.noTooltip = unk101 }

    @Deprecated boolean getUnk102() { align > 0 }
    @Deprecated void setUnk102(boolean unk102) { this.align = unk102 ? 1 : 0 }

    @Deprecated boolean getUnk103() { alarmBelow24Hour }
    @Deprecated void setUnk103(boolean unk103) { this.alarmBelow24Hour = unk103 }
    // @formatter:on
}
