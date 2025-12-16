package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CodeOss: ImageVector
    get() {
        if (_CodeOss != null) return _CodeOss!!
        
        _CodeOss = ImageVector.Builder(
            name = "code-oss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 1f)
                horizontalLineTo(3.5f)
                curveTo(2.121f, 1f, 1f, 2.122f, 1f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.879f, 2.121f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.879f, 15f, 15f, 13.879f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.122f, 13.879f, 1f, 12.5f, 1f)
                close()
                moveTo(2f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.673f, 2.673f, 2f, 3.5f, 2f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                close()
                moveTo(14f, 12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(12.5f)
                curveTo(13.327f, 2f, 14f, 2.673f, 14f, 3.5f)
                verticalLineTo(12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 4f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 4f, 11f, 3.776f, 11f, 3.5f)
                curveTo(11f, 3.224f, 10.776f, 3f, 10.5f, 3f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 3f, 7f, 3.224f, 7f, 3.5f)
                curveTo(7f, 3.776f, 7.224f, 4f, 7.5f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 5f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 5f, 9f, 5.224f, 9f, 5.5f)
                curveTo(9f, 5.776f, 9.224f, 6f, 9.5f, 6f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 6f, 13f, 5.776f, 13f, 5.5f)
                curveTo(13f, 5.224f, 12.776f, 5f, 12.5f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 11f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 11f, 7f, 11.224f, 7f, 11.5f)
                curveTo(7f, 11.776f, 7.224f, 12f, 7.5f, 12f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 12f, 11f, 11.776f, 11f, 11.5f)
                curveTo(11f, 11.224f, 10.776f, 11f, 10.5f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 7f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 7f, 9f, 7.224f, 9f, 7.5f)
                curveTo(9f, 7.776f, 9.224f, 8f, 9.5f, 8f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 8f, 13f, 7.776f, 13f, 7.5f)
                curveTo(13f, 7.224f, 12.776f, 7f, 12.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 9f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 9f, 9f, 9.224f, 9f, 9.5f)
                curveTo(9f, 9.776f, 9.224f, 10f, 9.5f, 10f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 10f, 13f, 9.776f, 13f, 9.5f)
                curveTo(13f, 9.224f, 12.776f, 9f, 12.5f, 9f)
                close()
            }
        }.build()
        
        return _CodeOss!!
    }

private var _CodeOss: ImageVector? = null

