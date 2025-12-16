package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ValueNone: ImageVector
    get() {
        if (_ValueNone != null) return _ValueNone!!
        
        _ValueNone = ImageVector.Builder(
            name = "value-none",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49908f, 0.87706f)
                curveTo(9.1478f, 0.87706f, 10.6553f, 1.48094f, 11.8145f, 2.47765f)
                lineTo(12.6465f, 1.64659f)
                curveTo(12.8418f, 1.45133f, 13.1583f, 1.45133f, 13.3536f, 1.64659f)
                curveTo(13.5487f, 1.84186f, 13.5488f, 2.15839f, 13.3536f, 2.35362f)
                lineTo(12.5215f, 3.18468f)
                curveTo(13.5185f, 4.34364f, 14.1219f, 5.85046f, 14.1221f, 7.49913f)
                curveTo(14.1221f, 11.1568f, 11.1567f, 14.1222f, 7.49908f, 14.1222f)
                curveTo(5.85042f, 14.122f, 4.3436f, 13.5185f, 3.18463f, 12.5216f)
                lineTo(2.35358f, 13.3536f)
                curveTo(2.15834f, 13.5488f, 1.84181f, 13.5488f, 1.64655f, 13.3536f)
                curveTo(1.45129f, 13.1584f, 1.4513f, 12.8419f, 1.64655f, 12.6466f)
                lineTo(2.4776f, 11.8146f)
                curveTo(1.4809f, 10.6553f, 0.877014f, 9.14785f, 0.877014f, 7.49913f)
                curveTo(0.877426f, 3.84205f, 3.842f, 0.877471f, 7.49908f, 0.87706f)
                close()
                moveTo(3.85748f, 11.8487f)
                curveTo(4.84282f, 12.6747f, 6.11288f, 13.1718f, 7.49908f, 13.172f)
                curveTo(10.6321f, 13.172f, 13.1719f, 10.6321f, 13.1719f, 7.49913f)
                curveTo(13.1718f, 6.11292f, 12.6747f, 4.84287f, 11.8487f, 3.85753f)
                lineTo(3.85748f, 11.8487f)
                close()
                moveTo(7.49908f, 1.82628f)
                curveTo(4.36667f, 1.82669f, 1.82664f, 4.36672f, 1.82623f, 7.49913f)
                curveTo(1.82623f, 8.88559f, 2.32526f, 10.1553f, 3.15143f, 11.1407f)
                lineTo(11.1407f, 3.15147f)
                curveTo(10.1553f, 2.32531f, 8.88554f, 1.82628f, 7.49908f, 1.82628f)
                close()
            }
        }.build()
        
        return _ValueNone!!
    }

private var _ValueNone: ImageVector? = null

