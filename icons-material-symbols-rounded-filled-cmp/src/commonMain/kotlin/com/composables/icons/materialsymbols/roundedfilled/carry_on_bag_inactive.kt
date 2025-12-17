package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Carry_on_bag_inactive: ImageVector
    get() {
        if (_Carry_on_bag_inactive != null) return _Carry_on_bag_inactive!!
        
        _Carry_on_bag_inactive = ImageVector.Builder(
            name = "carry_on_bag_inactive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(764f, 877f)
                lineTo(642f, 757f)
                quadToRelative(8f, 8f, 13f, 19f)
                reflectiveQuadToRelative(5f, 24f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(600f, 860f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(540f, 800f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(600f, 740f)
                quadToRelative(12f, 0f, 21.5f, 3.5f)
                reflectiveQuadTo(639f, 754f)
                lineToRelative(-69f, -70f)
                quadToRelative(-20f, 5f, -36.5f, 16.5f)
                reflectiveQuadTo(505f, 727f)
                quadToRelative(-13f, 17f, -19.5f, 37.5f)
                reflectiveQuadTo(480f, 806f)
                quadToRelative(1f, 14f, -6.5f, 24f)
                reflectiveQuadTo(453f, 840f)
                horizontalLineToRelative(-73f)
                verticalLineToRelative(-346f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(406f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -10f, 2.5f, -19.5f)
                reflectiveQuadTo(210f, 322f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(820f, 876f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(764f, 877f)
                close()
                moveTo(532f, 418f)
                lineToRelative(-70f, -70f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(491f, 280f)
                horizontalLineToRelative(29f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 120f)
                verticalLineToRelative(269f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(532f, 418f)
                close()
            }
        }.build()
        
        return _Carry_on_bag_inactive!!
    }

private var _Carry_on_bag_inactive: ImageVector? = null

