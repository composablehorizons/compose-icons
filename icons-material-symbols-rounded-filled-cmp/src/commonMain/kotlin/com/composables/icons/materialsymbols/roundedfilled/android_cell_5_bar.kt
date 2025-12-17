package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Android_cell_5_bar: ImageVector
    get() {
        if (_Android_cell_5_bar != null) return _Android_cell_5_bar!!
        
        _Android_cell_5_bar = ImageVector.Builder(
            name = "android_cell_5_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 740f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(100f, 560f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(160f, 620f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(100f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(40f, 740f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(290f, 480f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(350f, 540f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(290f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(230f, 740f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 420f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 740f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(670f, 280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(730f, 340f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(670f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(610f, 740f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(860f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(920f, 220f)
                verticalLineToRelative(520f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(800f, 740f)
                close()
            }
        }.build()
        
        return _Android_cell_5_bar!!
    }

private var _Android_cell_5_bar: ImageVector? = null

