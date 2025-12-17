package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Noise_control_on: ImageVector
    get() {
        if (_Noise_control_on != null) return _Noise_control_on!!
        
        _Noise_control_on = ImageVector.Builder(
            name = "noise_control_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(39f, -80f)
                quadToRelative(-39f, 0f, -70f, -24f)
                reflectiveQuadToRelative(-45f, -62f)
                quadToRelative(-3f, -8f, -6.5f, -15.5f)
                reflectiveQuadTo(388f, 605f)
                lineToRelative(-50f, -51f)
                quadToRelative(-26f, -26f, -42f, -60f)
                reflectiveQuadToRelative(-16f, -72f)
                quadToRelative(0f, -75f, 52.5f, -128.5f)
                reflectiveQuadTo(460f, 240f)
                quadToRelative(52f, 0f, 95.5f, 27.5f)
                reflectiveQuadTo(622f, 342f)
                quadToRelative(10f, 20f, -1.5f, 39f)
                reflectiveQuadTo(586f, 400f)
                quadToRelative(-12f, 0f, -21.5f, -6.5f)
                reflectiveQuadTo(550f, 376f)
                quadToRelative(-13f, -26f, -37f, -41f)
                reflectiveQuadToRelative(-53f, -15f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 21f, 7.5f, 40f)
                reflectiveQuadToRelative(22.5f, 34f)
                lineToRelative(55f, 54f)
                quadToRelative(14f, 14f, 22.5f, 30.5f)
                reflectiveQuadTo(482f, 613f)
                quadToRelative(5f, 12f, 15f, 19.5f)
                reflectiveQuadToRelative(23f, 7.5f)
                quadToRelative(11f, 0f, 20.5f, -5.5f)
                reflectiveQuadTo(555f, 619f)
                quadToRelative(5f, -9f, 14f, -14f)
                reflectiveQuadToRelative(20f, -5f)
                quadToRelative(23f, 0f, 35f, 19f)
                reflectiveQuadToRelative(1f, 39f)
                quadToRelative(-16f, 29f, -44.5f, 45.5f)
                reflectiveQuadTo(519f, 720f)
                close()
                moveToRelative(21f, -160f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(600f, 500f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(540f, 440f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(480f, 500f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(540f, 560f)
                close()
            }
        }.build()
        
        return _Noise_control_on!!
    }

private var _Noise_control_on: ImageVector? = null

