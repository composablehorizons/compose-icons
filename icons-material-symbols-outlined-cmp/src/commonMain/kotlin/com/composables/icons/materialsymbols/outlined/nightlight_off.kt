package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nightlight_off: ImageVector
    get() {
        if (_Nightlight_off != null) return _Nightlight_off!!
        
        _Nightlight_off = ImageVector.Builder(
            name = "nightlight_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(378f, 359f)
                quadToRelative(23f, -11f, 48.5f, -17f)
                reflectiveQuadToRelative(53.5f, -6f)
                quadToRelative(27f, 0f, 52f, 5f)
                reflectiveQuadToRelative(48f, 16f)
                quadToRelative(-34f, 15f, -61f, 40f)
                reflectiveQuadToRelative(-46f, 57f)
                lineToRelative(-95f, -95f)
                close()
                moveToRelative(102f, 457f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -51f, 18.5f, -95f)
                reflectiveQuadToRelative(51.5f, -76f)
                lineToRelative(133f, 133f)
                quadToRelative(-2f, 9f, -2.5f, 18.5f)
                reflectiveQuadTo(440f, 576f)
                quadToRelative(0f, 74f, 38.5f, 132f)
                reflectiveQuadTo(580f, 795f)
                quadToRelative(-23f, 11f, -48f, 16f)
                reflectiveQuadToRelative(-52f, 5f)
                close()
                moveToRelative(339f, 212f)
                lineTo(701f, 910f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 976f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 859f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 576f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 355f)
                lineTo(27f, 236f)
                lineToRelative(57f, -57f)
                lineToRelative(792f, 792f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(480f, 896f)
                quadToRelative(45f, 0f, 85.5f, -12f)
                reflectiveQuadToRelative(76.5f, -33f)
                lineTo(205f, 414f)
                quadToRelative(-21f, 36f, -33f, 76.5f)
                reflectiveQuadTo(160f, 576f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 896f)
                close()
                moveToRelative(335f, -100f)
                lineToRelative(-59f, -59f)
                quadToRelative(21f, -35f, 32.5f, -75.5f)
                reflectiveQuadTo(800f, 576f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 256f)
                quadToRelative(-45f, 0f, -85.5f, 11.5f)
                reflectiveQuadTo(319f, 300f)
                lineToRelative(-59f, -59f)
                quadToRelative(48f, -31f, 103.5f, -48f)
                reflectiveQuadTo(480f, 176f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 293f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 576f)
                quadToRelative(0f, 61f, -17f, 116.5f)
                reflectiveQuadTo(815f, 796f)
                close()
                moveTo(538f, 518f)
                close()
                moveTo(424f, 632f)
                close()
            }
        }.build()
        
        return _Nightlight_off!!
    }

private var _Nightlight_off: ImageVector? = null

