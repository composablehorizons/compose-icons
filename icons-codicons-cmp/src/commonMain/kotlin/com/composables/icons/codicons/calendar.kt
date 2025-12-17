package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Calendar: ImageVector
    get() {
        if (_Calendar != null) return _Calendar!!
        
        _Calendar = ImageVector.Builder(
            name = "calendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(12f)
                curveTo(1f, 13.657f, 2.343f, 15f, 4f, 15f)
                horizontalLineTo(12f)
                curveTo(13.657f, 15f, 15f, 13.657f, 15f, 12f)
                verticalLineTo(4f)
                curveTo(15f, 2.343f, 13.657f, 1f, 12f, 1f)
                close()
                moveTo(14f, 12f)
                curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
                horizontalLineTo(4f)
                curveTo(2.895f, 14f, 2f, 13.105f, 2f, 12f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                close()
                moveTo(2f, 4f)
                curveTo(2f, 2.895f, 2.895f, 2f, 4f, 2f)
                horizontalLineTo(12f)
                curveTo(13.105f, 2f, 14f, 2.895f, 14f, 4f)
                horizontalLineTo(2f)
                close()
                moveTo(4f, 11f)
                curveTo(4f, 10.448f, 4.448f, 10f, 5f, 10f)
                curveTo(5.552f, 10f, 6f, 10.448f, 6f, 11f)
                curveTo(6f, 11.552f, 5.552f, 12f, 5f, 12f)
                curveTo(4.448f, 12f, 4f, 11.552f, 4f, 11f)
                close()
                moveTo(7f, 11f)
                curveTo(7f, 10.448f, 7.448f, 10f, 8f, 10f)
                curveTo(8.552f, 10f, 9f, 10.448f, 9f, 11f)
                curveTo(9f, 11.552f, 8.552f, 12f, 8f, 12f)
                curveTo(7.448f, 12f, 7f, 11.552f, 7f, 11f)
                close()
                moveTo(4f, 8f)
                curveTo(4f, 7.448f, 4.448f, 7f, 5f, 7f)
                curveTo(5.552f, 7f, 6f, 7.448f, 6f, 8f)
                curveTo(6f, 8.552f, 5.552f, 9f, 5f, 9f)
                curveTo(4.448f, 9f, 4f, 8.552f, 4f, 8f)
                close()
                moveTo(7f, 8f)
                curveTo(7f, 7.448f, 7.448f, 7f, 8f, 7f)
                curveTo(8.552f, 7f, 9f, 7.448f, 9f, 8f)
                curveTo(9f, 8.552f, 8.552f, 9f, 8f, 9f)
                curveTo(7.448f, 9f, 7f, 8.552f, 7f, 8f)
                close()
                moveTo(10f, 8f)
                curveTo(10f, 7.448f, 10.448f, 7f, 11f, 7f)
                curveTo(11.552f, 7f, 12f, 7.448f, 12f, 8f)
                curveTo(12f, 8.552f, 11.552f, 9f, 11f, 9f)
                curveTo(10.448f, 9f, 10f, 8.552f, 10f, 8f)
                close()
            }
        }.build()
        
        return _Calendar!!
    }

private var _Calendar: ImageVector? = null

