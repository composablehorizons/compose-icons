package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EvStation: ImageVector
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
                moveTo(3.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveToRelative(2.131f, 10.46f)
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(13f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(11f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                verticalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.146f, -0.354f)
                lineToRelative(-0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0f)
                lineToRelative(-0.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.71f, 0.38f, 1.096f, 0.636f, 1.357f)
                lineToRelative(0.007f, 0.008f)
                curveToRelative(0.253f, 0.258f, 0.357f, 0.377f, 0.357f, 0.635f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineTo(12f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(7f, 2f)
                verticalLineToRelative(13f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
            }
        }.build()
        
        return _EvStation!!
    }

private var _EvStation: ImageVector? = null

