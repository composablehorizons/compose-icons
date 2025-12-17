package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mode_heat_off: ImageVector
    get() {
        if (_Mode_heat_off != null) return _Mode_heat_off!!
        
        _Mode_heat_off = ImageVector.Builder(
            name = "mode_heat_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(561f, 292f)
                quadToRelative(17f, 0f, 32.5f, -7f)
                reflectiveQuadToRelative(28.5f, -23f)
                quadToRelative(8f, -10f, 19.5f, -11.5f)
                reflectiveQuadTo(664f, 256f)
                quadToRelative(62f, 44f, 99f, 113.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(0f, 17f, -2f, 33.5f)
                reflectiveQuadToRelative(-5f, 32.5f)
                quadToRelative(-5f, 25f, -30.5f, 31f)
                reflectiveQuadTo(718f, 604f)
                lineTo(346f, 232f)
                quadToRelative(-13f, -13f, -13f, -31.5f)
                reflectiveQuadToRelative(14f, -30.5f)
                quadToRelative(17f, -15f, 34f, -27f)
                reflectiveQuadToRelative(32f, -22f)
                quadToRelative(22f, -14f, 44.5f, -2f)
                reflectiveQuadToRelative(22.5f, 39f)
                verticalLineToRelative(54f)
                quadToRelative(0f, 37f, 25f, 58.5f)
                reflectiveQuadToRelative(56f, 21.5f)
                close()
                moveTo(339f, 543f)
                quadToRelative(-29f, 29f, -44f, 64f)
                reflectiveQuadToRelative(-15f, 75f)
                quadToRelative(0f, 9f, 0.5f, 18f)
                reflectiveQuadToRelative(2.5f, 18f)
                quadToRelative(3f, 16f, -13f, 22.5f)
                reflectiveQuadToRelative(-29f, -7.5f)
                quadToRelative(-11f, -12f, -20.5f, -25.5f)
                reflectiveQuadTo(203f, 680f)
                quadToRelative(-20f, -35f, -31.5f, -75.5f)
                reflectiveQuadTo(160f, 520f)
                quadToRelative(0f, -78f, 29f, -143f)
                reflectiveQuadToRelative(71f, -117f)
                lineToRelative(182f, 182f)
                lineToRelative(-103f, 101f)
                close()
                moveToRelative(141f, 257f)
                quadToRelative(-50f, 0f, -85f, -34.5f)
                reflectiveQuadTo(360f, 682f)
                quadToRelative(0f, -23f, 9f, -44.5f)
                reflectiveQuadToRelative(26f, -38.5f)
                lineToRelative(85f, -83f)
                lineToRelative(85f, 83f)
                quadToRelative(17f, 17f, 26f, 38f)
                reflectiveQuadToRelative(9f, 45f)
                quadToRelative(0f, 49f, -35f, 83.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(283f, 76f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
            }
        }.build()
        
        return _Mode_heat_off!!
    }

private var _Mode_heat_off: ImageVector? = null

