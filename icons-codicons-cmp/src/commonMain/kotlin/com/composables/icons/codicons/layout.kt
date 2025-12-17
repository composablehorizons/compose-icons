package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Layout: ImageVector
    get() {
        if (_Layout != null) return _Layout!!
        
        _Layout = ImageVector.Builder(
            name = "layout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 1f)
                curveTo(6.327f, 1f, 7f, 1.673f, 7f, 2.5f)
                verticalLineTo(13.5f)
                curveTo(7f, 14.327f, 6.327f, 15f, 5.5f, 15f)
                horizontalLineTo(2.5f)
                curveTo(1.673f, 15f, 1f, 14.327f, 1f, 13.5f)
                verticalLineTo(2.5f)
                curveTo(1f, 1.673f, 1.673f, 1f, 2.5f, 1f)
                horizontalLineTo(5.5f)
                close()
                moveTo(2.5f, 2f)
                curveTo(2.225f, 2f, 2f, 2.225f, 2f, 2.5f)
                verticalLineTo(13.5f)
                curveTo(2f, 13.775f, 2.225f, 14f, 2.5f, 14f)
                horizontalLineTo(5.5f)
                curveTo(5.775f, 14f, 6f, 13.775f, 6f, 13.5f)
                verticalLineTo(2.5f)
                curveTo(6f, 2.225f, 5.775f, 2f, 5.5f, 2f)
                horizontalLineTo(2.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 9f)
                curveTo(14.327f, 9f, 15f, 9.673f, 15f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(15f, 14.327f, 14.327f, 15f, 13.5f, 15f)
                horizontalLineTo(10.5f)
                curveTo(9.673f, 15f, 9f, 14.327f, 9f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(9f, 9.673f, 9.673f, 9f, 10.5f, 9f)
                horizontalLineTo(13.5f)
                close()
                moveTo(10.5f, 10f)
                curveTo(10.225f, 10f, 10f, 10.225f, 10f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(10f, 13.775f, 10.225f, 14f, 10.5f, 14f)
                horizontalLineTo(13.5f)
                curveTo(13.775f, 14f, 14f, 13.775f, 14f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(14f, 10.225f, 13.775f, 10f, 13.5f, 10f)
                horizontalLineTo(10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 1f)
                curveTo(14.327f, 1f, 15f, 1.673f, 15f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(15f, 6.327f, 14.327f, 7f, 13.5f, 7f)
                horizontalLineTo(10.5f)
                curveTo(9.673f, 7f, 9f, 6.327f, 9f, 5.5f)
                verticalLineTo(2.5f)
                curveTo(9f, 1.673f, 9.673f, 1f, 10.5f, 1f)
                horizontalLineTo(13.5f)
                close()
                moveTo(10.5f, 2f)
                curveTo(10.225f, 2f, 10f, 2.225f, 10f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(10f, 5.775f, 10.225f, 6f, 10.5f, 6f)
                horizontalLineTo(13.5f)
                curveTo(13.775f, 6f, 14f, 5.775f, 14f, 5.5f)
                verticalLineTo(2.5f)
                curveTo(14f, 2.225f, 13.775f, 2f, 13.5f, 2f)
                horizontalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _Layout!!
    }

private var _Layout: ImageVector? = null

