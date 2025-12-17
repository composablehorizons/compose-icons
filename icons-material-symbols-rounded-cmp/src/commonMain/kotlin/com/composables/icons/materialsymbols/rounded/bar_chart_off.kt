package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bar_chart_off: ImageVector
    get() {
        if (_Bar_chart_off != null) return _Bar_chart_off!!
        
        _Bar_chart_off = ImageVector.Builder(
            name = "bar_chart_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 360f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 400f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 800f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 760f)
                verticalLineToRelative(-360f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -354f)
                lineTo(400f, 286f)
                verticalLineToRelative(-86f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 160f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 200f)
                verticalLineToRelative(246f)
                close()
                moveToRelative(240f, 240f)
                lineTo(640f, 526f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(126f)
                close()
                moveTo(763f, 876f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
            }
        }.build()
        
        return _Bar_chart_off!!
    }

private var _Bar_chart_off: ImageVector? = null

