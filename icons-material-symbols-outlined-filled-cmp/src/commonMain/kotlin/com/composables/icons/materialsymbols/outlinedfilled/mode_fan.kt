package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mode_fan: ImageVector
    get() {
        if (_Mode_fan != null) return _Mode_fan!!
        
        _Mode_fan = ImageVector.Builder(
            name = "mode_fan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(424f, 880f)
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
                quadToRelative(26f, 0f, 51f, 11.5f)
                reflectiveQuadToRelative(41f, 35.5f)
                quadToRelative(14f, 22f, 36f, 35.5f)
                reflectiveQuadToRelative(47f, 18.5f)
                lineToRelative(6f, -12f)
                quadToRelative(3f, -6f, 7f, -11f)
                lineToRelative(-33f, -92f)
                quadToRelative(-6f, -17f, -10f, -33f)
                reflectiveQuadToRelative(-4f, -32f)
                quadToRelative(0f, -64f, 55f, -112.5f)
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
                quadToRelative(0f, 51f, -32f, 77.5f)
                reflectiveQuadTo(777f, 640f)
                quadToRelative(-25f, 0f, -48.5f, -11.5f)
                reflectiveQuadTo(689f, 593f)
                quadToRelative(-14f, -22f, -36f, -35.5f)
                reflectiveQuadTo(606f, 539f)
                lineToRelative(-6f, 12f)
                quadToRelative(-3f, 6f, -7f, 11f)
                lineToRelative(33f, 92f)
                quadToRelative(6f, 16f, 10f, 30.5f)
                reflectiveQuadToRelative(4f, 30.5f)
                quadToRelative(1f, 65f, -54f, 115f)
                reflectiveQuadTo(424f, 880f)
                close()
                moveToRelative(56f, -340f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 540f)
                close()
            }
        }.build()
        
        return _Mode_fan!!
    }

private var _Mode_fan: ImageVector? = null

