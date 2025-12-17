package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Screwdriver: ImageVector
    get() {
        if (_Screwdriver != null) return _Screwdriver!!
        
        _Screwdriver = ImageVector.Builder(
            name = "screwdriver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0.995f)
                lineTo(0.995f, 0f)
                lineToRelative(3.064f, 2.19f)
                arcToRelative(1f, 1f, 0f, false, true, 0.417f, 0.809f)
                verticalLineToRelative(0.07f)
                curveToRelative(0f, 0.264f, 0.105f, 0.517f, 0.291f, 0.704f)
                lineToRelative(5.677f, 5.676f)
                lineToRelative(0.909f, -0.303f)
                arcToRelative(1f, 1f, 0f, false, true, 1.018f, 0.24f)
                lineToRelative(3.338f, 3.339f)
                arcToRelative(0.995f, 0.995f, 0f, false, true, 0f, 1.406f)
                lineTo(14.13f, 15.71f)
                arcToRelative(0.995f, 0.995f, 0f, false, true, -1.406f, 0f)
                lineToRelative(-3.337f, -3.34f)
                arcToRelative(1f, 1f, 0f, false, true, -0.24f, -1.018f)
                lineToRelative(0.302f, -0.909f)
                lineToRelative(-5.676f, -5.677f)
                arcToRelative(1f, 1f, 0f, false, false, -0.704f, -0.291f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.81f, -0.417f)
                close()
                moveToRelative(11.293f, 9.595f)
                arcToRelative(0.497f, 0.497f, 0f, true, false, -0.703f, 0.703f)
                lineToRelative(2.984f, 2.984f)
                arcToRelative(0.497f, 0.497f, 0f, false, false, 0.703f, -0.703f)
                close()
            }
        }.build()
        
        return _Screwdriver!!
    }

private var _Screwdriver: ImageVector? = null

