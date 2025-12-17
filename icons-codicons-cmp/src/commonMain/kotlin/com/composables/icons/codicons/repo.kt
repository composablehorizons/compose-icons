package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Repo: ImageVector
    get() {
        if (_Repo != null) return _Repo!!
        
        _Repo = ImageVector.Builder(
            name = "repo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 12f)
                curveTo(12.776f, 12f, 13f, 11.776f, 13f, 11.5f)
                verticalLineTo(3f)
                curveTo(13f, 1.895f, 12.105f, 1f, 11f, 1f)
                horizontalLineTo(5f)
                curveTo(3.895f, 1f, 3f, 1.895f, 3f, 3f)
                verticalLineTo(13f)
                curveTo(3f, 14.105f, 3.895f, 15f, 5f, 15f)
                verticalLineTo(15.5f)
                curveTo(5f, 15.702f, 5.122f, 15.885f, 5.309f, 15.962f)
                curveTo(5.495f, 16.039f, 5.711f, 15.997f, 5.854f, 15.854f)
                lineTo(6.5f, 15.208f)
                lineTo(7.146f, 15.854f)
                curveTo(7.242f, 15.95f, 7.37f, 16f, 7.5f, 16f)
                curveTo(7.564f, 16f, 7.63f, 15.987f, 7.691f, 15.962f)
                curveTo(7.878f, 15.885f, 8f, 15.702f, 8f, 15.5f)
                verticalLineTo(15f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 15f, 13f, 14.776f, 13f, 14.5f)
                curveTo(13f, 14.224f, 12.776f, 14f, 12.5f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(13.5f)
                curveTo(8f, 13.224f, 7.776f, 13f, 7.5f, 13f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 13f, 5f, 13.224f, 5f, 13.5f)
                verticalLineTo(14f)
                curveTo(4.448f, 14f, 4f, 13.552f, 4f, 13f)
                verticalLineTo(12f)
                horizontalLineTo(12.5f)
                close()
                moveTo(4f, 3f)
                curveTo(4f, 2.448f, 4.448f, 2f, 5f, 2f)
                horizontalLineTo(11f)
                curveTo(11.552f, 2f, 12f, 2.448f, 12f, 3f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Repo!!
    }

private var _Repo: ImageVector? = null

