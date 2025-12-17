package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.IndexZero: ImageVector
    get() {
        if (_IndexZero != null) return _IndexZero!!
        
        _IndexZero = ImageVector.Builder(
            name = "index-zero",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 2f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(1.5f)
                lineTo(1f, 13.5f)
                verticalLineTo(2.5f)
                lineTo(1.5f, 2f)
                close()
                moveTo(14.5f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(14.5f)
                lineTo(15f, 13.5f)
                verticalLineTo(2.5f)
                lineTo(14.5f, 2f)
                close()
                moveTo(11f, 7f)
                verticalLineTo(9f)
                curveTo(11f, 10.654f, 9.654f, 12f, 8f, 12f)
                curveTo(6.346f, 12f, 5f, 10.654f, 5f, 9f)
                verticalLineTo(7f)
                curveTo(5f, 5.346f, 6.346f, 4f, 8f, 4f)
                curveTo(9.654f, 4f, 11f, 5.346f, 11f, 7f)
                close()
                moveTo(10f, 7f)
                curveTo(10f, 5.897f, 9.103f, 5f, 8f, 5f)
                curveTo(6.897f, 5f, 6f, 5.897f, 6f, 7f)
                verticalLineTo(9f)
                curveTo(6f, 10.103f, 6.897f, 11f, 8f, 11f)
                curveTo(9.103f, 11f, 10f, 10.103f, 10f, 9f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _IndexZero!!
    }

private var _IndexZero: ImageVector? = null

