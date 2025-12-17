package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Carry_on_bag_inactive: ImageVector
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
                moveTo(792f, 904f)
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
                quadToRelative(-40f, 11f, -65f, 42.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(0f, 11f, 1.5f, 20.5f)
                reflectiveQuadTo(487f, 840f)
                horizontalLineTo(380f)
                verticalLineToRelative(-346f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(406f)
                horizontalLineTo(200f)
                verticalLineToRelative(-528f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(600f, 486f)
                lineTo(394f, 280f)
                horizontalLineToRelative(126f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(406f)
                close()
            }
        }.build()
        
        return _Carry_on_bag_inactive!!
    }

private var _Carry_on_bag_inactive: ImageVector? = null

