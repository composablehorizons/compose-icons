package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Milestone: ImageVector
    get() {
        if (_Milestone != null) return _Milestone!!
        
        _Milestone = ImageVector.Builder(
            name = "milestone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.854f, 6.146f)
                lineTo(12.147f, 4.439f)
                curveTo(11.864f, 4.156f, 11.487f, 4f, 11.086f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                curveTo(9f, 1.897f, 8.103f, 1f, 7f, 1f)
                curveTo(5.897f, 1f, 5f, 1.897f, 5f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 4f, 2f, 4.673f, 2f, 5.5f)
                verticalLineTo(7.5f)
                curveTo(2f, 8.327f, 2.673f, 9f, 3.5f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                curveTo(5f, 14.551f, 5.449f, 15f, 6f, 15f)
                horizontalLineTo(8f)
                curveTo(8.551f, 15f, 9f, 14.551f, 9f, 14f)
                verticalLineTo(9f)
                horizontalLineTo(11.086f)
                curveTo(11.486f, 9f, 11.863f, 8.844f, 12.147f, 8.561f)
                lineTo(13.854f, 6.854f)
                curveTo(14.049f, 6.659f, 14.049f, 6.341f, 13.854f, 6.146f)
                close()
                moveTo(6f, 3f)
                curveTo(6f, 2.449f, 6.449f, 2f, 7f, 2f)
                curveTo(7.551f, 2f, 8f, 2.449f, 8f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                close()
                moveTo(8f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                close()
                moveTo(11.439f, 7.854f)
                curveTo(11.346f, 7.947f, 11.217f, 8f, 11.085f, 8f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 8f, 3f, 7.776f, 3f, 7.5f)
                verticalLineTo(5.5f)
                curveTo(3f, 5.224f, 3.224f, 5f, 3.5f, 5f)
                horizontalLineTo(11.086f)
                curveTo(11.217f, 5f, 11.346f, 5.053f, 11.44f, 5.146f)
                lineTo(12.794f, 6.5f)
                lineTo(11.439f, 7.854f)
                close()
            }
        }.build()
        
        return _Milestone!!
    }

private var _Milestone: ImageVector? = null

