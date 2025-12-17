package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Join_left: ImageVector
    get() {
        if (_Join_left != null) return _Join_left!!
        
        _Join_left = ImageVector.Builder(
            name = "join_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(14f, 0f, 26.5f, 1.5f)
                reflectiveQuadTo(372f, 205f)
                quadToRelative(17f, 3f, 21.5f, 20f)
                reflectiveQuadToRelative(-8.5f, 31f)
                quadToRelative(-41f, 47f, -63f, 104f)
                reflectiveQuadToRelative(-22f, 120f)
                quadToRelative(0f, 63f, 22f, 120f)
                reflectiveQuadToRelative(63f, 104f)
                quadToRelative(12f, 14f, 7.5f, 30.5f)
                reflectiveQuadTo(372f, 755f)
                quadToRelative(-13f, 2f, -25.5f, 3.5f)
                reflectiveQuadTo(320f, 760f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(40f, 480f)
                close()
                moveToRelative(440f, 218f)
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
                moveToRelative(440f, -218f)
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
            }
        }.build()
        
        return _Join_left!!
    }

private var _Join_left: ImageVector? = null

