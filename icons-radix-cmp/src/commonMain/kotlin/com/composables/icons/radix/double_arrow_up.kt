package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DoubleArrowUp: ImageVector
    get() {
        if (_DoubleArrowUp != null) return _DoubleArrowUp!!
        
        _DoubleArrowUp = ImageVector.Builder(
            name = "double-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.14669f, 8.14645f)
                curveTo(7.34195f, 7.95118f, 7.65846f, 7.95118f, 7.85372f, 8.14645f)
                lineTo(11.8537f, 12.1464f)
                lineTo(11.9182f, 12.2246f)
                curveTo(12.0463f, 12.4186f, 12.0246f, 12.6826f, 11.8537f, 12.8535f)
                curveTo(11.6829f, 13.0243f, 11.4189f, 13.0461f, 11.2248f, 12.9179f)
                lineTo(11.1467f, 12.8535f)
                lineTo(7.50021f, 9.20699f)
                lineTo(3.85372f, 12.8535f)
                lineTo(3.7756f, 12.9179f)
                curveTo(3.58152f, 13.0461f, 3.31756f, 13.0243f, 3.14669f, 12.8535f)
                curveTo(2.97583f, 12.6826f, 2.95407f, 12.4187f, 3.08224f, 12.2246f)
                lineTo(3.14669f, 12.1464f)
                lineTo(7.14669f, 8.14645f)
                close()
                moveTo(7.14669f, 2.14645f)
                curveTo(7.34195f, 1.95118f, 7.65846f, 1.95118f, 7.85372f, 2.14645f)
                lineTo(11.8537f, 6.14645f)
                lineTo(11.9182f, 6.22457f)
                curveTo(12.0463f, 6.41865f, 12.0246f, 6.68261f, 11.8537f, 6.85348f)
                curveTo(11.6829f, 7.02434f, 11.4189f, 7.04609f, 11.2248f, 6.91793f)
                lineTo(11.1467f, 6.85348f)
                lineTo(7.50021f, 3.20699f)
                lineTo(3.85372f, 6.85348f)
                lineTo(3.7756f, 6.91793f)
                curveTo(3.58152f, 7.04609f, 3.31756f, 7.02434f, 3.14669f, 6.85348f)
                curveTo(2.97583f, 6.68261f, 2.95407f, 6.41865f, 3.08224f, 6.22457f)
                lineTo(3.14669f, 6.14645f)
                lineTo(7.14669f, 2.14645f)
                close()
            }
        }.build()
        
        return _DoubleArrowUp!!
    }

private var _DoubleArrowUp: ImageVector? = null

