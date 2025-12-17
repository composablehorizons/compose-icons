package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Gesture: ImageVector
    get() {
        if (_Gesture != null) return _Gesture!!
        
        _Gesture = ImageVector.Builder(
            name = "gesture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(554f, 840f)
                quadToRelative(-54f, 0f, -91f, -37f)
                reflectiveQuadToRelative(-37f, -89f)
                quadToRelative(0f, -76f, 61.5f, -137.5f)
                reflectiveQuadTo(641f, 500f)
                quadToRelative(-3f, -36f, -18f, -54.5f)
                reflectiveQuadTo(582f, 427f)
                quadToRelative(-30f, 0f, -65f, 25f)
                reflectiveQuadToRelative(-83f, 82f)
                quadToRelative(-78f, 93f, -114.5f, 121f)
                reflectiveQuadTo(241f, 683f)
                quadToRelative(-51f, 0f, -86f, -38f)
                reflectiveQuadToRelative(-35f, -92f)
                quadToRelative(0f, -54f, 23.5f, -110.5f)
                reflectiveQuadTo(223f, 307f)
                quadToRelative(19f, -26f, 28f, -44f)
                reflectiveQuadToRelative(9f, -29f)
                quadToRelative(0f, -7f, -2.5f, -10.5f)
                reflectiveQuadTo(250f, 220f)
                quadToRelative(-5f, 0f, -12f, 3f)
                reflectiveQuadToRelative(-15f, 11f)
                quadToRelative(-15f, 14f, -34.5f, 15f)
                reflectiveQuadTo(155f, 236f)
                quadToRelative(-15f, -16f, -15.5f, -37.5f)
                reflectiveQuadTo(155f, 163f)
                quadToRelative(24f, -21f, 48f, -32f)
                reflectiveQuadToRelative(47f, -11f)
                quadToRelative(46f, 0f, 78f, 32f)
                reflectiveQuadToRelative(32f, 80f)
                quadToRelative(0f, 29f, -15f, 64f)
                reflectiveQuadToRelative(-50f, 84f)
                quadToRelative(-38f, 54f, -56.5f, 95f)
                reflectiveQuadTo(220f, 547f)
                quadToRelative(0f, 17f, 5.5f, 26.5f)
                reflectiveQuadTo(241f, 583f)
                quadToRelative(10f, 0f, 17.5f, -5.5f)
                reflectiveQuadTo(286f, 551f)
                quadToRelative(13f, -14f, 31f, -34.5f)
                reflectiveQuadToRelative(44f, -50.5f)
                quadToRelative(63f, -75f, 114f, -107f)
                reflectiveQuadToRelative(107f, -32f)
                quadToRelative(67f, 0f, 110f, 45f)
                reflectiveQuadToRelative(49f, 123f)
                horizontalLineToRelative(49f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(840f, 545f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(790f, 595f)
                horizontalLineToRelative(-49f)
                quadToRelative(-8f, 112f, -58.5f, 178.5f)
                reflectiveQuadTo(554f, 840f)
                close()
                moveToRelative(2f, -100f)
                quadToRelative(32f, 0f, 54f, -36.5f)
                reflectiveQuadTo(640f, 602f)
                quadToRelative(-46f, 11f, -80f, 43.5f)
                reflectiveQuadTo(526f, 710f)
                quadToRelative(0f, 14f, 8f, 22f)
                reflectiveQuadToRelative(22f, 8f)
                close()
            }
        }.build()
        
        return _Gesture!!
    }

private var _Gesture: ImageVector? = null

