package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SurroundWith: ImageVector
    get() {
        if (_SurroundWith != null) return _SurroundWith!!
        
        _SurroundWith = ImageVector.Builder(
            name = "surround-with",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 9f)
                curveTo(5.552f, 9f, 6f, 8.552f, 6f, 8f)
                curveTo(6f, 7.448f, 5.552f, 7f, 5f, 7f)
                curveTo(4.448f, 7f, 4f, 7.448f, 4f, 8f)
                curveTo(4f, 8.552f, 4.448f, 9f, 5f, 9f)
                close()
                moveTo(9f, 8f)
                curveTo(9f, 8.552f, 8.552f, 9f, 8f, 9f)
                curveTo(7.448f, 9f, 7f, 8.552f, 7f, 8f)
                curveTo(7f, 7.448f, 7.448f, 7f, 8f, 7f)
                curveTo(8.552f, 7f, 9f, 7.448f, 9f, 8f)
                close()
                moveTo(11f, 9f)
                curveTo(11.552f, 9f, 12f, 8.552f, 12f, 8f)
                curveTo(12f, 7.448f, 11.552f, 7f, 11f, 7f)
                curveTo(10.448f, 7f, 10f, 7.448f, 10f, 8f)
                curveTo(10f, 8.552f, 10.448f, 9f, 11f, 9f)
                close()
                moveTo(2.5f, 13f)
                horizontalLineTo(2f)
                curveTo(1.449f, 13f, 1f, 12.552f, 1f, 12f)
                verticalLineTo(4f)
                curveTo(1f, 3.449f, 1.449f, 3f, 2f, 3f)
                horizontalLineTo(2.5f)
                curveTo(2.776f, 3f, 3f, 3.224f, 3f, 3.5f)
                curveTo(3f, 3.776f, 2.776f, 4f, 2.5f, 4f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(2.5f)
                curveTo(2.776f, 12f, 3f, 12.224f, 3f, 12.5f)
                curveTo(3f, 12.776f, 2.776f, 13f, 2.5f, 13f)
                close()
                moveTo(14f, 13f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 13f, 13f, 12.776f, 13f, 12.5f)
                curveTo(13f, 12.224f, 13.224f, 12f, 13.5f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 4f, 13f, 3.776f, 13f, 3.5f)
                curveTo(13f, 3.224f, 13.224f, 3f, 13.5f, 3f)
                horizontalLineTo(14f)
                curveTo(14.551f, 3f, 15f, 3.449f, 15f, 4f)
                verticalLineTo(12f)
                curveTo(15f, 12.552f, 14.551f, 13f, 14f, 13f)
                close()
            }
        }.build()
        
        return _SurroundWith!!
    }

private var _SurroundWith: ImageVector? = null

