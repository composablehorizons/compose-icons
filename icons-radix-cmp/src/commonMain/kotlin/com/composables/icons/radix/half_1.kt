package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Half1: ImageVector
    get() {
        if (_Half1 != null) return _Half1!!
        
        _Half1 = ImageVector.Builder(
            name = "half-1",
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
                moveTo(7.00012f, 1.84857f)
                curveTo(4.10141f, 2.10165f, 1.82668f, 4.53471f, 1.82629f, 7.49896f)
                curveTo(1.82629f, 10.4635f, 4.10123f, 12.8952f, 7.00012f, 13.1484f)
                verticalLineTo(1.84857f)
                close()
                moveTo(8.00012f, 13.1484f)
                curveTo(10.8986f, 12.8949f, 13.172f, 10.4632f, 13.172f, 7.49896f)
                curveTo(13.1716f, 4.53499f, 10.8984f, 2.10203f, 8.00012f, 1.84857f)
                verticalLineTo(13.1484f)
                close()
            }
        }.build()
        
        return _Half1!!
    }

private var _Half1: ImageVector? = null

