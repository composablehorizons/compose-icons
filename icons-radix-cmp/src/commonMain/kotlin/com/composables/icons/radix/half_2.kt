package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Half2: ImageVector
    get() {
        if (_Half2 != null) return _Half2!!
        
        _Half2 = ImageVector.Builder(
            name = "half-2",
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
                curveTo(4.36673f, 1.82652f, 1.82671f, 4.36655f, 1.82629f, 7.49896f)
                curveTo(1.82629f, 10.6317f, 4.36648f, 13.1714f, 7.49915f, 13.1718f)
                lineTo(7.50012f, 13.1708f)
                verticalLineTo(1.82611f)
                horizontalLineTo(7.49915f)
                close()
            }
        }.build()
        
        return _Half2!!
    }

private var _Half2: ImageVector? = null

