package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sound_detection_glass_break: ImageVector
    get() {
        if (_Sound_detection_glass_break != null) return _Sound_detection_glass_break!!
        
        _Sound_detection_glass_break = ImageVector.Builder(
            name = "sound_detection_glass_break",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(2f)
                lineTo(540f, 539f)
                lineTo(437f, 436f)
                quadToRelative(-12f, -12f, -27f, -18f)
                reflectiveQuadToRelative(-30f, -6f)
                quadToRelative(-16f, 0f, -30.5f, 6f)
                reflectiveQuadTo(323f, 436f)
                lineTo(120f, 640f)
                close()
                moveToRelative(80f, 200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                lineToRelative(260f, -261f)
                lineToRelative(100f, 100f)
                quadToRelative(12f, 12f, 27f, 17.5f)
                reflectiveQuadToRelative(30f, 5.5f)
                quadToRelative(17f, 0f, 32f, -6f)
                reflectiveQuadToRelative(27f, -20f)
                lineToRelative(244f, -274f)
                verticalLineToRelative(438f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Sound_detection_glass_break!!
    }

private var _Sound_detection_glass_break: ImageVector? = null

