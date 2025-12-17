package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Heat: ImageVector
    get() {
        if (_Heat != null) return _Heat!!
        
        _Heat = ImageVector.Builder(
            name = "heat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(476f, 639f)
                quadToRelative(0f, 38f, 19.5f, 75.5f)
                reflectiveQuadTo(561f, 804f)
                lineToRelative(-57f, 52f)
                quadToRelative(-58f, -61f, -83.5f, -111f)
                reflectiveQuadTo(395f, 641f)
                quadToRelative(0f, -38f, 11.5f, -80f)
                reflectiveQuadTo(444f, 456f)
                quadToRelative(24f, -59f, 32.5f, -88.5f)
                reflectiveQuadTo(485f, 313f)
                quadToRelative(0f, -37f, -20.5f, -71f)
                reflectiveQuadTo(394f, 163f)
                lineToRelative(55f, -58f)
                quadToRelative(63f, 57f, 89.5f, 105f)
                reflectiveQuadTo(565f, 312f)
                quadToRelative(0f, 35f, -10f, 73.5f)
                reflectiveQuadTo(519f, 486f)
                quadToRelative(-25f, 60f, -34f, 92f)
                reflectiveQuadToRelative(-9f, 61f)
                close()
                moveToRelative(196f, 0f)
                quadToRelative(0f, 38f, 19f, 75.5f)
                reflectiveQuadToRelative(65f, 89.5f)
                lineToRelative(-57f, 51f)
                quadToRelative(-58f, -61f, -83f, -110.5f)
                reflectiveQuadTo(591f, 641f)
                quadToRelative(0f, -38f, 11.5f, -80f)
                reflectiveQuadTo(640f, 456f)
                quadToRelative(24f, -59f, 32.5f, -88.5f)
                reflectiveQuadTo(681f, 313f)
                quadToRelative(0f, -37f, -21f, -71f)
                reflectiveQuadToRelative(-71f, -79f)
                lineToRelative(55f, -58f)
                quadToRelative(63f, 57f, 90f, 105f)
                reflectiveQuadToRelative(27f, 102f)
                quadToRelative(0f, 35f, -10f, 73.5f)
                reflectiveQuadTo(715f, 486f)
                quadToRelative(-25f, 60f, -34f, 92f)
                reflectiveQuadToRelative(-9f, 61f)
                close()
                moveToRelative(-391f, 0f)
                quadToRelative(0f, 38f, 19.5f, 75.5f)
                reflectiveQuadTo(366f, 804f)
                lineToRelative(-57f, 52f)
                quadToRelative(-58f, -61f, -83.5f, -111f)
                reflectiveQuadTo(200f, 641f)
                quadToRelative(0f, -38f, 11.5f, -80f)
                reflectiveQuadTo(249f, 456f)
                quadToRelative(24f, -59f, 32.5f, -88.5f)
                reflectiveQuadTo(290f, 313f)
                quadToRelative(0f, -37f, -20.5f, -71f)
                reflectiveQuadTo(199f, 163f)
                lineToRelative(54f, -58f)
                quadToRelative(63f, 57f, 90f, 105f)
                reflectiveQuadToRelative(27f, 102f)
                quadToRelative(0f, 35f, -10f, 73.5f)
                reflectiveQuadTo(324f, 486f)
                quadToRelative(-25f, 60f, -34f, 92f)
                reflectiveQuadToRelative(-9f, 61f)
                close()
            }
        }.build()
        
        return _Heat!!
    }

private var _Heat: ImageVector? = null

