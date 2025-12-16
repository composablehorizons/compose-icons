package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Game: ImageVector
    get() {
        if (_Game != null) return _Game!!
        
        _Game = ImageVector.Builder(
            name = "game",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 6f)
                curveTo(5.776f, 6f, 6f, 6.224f, 6f, 6.5f)
                verticalLineTo(8f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 8f, 8f, 8.224f, 8f, 8.5f)
                curveTo(8f, 8.776f, 7.776f, 9f, 7.5f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(10.5f)
                curveTo(6f, 10.776f, 5.776f, 11f, 5.5f, 11f)
                curveTo(5.224f, 11f, 5f, 10.776f, 5f, 10.5f)
                verticalLineTo(9f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 9f, 3f, 8.776f, 3f, 8.5f)
                curveTo(3f, 8.224f, 3.224f, 8f, 3.5f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(6.5f)
                curveTo(5f, 6.224f, 5.224f, 6f, 5.5f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 9f)
                curveTo(11.552f, 9f, 12f, 9.448f, 12f, 10f)
                curveTo(12f, 10.552f, 11.552f, 11f, 11f, 11f)
                curveTo(10.448f, 11f, 10f, 10.552f, 10f, 10f)
                curveTo(10f, 9.448f, 10.448f, 9f, 11f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6f)
                curveTo(12.552f, 6f, 13f, 6.448f, 13f, 7f)
                curveTo(13f, 7.552f, 12.552f, 8f, 12f, 8f)
                curveTo(11.448f, 8f, 11f, 7.552f, 11f, 7f)
                curveTo(11f, 6.448f, 11.448f, 6f, 12f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                curveTo(14.209f, 3f, 16f, 4.791f, 16f, 7f)
                verticalLineTo(10f)
                curveTo(16f, 12.209f, 14.209f, 14f, 12f, 14f)
                horizontalLineTo(4f)
                curveTo(1.791f, 14f, 0f, 12.209f, 0f, 10f)
                verticalLineTo(7f)
                curveTo(0f, 4.791f, 1.791f, 3f, 4f, 3f)
                horizontalLineTo(12f)
                close()
                moveTo(4f, 4f)
                curveTo(2.343f, 4f, 1f, 5.343f, 1f, 7f)
                verticalLineTo(10f)
                curveTo(1f, 11.657f, 2.343f, 13f, 4f, 13f)
                horizontalLineTo(12f)
                curveTo(13.657f, 13f, 15f, 11.657f, 15f, 10f)
                verticalLineTo(7f)
                curveTo(15f, 5.343f, 13.657f, 4f, 12f, 4f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Game!!
    }

private var _Game: ImageVector? = null

