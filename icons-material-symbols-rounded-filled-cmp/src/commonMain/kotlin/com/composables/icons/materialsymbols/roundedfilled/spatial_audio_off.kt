package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Spatial_audio_off: ImageVector
    get() {
        if (_Spatial_audio_off != null) return _Spatial_audio_off!!
        
        _Spatial_audio_off = ImageVector.Builder(
            name = "spatial_audio_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 520f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(80f, 760f)
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
                reflectiveQuadTo(640f, 840f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                close()
                moveToRelative(810f, -312f)
                quadToRelative(-8f, 0f, -15.5f, -3.5f)
                reflectiveQuadTo(862f, 436f)
                quadToRelative(-29f, -28f, -45f, -65f)
                reflectiveQuadToRelative(-16f, -78f)
                quadToRelative(0f, -41f, 16f, -77f)
                reflectiveQuadToRelative(45f, -65f)
                quadToRelative(5f, -5f, 12.5f, -8f)
                reflectiveQuadToRelative(15.5f, -3f)
                quadToRelative(17f, 0f, 28.5f, 11f)
                reflectiveQuadToRelative(11.5f, 28f)
                quadToRelative(0f, 8f, -3.5f, 16f)
                reflectiveQuadToRelative(-8.5f, 13f)
                quadToRelative(-17f, 17f, -27f, 39f)
                reflectiveQuadToRelative(-10f, 47f)
                quadToRelative(0f, 25f, 10f, 47f)
                reflectiveQuadToRelative(27f, 39f)
                quadToRelative(5f, 5f, 8.5f, 12.5f)
                reflectiveQuadTo(930f, 408f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(890f, 448f)
                close()
                moveTo(778f, 562f)
                quadToRelative(-8f, 0f, -15.5f, -3.5f)
                reflectiveQuadTo(750f, 550f)
                quadToRelative(-51f, -51f, -80f, -117.5f)
                reflectiveQuadTo(641f, 294f)
                quadToRelative(0f, -72f, 29f, -139f)
                reflectiveQuadToRelative(80f, -118f)
                quadToRelative(5f, -5f, 12.5f, -8f)
                reflectiveQuadToRelative(15.5f, -3f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(818f, 66f)
                quadToRelative(0f, 8f, -3f, 16f)
                reflectiveQuadToRelative(-9f, 13f)
                quadToRelative(-40f, 40f, -62.5f, 91f)
                reflectiveQuadTo(721f, 294f)
                quadToRelative(0f, 57f, 22.5f, 108.5f)
                reflectiveQuadTo(806f, 494f)
                quadToRelative(5f, 5f, 8.5f, 12.5f)
                reflectiveQuadTo(818f, 522f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(778f, 562f)
                close()
            }
        }.build()
        
        return _Spatial_audio_off!!
    }

private var _Spatial_audio_off: ImageVector? = null

