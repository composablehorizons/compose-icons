package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Price_change: ImageVector
    get() {
        if (_Price_change != null) return _Price_change!!
        
        _Price_change = ImageVector.Builder(
            name = "price_change",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, -240f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 640f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 640f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 600f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 440f)
                horizontalLineTo(320f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 320f)
                horizontalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(-16f, 0f, -22.5f, 14.5f)
                reflectiveQuadTo(320f, 320f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 360f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 520f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(247f, 83f)
                lineToRelative(56f, -56f)
                quadToRelative(5f, -5f, 2.5f, -11f)
                reflectiveQuadToRelative(-9.5f, -6f)
                horizontalLineTo(584f)
                quadToRelative(-7f, 0f, -9.5f, 6f)
                reflectiveQuadToRelative(2.5f, 11f)
                lineToRelative(56f, 56f)
                quadToRelative(3f, 3f, 7f, 3f)
                reflectiveQuadToRelative(7f, -3f)
                close()
                moveToRelative(-63f, -243f)
                horizontalLineToRelative(112f)
                quadToRelative(7f, 0f, 9.5f, -6f)
                reflectiveQuadToRelative(-2.5f, -11f)
                lineToRelative(-56f, -56f)
                quadToRelative(-3f, -3f, -7f, -3f)
                reflectiveQuadToRelative(-7f, 3f)
                lineToRelative(-56f, 56f)
                quadToRelative(-5f, 5f, -2.5f, 11f)
                reflectiveQuadToRelative(9.5f, 6f)
                close()
            }
        }.build()
        
        return _Price_change!!
    }

private var _Price_change: ImageVector? = null

