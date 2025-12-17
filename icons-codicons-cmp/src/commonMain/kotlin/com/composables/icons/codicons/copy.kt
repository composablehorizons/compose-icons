package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Copy: ImageVector
    get() {
        if (_Copy != null) return _Copy!!
        
        _Copy = ImageVector.Builder(
            name = "copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                verticalLineTo(12.73f)
                curveTo(2.4f, 12.38f, 2f, 11.74f, 2f, 11f)
                verticalLineTo(5f)
                curveTo(2f, 2.79f, 3.79f, 1f, 6f, 1f)
                horizontalLineTo(9f)
                curveTo(9.74f, 1f, 10.38f, 1.4f, 10.73f, 2f)
                horizontalLineTo(6f)
                curveTo(4.35f, 2f, 3f, 3.35f, 3f, 5f)
                close()
                moveTo(11f, 15f)
                horizontalLineTo(6f)
                curveTo(4.897f, 15f, 4f, 14.103f, 4f, 13f)
                verticalLineTo(5f)
                curveTo(4f, 3.897f, 4.897f, 3f, 6f, 3f)
                horizontalLineTo(11f)
                curveTo(12.103f, 3f, 13f, 3.897f, 13f, 5f)
                verticalLineTo(13f)
                curveTo(13f, 14.103f, 12.103f, 15f, 11f, 15f)
                close()
                moveTo(12f, 5f)
                curveTo(12f, 4.448f, 11.552f, 4f, 11f, 4f)
                horizontalLineTo(6f)
                curveTo(5.448f, 4f, 5f, 4.448f, 5f, 5f)
                verticalLineTo(13f)
                curveTo(5f, 13.552f, 5.448f, 14f, 6f, 14f)
                horizontalLineTo(11f)
                curveTo(11.552f, 14f, 12f, 13.552f, 12f, 13f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Copy!!
    }

private var _Copy: ImageVector? = null

