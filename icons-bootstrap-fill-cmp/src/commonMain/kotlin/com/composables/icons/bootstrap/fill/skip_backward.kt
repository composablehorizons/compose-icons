package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SkipBackward: ImageVector
    get() {
        if (_SkipBackward != null) return _SkipBackward!!
        
        _SkipBackward = ImageVector.Builder(
            name = "skip-backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 0f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(8.753f)
                lineToRelative(6.267f, 3.636f)
                curveToRelative(0.54f, 0.313f, 1.233f, -0.066f, 1.233f, -0.697f)
                verticalLineToRelative(-2.94f)
                lineToRelative(6.267f, 3.636f)
                curveToRelative(0.54f, 0.314f, 1.233f, -0.065f, 1.233f, -0.696f)
                verticalLineTo(4.308f)
                curveToRelative(0f, -0.63f, -0.693f, -1.01f, -1.233f, -0.696f)
                lineTo(8.5f, 7.248f)
                verticalLineToRelative(-2.94f)
                curveToRelative(0f, -0.63f, -0.692f, -1.01f, -1.233f, -0.696f)
                lineTo(1f, 7.248f)
                verticalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
            }
        }.build()
        
        return _SkipBackward!!
    }

private var _SkipBackward: ImageVector? = null

