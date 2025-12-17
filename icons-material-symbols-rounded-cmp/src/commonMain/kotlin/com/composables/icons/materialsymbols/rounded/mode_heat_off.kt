package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mode_heat_off: ImageVector
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
                moveTo(480f, 451f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveTo(763f, 876f)
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
                moveTo(561f, 372f)
                quadToRelative(-62f, 0f, -107.5f, -41f)
                reflectiveQuadTo(401f, 230f)
                horizontalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                quadToRelative(-13f, 11f, -30.5f, 10f)
                reflectiveQuadTo(342f, 227f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(13f, -27.5f)
                quadToRelative(18f, -16f, 33f, -26.5f)
                reflectiveQuadToRelative(36f, -24.5f)
                quadToRelative(22f, -14f, 44.5f, -1f)
                reflectiveQuadToRelative(22.5f, 39f)
                verticalLineToRelative(54f)
                quadToRelative(0f, 34f, 23.5f, 57f)
                reflectiveQuadToRelative(57.5f, 23f)
                quadToRelative(18f, 0f, 33.5f, -8f)
                reflectiveQuadToRelative(27.5f, -22f)
                quadToRelative(8f, -10f, 19.5f, -12f)
                reflectiveQuadToRelative(22.5f, 5f)
                quadToRelative(63f, 45f, 99.5f, 115f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(0f, 15f, -1.5f, 29f)
                reflectiveQuadToRelative(-3.5f, 28f)
                quadToRelative(-3f, 16f, -17.5f, 24.5f)
                reflectiveQuadTo(747f, 605f)
                quadToRelative(-8f, -2f, -14f, -7f)
                reflectiveQuadToRelative(-10f, -12f)
                quadToRelative(-4f, -7f, -5.5f, -15f)
                reflectiveQuadToRelative(-0.5f, -16f)
                quadToRelative(2f, -9f, 2.5f, -17.5f)
                reflectiveQuadToRelative(0.5f, -17.5f)
                quadToRelative(0f, -50f, -18.5f, -94.5f)
                reflectiveQuadTo(648f, 346f)
                quadToRelative(-20f, 13f, -42f, 19.5f)
                reflectiveQuadToRelative(-45f, 6.5f)
                close()
                moveToRelative(-81f, 468f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -69f, 25.5f, -134.5f)
                reflectiveQuadTo(259f, 260f)
                lineToRelative(57f, 57f)
                quadToRelative(-38f, 50f, -57f, 101f)
                reflectiveQuadToRelative(-19f, 102f)
                quadToRelative(0f, 52f, 21f, 98.5f)
                reflectiveQuadToRelative(60f, 81.5f)
                quadToRelative(-1f, -5f, -1f, -9f)
                verticalLineToRelative(-9f)
                quadToRelative(0f, -32f, 12f, -60f)
                reflectiveQuadToRelative(35f, -51f)
                lineToRelative(103f, -100f)
                lineToRelative(57f, 57f)
                lineToRelative(-104f, 100f)
                quadToRelative(-11f, 11f, -17f, 25f)
                reflectiveQuadToRelative(-6f, 29f)
                quadToRelative(0f, 32f, 23.5f, 55f)
                reflectiveQuadToRelative(56.5f, 23f)
                quadToRelative(33f, 0f, 56.5f, -23f)
                reflectiveQuadToRelative(23.5f, -55f)
                quadToRelative(0f, -16f, -6.5f, -29f)
                reflectiveQuadTo(536f, 629f)
                lineToRelative(46f, -46f)
                lineToRelative(143f, 143f)
                quadToRelative(-45f, 53f, -107.5f, 83.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Mode_heat_off!!
    }

private var _Mode_heat_off: ImageVector? = null

