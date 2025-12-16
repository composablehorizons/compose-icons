package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Face: ImageVector
    get() {
        if (_Face != null) return _Face!!
        
        _Face = ImageVector.Builder(
            name = "face",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49915f, 0.876892f)
                curveTo(11.1566f, 0.876892f, 14.1218f, 3.84163f, 14.1222f, 7.49896f)
                curveTo(14.1222f, 11.1566f, 11.1568f, 14.122f, 7.49915f, 14.122f)
                curveTo(3.84181f, 14.1216f, 0.877075f, 11.1564f, 0.877075f, 7.49896f)
                curveTo(0.877487f, 3.84188f, 3.84206f, 0.877303f, 7.49915f, 0.876892f)
                close()
                moveTo(7.49915f, 1.82611f)
                curveTo(4.36674f, 1.82652f, 1.82671f, 4.36655f, 1.82629f, 7.49896f)
                curveTo(1.82629f, 10.6317f, 4.36648f, 13.1714f, 7.49915f, 13.1718f)
                curveTo(10.6321f, 13.1718f, 13.172f, 10.632f, 13.172f, 7.49896f)
                curveTo(13.1716f, 4.3663f, 10.6319f, 1.82611f, 7.49915f, 1.82611f)
                close()
                moveTo(9.96204f, 9.21381f)
                curveTo(10.1199f, 8.98743f, 10.4319f, 8.93209f, 10.6583f, 9.08978f)
                curveTo(10.8848f, 9.24776f, 10.9403f, 9.55958f, 10.7823f, 9.78607f)
                curveTo(10.0604f, 10.8209f, 8.85957f, 11.4998f, 7.50012f, 11.4999f)
                curveTo(6.22536f, 11.4998f, 5.0893f, 10.9031f, 4.35754f, 9.97552f)
                lineTo(4.21692f, 9.78607f)
                lineTo(4.16809f, 9.6972f)
                curveTo(4.07619f, 9.48379f, 4.14301f, 9.22799f, 4.34094f, 9.08978f)
                curveTo(4.53889f, 8.95171f, 4.80221f, 8.97695f, 4.97083f, 9.13666f)
                lineTo(5.03723f, 9.21381f)
                lineTo(5.1427f, 9.35638f)
                curveTo(5.6927f, 10.0537f, 6.54474f, 10.4998f, 7.50012f, 10.4999f)
                curveTo(8.51893f, 10.4998f, 9.41912f, 9.99204f, 9.96204f, 9.21381f)
                close()
                moveTo(5.37512f, 5.09955f)
                curveTo(5.85818f, 5.0996f, 6.24989f, 5.4916f, 6.25012f, 5.97455f)
                curveTo(6.25012f, 6.45769f, 5.85833f, 6.8495f, 5.37512f, 6.84955f)
                curveTo(4.89188f, 6.84955f, 4.50012f, 6.45772f, 4.50012f, 5.97455f)
                curveTo(4.50035f, 5.49157f, 4.89202f, 5.09955f, 5.37512f, 5.09955f)
                close()
                moveTo(9.62512f, 5.09955f)
                curveTo(10.1082f, 5.0996f, 10.4999f, 5.4916f, 10.5001f, 5.97455f)
                curveTo(10.5001f, 6.45769f, 10.1083f, 6.8495f, 9.62512f, 6.84955f)
                curveTo(9.14188f, 6.84955f, 8.75012f, 6.45772f, 8.75012f, 5.97455f)
                curveTo(8.75035f, 5.49157f, 9.14202f, 5.09955f, 9.62512f, 5.09955f)
                close()
            }
        }.build()
        
        return _Face!!
    }

private var _Face: ImageVector? = null

