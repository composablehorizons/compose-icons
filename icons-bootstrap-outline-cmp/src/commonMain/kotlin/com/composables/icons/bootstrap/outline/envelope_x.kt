package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EnvelopeX: ImageVector
    get() {
        if (_EnvelopeX != null) return _EnvelopeX!!
        
        _EnvelopeX = ImageVector.Builder(
            name = "envelope-x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8.01f)
                arcTo(2f, 2f, 0f, false, false, 2f, 14f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.966f, -0.741f)
                lineToRelative(5.64f, -3.471f)
                lineTo(8f, 9.583f)
                lineToRelative(7f, -4.2f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(3.708f, 6.208f)
                lineTo(1f, 11.105f)
                verticalLineTo(5.383f)
                close()
                moveTo(1f, 4.217f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.217f)
                lineToRelative(-7f, 4.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 7f, 0f)
                moveToRelative(-4.854f, -1.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineToRelative(0.647f, 0.646f)
                lineToRelative(-0.647f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineToRelative(0.646f, -0.647f)
                lineToRelative(0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineToRelative(-0.647f, -0.646f)
                lineToRelative(0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineToRelative(-0.646f, 0.647f)
                lineToRelative(-0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
            }
        }.build()
        
        return _EnvelopeX!!
    }

private var _EnvelopeX: ImageVector? = null

