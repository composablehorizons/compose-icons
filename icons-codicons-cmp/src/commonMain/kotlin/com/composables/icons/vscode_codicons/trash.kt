package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Trash: ImageVector
    get() {
        if (_Trash != null) return _Trash!!
        
        _Trash = ImageVector.Builder(
            name = "trash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 2f)
                horizontalLineTo(10f)
                curveTo(10f, 0.897f, 9.103f, 0f, 8f, 0f)
                curveTo(6.897f, 0f, 6f, 0.897f, 6f, 2f)
                horizontalLineTo(2f)
                curveTo(1.724f, 2f, 1.5f, 2.224f, 1.5f, 2.5f)
                curveTo(1.5f, 2.776f, 1.724f, 3f, 2f, 3f)
                horizontalLineTo(2.54f)
                lineTo(3.349f, 12.708f)
                curveTo(3.456f, 13.994f, 4.55f, 15f, 5.84f, 15f)
                horizontalLineTo(10.159f)
                curveTo(11.449f, 15f, 12.543f, 13.993f, 12.65f, 12.708f)
                lineTo(13.459f, 3f)
                horizontalLineTo(13.999f)
                curveTo(14.275f, 3f, 14.499f, 2.776f, 14.499f, 2.5f)
                curveTo(14.499f, 2.224f, 14.275f, 2f, 13.999f, 2f)
                horizontalLineTo(14f)
                close()
                moveTo(8f, 1f)
                curveTo(8.551f, 1f, 9f, 1.449f, 9f, 2f)
                horizontalLineTo(7f)
                curveTo(7f, 1.449f, 7.449f, 1f, 8f, 1f)
                close()
                moveTo(11.655f, 12.625f)
                curveTo(11.591f, 13.396f, 10.934f, 14f, 10.16f, 14f)
                horizontalLineTo(5.841f)
                curveTo(5.067f, 14f, 4.41f, 13.396f, 4.346f, 12.625f)
                lineTo(3.544f, 3f)
                horizontalLineTo(12.458f)
                lineTo(11.656f, 12.625f)
                horizontalLineTo(11.655f)
                close()
                moveTo(7f, 5.5f)
                verticalLineTo(11.5f)
                curveTo(7f, 11.776f, 6.776f, 12f, 6.5f, 12f)
                curveTo(6.224f, 12f, 6f, 11.776f, 6f, 11.5f)
                verticalLineTo(5.5f)
                curveTo(6f, 5.224f, 6.224f, 5f, 6.5f, 5f)
                curveTo(6.776f, 5f, 7f, 5.224f, 7f, 5.5f)
                close()
                moveTo(10f, 5.5f)
                verticalLineTo(11.5f)
                curveTo(10f, 11.776f, 9.776f, 12f, 9.5f, 12f)
                curveTo(9.224f, 12f, 9f, 11.776f, 9f, 11.5f)
                verticalLineTo(5.5f)
                curveTo(9f, 5.224f, 9.224f, 5f, 9.5f, 5f)
                curveTo(9.776f, 5f, 10f, 5.224f, 10f, 5.5f)
                close()
            }
        }.build()
        
        return _Trash!!
    }

private var _Trash: ImageVector? = null

