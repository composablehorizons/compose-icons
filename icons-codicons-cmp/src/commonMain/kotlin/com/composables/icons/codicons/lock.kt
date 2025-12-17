package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Lock: ImageVector
    get() {
        if (_Lock != null) return _Lock!!
        
        _Lock = ImageVector.Builder(
            name = "lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 9f)
                curveTo(8.55228f, 9f, 9f, 9.44771f, 9f, 10f)
                curveTo(9f, 10.5523f, 8.55228f, 11f, 8f, 11f)
                curveTo(7.44772f, 11f, 7f, 10.5523f, 7f, 10f)
                curveTo(7f, 9.44771f, 7.44772f, 9f, 8f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(9.654f, 1f, 11f, 2.346f, 11f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                curveTo(13.103f, 6f, 14f, 6.897f, 14f, 8f)
                verticalLineTo(13f)
                curveTo(14f, 14.103f, 13.103f, 15f, 12f, 15f)
                horizontalLineTo(4f)
                curveTo(2.897f, 15f, 2f, 14.103f, 2f, 13f)
                verticalLineTo(8f)
                curveTo(2f, 6.897f, 2.897f, 6f, 4f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                curveTo(5f, 2.346f, 6.346f, 1f, 8f, 1f)
                close()
                moveTo(4f, 7f)
                curveTo(3.449f, 7f, 3f, 7.449f, 3f, 8f)
                verticalLineTo(13f)
                curveTo(3f, 13.551f, 3.449f, 14f, 4f, 14f)
                horizontalLineTo(12f)
                curveTo(12.551f, 14f, 13f, 13.551f, 13f, 13f)
                verticalLineTo(8f)
                curveTo(13f, 7.449f, 12.551f, 7f, 12f, 7f)
                horizontalLineTo(4f)
                close()
                moveTo(8f, 2f)
                curveTo(6.897f, 2f, 6f, 2.897f, 6f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                curveTo(10f, 2.897f, 9.103f, 2f, 8f, 2f)
                close()
            }
        }.build()
        
        return _Lock!!
    }

private var _Lock: ImageVector? = null

