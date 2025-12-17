package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Watch: ImageVector
    get() {
        if (_Watch != null) return _Watch!!
        
        _Watch = ImageVector.Builder(
            name = "watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 6f)
                horizontalLineTo(12f)
                curveTo(12f, 5.282f, 11.61f, 4.627f, 11f, 4.275f)
                verticalLineTo(2.5f)
                curveTo(11f, 1.673f, 10.327f, 1f, 9.5f, 1f)
                horizontalLineTo(6.5f)
                curveTo(5.673f, 1f, 5f, 1.673f, 5f, 2.5f)
                verticalLineTo(4.275f)
                curveTo(4.39f, 4.628f, 4f, 5.283f, 4f, 6f)
                verticalLineTo(10f)
                curveTo(4f, 10.718f, 4.39f, 11.373f, 5f, 11.725f)
                verticalLineTo(13.5f)
                curveTo(5f, 14.327f, 5.673f, 15f, 6.5f, 15f)
                horizontalLineTo(9.5f)
                curveTo(10.327f, 15f, 11f, 14.327f, 11f, 13.5f)
                verticalLineTo(11.725f)
                curveTo(11.61f, 11.372f, 12f, 10.717f, 12f, 10f)
                verticalLineTo(9f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 9f, 13f, 8.776f, 13f, 8.5f)
                verticalLineTo(6.5f)
                curveTo(13f, 6.224f, 12.776f, 6f, 12.5f, 6f)
                close()
                moveTo(6f, 2.5f)
                curveTo(6f, 2.224f, 6.225f, 2f, 6.5f, 2f)
                horizontalLineTo(9.5f)
                curveTo(9.775f, 2f, 10f, 2.224f, 10f, 2.5f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(2.5f)
                close()
                moveTo(10f, 13.5f)
                curveTo(10f, 13.776f, 9.775f, 14f, 9.5f, 14f)
                horizontalLineTo(6.5f)
                curveTo(6.225f, 14f, 6f, 13.776f, 6f, 13.5f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(13.5f)
                close()
                moveTo(11f, 10f)
                curveTo(11f, 10.418f, 10.731f, 10.795f, 10.333f, 10.937f)
                curveTo(10.213f, 10.979f, 10.104f, 11f, 10f, 11f)
                horizontalLineTo(6f)
                curveTo(5.896f, 11f, 5.787f, 10.979f, 5.667f, 10.937f)
                curveTo(5.269f, 10.795f, 5f, 10.418f, 5f, 10f)
                verticalLineTo(6f)
                curveTo(5f, 5.582f, 5.269f, 5.205f, 5.667f, 5.063f)
                curveTo(5.787f, 5.021f, 5.896f, 5f, 6f, 5f)
                horizontalLineTo(10f)
                curveTo(10.104f, 5f, 10.213f, 5.021f, 10.333f, 5.063f)
                curveTo(10.731f, 5.205f, 11f, 5.582f, 11f, 6f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _Watch!!
    }

private var _Watch: ImageVector? = null

