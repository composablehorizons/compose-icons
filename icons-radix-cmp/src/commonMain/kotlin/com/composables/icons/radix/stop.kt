package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Stop: ImageVector
    get() {
        if (_Stop != null) return _Stop!!
        
        _Stop = ImageVector.Builder(
            name = "stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(12.5523f, 2f, 13f, 2.44772f, 13f, 3f)
                verticalLineTo(12f)
                curveTo(13f, 12.5523f, 12.5523f, 13f, 12f, 13f)
                horizontalLineTo(3f)
                curveTo(2.44772f, 13f, 2f, 12.5523f, 2f, 12f)
                verticalLineTo(3f)
                curveTo(2f, 2.44772f, 2.44772f, 2f, 3f, 2f)
                horizontalLineTo(12f)
                close()
                moveTo(3f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        
        return _Stop!!
    }

private var _Stop: ImageVector? = null

