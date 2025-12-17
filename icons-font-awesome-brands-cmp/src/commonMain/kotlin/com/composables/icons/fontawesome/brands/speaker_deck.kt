package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.SpeakerDeck: ImageVector
    get() {
        if (_SpeakerDeck != null) return _SpeakerDeck!!
        
        _SpeakerDeck = ImageVector.Builder(
            name = "speaker-deck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(213.86f, 296f)
                horizontalLineTo(100f)
                arcToRelative(100f, 100f, 0f, false, true, 0f, -200f)
                horizontalLineToRelative(132.84f)
                arcToRelative(40f, 40f, 0f, false, true, 0f, 80f)
                horizontalLineTo(98f)
                curveToRelative(-26.47f, 0f, -26.45f, 40f, 0f, 40f)
                horizontalLineToRelative(113.82f)
                arcToRelative(100f, 100f, 0f, false, true, 0f, 200f)
                horizontalLineTo(40f)
                arcToRelative(40f, 40f, 0f, false, true, 0f, -80f)
                horizontalLineToRelative(173.86f)
                curveToRelative(26.48f, 0f, 26.46f, -40f, 0f, -40f)
                close()
                moveTo(298f, 416f)
                arcToRelative(120.21f, 120.21f, 0f, false, false, 51.11f, -80f)
                horizontalLineToRelative(64.55f)
                arcToRelative(19.83f, 19.83f, 0f, false, false, 19.66f, -20f)
                verticalLineTo(196f)
                arcToRelative(19.83f, 19.83f, 0f, false, false, -19.66f, -20f)
                horizontalLineTo(296.42f)
                arcToRelative(60.77f, 60.77f, 0f, false, false, 0f, -80f)
                horizontalLineToRelative(136.93f)
                curveToRelative(43.44f, 0f, 78.65f, 35.82f, 78.65f, 80f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 44.18f, -35.21f, 80f, -78.65f, 80f)
                close()
            }
        }.build()
        
        return _SpeakerDeck!!
    }

private var _SpeakerDeck: ImageVector? = null

