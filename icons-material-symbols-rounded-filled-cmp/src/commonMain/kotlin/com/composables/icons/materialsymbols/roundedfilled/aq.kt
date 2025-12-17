package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Aq: ImageVector
    get() {
        if (_Aq != null) return _Aq!!
        
        _Aq = ImageVector.Builder(
            name = "aq",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(657f, 685f)
                quadToRelative(-78f, 0f, -132f, -54f)
                reflectiveQuadToRelative(-54f, -132f)
                quadToRelative(0f, -77f, 54f, -131.5f)
                reflectiveQuadTo(656f, 313f)
                quadToRelative(77f, 0f, 130.5f, 54.5f)
                reflectiveQuadTo(840f, 499f)
                quadToRelative(0f, 40f, -16f, 76f)
                reflectiveQuadToRelative(-45f, 63f)
                lineToRelative(12f, 18f)
                quadToRelative(6f, 9f, 4f, 19f)
                reflectiveQuadToRelative(-11f, 16f)
                quadToRelative(-9f, 6f, -19f, 4.5f)
                reflectiveQuadTo(749f, 685f)
                lineToRelative(-12f, -18f)
                quadToRelative(-19f, 9f, -39f, 13.5f)
                reflectiveQuadToRelative(-41f, 4.5f)
                close()
                moveToRelative(-443f, -99f)
                lineToRelative(-26f, 72f)
                quadToRelative(-3f, 8f, -10.5f, 13.5f)
                reflectiveQuadTo(161f, 677f)
                quadToRelative(-15f, 0f, -23.5f, -12.5f)
                reflectiveQuadTo(134f, 638f)
                lineToRelative(112f, -298f)
                quadToRelative(3f, -9f, 11f, -14f)
                reflectiveQuadToRelative(17f, -5f)
                horizontalLineToRelative(22f)
                quadToRelative(9f, 0f, 17f, 5f)
                reflectiveQuadToRelative(11f, 14f)
                lineToRelative(112f, 298f)
                quadToRelative(5f, 14f, -3f, 26.5f)
                reflectiveQuadTo(410f, 677f)
                quadToRelative(-9f, 0f, -17f, -5.5f)
                reflectiveQuadTo(382f, 657f)
                lineToRelative(-25f, -71f)
                horizontalLineTo(214f)
                close()
                moveToRelative(442f, 47f)
                quadToRelative(14f, 0f, 26.5f, -3f)
                reflectiveQuadToRelative(24.5f, -8f)
                lineToRelative(-28f, -40f)
                quadToRelative(-6f, -9f, -3.5f, -19.5f)
                reflectiveQuadTo(687f, 546f)
                quadToRelative(9f, -6f, 19f, -4f)
                reflectiveQuadToRelative(16f, 11f)
                lineToRelative(26f, 39f)
                quadToRelative(17f, -19f, 26f, -43f)
                reflectiveQuadToRelative(9f, -50f)
                quadToRelative(0f, -55f, -36.5f, -94.5f)
                reflectiveQuadTo(656f, 365f)
                quadToRelative(-54f, 0f, -91f, 39.5f)
                reflectiveQuadTo(528f, 499f)
                quadToRelative(0f, 55f, 37f, 94.5f)
                reflectiveQuadToRelative(91f, 39.5f)
                close()
                moveToRelative(-424f, -99f)
                horizontalLineToRelative(106f)
                lineToRelative(-51f, -144f)
                horizontalLineToRelative(-4f)
                lineToRelative(-51f, 144f)
                close()
            }
        }.build()
        
        return _Aq!!
    }

private var _Aq: ImageVector? = null

