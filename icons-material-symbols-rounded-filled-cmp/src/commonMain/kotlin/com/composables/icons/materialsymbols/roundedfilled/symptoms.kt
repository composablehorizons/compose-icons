package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Symptoms: ImageVector
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
                moveTo(480f, 352f)
                quadToRelative(45f, 0f, 76.5f, 31.5f)
                reflectiveQuadTo(588f, 460f)
                quadToRelative(0f, 45f, -31.5f, 76.5f)
                reflectiveQuadTo(480f, 568f)
                quadToRelative(-45f, 0f, -76.5f, -31.5f)
                reflectiveQuadTo(372f, 460f)
                quadToRelative(0f, -45f, 31.5f, -76.5f)
                reflectiveQuadTo(480f, 352f)
                close()
                moveTo(300f, 460f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(15f, 0f, 29f, -2f)
                reflectiveQuadToRelative(28f, -7f)
                quadToRelative(-9f, 23f, -13.5f, 46.5f)
                reflectiveQuadTo(520f, 726f)
                quadToRelative(1f, 14f, -7.5f, 24f)
                reflectiveQuadTo(490f, 760f)
                quadToRelative(-63f, 0f, -121f, -14f)
                reflectiveQuadToRelative(-111f, -42f)
                quadToRelative(-60f, -32f, -109f, -79.5f)
                reflectiveQuadTo(65f, 514f)
                quadToRelative(-7f, -13f, -10f, -26.5f)
                reflectiveQuadTo(52f, 460f)
                quadToRelative(0f, -14f, 3f, -27.5f)
                reflectiveQuadTo(65f, 406f)
                quadToRelative(63f, -113f, 173.5f, -179.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(131f, 0f, 241.5f, 66.5f)
                reflectiveQuadTo(895f, 406f)
                quadToRelative(6f, 12f, 9f, 26f)
                reflectiveQuadToRelative(3f, 28f)
                quadToRelative(0f, 15f, -3.5f, 29f)
                reflectiveQuadTo(893f, 516f)
                lineToRelative(-50f, -47f)
                quadToRelative(-17f, -17f, -37.5f, -25f)
                reflectiveQuadToRelative(-43.5f, -8f)
                quadToRelative(-23f, 0f, -44.5f, 7.5f)
                reflectiveQuadTo(679f, 467f)
                lineToRelative(-21f, 20f)
                quadToRelative(1f, -7f, 1.5f, -13.5f)
                reflectiveQuadToRelative(0.5f, -13.5f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 460f)
                close()
            }
        }.build()
        
        return _Symptoms!!
    }

private var _Symptoms: ImageVector? = null

