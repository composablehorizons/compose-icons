package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.`5Square`: ImageVector
    get() {
        if (_5Square != null) return _5Square!!
        
        _5Square = ImageVector.Builder(
            name = "5-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.994f, 12.158f)
                curveToRelative(-1.57f, 0f, -2.654f, -0.902f, -2.719f, -2.115f)
                horizontalLineToRelative(1.237f)
                curveToRelative(0.14f, 0.72f, 0.832f, 1.031f, 1.529f, 1.031f)
                curveToRelative(0.791f, 0f, 1.57f, -0.597f, 1.57f, -1.681f)
                curveToRelative(0f, -0.967f, -0.732f, -1.57f, -1.582f, -1.57f)
                curveToRelative(-0.767f, 0f, -1.242f, 0.45f, -1.435f, 0.808f)
                horizontalLineTo(5.445f)
                lineTo(5.791f, 4f)
                horizontalLineToRelative(4.705f)
                verticalLineToRelative(1.103f)
                horizontalLineTo(6.875f)
                lineToRelative(-0.193f, 2.343f)
                horizontalLineToRelative(0.064f)
                curveToRelative(0.17f, -0.258f, 0.715f, -0.68f, 1.611f, -0.68f)
                curveToRelative(1.383f, 0f, 2.561f, 0.944f, 2.561f, 2.585f)
                curveToRelative(0f, 1.687f, -1.184f, 2.806f, -2.924f, 2.806f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(15f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
        }.build()
        
        return _5Square!!
    }

private var _5Square: ImageVector? = null

