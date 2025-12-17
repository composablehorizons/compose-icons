package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Carry_on_bag_checked: ImageVector
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
                moveToRelative(28f, 170f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(-300f, -80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 120f)
                verticalLineToRelative(291f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-28f, 23f)
                quadToRelative(-32f, 15f, -58.5f, 37f)
                reflectiveQuadTo(496f, 554f)
                quadToRelative(-26f, 35f, -41f, 77f)
                reflectiveQuadToRelative(-15f, 89f)
                quadToRelative(0f, 20f, 3f, 38.5f)
                reflectiveQuadToRelative(8f, 36.5f)
                quadToRelative(5f, 17f, -4.5f, 31f)
                reflectiveQuadTo(420f, 840f)
                close()
                moveToRelative(-100f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 760f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Carry_on_bag_checked!!
    }

private var _Carry_on_bag_checked: ImageVector? = null

