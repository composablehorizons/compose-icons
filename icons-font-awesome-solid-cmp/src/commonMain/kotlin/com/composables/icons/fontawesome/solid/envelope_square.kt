package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.EnvelopeSquare: ImageVector
    get() {
        if (_EnvelopeSquare != null) return _EnvelopeSquare!!
        
        _EnvelopeSquare = ImageVector.Builder(
            name = "envelope-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.49f, 32f, 0f, 53.49f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveTo(178.117f, 262.104f)
                curveTo(87.429f, 196.287f, 88.353f, 196.121f, 64f, 177.167f)
                verticalLineTo(152f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(272f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(25.167f)
                curveToRelative(-24.371f, 18.969f, -23.434f, 19.124f, -114.117f, 84.938f)
                curveToRelative(-10.5f, 7.655f, -31.392f, 26.12f, -45.883f, 25.894f)
                curveToRelative(-14.503f, 0.218f, -35.367f, -18.227f, -45.883f, -25.895f)
                close()
                moveTo(384f, 217.775f)
                verticalLineTo(360f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(88f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineTo(217.775f)
                curveToRelative(13.958f, 10.794f, 33.329f, 25.236f, 95.303f, 70.214f)
                curveToRelative(14.162f, 10.341f, 37.975f, 32.145f, 64.694f, 32.01f)
                curveToRelative(26.887f, 0.134f, 51.037f, -22.041f, 64.72f, -32.025f)
                curveToRelative(61.958f, -44.965f, 81.325f, -59.406f, 95.283f, -70.199f)
                close()
            }
        }.build()
        
        return _EnvelopeSquare!!
    }

private var _EnvelopeSquare: ImageVector? = null

