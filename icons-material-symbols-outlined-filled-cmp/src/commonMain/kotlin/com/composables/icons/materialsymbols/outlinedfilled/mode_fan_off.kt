package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mode_fan_off: ImageVector
    get() {
        if (_Mode_fan_off != null) return _Mode_fan_off!!
        
        _Mode_fan_off = ImageVector.Builder(
            name = "mode_fan_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 536f)
                quadToRelative(0f, 51f, -32f, 77.5f)
                reflectiveQuadTo(777f, 640f)
                quadToRelative(-6f, 0f, -12f, -0.5f)
                reflectiveQuadToRelative(-12f, -2.5f)
                lineTo(324f, 208f)
                quadToRelative(13f, -54f, 66.5f, -91f)
                reflectiveQuadTo(536f, 80f)
                quadToRelative(51f, 0f, 77.5f, 30.5f)
                reflectiveQuadTo(640f, 179f)
                quadToRelative(0f, 26f, -11.5f, 51f)
                reflectiveQuadTo(593f, 271f)
                quadToRelative(-22f, 14f, -35.5f, 36f)
                reflectiveQuadTo(539f, 354f)
                lineToRelative(12f, 6f)
                quadToRelative(6f, 3f, 11f, 7f)
                lineToRelative(92f, -34f)
                quadToRelative(17f, -6f, 32.5f, -9.5f)
                reflectiveQuadTo(719f, 320f)
                quadToRelative(81f, 0f, 121f, 67f)
                reflectiveQuadToRelative(40f, 149f)
                close()
                moveTo(819f, 932f)
                lineTo(637f, 749f)
                quadToRelative(-13f, 54f, -66.5f, 92.5f)
                reflectiveQuadTo(424f, 880f)
                quadToRelative(-51f, 0f, -77.5f, -30.5f)
                reflectiveQuadTo(320f, 780f)
                quadToRelative(0f, -26f, 11.5f, -50.5f)
                reflectiveQuadTo(367f, 689f)
                quadToRelative(22f, -14f, 35.5f, -36f)
                reflectiveQuadToRelative(18.5f, -47f)
                lineToRelative(-12f, -6f)
                quadToRelative(-6f, -3f, -11f, -7f)
                lineToRelative(-92f, 33f)
                quadToRelative(-17f, 6f, -33f, 10f)
                reflectiveQuadToRelative(-33f, 4f)
                quadToRelative(-63f, 0f, -111.5f, -55f)
                reflectiveQuadTo(80f, 424f)
                quadToRelative(0f, -51f, 30.5f, -77.5f)
                reflectiveQuadTo(179f, 320f)
                quadToRelative(8f, 0f, 16.5f, 1f)
                reflectiveQuadToRelative(16.5f, 3f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Mode_fan_off!!
    }

private var _Mode_fan_off: ImageVector? = null

