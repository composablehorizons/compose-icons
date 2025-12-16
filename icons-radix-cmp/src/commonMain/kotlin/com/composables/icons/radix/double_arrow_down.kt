package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DoubleArrowDown: ImageVector
    get() {
        if (_DoubleArrowDown != null) return _DoubleArrowDown!!
        
        _DoubleArrowDown = ImageVector.Builder(
            name = "double-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.2248f, 8.08224f)
                curveTo(11.4189f, 7.95407f, 11.6829f, 7.97583f, 11.8537f, 8.14669f)
                curveTo(12.0246f, 8.31756f, 12.0463f, 8.58152f, 11.9182f, 8.7756f)
                lineTo(11.8537f, 8.85372f)
                lineTo(7.85372f, 12.8537f)
                curveTo(7.65846f, 13.049f, 7.34195f, 13.049f, 7.14669f, 12.8537f)
                lineTo(3.14669f, 8.85372f)
                lineTo(3.08224f, 8.7756f)
                curveTo(2.95407f, 8.58152f, 2.97583f, 8.31756f, 3.14669f, 8.14669f)
                curveTo(3.31756f, 7.97583f, 3.58152f, 7.95407f, 3.7756f, 8.08224f)
                lineTo(3.85372f, 8.14669f)
                lineTo(7.50021f, 11.7932f)
                lineTo(11.1467f, 8.14669f)
                lineTo(11.2248f, 8.08224f)
                close()
                moveTo(11.2248f, 2.08224f)
                curveTo(11.4189f, 1.95407f, 11.6829f, 1.97583f, 11.8537f, 2.14669f)
                curveTo(12.0246f, 2.31756f, 12.0463f, 2.58152f, 11.9182f, 2.7756f)
                lineTo(11.8537f, 2.85372f)
                lineTo(7.85372f, 6.85372f)
                curveTo(7.65846f, 7.04899f, 7.34195f, 7.04899f, 7.14669f, 6.85372f)
                lineTo(3.14669f, 2.85372f)
                lineTo(3.08224f, 2.7756f)
                curveTo(2.95407f, 2.58152f, 2.97583f, 2.31756f, 3.14669f, 2.14669f)
                curveTo(3.31756f, 1.97583f, 3.58152f, 1.95407f, 3.7756f, 2.08224f)
                lineTo(3.85372f, 2.14669f)
                lineTo(7.50021f, 5.79318f)
                lineTo(11.1467f, 2.14669f)
                lineTo(11.2248f, 2.08224f)
                close()
            }
        }.build()
        
        return _DoubleArrowDown!!
    }

private var _DoubleArrowDown: ImageVector? = null

