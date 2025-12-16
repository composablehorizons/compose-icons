package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CircleSlash: ImageVector
    get() {
        if (_CircleSlash != null) return _CircleSlash!!
        
        _CircleSlash = ImageVector.Builder(
            name = "circle-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.8746f, 3.41833f)
                curveTo(9.51718f, 1.42026f, 5.98144f, 1.53327f, 3.75736f, 3.75736f)
                curveTo(1.53327f, 5.98144f, 1.42026f, 9.51719f, 3.41833f, 11.8746f)
                lineTo(11.8746f, 3.41833f)
                close()
                moveTo(12.5817f, 4.12543f)
                lineTo(4.12543f, 12.5817f)
                curveTo(6.48282f, 14.5797f, 10.0186f, 14.4667f, 12.2426f, 12.2426f)
                curveTo(14.4667f, 10.0186f, 14.5797f, 6.48282f, 12.5817f, 4.12543f)
                close()
                moveTo(3.05025f, 3.05025f)
                curveTo(5.78392f, 0.316582f, 10.2161f, 0.316582f, 12.9497f, 3.05025f)
                curveTo(15.6834f, 5.78392f, 15.6834f, 10.2161f, 12.9497f, 12.9497f)
                curveTo(10.2161f, 15.6834f, 5.78392f, 15.6834f, 3.05025f, 12.9497f)
                curveTo(0.316583f, 10.2161f, 0.316582f, 5.78392f, 3.05025f, 3.05025f)
                close()
            }
        }.build()
        
        return _CircleSlash!!
    }

private var _CircleSlash: ImageVector? = null

