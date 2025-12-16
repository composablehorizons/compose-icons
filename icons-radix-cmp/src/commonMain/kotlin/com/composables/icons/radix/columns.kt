package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Columns: ImageVector
    get() {
        if (_Columns != null) return _Columns!!
        
        _Columns = ImageVector.Builder(
            name = "columns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.15079f, 14f)
                horizontalLineTo(0.850006f)
                verticalLineTo(1f)
                horizontalLineTo(2.15079f)
                verticalLineTo(14f)
                close()
                moveTo(6.15079f, 14f)
                horizontalLineTo(4.85001f)
                verticalLineTo(1f)
                horizontalLineTo(6.15079f)
                verticalLineTo(14f)
                close()
                moveTo(10.1508f, 14f)
                horizontalLineTo(8.85001f)
                verticalLineTo(1f)
                horizontalLineTo(10.1508f)
                verticalLineTo(14f)
                close()
                moveTo(14.1508f, 14f)
                horizontalLineTo(12.85f)
                verticalLineTo(1f)
                horizontalLineTo(14.1508f)
                verticalLineTo(14f)
                close()
            }
        }.build()
        
        return _Columns!!
    }

private var _Columns: ImageVector? = null

