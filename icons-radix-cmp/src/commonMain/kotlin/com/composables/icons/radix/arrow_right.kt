package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ArrowRight: ImageVector
    get() {
        if (_ArrowRight != null) return _ArrowRight!!
        
        _ArrowRight = ImageVector.Builder(
            name = "arrow-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.14648f, 3.14669f)
                curveTo(8.31735f, 2.97583f, 8.58131f, 2.95407f, 8.77539f, 3.08224f)
                lineTo(8.85352f, 3.14669f)
                lineTo(12.8535f, 7.14669f)
                curveTo(13.0488f, 7.34195f, 13.0488f, 7.65846f, 12.8535f, 7.85372f)
                lineTo(8.85352f, 11.8537f)
                curveTo(8.65825f, 12.049f, 8.34175f, 12.049f, 8.14648f, 11.8537f)
                curveTo(7.95122f, 11.6585f, 7.95122f, 11.342f, 8.14648f, 11.1467f)
                lineTo(11.293f, 8.00021f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 8.00021f, 2f, 7.77635f, 2f, 7.50021f)
                curveTo(2f, 7.22406f, 2.22386f, 7.00021f, 2.5f, 7.00021f)
                horizontalLineTo(11.293f)
                lineTo(8.14648f, 3.85372f)
                lineTo(8.08203f, 3.7756f)
                curveTo(7.95387f, 3.58152f, 7.97562f, 3.31756f, 8.14648f, 3.14669f)
                close()
            }
        }.build()
        
        return _ArrowRight!!
    }

private var _ArrowRight: ImageVector? = null

