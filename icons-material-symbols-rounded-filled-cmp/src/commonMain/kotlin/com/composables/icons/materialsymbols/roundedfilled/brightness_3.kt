package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Brightness_3: ImageVector
    get() {
        if (_Brightness_3 != null) return _Brightness_3!!
        
        _Brightness_3 = ImageVector.Builder(
            name = "brightness_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(630f, 183f)
                quadToRelative(61f, 57f, 95.5f, 138f)
                reflectiveQuadTo(760f, 483f)
                quadToRelative(0f, 85f, -34.5f, 160f)
                reflectiveQuadTo(630f, 775f)
                quadToRelative(-52f, 48f, -117f, 76f)
                reflectiveQuadTo(377f, 879f)
                quadToRelative(-12f, 0f, -25f, -1f)
                reflectiveQuadToRelative(-25f, -4f)
                quadToRelative(-10f, -2f, -16f, -9f)
                reflectiveQuadToRelative(-6f, -17f)
                quadToRelative(0f, -8f, 4f, -13.5f)
                reflectiveQuadToRelative(11f, -9.5f)
                quadToRelative(93f, -53f, 146.5f, -144f)
                reflectiveQuadTo(520f, 483f)
                quadToRelative(0f, -104f, -53.5f, -200.5f)
                reflectiveQuadTo(320f, 133f)
                quadToRelative(-7f, -4f, -11f, -9.5f)
                reflectiveQuadToRelative(-4f, -13.5f)
                quadToRelative(0f, -10f, 6f, -16.5f)
                reflectiveQuadToRelative(16f, -8.5f)
                quadToRelative(12f, -3f, 25f, -4f)
                reflectiveQuadToRelative(25f, -1f)
                quadToRelative(71f, 0f, 136f, 27.5f)
                reflectiveQuadTo(630f, 183f)
                close()
            }
        }.build()
        
        return _Brightness_3!!
    }

private var _Brightness_3: ImageVector? = null

