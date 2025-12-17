package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ear_sound: ImageVector
    get() {
        if (_Ear_sound != null) return _Ear_sound!!
        
        _Ear_sound = ImageVector.Builder(
            name = "ear_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(62f, 0f, 101.5f, -31f)
                reflectiveQuadToRelative(60.5f, -91f)
                quadToRelative(17f, -50f, 32.5f, -70f)
                reflectiveQuadToRelative(71.5f, -64f)
                quadToRelative(62f, -50f, 98f, -113f)
                reflectiveQuadToRelative(36f, -151f)
                quadToRelative(0f, -119f, -80.5f, -199.5f)
                reflectiveQuadTo(360f, 80f)
                quadToRelative(-119f, 0f, -199.5f, 80.5f)
                reflectiveQuadTo(80f, 360f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -85f, 57.5f, -142.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(85f, 0f, 142.5f, 57.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, 68f, -27f, 116f)
                reflectiveQuadToRelative(-77f, 86f)
                quadToRelative(-52f, 38f, -81f, 74f)
                reflectiveQuadToRelative(-43f, 78f)
                quadToRelative(-14f, 44f, -33.5f, 65f)
                reflectiveQuadTo(240f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                horizontalLineTo(80f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(120f, -420f)
                quadToRelative(42f, 0f, 71f, -29.5f)
                reflectiveQuadToRelative(29f, -70.5f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 41f, 29f, 70.5f)
                reflectiveQuadToRelative(71f, 29.5f)
                close()
                moveToRelative(380f, 121f)
                lineToRelative(-59f, -59f)
                quadToRelative(19f, -37f, 29f, -77.5f)
                reflectiveQuadToRelative(10f, -84.5f)
                quadToRelative(0f, -44f, -10f, -84f)
                reflectiveQuadToRelative(-29f, -77f)
                lineToRelative(59f, -59f)
                quadToRelative(29f, 49f, 44.5f, 104.5f)
                reflectiveQuadTo(800f, 360f)
                quadToRelative(0f, 61f, -15.5f, 116.5f)
                reflectiveQuadTo(740f, 581f)
                close()
                moveToRelative(117f, 116f)
                lineToRelative(-59f, -58f)
                quadToRelative(39f, -60f, 60.5f, -130f)
                reflectiveQuadTo(880f, 362f)
                quadToRelative(0f, -78f, -21.5f, -148.5f)
                reflectiveQuadTo(797f, 83f)
                lineToRelative(60f, -60f)
                quadToRelative(49f, 72f, 76f, 157.5f)
                reflectiveQuadTo(960f, 360f)
                quadToRelative(0f, 94f, -27f, 179.5f)
                reflectiveQuadTo(857f, 697f)
                close()
            }
        }.build()
        
        return _Ear_sound!!
    }

private var _Ear_sound: ImageVector? = null

