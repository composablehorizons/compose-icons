package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EnvelopeArrowDown: ImageVector
    get() {
        if (_EnvelopeArrowDown != null) return _EnvelopeArrowDown!!
        
        _EnvelopeArrowDown = ImageVector.Builder(
            name = "envelope-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(5.383f)
                lineToRelative(-7f, 4.2f)
                lineToRelative(-1.326f, -0.795f)
                lineToRelative(-5.64f, 3.47f)
                arcTo(1f, 1f, 0f, false, false, 2f, 13f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -1.99f)
                close()
                moveToRelative(1f, 7.105f)
                lineToRelative(4.708f, -2.897f)
                lineTo(1f, 5.383f)
                close()
                moveTo(1f, 4f)
                verticalLineToRelative(0.217f)
                lineToRelative(7f, 4.2f)
                lineToRelative(7f, -4.2f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                moveToRelative(0.354f, -1.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.722f, -0.016f)
                lineToRelative(-1.149f, -1.25f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.737f, -0.676f)
                lineToRelative(0.28f, 0.305f)
                verticalLineTo(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(1.793f)
                lineToRelative(0.396f, -0.397f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _EnvelopeArrowDown!!
    }

private var _EnvelopeArrowDown: ImageVector? = null

