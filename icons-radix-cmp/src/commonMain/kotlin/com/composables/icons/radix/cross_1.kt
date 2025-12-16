package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Cross1: ImageVector
    get() {
        if (_Cross1 != null) return _Cross1!!
        
        _Cross1 = ImageVector.Builder(
            name = "cross-1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.2248f, 2.08224f)
                curveTo(12.4189f, 1.95407f, 12.6829f, 1.97583f, 12.8537f, 2.14669f)
                curveTo(13.0246f, 2.31756f, 13.0463f, 2.58152f, 12.9182f, 2.7756f)
                lineTo(12.8537f, 2.85372f)
                lineTo(8.20724f, 7.50021f)
                lineTo(12.8537f, 12.1467f)
                lineTo(12.9182f, 12.2248f)
                curveTo(13.0463f, 12.4189f, 13.0246f, 12.6829f, 12.8537f, 12.8537f)
                curveTo(12.6829f, 13.0246f, 12.4189f, 13.0463f, 12.2248f, 12.9182f)
                lineTo(12.1467f, 12.8537f)
                lineTo(7.50021f, 8.20724f)
                lineTo(2.85372f, 12.8537f)
                curveTo(2.65846f, 13.049f, 2.34195f, 13.049f, 2.14669f, 12.8537f)
                curveTo(1.95143f, 12.6585f, 1.95143f, 12.342f, 2.14669f, 12.1467f)
                lineTo(6.79318f, 7.50021f)
                lineTo(2.14669f, 2.85372f)
                lineTo(2.08224f, 2.7756f)
                curveTo(1.95407f, 2.58152f, 1.97583f, 2.31756f, 2.14669f, 2.14669f)
                curveTo(2.31756f, 1.97583f, 2.58152f, 1.95407f, 2.7756f, 2.08224f)
                lineTo(2.85372f, 2.14669f)
                lineTo(7.50021f, 6.79318f)
                lineTo(12.1467f, 2.14669f)
                lineTo(12.2248f, 2.08224f)
                close()
            }
        }.build()
        
        return _Cross1!!
    }

private var _Cross1: ImageVector? = null

