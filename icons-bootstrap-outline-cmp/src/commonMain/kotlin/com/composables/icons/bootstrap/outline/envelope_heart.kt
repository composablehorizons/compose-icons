package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EnvelopeHeart: ImageVector
    get() {
        if (_EnvelopeHeart != null) return _EnvelopeHeart!!
        
        _EnvelopeHeart = ImageVector.Builder(
            name = "envelope-heart",
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
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(0.217f)
                lineToRelative(3.235f, 1.94f)
                arcToRelative(2.8f, 2.8f, 0f, false, false, -0.233f, 1.027f)
                lineTo(1f, 5.384f)
                verticalLineToRelative(5.721f)
                lineToRelative(3.453f, -2.124f)
                quadToRelative(0.219f, 0.416f, 0.55f, 0.835f)
                lineToRelative(-3.97f, 2.443f)
                arcTo(1f, 1f, 0f, false, false, 2f, 13f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 0.966f, -0.741f)
                lineToRelative(-3.968f, -2.442f)
                quadToRelative(0.33f, -0.421f, 0.55f, -0.836f)
                lineTo(15f, 11.105f)
                verticalLineTo(5.383f)
                lineToRelative(-3.002f, 1.801f)
                arcToRelative(2.8f, 2.8f, 0f, false, false, -0.233f, -1.026f)
                lineTo(15f, 4.217f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(6f, 2.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
            }
        }.build()
        
        return _EnvelopeHeart!!
    }

private var _EnvelopeHeart: ImageVector? = null

