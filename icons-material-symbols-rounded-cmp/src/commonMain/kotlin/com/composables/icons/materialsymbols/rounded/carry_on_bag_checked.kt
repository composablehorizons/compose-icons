package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Carry_on_bag_checked: ImageVector
    get() {
        if (_Carry_on_bag_checked != null) return _Carry_on_bag_checked!!
        
        _Carry_on_bag_checked = ImageVector.Builder(
            name = "carry_on_bag_checked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(692f, 750f)
                lineToRelative(-41f, -41f)
                quadToRelative(-6f, -6f, -15f, -6f)
                reflectiveQuadToRelative(-15f, 6f)
                quadToRelative(-6f, 6f, -6f, 15f)
                reflectiveQuadToRelative(6f, 15f)
                lineToRelative(43f, 43f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(99f, -99f)
                quadToRelative(6f, -6f, 6f, -15f)
                reflectiveQuadToRelative(-6f, -15f)
                quadToRelative(-6f, -6f, -15f, -6f)
                reflectiveQuadToRelative(-15f, 6f)
                lineToRelative(-97f, 97f)
                close()
                moveToRelative(-332f, 10f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(-40f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 760f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 120f)
                verticalLineToRelative(307f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(600f, 467f)
                quadToRelative(-15f, 0f, -27.5f, -10f)
                reflectiveQuadTo(560f, 427f)
                verticalLineToRelative(-67f)
                horizontalLineTo(440f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(1f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(481f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(441f, 840f)
                horizontalLineTo(320f)
                close()
                moveToRelative(400f, -320f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                close()
                moveToRelative(-320f, 40f)
                close()
                moveToRelative(-40f, 200f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Carry_on_bag_checked!!
    }

private var _Carry_on_bag_checked: ImageVector? = null

