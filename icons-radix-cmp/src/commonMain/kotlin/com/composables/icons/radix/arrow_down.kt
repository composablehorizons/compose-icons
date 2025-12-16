package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ArrowDown: ImageVector
    get() {
        if (_ArrowDown != null) return _ArrowDown!!
        
        _ArrowDown = ImageVector.Builder(
            name = "arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50021f, 2f)
                curveTo(7.77635f, 2f, 8.00021f, 2.22386f, 8.00021f, 2.5f)
                verticalLineTo(11.293f)
                lineTo(11.1467f, 8.14648f)
                curveTo(11.342f, 7.95122f, 11.6585f, 7.95122f, 11.8537f, 8.14648f)
                curveTo(12.049f, 8.34175f, 12.049f, 8.65825f, 11.8537f, 8.85352f)
                lineTo(7.85372f, 12.8535f)
                curveTo(7.75995f, 12.9473f, 7.63282f, 13f, 7.50021f, 13f)
                curveTo(7.3676f, 13f, 7.24046f, 12.9473f, 7.14669f, 12.8535f)
                lineTo(3.14669f, 8.85352f)
                lineTo(3.08224f, 8.77539f)
                curveTo(2.95407f, 8.58131f, 2.97583f, 8.31735f, 3.14669f, 8.14648f)
                curveTo(3.31756f, 7.97562f, 3.58152f, 7.95387f, 3.7756f, 8.08203f)
                lineTo(3.85372f, 8.14648f)
                lineTo(7.00021f, 11.293f)
                verticalLineTo(2.5f)
                curveTo(7.00021f, 2.22386f, 7.22407f, 2f, 7.50021f, 2f)
                close()
            }
        }.build()
        
        return _ArrowDown!!
    }

private var _ArrowDown: ImageVector? = null

