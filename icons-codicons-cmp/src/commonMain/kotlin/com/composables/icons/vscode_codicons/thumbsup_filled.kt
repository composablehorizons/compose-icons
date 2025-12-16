package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ThumbsupFilled: ImageVector
    get() {
        if (_ThumbsupFilled != null) return _ThumbsupFilled!!
        
        _ThumbsupFilled = ImageVector.Builder(
            name = "thumbsup-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8.5f)
                verticalLineTo(13.5f)
                curveTo(1f, 14.327f, 1.673f, 15f, 2.5f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2.5f)
                curveTo(1.673f, 7f, 1f, 7.673f, 1f, 8.5f)
                close()
                moveTo(14.571f, 6.815f)
                curveTo(14.19f, 6.297f, 13.602f, 6f, 12.959f, 6f)
                horizontalLineTo(9.526f)
                lineTo(9.99f, 3.68f)
                curveTo(10.122f, 3.019f, 9.953f, 2.342f, 9.526f, 1.82f)
                curveTo(9.099f, 1.299f, 8.467f, 1f, 7.794f, 1f)
                curveTo(7.35f, 1f, 6.955f, 1.298f, 6.843f, 1.693f)
                lineTo(6.379f, 2.979f)
                curveTo(6.016f, 3.984f, 5.551f, 4.944f, 5.001f, 5.855f)
                verticalLineTo(15f)
                horizontalLineTo(11.398f)
                curveTo(12.278f, 15f, 13.045f, 14.436f, 13.307f, 13.596f)
                lineTo(14.869f, 8.596f)
                curveTo(15.061f, 7.982f, 14.951f, 7.333f, 14.571f, 6.815f)
                close()
            }
        }.build()
        
        return _ThumbsupFilled!!
    }

private var _ThumbsupFilled: ImageVector? = null

