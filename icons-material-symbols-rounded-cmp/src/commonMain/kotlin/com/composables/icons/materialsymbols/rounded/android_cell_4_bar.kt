package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Android_cell_4_bar: ImageVector
    get() {
        if (_Android_cell_4_bar != null) return _Android_cell_4_bar!!
        
        _Android_cell_4_bar = ImageVector.Builder(
            name = "android_cell_4_bar",
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
                moveToRelative(240f, 0f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(660f, 340f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(600f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(540f, 740f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(840f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(900f, 220f)
                verticalLineToRelative(520f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(780f, 740f)
                close()
            }
        }.build()
        
        return _Android_cell_4_bar!!
    }

private var _Android_cell_4_bar: ImageVector? = null

