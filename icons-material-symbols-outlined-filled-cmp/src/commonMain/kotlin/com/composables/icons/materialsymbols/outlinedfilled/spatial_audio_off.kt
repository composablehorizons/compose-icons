package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Spatial_audio_off: ImageVector
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
                moveTo(750f, 550f)
                lineToRelative(56f, -56f)
                quadToRelative(-40f, -40f, -62.5f, -91.5f)
                reflectiveQuadTo(721f, 294f)
                quadToRelative(0f, -57f, 22.5f, -108f)
                reflectiveQuadToRelative(62.5f, -91f)
                lineToRelative(-56f, -58f)
                quadToRelative(-51f, 51f, -80f, 118f)
                reflectiveQuadToRelative(-29f, 139f)
                quadToRelative(0f, 72f, 29f, 138.5f)
                reflectiveQuadTo(750f, 550f)
                close()
                moveToRelative(112f, -114f)
                lineToRelative(56f, -56f)
                quadToRelative(-17f, -17f, -27f, -39f)
                reflectiveQuadToRelative(-10f, -47f)
                quadToRelative(0f, -25f, 10f, -47f)
                reflectiveQuadToRelative(27f, -39f)
                lineToRelative(-56f, -57f)
                quadToRelative(-29f, 29f, -45f, 65f)
                reflectiveQuadToRelative(-16f, 77f)
                quadToRelative(0f, 41f, 16f, 78f)
                reflectiveQuadToRelative(45f, 65f)
                close()
                moveToRelative(-462f, 84f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                quadToRelative(77f, 0f, 141f, 18f)
                reflectiveQuadToRelative(115f, 44f)
                quadToRelative(30f, 15f, 47f, 44f)
                reflectiveQuadToRelative(17f, 62f)
                verticalLineToRelative(112f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Spatial_audio_off!!
    }

private var _Spatial_audio_off: ImageVector? = null

