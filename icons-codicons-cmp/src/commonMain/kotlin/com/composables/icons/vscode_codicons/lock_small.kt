package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LockSmall: ImageVector
    get() {
        if (_LockSmall != null) return _LockSmall!!
        
        _LockSmall = ImageVector.Builder(
            name = "lock-small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 7f)
                verticalLineTo(5f)
                curveTo(11f, 3.346f, 9.654f, 2f, 8f, 2f)
                curveTo(6.346f, 2f, 5f, 3.346f, 5f, 5f)
                verticalLineTo(7f)
                curveTo(3.897f, 7f, 3f, 7.897f, 3f, 9f)
                verticalLineTo(12f)
                curveTo(3f, 13.103f, 3.897f, 14f, 5f, 14f)
                horizontalLineTo(11f)
                curveTo(12.103f, 14f, 13f, 13.103f, 13f, 12f)
                verticalLineTo(9f)
                curveTo(13f, 7.897f, 12.103f, 7f, 11f, 7f)
                close()
                moveTo(6f, 5f)
                curveTo(6f, 3.897f, 6.897f, 3f, 8f, 3f)
                curveTo(9.103f, 3f, 10f, 3.897f, 10f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                close()
                moveTo(12f, 12f)
                curveTo(12f, 12.551f, 11.551f, 13f, 11f, 13f)
                horizontalLineTo(5f)
                curveTo(4.449f, 13f, 4f, 12.551f, 4f, 12f)
                verticalLineTo(9f)
                curveTo(4f, 8.449f, 4.449f, 8f, 5f, 8f)
                horizontalLineTo(11f)
                curveTo(11.551f, 8f, 12f, 8.449f, 12f, 9f)
                verticalLineTo(12f)
                close()
                moveTo(9f, 10f)
                curveTo(9f, 10.552f, 8.552f, 11f, 8f, 11f)
                curveTo(7.448f, 11f, 7f, 10.552f, 7f, 10f)
                curveTo(7f, 9.448f, 7.448f, 9f, 8f, 9f)
                curveTo(8.552f, 9f, 9f, 9.448f, 9f, 10f)
                close()
            }
        }.build()
        
        return _LockSmall!!
    }

private var _LockSmall: ImageVector? = null

