package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Adaptive_audio_mic: ImageVector
    get() {
        if (_Adaptive_audio_mic != null) return _Adaptive_audio_mic!!
        
        _Adaptive_audio_mic = ImageVector.Builder(
            name = "adaptive_audio_mic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(450f, 880f)
                verticalLineToRelative(-82f)
                quadToRelative(-72f, -11f, -121f, -67f)
                reflectiveQuadToRelative(-49f, -131f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, 75f, -49f, 131f)
                reflectiveQuadToRelative(-121f, 67f)
                verticalLineToRelative(82f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(30f, -200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 600f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveTo(40f, 560f)
                verticalLineToRelative(-63f)
                quadToRelative(0f, -35f, 14.5f, -62.5f)
                reflectiveQuadTo(95f, 393f)
                quadToRelative(40f, -21f, 86f, -32f)
                reflectiveQuadToRelative(99f, -11f)
                quadToRelative(26f, 0f, 50.5f, 3f)
                reflectiveQuadToRelative(47.5f, 8f)
                quadToRelative(-62f, 26f, -103.5f, 79f)
                reflectiveQuadTo(223f, 560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(697f, 0f)
                quadToRelative(-10f, -67f, -51.5f, -119.5f)
                reflectiveQuadTo(582f, 361f)
                quadToRelative(23f, -5f, 47.5f, -8f)
                reflectiveQuadToRelative(50.5f, -3f)
                quadToRelative(53f, 0f, 99f, 11f)
                reflectiveQuadToRelative(86f, 32f)
                quadToRelative(26f, 14f, 40.5f, 41.5f)
                reflectiveQuadTo(920f, 497f)
                verticalLineToRelative(63f)
                horizontalLineTo(737f)
                close()
                moveTo(280f, 320f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Adaptive_audio_mic!!
    }

private var _Adaptive_audio_mic: ImageVector? = null

