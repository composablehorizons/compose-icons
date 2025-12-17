package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EnvelopeHeart: ImageVector
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
                moveTo(0.05f, 3.555f)
                arcTo(2f, 2f, 0f, false, true, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 1.95f, 1.555f)
                lineToRelative(-4.2f, 2.568f)
                lineToRelative(-0.051f, -0.105f)
                curveToRelative(-0.666f, -1.3f, -2.363f, -1.917f, -3.699f, -1.25f)
                curveToRelative(-1.336f, -0.667f, -3.033f, -0.05f, -3.699f, 1.25f)
                lineToRelative(-0.05f, 0.105f)
                close()
                moveTo(11.584f, 8.91f)
                lineToRelative(-0.073f, 0.139f)
                lineTo(16f, 11.8f)
                verticalLineTo(4.697f)
                lineToRelative(-4.003f, 2.447f)
                curveToRelative(0.027f, 0.562f, -0.107f, 1.163f, -0.413f, 1.767f)
                close()
                moveToRelative(-4.135f, 3.05f)
                curveToRelative(-1.048f, -0.693f, -1.84f, -1.39f, -2.398f, -2.082f)
                lineTo(0.19f, 12.856f)
                arcTo(2f, 2f, 0f, false, false, 2f, 14f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 1.808f, -1.144f)
                lineTo(10.95f, 9.878f)
                curveToRelative(-0.559f, 0.692f, -1.35f, 1.389f, -2.398f, 2.081f)
                lineTo(8f, 12.324f)
                lineToRelative(-0.551f, -0.365f)
                close()
                moveTo(4.416f, 8.91f)
                curveToRelative(-0.306f, -0.603f, -0.44f, -1.204f, -0.413f, -1.766f)
                lineTo(0f, 4.697f)
                verticalLineToRelative(7.104f)
                lineToRelative(4.49f, -2.752f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
            }
        }.build()
        
        return _EnvelopeHeart!!
    }

private var _EnvelopeHeart: ImageVector? = null

