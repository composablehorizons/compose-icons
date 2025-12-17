package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ear_sound: ImageVector
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
                moveTo(360f, 460f)
                quadToRelative(42f, 0f, 71f, -29.5f)
                reflectiveQuadToRelative(29f, -70.5f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 41f, 29f, 70.5f)
                reflectiveQuadToRelative(71f, 29.5f)
                close()
                moveToRelative(352f, 93f)
                quadToRelative(-15f, -6f, -21.5f, -20.5f)
                reflectiveQuadTo(690f, 504f)
                quadToRelative(15f, -34f, 22.5f, -70.5f)
                reflectiveQuadTo(720f, 360f)
                quadToRelative(0f, -37f, -7.5f, -73f)
                reflectiveQuadTo(690f, 217f)
                quadToRelative(-6f, -14f, 1f, -27.5f)
                reflectiveQuadToRelative(22f, -19.5f)
                quadToRelative(17f, -6f, 32.5f, 1.5f)
                reflectiveQuadTo(768f, 196f)
                quadToRelative(17f, 39f, 24.5f, 80.5f)
                reflectiveQuadTo(800f, 360f)
                quadToRelative(0f, 43f, -8f, 84.5f)
                reflectiveQuadTo(767f, 526f)
                quadToRelative(-7f, 17f, -22.5f, 25f)
                reflectiveQuadToRelative(-32.5f, 2f)
                close()
                moveToRelative(116f, 116f)
                quadToRelative(-14f, -7f, -20f, -21.5f)
                reflectiveQuadToRelative(2f, -27.5f)
                quadToRelative(35f, -59f, 52.5f, -124f)
                reflectiveQuadTo(880f, 362f)
                quadToRelative(0f, -69f, -18f, -134.5f)
                reflectiveQuadTo(809f, 102f)
                quadToRelative(-8f, -13f, -1.5f, -27.5f)
                reflectiveQuadTo(828f, 53f)
                quadToRelative(17f, -8f, 34.5f, -0.5f)
                reflectiveQuadTo(889f, 77f)
                quadToRelative(35f, 66f, 53f, 137f)
                reflectiveQuadToRelative(18f, 146f)
                quadToRelative(0f, 75f, -18.5f, 147.5f)
                reflectiveQuadTo(888f, 646f)
                quadToRelative(-9f, 17f, -26f, 24f)
                reflectiveQuadToRelative(-34f, -1f)
                close()
                moveToRelative(-668f, 51f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(120f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(80f, 720f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
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
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(120f, 400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(160f, 360f)
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
                close()
            }
        }.build()
        
        return _Ear_sound!!
    }

private var _Ear_sound: ImageVector? = null

