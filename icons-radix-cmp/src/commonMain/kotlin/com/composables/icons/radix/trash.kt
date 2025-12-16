package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Trash: ImageVector
    get() {
        if (_Trash != null) return _Trash!!
        
        _Trash = ImageVector.Builder(
            name = "trash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 3f)
                curveTo(11.7761f, 3f, 12f, 3.22386f, 12f, 3.5f)
                curveTo(12f, 3.77614f, 11.7761f, 4f, 11.5f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                lineTo(10.9951f, 12.1025f)
                curveTo(10.9472f, 12.573f, 10.573f, 12.9472f, 10.1025f, 12.9951f)
                lineTo(10f, 13f)
                horizontalLineTo(5f)
                lineTo(4.89746f, 12.9951f)
                curveTo(4.42703f, 12.9472f, 4.05278f, 12.573f, 4.00488f, 12.1025f)
                lineTo(4f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(3.5f)
                curveTo(3.22386f, 4f, 3f, 3.77614f, 3f, 3.5f)
                curveTo(3f, 3.22386f, 3.22386f, 3f, 3.5f, 3f)
                horizontalLineTo(11.5f)
                close()
                moveTo(5f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                close()
                moveTo(9.5f, 1f)
                curveTo(9.77614f, 1f, 10f, 1.22386f, 10f, 1.5f)
                curveTo(10f, 1.77614f, 9.77614f, 2f, 9.5f, 2f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 2f, 5f, 1.77614f, 5f, 1.5f)
                curveTo(5f, 1.22386f, 5.22386f, 1f, 5.5f, 1f)
                horizontalLineTo(9.5f)
                close()
            }
        }.build()
        
        return _Trash!!
    }

private var _Trash: ImageVector? = null

