package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EnvelopeOpenHeart: ImageVector
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
                moveTo(8.941f, 0.435f)
                arcToRelative(2f, 2f, 0f, false, false, -1.882f, 0f)
                lineToRelative(-6f, 3.2f)
                arcTo(2f, 2f, 0f, false, false, 0f, 5.4f)
                verticalLineToRelative(0.313f)
                lineToRelative(4.222f, 2.475f)
                quadToRelative(0.035f, -0.087f, 0.08f, -0.17f)
                curveToRelative(0.665f, -1.3f, 2.362f, -1.917f, 3.698f, -1.25f)
                curveToRelative(1.336f, -0.667f, 3.033f, -0.05f, 3.699f, 1.25f)
                arcToRelative(3f, 3f, 0f, false, true, 0.08f, 0.17f)
                lineTo(16f, 5.713f)
                verticalLineTo(5.4f)
                arcToRelative(2f, 2f, 0f, false, false, -1.059f, -1.765f)
                close()
                moveTo(0f, 6.873f)
                lineToRelative(4f, 2.344f)
                curveToRelative(-0.012f, 0.542f, 0.124f, 1.117f, 0.416f, 1.694f)
                lineToRelative(0.004f, 0.006f)
                lineTo(0f, 13.372f)
                verticalLineToRelative(-6.5f)
                close()
                moveToRelative(0.059f, 7.611f)
                lineToRelative(4.9f, -2.723f)
                curveToRelative(0.563f, 0.73f, 1.383f, 1.467f, 2.49f, 2.198f)
                lineToRelative(0.551f, 0.365f)
                lineToRelative(0.551f, -0.365f)
                curveToRelative(1.107f, -0.73f, 1.927f, -1.467f, 2.49f, -2.198f)
                lineToRelative(4.9f, 2.723f)
                arcTo(2f, 2f, 0f, false, true, 14f, 16f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.941f, -1.516f)
                moveTo(16f, 13.372f)
                lineToRelative(-4.42f, -2.455f)
                lineToRelative(0.004f, -0.006f)
                curveToRelative(0.292f, -0.577f, 0.428f, -1.152f, 0.415f, -1.694f)
                lineTo(16f, 6.873f)
                verticalLineToRelative(6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 7.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
            }
        }.build()
        
        return _EnvelopeOpenHeart!!
    }

private var _EnvelopeOpenHeart: ImageVector? = null

