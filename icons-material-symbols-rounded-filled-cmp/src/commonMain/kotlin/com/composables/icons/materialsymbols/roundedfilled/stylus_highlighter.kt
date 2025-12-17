package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stylus_highlighter: ImageVector
    get() {
        if (_Stylus_highlighter != null) return _Stylus_highlighter!!
        
        _Stylus_highlighter = ImageVector.Builder(
            name = "stylus_highlighter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 120f)
                quadToRelative(9f, 0f, 18f, 2f)
                reflectiveQuadToRelative(17f, 6f)
                lineToRelative(240f, 119f)
                quadToRelative(20f, 10f, 32.5f, 29.5f)
                reflectiveQuadTo(680f, 319f)
                verticalLineToRelative(281f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 640f)
                horizontalLineTo(320f)
                close()
                moveTo(215f, 840f)
                quadToRelative(-20f, 0f, -32.5f, -16.5f)
                reflectiveQuadTo(177f, 787f)
                lineToRelative(5f, -12f)
                quadToRelative(8f, -25f, 29f, -40f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(444f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 40f)
                lineToRelative(5f, 12f)
                quadToRelative(7f, 20f, -5.5f, 36.5f)
                reflectiveQuadTo(745f, 840f)
                horizontalLineTo(215f)
                close()
            }
        }.build()
        
        return _Stylus_highlighter!!
    }

private var _Stylus_highlighter: ImageVector? = null

