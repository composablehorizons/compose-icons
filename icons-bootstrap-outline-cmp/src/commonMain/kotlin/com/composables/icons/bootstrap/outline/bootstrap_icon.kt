package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bootstrap: ImageVector
    get() {
        if (_Bootstrap != null) return _Bootstrap!!
        
        _Bootstrap = ImageVector.Builder(
            name = "bootstrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.062f, 12f)
                horizontalLineToRelative(3.475f)
                curveToRelative(1.804f, 0f, 2.888f, -0.908f, 2.888f, -2.396f)
                curveToRelative(0f, -1.102f, -0.761f, -1.916f, -1.904f, -2.034f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.832f, -0.14f, 1.482f, -0.93f, 1.482f, -1.816f)
                curveToRelative(0f, -1.3f, -0.955f, -2.11f, -2.542f, -2.11f)
                horizontalLineTo(5.062f)
                close()
                moveToRelative(1.313f, -4.875f)
                verticalLineTo(4.658f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.973f, 0f, 1.542f, 0.457f, 1.542f, 1.237f)
                curveToRelative(0f, 0.802f, -0.604f, 1.23f, -1.764f, 1.23f)
                close()
                moveToRelative(0f, 3.762f)
                verticalLineTo(8.162f)
                horizontalLineToRelative(1.822f)
                curveToRelative(1.236f, 0f, 1.887f, 0.463f, 1.887f, 1.348f)
                curveToRelative(0f, 0.896f, -0.627f, 1.377f, -1.811f, 1.377f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineTo(4f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                close()
                moveToRelative(4f, -3f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(4f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
            }
        }.build()
        
        return _Bootstrap!!
    }

private var _Bootstrap: ImageVector? = null

