package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SkipForward: ImageVector
    get() {
        if (_SkipForward != null) return _SkipForward!!
        
        _SkipForward = ImageVector.Builder(
            name = "skip-forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(8.753f)
                lineToRelative(-6.267f, 3.636f)
                curveToRelative(-0.54f, 0.313f, -1.233f, -0.066f, -1.233f, -0.697f)
                verticalLineToRelative(-2.94f)
                lineToRelative(-6.267f, 3.636f)
                curveTo(0.693f, 12.703f, 0f, 12.324f, 0f, 11.693f)
                verticalLineTo(4.308f)
                curveToRelative(0f, -0.63f, 0.693f, -1.01f, 1.233f, -0.696f)
                lineTo(7.5f, 7.248f)
                verticalLineToRelative(-2.94f)
                curveToRelative(0f, -0.63f, 0.693f, -1.01f, 1.233f, -0.696f)
                lineTo(15f, 7.248f)
                verticalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _SkipForward!!
    }

private var _SkipForward: ImageVector? = null

