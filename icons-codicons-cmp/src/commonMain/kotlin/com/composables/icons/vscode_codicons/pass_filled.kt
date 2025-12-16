package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.PassFilled: ImageVector
    get() {
        if (_PassFilled != null) return _PassFilled!!
        
        _PassFilled = ImageVector.Builder(
            name = "pass-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(4.14f, 1f, 1f, 4.14f, 1f, 8f)
                curveTo(1f, 11.86f, 4.14f, 15f, 8f, 15f)
                curveTo(11.86f, 15f, 15f, 11.86f, 15f, 8f)
                curveTo(15f, 4.14f, 11.86f, 1f, 8f, 1f)
                close()
                moveTo(11.354f, 6.354f)
                lineTo(7.354f, 10.354f)
                curveTo(7.256f, 10.452f, 7.128f, 10.5f, 7f, 10.5f)
                curveTo(6.872f, 10.5f, 6.744f, 10.451f, 6.646f, 10.354f)
                lineTo(4.646f, 8.354f)
                curveTo(4.451f, 8.159f, 4.451f, 7.842f, 4.646f, 7.647f)
                curveTo(4.841f, 7.452f, 5.158f, 7.452f, 5.353f, 7.647f)
                lineTo(6.999f, 9.293f)
                lineTo(10.645f, 5.647f)
                curveTo(10.84f, 5.452f, 11.157f, 5.452f, 11.352f, 5.647f)
                curveTo(11.547f, 5.842f, 11.547f, 6.159f, 11.352f, 6.354f)
                horizontalLineTo(11.354f)
                close()
            }
        }.build()
        
        return _PassFilled!!
    }

private var _PassFilled: ImageVector? = null

