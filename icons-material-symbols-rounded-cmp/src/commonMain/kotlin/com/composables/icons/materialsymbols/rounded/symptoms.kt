package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Symptoms: ImageVector
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
                moveToRelative(-427f, 0f)
                quadToRelative(0f, -14f, 3f, -27.5f)
                reflectiveQuadTo(65f, 406f)
                quadToRelative(63f, -113f, 173.5f, -179.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(135f, 0f, 248.5f, 70f)
                reflectiveQuadTo(902f, 420f)
                quadToRelative(8f, 15f, 2.5f, 31f)
                reflectiveQuadTo(884f, 475f)
                quadToRelative(-15f, 8f, -30.5f, 2.5f)
                reflectiveQuadTo(830f, 457f)
                quadToRelative(-25f, -50f, -62f, -90f)
                reflectiveQuadToRelative(-82.5f, -68f)
                quadTo(640f, 271f, 588f, 255.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-113f, 0f, -207.5f, 59.5f)
                reflectiveQuadTo(128f, 460f)
                quadToRelative(50f, 100f, 146f, 161f)
                reflectiveQuadToRelative(209f, 59f)
                quadToRelative(17f, 0f, 28.5f, 11f)
                reflectiveQuadToRelative(11.5f, 27f)
                quadToRelative(0f, 17f, -11.5f, 29.5f)
                reflectiveQuadTo(483f, 760f)
                quadToRelative(-132f, -1f, -243f, -65.5f)
                reflectiveQuadTo(65f, 514f)
                quadToRelative(-7f, -13f, -10f, -26.5f)
                reflectiveQuadTo(52f, 460f)
                close()
                moveToRelative(428f, 180f)
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
                lineToRelative(54f, -51f)
                quadToRelative(23f, -22f, 55f, -22f)
                reflectiveQuadToRelative(55f, 22f)
                lineToRelative(53f, 51f)
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

