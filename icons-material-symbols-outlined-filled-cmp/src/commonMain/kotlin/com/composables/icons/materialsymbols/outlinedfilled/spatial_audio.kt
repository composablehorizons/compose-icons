package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Spatial_audio: ImageVector
    get() {
        if (_Spatial_audio != null) return _Spatial_audio!!
        
        _Spatial_audio = ImageVector.Builder(
            name = "spatial_audio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(920f, 401f)
                quadToRelative(-72f, 0f, -138f, -27.5f)
                reflectiveQuadTo(665f, 295f)
                quadToRelative(-51f, -51f, -78.5f, -117f)
                reflectiveQuadTo(559f, 40f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 57f, 21f, 108f)
                reflectiveQuadToRelative(61f, 91f)
                quadToRelative(40f, 40f, 91f, 61.5f)
                reflectiveQuadTo(920f, 322f)
                verticalLineToRelative(79f)
                close()
                moveToRelative(0f, -159f)
                quadToRelative(-41f, 0f, -77.5f, -15f)
                reflectiveQuadTo(777f, 183f)
                quadToRelative(-29f, -29f, -44f, -65.5f)
                reflectiveQuadTo(718f, 40f)
                horizontalLineToRelative(79f)
                quadToRelative(0f, 25f, 9.5f, 47.5f)
                reflectiveQuadTo(833f, 127f)
                quadToRelative(17f, 17f, 39.5f, 26f)
                reflectiveQuadToRelative(47.5f, 9f)
                verticalLineToRelative(80f)
                close()
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
        
        return _Spatial_audio!!
    }

private var _Spatial_audio: ImageVector? = null

