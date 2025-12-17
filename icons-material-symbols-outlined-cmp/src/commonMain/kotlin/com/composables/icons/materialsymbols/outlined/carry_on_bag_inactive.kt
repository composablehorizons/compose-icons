package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Carry_on_bag_inactive: ImageVector
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
                moveTo(600f, 486f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(-46f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(126f)
                verticalLineToRelative(-120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(440f, 80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(406f)
                close()
                moveTo(792f, 904f)
                lineToRelative(-76f, -76f)
                quadToRelative(-11f, 42f, -42.5f, 67f)
                reflectiveQuadTo(600f, 920f)
                quadToRelative(-39f, 0f, -69.5f, -22.5f)
                reflectiveQuadTo(488f, 840f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -11f, 2.5f, -20f)
                reflectiveQuadToRelative(7.5f, -18f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(320f, 760f)
                verticalLineToRelative(-326f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(366f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(280f, 100f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveTo(400f, 760f)
                horizontalLineToRelative(88f)
                quadToRelative(5f, -14f, 13f, -26.5f)
                reflectiveQuadToRelative(19f, -21.5f)
                verticalLineToRelative(-78f)
                lineTo(400f, 514f)
                verticalLineToRelative(246f)
                close()
                moveToRelative(198f, 42f)
                close()
                moveTo(474f, 360f)
                close()
                moveTo(360f, 637f)
                close()
                moveToRelative(-40f, 123f)
                verticalLineToRelative(-326f)
                verticalLineToRelative(326f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-246f)
                verticalLineToRelative(246f)
                close()
                moveToRelative(200f, 40f)
                close()
            }
        }.build()
        
        return _Carry_on_bag_inactive!!
    }

private var _Carry_on_bag_inactive: ImageVector? = null

