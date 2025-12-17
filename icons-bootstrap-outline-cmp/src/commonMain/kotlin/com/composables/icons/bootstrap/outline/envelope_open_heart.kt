package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EnvelopeOpenHeart: ImageVector
    get() {
        if (_EnvelopeOpenHeart != null) return _EnvelopeOpenHeart!!
        
        _EnvelopeOpenHeart = ImageVector.Builder(
            name = "envelope-open-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.47f, 1.318f)
                arcToRelative(1f, 1f, 0f, false, false, -0.94f, 0f)
                lineToRelative(-6f, 3.2f)
                arcTo(1f, 1f, 0f, false, false, 1f, 5.4f)
                verticalLineToRelative(0.817f)
                lineToRelative(3.235f, 1.94f)
                arcToRelative(2.8f, 2.8f, 0f, false, false, -0.233f, 1.027f)
                lineTo(1f, 7.384f)
                verticalLineToRelative(5.733f)
                lineToRelative(3.479f, -2.087f)
                quadToRelative(0.224f, 0.414f, 0.558f, 0.83f)
                lineToRelative(-4.002f, 2.402f)
                arcTo(1f, 1f, 0f, false, false, 2f, 15f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 0.965f, -0.738f)
                lineToRelative(-4.002f, -2.401f)
                quadToRelative(0.334f, -0.418f, 0.558f, -0.831f)
                lineTo(15f, 13.117f)
                verticalLineTo(7.383f)
                lineToRelative(-3.002f, 1.801f)
                arcToRelative(2.8f, 2.8f, 0f, false, false, -0.233f, -1.026f)
                lineTo(15f, 6.217f)
                verticalLineTo(5.4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.53f, -0.882f)
                close()
                moveTo(7.06f, 0.435f)
                arcToRelative(2f, 2f, 0f, false, true, 1.882f, 0f)
                lineToRelative(6f, 3.2f)
                arcTo(2f, 2f, 0f, false, true, 16f, 5.4f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5.4f)
                arcToRelative(2f, 2f, 0f, false, true, 1.059f, -1.765f)
                close()
                moveTo(8f, 7.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
            }
        }.build()
        
        return _EnvelopeOpenHeart!!
    }

private var _EnvelopeOpenHeart: ImageVector? = null

