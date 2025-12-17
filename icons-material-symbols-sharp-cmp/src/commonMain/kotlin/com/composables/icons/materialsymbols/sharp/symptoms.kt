package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Symptoms: ImageVector
    get() {
        if (_Symptoms != null) return _Symptoms!!
        
        _Symptoms = ImageVector.Builder(
            name = "symptoms",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(479f, 460f)
                close()
                moveToRelative(1f, 300f)
                quadToRelative(-146f, 0f, -266f, -81.5f)
                reflectiveQuadTo(40f, 460f)
                quadToRelative(54f, -137f, 174f, -218.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(146f, 0f, 266f, 81.5f)
                reflectiveQuadTo(920f, 460f)
                quadToRelative(-6f, 15f, -12.5f, 29f)
                reflectiveQuadTo(893f, 516f)
                lineToRelative(-63f, -59f)
                quadToRelative(-51f, -100f, -144.5f, -158.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-113f, 0f, -207.5f, 59.5f)
                reflectiveQuadTo(128f, 460f)
                quadToRelative(50f, 101f, 144.5f, 160.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(11f, 0f, 21.5f, -0.5f)
                reflectiveQuadTo(523f, 677f)
                quadToRelative(-4f, 20f, -4f, 41f)
                reflectiveQuadToRelative(4f, 41f)
                quadToRelative(-11f, 1f, -21.5f, 1f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(660f, 460f)
                quadToRelative(0f, 7f, -0.5f, 13.5f)
                reflectiveQuadTo(658f, 487f)
                lineToRelative(-62f, 57f)
                quadToRelative(-19f, 19f, -34f, 40.5f)
                reflectiveQuadTo(537f, 630f)
                quadToRelative(-14f, 5f, -28f, 7.5f)
                reflectiveQuadToRelative(-29f, 2.5f)
                close()
                moveToRelative(0f, -72f)
                quadToRelative(45f, 0f, 76.5f, -31.5f)
                reflectiveQuadTo(588f, 460f)
                quadToRelative(0f, -45f, -31.5f, -76.5f)
                reflectiveQuadTo(480f, 352f)
                quadToRelative(-45f, 0f, -76.5f, 31.5f)
                reflectiveQuadTo(372f, 460f)
                quadToRelative(0f, 45f, 31.5f, 76.5f)
                reflectiveQuadTo(480f, 568f)
                close()
                moveTo(760f, 880f)
                quadToRelative(-67f, 0f, -113.5f, -47f)
                reflectiveQuadTo(599f, 719f)
                quadToRelative(0f, -33f, 14f, -63f)
                reflectiveQuadToRelative(38f, -53f)
                lineToRelative(109f, -103f)
                lineToRelative(108f, 103f)
                quadToRelative(24f, 23f, 37.5f, 52.5f)
                reflectiveQuadTo(920f, 718f)
                quadToRelative(0f, 68f, -47f, 115f)
                reflectiveQuadTo(760f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -24f)
                reflectiveQuadToRelative(22.5f, -58f)
                quadToRelative(0f, -17f, -7.5f, -32f)
                reflectiveQuadTo(812f, 660f)
                lineToRelative(-52f, -50f)
                lineToRelative(-53f, 50f)
                quadToRelative(-12f, 11f, -20f, 26.5f)
                reflectiveQuadToRelative(-7f, 32.5f)
                quadToRelative(0f, 34f, 23f, 57.5f)
                reflectiveQuadToRelative(57f, 23.5f)
                close()
                moveToRelative(0f, -95f)
                close()
            }
        }.build()
        
        return _Symptoms!!
    }

private var _Symptoms: ImageVector? = null

