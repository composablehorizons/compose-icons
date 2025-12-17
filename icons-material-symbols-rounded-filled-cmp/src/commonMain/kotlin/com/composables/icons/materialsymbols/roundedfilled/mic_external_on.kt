package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mic_external_on: ImageVector
    get() {
        if (_Mic_external_on != null) return _Mic_external_on!!
        
        _Mic_external_on = ImageVector.Builder(
            name = "mic_external_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 280f)
                quadToRelative(-15f, -17f, -23.5f, -37f)
                reflectiveQuadToRelative(-8.5f, -43f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 23f, -8.5f, 43f)
                reflectiveQuadTo(368f, 280f)
                horizontalLineTo(192f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                horizontalLineToRelative(-4f)
                quadToRelative(-16f, 0f, -27f, -10.5f)
                reflectiveQuadTo(196f, 684f)
                lineToRelative(-32f, -320f)
                quadToRelative(-2f, -18f, 10f, -31f)
                reflectiveQuadToRelative(30f, -13f)
                horizontalLineToRelative(152f)
                quadToRelative(18f, 0f, 30f, 13f)
                reflectiveQuadToRelative(10f, 31f)
                lineToRelative(-32f, 320f)
                quadToRelative(-2f, 15f, -13f, 25.5f)
                reflectiveQuadTo(324f, 720f)
                horizontalLineToRelative(-4f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 800f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(480f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(600f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 840f)
                verticalLineToRelative(-600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(560f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(400f, 880f)
                close()
            }
        }.build()
        
        return _Mic_external_on!!
    }

private var _Mic_external_on: ImageVector? = null

