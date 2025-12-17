package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Android_cell_4_bar_plus: ImageVector
    get() {
        if (_Android_cell_4_bar_plus != null) return _Android_cell_4_bar_plus!!
        
        _Android_cell_4_bar_plus = ImageVector.Builder(
            name = "android_cell_4_bar_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(60f, 740f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(180f, 540f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(120f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(60f, 740f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-300f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(360f, 380f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(420f, 440f)
                verticalLineToRelative(300f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(360f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(300f, 740f)
                close()
                moveToRelative(480f, -259f)
                verticalLineToRelative(-261f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(840f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(900f, 220f)
                verticalLineToRelative(287f)
                quadToRelative(-27f, -16f, -57.5f, -22.5f)
                reflectiveQuadTo(780f, 481f)
                close()
                moveToRelative(-20f, 239f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 640f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 720f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 760f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(-220f, 30f)
                verticalLineToRelative(-410f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(660f, 340f)
                verticalLineToRelative(207f)
                quadToRelative(-31f, 26f, -45.5f, 60.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(0f, 29f, 7.5f, 55f)
                reflectiveQuadToRelative(21.5f, 49f)
                quadToRelative(-7f, 8f, -17f, 12f)
                reflectiveQuadToRelative(-22f, 4f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(540f, 750f)
                close()
            }
        }.build()
        
        return _Android_cell_4_bar_plus!!
    }

private var _Android_cell_4_bar_plus: ImageVector? = null

