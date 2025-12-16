package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DoubleArrowRight: ImageVector
    get() {
        if (_DoubleArrowRight != null) return _DoubleArrowRight!!
        
        _DoubleArrowRight = ImageVector.Builder(
            name = "double-arrow-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.14669f, 3.14669f)
                curveTo(2.31756f, 2.97583f, 2.58152f, 2.95407f, 2.7756f, 3.08224f)
                lineTo(2.85372f, 3.14669f)
                lineTo(6.85372f, 7.14669f)
                curveTo(7.04899f, 7.34195f, 7.04899f, 7.65846f, 6.85372f, 7.85372f)
                lineTo(2.85372f, 11.8537f)
                lineTo(2.7756f, 11.9182f)
                curveTo(2.58152f, 12.0463f, 2.31756f, 12.0246f, 2.14669f, 11.8537f)
                curveTo(1.97583f, 11.6829f, 1.95407f, 11.4189f, 2.08224f, 11.2248f)
                lineTo(2.14669f, 11.1467f)
                lineTo(5.79318f, 7.50021f)
                lineTo(2.14669f, 3.85372f)
                lineTo(2.08224f, 3.7756f)
                curveTo(1.95407f, 3.58152f, 1.97583f, 3.31756f, 2.14669f, 3.14669f)
                close()
                moveTo(8.14669f, 3.14669f)
                curveTo(8.31756f, 2.97583f, 8.58152f, 2.95407f, 8.7756f, 3.08224f)
                lineTo(8.85372f, 3.14669f)
                lineTo(12.8537f, 7.14669f)
                curveTo(13.049f, 7.34195f, 13.049f, 7.65846f, 12.8537f, 7.85372f)
                lineTo(8.85372f, 11.8537f)
                lineTo(8.7756f, 11.9182f)
                curveTo(8.58152f, 12.0463f, 8.31756f, 12.0246f, 8.14669f, 11.8537f)
                curveTo(7.97583f, 11.6829f, 7.95407f, 11.4189f, 8.08224f, 11.2248f)
                lineTo(8.14669f, 11.1467f)
                lineTo(11.7932f, 7.50021f)
                lineTo(8.14669f, 3.85372f)
                lineTo(8.08224f, 3.7756f)
                curveTo(7.95407f, 3.58152f, 7.97583f, 3.31756f, 8.14669f, 3.14669f)
                close()
            }
        }.build()
        
        return _DoubleArrowRight!!
    }

private var _DoubleArrowRight: ImageVector? = null

