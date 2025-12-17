package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Snake: ImageVector
    get() {
        if (_Snake != null) return _Snake!!
        
        _Snake = ImageVector.Builder(
            name = "snake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 11f)
                verticalLineTo(10f)
                curveTo(13f, 8.897f, 12.103f, 8f, 11f, 8f)
                verticalLineTo(3.5f)
                curveTo(11f, 2.122f, 9.879f, 1f, 8.5f, 1f)
                horizontalLineTo(5.5f)
                curveTo(4.121f, 1f, 3f, 2.122f, 3f, 3.5f)
                curveTo(3f, 4.009f, 3.154f, 4.481f, 3.416f, 4.877f)
                lineTo(2.293f, 6f)
                horizontalLineTo(1f)
                curveTo(0.724f, 6f, 0.5f, 6.224f, 0.5f, 6.5f)
                curveTo(0.5f, 6.776f, 0.724f, 7f, 1f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                curveTo(2f, 8.276f, 2.224f, 8.5f, 2.5f, 8.5f)
                curveTo(2.776f, 8.5f, 3f, 8.276f, 3f, 8f)
                verticalLineTo(6.707f)
                lineTo(4.123f, 5.584f)
                curveTo(4.518f, 5.846f, 4.991f, 6f, 5.5f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                curveTo(4.897f, 8f, 4f, 8.897f, 4f, 10f)
                verticalLineTo(11f)
                curveTo(2.897f, 11f, 2f, 11.897f, 2f, 13f)
                curveTo(2f, 14.103f, 2.897f, 15f, 4f, 15f)
                horizontalLineTo(13f)
                curveTo(14.103f, 15f, 15f, 14.103f, 15f, 13f)
                curveTo(15f, 11.897f, 14.103f, 11f, 13f, 11f)
                close()
                moveTo(13f, 14f)
                horizontalLineTo(4f)
                curveTo(3.448f, 14f, 3f, 13.551f, 3f, 13f)
                curveTo(3f, 12.449f, 3.448f, 12f, 4f, 12f)
                horizontalLineTo(4.5f)
                curveTo(4.776f, 12f, 5f, 11.776f, 5f, 11.5f)
                verticalLineTo(10f)
                curveTo(5f, 9.449f, 5.448f, 9f, 6f, 9f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 9f, 8f, 8.776f, 8f, 8.5f)
                verticalLineTo(5.5f)
                curveTo(8f, 5.224f, 7.776f, 5f, 7.5f, 5f)
                horizontalLineTo(5.5f)
                curveTo(4.673f, 5f, 4f, 4.327f, 4f, 3.5f)
                curveTo(4f, 2.673f, 4.673f, 2f, 5.5f, 2f)
                horizontalLineTo(8.5f)
                curveTo(9.327f, 2f, 10f, 2.673f, 10f, 3.5f)
                verticalLineTo(8.5f)
                curveTo(10f, 8.776f, 10.224f, 9f, 10.5f, 9f)
                horizontalLineTo(11f)
                curveTo(11.552f, 9f, 12f, 9.449f, 12f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 11f, 7f, 11.224f, 7f, 11.5f)
                curveTo(7f, 11.776f, 7.224f, 12f, 7.5f, 12f)
                horizontalLineTo(13f)
                curveTo(13.552f, 12f, 14f, 12.449f, 14f, 13f)
                curveTo(14f, 13.551f, 13.552f, 14f, 13f, 14f)
                close()
                moveTo(7f, 3.5f)
                curveTo(7f, 3.776f, 6.776f, 4f, 6.5f, 4f)
                curveTo(6.224f, 4f, 6f, 3.776f, 6f, 3.5f)
                curveTo(6f, 3.224f, 6.224f, 3f, 6.5f, 3f)
                curveTo(6.776f, 3f, 7f, 3.224f, 7f, 3.5f)
                close()
            }
        }.build()
        
        return _Snake!!
    }

private var _Snake: ImageVector? = null

