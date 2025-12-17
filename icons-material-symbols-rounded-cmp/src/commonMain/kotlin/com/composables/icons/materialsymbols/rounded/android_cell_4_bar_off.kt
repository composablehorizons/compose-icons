package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Android_cell_4_bar_off: ImageVector
    get() {
        if (_Android_cell_4_bar_off != null) return _Android_cell_4_bar_off!!
        
        _Android_cell_4_bar_off = ImageVector.Builder(
            name = "android_cell_4_bar_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(540f, 740f)
                verticalLineToRelative(-96f)
                lineToRelative(-120f, -84f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(360f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(300f, 740f)
                verticalLineToRelative(-264f)
                lineTo(70f, 315f)
                quadToRelative(-17f, -12f, -20.5f, -32f)
                reflectiveQuadToRelative(8.5f, -37f)
                quadToRelative(12f, -17f, 32.5f, -21f)
                reflectiveQuadToRelative(37.5f, 8f)
                lineToRelative(704f, 494f)
                quadToRelative(17f, 12f, 21f, 32f)
                reflectiveQuadToRelative(-8f, 37f)
                quadToRelative(-12f, 17f, -32.5f, 20.5f)
                reflectiveQuadTo(775f, 808f)
                lineToRelative(-115f, -80f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(600f, 800f)
                close()
                moveToRelative(300f, -148f)
                lineToRelative(-120f, -84f)
                verticalLineToRelative(-348f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(840f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(900f, 220f)
                verticalLineToRelative(432f)
                close()
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
                moveToRelative(600f, -256f)
                lineToRelative(-120f, -84f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(660f, 340f)
                verticalLineToRelative(144f)
                close()
            }
        }.build()
        
        return _Android_cell_4_bar_off!!
    }

private var _Android_cell_4_bar_off: ImageVector? = null

