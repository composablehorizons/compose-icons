package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mode_heat_off: ImageVector
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
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveTo(791f, 905f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(368f, 368f)
                lineToRelative(368f, 368f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-21f, -250f)
                lineToRelative(-61f, -61f)
                quadToRelative(5f, -18f, 8f, -36.5f)
                reflectiveQuadToRelative(3f, -37.5f)
                quadToRelative(0f, -50f, -18.5f, -94.5f)
                reflectiveQuadTo(648f, 346f)
                quadToRelative(-20f, 13f, -42f, 19.5f)
                reflectiveQuadToRelative(-45f, 6.5f)
                quadToRelative(-62f, 0f, -107.5f, -41f)
                reflectiveQuadTo(401f, 230f)
                quadToRelative(-8f, 6f, -15f, 12.5f)
                reflectiveQuadTo(371f, 256f)
                lineToRelative(-57f, -57f)
                quadToRelative(35f, -34f, 76.5f, -63.5f)
                reflectiveQuadTo(480f, 80f)
                verticalLineToRelative(132f)
                quadToRelative(0f, 34f, 23.5f, 57f)
                reflectiveQuadToRelative(57.5f, 23f)
                quadToRelative(18f, 0f, 33.5f, -8f)
                reflectiveQuadToRelative(27.5f, -22f)
                lineToRelative(18f, -22f)
                quadToRelative(74f, 42f, 117f, 117f)
                reflectiveQuadToRelative(43f, 163f)
                quadToRelative(0f, 36f, -7.5f, 70f)
                reflectiveQuadTo(770f, 655f)
                close()
                moveTo(480f, 840f)
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

