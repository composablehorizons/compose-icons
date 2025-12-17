package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EnvelopeArrowUp: ImageVector
    get() {
        if (_EnvelopeArrowUp != null) return _EnvelopeArrowUp!!
        
        _EnvelopeArrowUp = ImageVector.Builder(
            name = "envelope-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.05f, 3.555f)
                arcTo(2f, 2f, 0f, false, true, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 1.95f, 1.555f)
                lineTo(8f, 8.414f)
                close()
                moveTo(0f, 4.697f)
                verticalLineToRelative(7.104f)
                lineToRelative(5.803f, -3.558f)
                close()
                moveToRelative(0.192f, 8.159f)
                lineToRelative(6.57f, -4.027f)
                lineTo(8f, 9.586f)
                lineToRelative(1.239f, -0.757f)
                lineToRelative(0.367f, 0.225f)
                arcTo(4.49f, 4.49f, 0f, false, false, 8f, 12.5f)
                curveToRelative(0f, 0.526f, 0.09f, 1.03f, 0.256f, 1.5f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.808f, -1.144f)
                moveTo(16f, 4.697f)
                verticalLineToRelative(4.974f)
                arcTo(4.5f, 4.5f, 0f, false, false, 12.5f, 8f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -1.965f, 0.45f)
                lineToRelative(-0.338f, -0.207f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                moveToRelative(0.354f, -5.354f)
                lineToRelative(1.25f, 1.25f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(13f, 12.207f)
                verticalLineTo(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-1.717f)
                lineToRelative(-0.28f, 0.305f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.737f, -0.676f)
                lineToRelative(1.149f, -1.25f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.722f, -0.016f)
            }
        }.build()
        
        return _EnvelopeArrowUp!!
    }

private var _EnvelopeArrowUp: ImageVector? = null

