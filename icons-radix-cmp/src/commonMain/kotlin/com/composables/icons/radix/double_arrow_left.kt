package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DoubleArrowLeft: ImageVector
    get() {
        if (_DoubleArrowLeft != null) return _DoubleArrowLeft!!
        
        _DoubleArrowLeft = ImageVector.Builder(
            name = "double-arrow-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.22457f, 3.08224f)
                curveTo(6.41865f, 2.95407f, 6.68261f, 2.97583f, 6.85348f, 3.14669f)
                curveTo(7.02434f, 3.31756f, 7.04609f, 3.58152f, 6.91793f, 3.7756f)
                lineTo(6.85348f, 3.85372f)
                lineTo(3.20699f, 7.50021f)
                lineTo(6.85348f, 11.1467f)
                lineTo(6.91793f, 11.2248f)
                curveTo(7.04609f, 11.4189f, 7.02434f, 11.6829f, 6.85348f, 11.8537f)
                curveTo(6.68261f, 12.0246f, 6.41865f, 12.0463f, 6.22457f, 11.9182f)
                lineTo(6.14645f, 11.8537f)
                lineTo(2.14645f, 7.85372f)
                curveTo(1.95118f, 7.65846f, 1.95118f, 7.34195f, 2.14645f, 7.14669f)
                lineTo(6.14645f, 3.14669f)
                lineTo(6.22457f, 3.08224f)
                close()
                moveTo(12.2246f, 3.08224f)
                curveTo(12.4187f, 2.95407f, 12.6826f, 2.97583f, 12.8535f, 3.14669f)
                curveTo(13.0243f, 3.31756f, 13.0461f, 3.58152f, 12.9179f, 3.7756f)
                lineTo(12.8535f, 3.85372f)
                lineTo(9.20699f, 7.50021f)
                lineTo(12.8535f, 11.1467f)
                lineTo(12.9179f, 11.2248f)
                curveTo(13.0461f, 11.4189f, 13.0243f, 11.6829f, 12.8535f, 11.8537f)
                curveTo(12.6826f, 12.0246f, 12.4187f, 12.0463f, 12.2246f, 11.9182f)
                lineTo(12.1464f, 11.8537f)
                lineTo(8.14645f, 7.85372f)
                curveTo(7.95118f, 7.65846f, 7.95118f, 7.34195f, 8.14645f, 7.14669f)
                lineTo(12.1464f, 3.14669f)
                lineTo(12.2246f, 3.08224f)
                close()
            }
        }.build()
        
        return _DoubleArrowLeft!!
    }

private var _DoubleArrowLeft: ImageVector? = null

