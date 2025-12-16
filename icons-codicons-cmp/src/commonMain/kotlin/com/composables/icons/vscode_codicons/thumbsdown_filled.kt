package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ThumbsdownFilled: ImageVector
    get() {
        if (_ThumbsdownFilled != null) return _ThumbsdownFilled!!
        
        _ThumbsdownFilled = ImageVector.Builder(
            name = "thumbsdown-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 7.5f)
                verticalLineTo(2.5f)
                curveTo(15f, 1.673f, 14.327f, 1f, 13.5f, 1f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(13.5f)
                curveTo(14.327f, 9f, 15f, 8.327f, 15f, 7.5f)
                close()
                moveTo(1.429f, 9.185f)
                curveTo(1.81f, 9.703f, 2.398f, 10f, 3.041f, 10f)
                horizontalLineTo(6.474f)
                lineTo(6.01f, 12.32f)
                curveTo(5.878f, 12.981f, 6.047f, 13.658f, 6.474f, 14.18f)
                curveTo(6.901f, 14.701f, 7.533f, 15f, 8.206f, 15f)
                curveTo(8.65f, 15f, 9.045f, 14.702f, 9.157f, 14.307f)
                lineTo(9.621f, 13.021f)
                curveTo(9.984f, 12.016f, 10.449f, 11.056f, 10.999f, 10.145f)
                verticalLineTo(1f)
                horizontalLineTo(4.602f)
                curveTo(3.722f, 1f, 2.955f, 1.564f, 2.693f, 2.404f)
                lineTo(1.131f, 7.404f)
                curveTo(0.938998f, 8.018f, 1.048f, 8.667f, 1.428f, 9.185f)
                horizontalLineTo(1.429f)
                close()
            }
        }.build()
        
        return _ThumbsdownFilled!!
    }

private var _ThumbsdownFilled: ImageVector? = null

