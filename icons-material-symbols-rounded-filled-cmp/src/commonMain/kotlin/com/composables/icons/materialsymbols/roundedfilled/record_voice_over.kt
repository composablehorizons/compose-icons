package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Record_voice_over: ImageVector
    get() {
        if (_Record_voice_over != null) return _Record_voice_over!!
        
        _Record_voice_over = ImageVector.Builder(
            name = "record_voice_over",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(920f, 360f)
                quadToRelative(0f, 69f, -24.5f, 131.5f)
                reflectiveQuadTo(829f, 605f)
                quadToRelative(-12f, 14f, -30f, 15f)
                reflectiveQuadToRelative(-32f, -13f)
                quadToRelative(-13f, -13f, -12f, -31f)
                reflectiveQuadToRelative(12f, -33f)
                quadToRelative(30f, -38f, 46.5f, -85f)
                reflectiveQuadToRelative(16.5f, -98f)
                quadToRelative(0f, -51f, -16.5f, -97f)
                reflectiveQuadTo(767f, 179f)
                quadToRelative(-12f, -15f, -12.5f, -33f)
                reflectiveQuadToRelative(12.5f, -32f)
                quadToRelative(13f, -14f, 31.5f, -13.5f)
                reflectiveQuadTo(829f, 115f)
                quadToRelative(42f, 51f, 66.5f, 113.5f)
                reflectiveQuadTo(920f, 360f)
                close()
                moveToRelative(-182f, 0f)
                quadToRelative(0f, 32f, -10f, 61.5f)
                reflectiveQuadTo(700f, 476f)
                quadToRelative(-11f, 15f, -29.5f, 15.5f)
                reflectiveQuadTo(638f, 478f)
                quadToRelative(-13f, -13f, -13.5f, -31.5f)
                reflectiveQuadTo(633f, 411f)
                quadToRelative(6f, -11f, 9.5f, -24f)
                reflectiveQuadToRelative(3.5f, -27f)
                quadToRelative(0f, -14f, -3.5f, -27f)
                reflectiveQuadToRelative(-9.5f, -25f)
                quadToRelative(-9f, -17f, -8.5f, -35f)
                reflectiveQuadToRelative(13.5f, -31f)
                quadToRelative(14f, -14f, 32.5f, -13.5f)
                reflectiveQuadTo(700f, 244f)
                quadToRelative(18f, 25f, 28f, 54.5f)
                reflectiveQuadToRelative(10f, 61.5f)
                close()
                moveTo(360f, 520f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(40f, 760f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                quadToRelative(77f, 0f, 141f, 18f)
                reflectiveQuadToRelative(115f, 44f)
                quadToRelative(30f, 15f, 47f, 44f)
                reflectiveQuadToRelative(17f, 62f)
                verticalLineToRelative(32f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                close()
            }
        }.build()
        
        return _Record_voice_over!!
    }

private var _Record_voice_over: ImageVector? = null

