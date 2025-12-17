package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EvStation: ImageVector
    get() {
        if (_EvStation != null) return _EvStation!!
        
        _EvStation = ImageVector.Builder(
            name = "ev-station",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.258f, -0.104f, -0.377f, -0.357f, -0.635f)
                lineToRelative(-0.007f, -0.008f)
                curveTo(13.379f, 8.096f, 13f, 7.71f, 13f, 7f)
                verticalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, -0.354f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(0.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 4f)
                verticalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                verticalLineTo(12f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                close()
                moveToRelative(2f, 0.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(2.631f, 9.96f)
                horizontalLineTo(4.14f)
                verticalLineToRelative(-0.893f)
                horizontalLineToRelative(1.403f)
                verticalLineToRelative(-0.505f)
                horizontalLineTo(4.14f)
                verticalLineToRelative(-0.855f)
                horizontalLineToRelative(1.49f)
                verticalLineToRelative(-0.54f)
                horizontalLineTo(3.485f)
                verticalLineTo(13f)
                horizontalLineToRelative(2.146f)
                close()
                moveToRelative(1.316f, 0.54f)
                horizontalLineToRelative(0.794f)
                lineToRelative(1.106f, -3.333f)
                horizontalLineToRelative(-0.733f)
                lineToRelative(-0.74f, 2.615f)
                horizontalLineToRelative(-0.031f)
                lineToRelative(-0.747f, -2.615f)
                horizontalLineToRelative(-0.764f)
                close()
            }
        }.build()
        
        return _EvStation!!
    }

private var _EvStation: ImageVector? = null

