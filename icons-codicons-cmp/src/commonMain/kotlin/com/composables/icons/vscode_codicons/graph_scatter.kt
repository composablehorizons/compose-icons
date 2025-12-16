package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GraphScatter: ImageVector
    get() {
        if (_GraphScatter != null) return _GraphScatter!!
        
        _GraphScatter = ImageVector.Builder(
            name = "graph-scatter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 14.5f)
                curveTo(1f, 14.776f, 1.224f, 15f, 1.5f, 15f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 15f, 15f, 14.776f, 15f, 14.5f)
                curveTo(15f, 14.224f, 14.776f, 14f, 14.5f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(1.5f)
                curveTo(2f, 1.224f, 1.776f, 1f, 1.5f, 1f)
                curveTo(1.224f, 1f, 1f, 1.224f, 1f, 1.5f)
                verticalLineTo(14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 4f)
                curveTo(10f, 5.103f, 10.897f, 6f, 12f, 6f)
                curveTo(13.103f, 6f, 14f, 5.103f, 14f, 4f)
                curveTo(14f, 2.897f, 13.103f, 2f, 12f, 2f)
                curveTo(10.897f, 2f, 10f, 2.897f, 10f, 4f)
                close()
                moveTo(11f, 4f)
                curveTo(11f, 3.449f, 11.449f, 3f, 12f, 3f)
                curveTo(12.551f, 3f, 13f, 3.449f, 13f, 4f)
                curveTo(13f, 4.551f, 12.551f, 5f, 12f, 5f)
                curveTo(11.449f, 5f, 11f, 4.551f, 11f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 8f)
                curveTo(4.897f, 8f, 4f, 7.103f, 4f, 6f)
                curveTo(4f, 4.897f, 4.897f, 4f, 6f, 4f)
                curveTo(7.103f, 4f, 8f, 4.897f, 8f, 6f)
                curveTo(8f, 7.103f, 7.103f, 8f, 6f, 8f)
                close()
                moveTo(6f, 5f)
                curveTo(5.449f, 5f, 5f, 5.449f, 5f, 6f)
                curveTo(5f, 6.551f, 5.449f, 7f, 6f, 7f)
                curveTo(6.551f, 7f, 7f, 6.551f, 7f, 6f)
                curveTo(7f, 5.449f, 6.551f, 5f, 6f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 10f)
                curveTo(8f, 11.103f, 8.897f, 12f, 10f, 12f)
                curveTo(11.103f, 12f, 12f, 11.103f, 12f, 10f)
                curveTo(12f, 8.897f, 11.103f, 8f, 10f, 8f)
                curveTo(8.897f, 8f, 8f, 8.897f, 8f, 10f)
                close()
                moveTo(9f, 10f)
                curveTo(9f, 9.449f, 9.449f, 9f, 10f, 9f)
                curveTo(10.551f, 9f, 11f, 9.449f, 11f, 10f)
                curveTo(11f, 10.551f, 10.551f, 11f, 10f, 11f)
                curveTo(9.449f, 11f, 9f, 10.551f, 9f, 10f)
                close()
            }
        }.build()
        
        return _GraphScatter!!
    }

private var _GraphScatter: ImageVector? = null

