package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Join_inner: ImageVector
    get() {
        if (_Join_inner != null) return _Join_inner!!
        
        _Join_inner = ImageVector.Builder(
            name = "join_inner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 480f)
                quadToRelative(0f, -56f, 21f, -107f)
                reflectiveQuadToRelative(61f, -91f)
                quadToRelative(45f, -45f, 105.5f, -66.5f)
                reflectiveQuadTo(352f, 202f)
                quadToRelative(17f, 2f, 27f, 14.5f)
                reflectiveQuadToRelative(8f, 29.5f)
                quadToRelative(-2f, 17f, -15f, 27f)
                reflectiveQuadToRelative(-30f, 8f)
                quadToRelative(-45f, -5f, -88f, 10.5f)
                reflectiveQuadTo(179f, 339f)
                quadToRelative(-28f, 28f, -43.5f, 64.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 40f, 15.5f, 76.5f)
                reflectiveQuadTo(179f, 621f)
                quadToRelative(32f, 32f, 75f, 47.5f)
                reflectiveQuadToRelative(88f, 10.5f)
                quadToRelative(17f, -2f, 29.5f, 8f)
                reflectiveQuadToRelative(14.5f, 27f)
                quadToRelative(2f, 16f, -7.5f, 29f)
                reflectiveQuadTo(352f, 758f)
                quadToRelative(-64f, 8f, -124.5f, -13.5f)
                reflectiveQuadTo(122f, 678f)
                quadToRelative(-40f, -40f, -61f, -91f)
                reflectiveQuadTo(40f, 480f)
                close()
                moveToRelative(880f, 0f)
                quadToRelative(0f, 56f, -21f, 107f)
                reflectiveQuadToRelative(-61f, 91f)
                quadToRelative(-45f, 45f, -105.5f, 65f)
                reflectiveQuadTo(609f, 757f)
                quadToRelative(-17f, -2f, -27f, -14f)
                reflectiveQuadToRelative(-8f, -29f)
                quadToRelative(2f, -17f, 14.5f, -27f)
                reflectiveQuadToRelative(29.5f, -8f)
                quadToRelative(45f, 5f, 88f, -10.5f)
                reflectiveQuadToRelative(75f, -47.5f)
                quadToRelative(28f, -28f, 43.5f, -64.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, -40f, -15.5f, -76.5f)
                reflectiveQuadTo(781f, 339f)
                quadToRelative(-32f, -32f, -75f, -47.5f)
                reflectiveQuadTo(618f, 281f)
                quadToRelative(-17f, 2f, -29.5f, -8f)
                reflectiveQuadTo(574f, 246f)
                quadToRelative(-2f, -17f, 8f, -29.5f)
                reflectiveQuadToRelative(27f, -14.5f)
                quadToRelative(64f, -7f, 124f, 14f)
                reflectiveQuadToRelative(105f, 66f)
                quadToRelative(40f, 40f, 61f, 91f)
                reflectiveQuadToRelative(21f, 107f)
                close()
                moveTo(480f, 698f)
                quadToRelative(-7f, 0f, -14f, -2.5f)
                reflectiveQuadToRelative(-12f, -7.5f)
                quadToRelative(-46f, -38f, -70f, -93f)
                reflectiveQuadToRelative(-24f, -115f)
                quadToRelative(0f, -60f, 24f, -115f)
                reflectiveQuadToRelative(70f, -93f)
                quadToRelative(5f, -5f, 12f, -7.5f)
                reflectiveQuadToRelative(14f, -2.5f)
                quadToRelative(7f, 0f, 14f, 2.5f)
                reflectiveQuadToRelative(12f, 7.5f)
                quadToRelative(46f, 38f, 70f, 93f)
                reflectiveQuadToRelative(24f, 115f)
                quadToRelative(0f, 60f, -24f, 115f)
                reflectiveQuadToRelative(-70f, 93f)
                quadToRelative(-5f, 5f, -12f, 7.5f)
                reflectiveQuadToRelative(-14f, 2.5f)
                close()
            }
        }.build()
        
        return _Join_inner!!
    }

private var _Join_inner: ImageVector? = null

