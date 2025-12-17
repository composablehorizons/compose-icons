package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Piano: ImageVector
    get() {
        if (_Piano != null) return _Piano!!
        
        _Piano = ImageVector.Builder(
            name = "piano",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 2f)
                horizontalLineTo(1.5f)
                curveTo(0.673f, 2f, 0f, 2.673f, 0f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(0f, 13.327f, 0.673f, 14f, 1.5f, 14f)
                horizontalLineTo(13.5f)
                curveTo(14.327f, 14f, 15f, 13.327f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.673f, 14.327f, 2f, 13.5f, 2f)
                close()
                moveTo(11f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                curveTo(8.552f, 9f, 9f, 8.552f, 9f, 8f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                curveTo(10f, 8.552f, 10.448f, 9f, 11f, 9f)
                verticalLineTo(13f)
                close()
                moveTo(5f, 8f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                curveTo(6f, 8.552f, 6.448f, 9f, 7f, 9f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                curveTo(4.552f, 9f, 5f, 8.552f, 5f, 8f)
                close()
                moveTo(1f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(1f, 3.225f, 1.225f, 3f, 1.5f, 3f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                curveTo(2f, 8.552f, 2.448f, 9f, 3f, 9f)
                verticalLineTo(13f)
                horizontalLineTo(1.5f)
                curveTo(1.225f, 13f, 1f, 12.775f, 1f, 12.5f)
                close()
                moveTo(14f, 12.5f)
                curveTo(14f, 12.775f, 13.775f, 13f, 13.5f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                curveTo(12.552f, 9f, 13f, 8.552f, 13f, 8f)
                verticalLineTo(3f)
                horizontalLineTo(13.5f)
                curveTo(13.775f, 3f, 14f, 3.225f, 14f, 3.5f)
                verticalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _Piano!!
    }

private var _Piano: ImageVector? = null

