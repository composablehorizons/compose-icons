package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stylus_highlighter: ImageVector
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
                moveTo(280f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 120f)
                quadToRelative(9f, 0f, 18f, 2f)
                reflectiveQuadToRelative(17f, 6f)
                lineToRelative(240f, 119f)
                quadToRelative(20f, 10f, 32.5f, 29.5f)
                reflectiveQuadTo(680f, 319f)
                verticalLineToRelative(321f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-241f)
                lineTo(360f, 200f)
                verticalLineToRelative(360f)
                close()
                moveTo(160f, 840f)
                lineToRelative(22f, -65f)
                quadToRelative(8f, -25f, 29f, -40f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(444f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 40f)
                lineToRelative(22f, 65f)
                horizontalLineTo(160f)
                close()
                moveToRelative(200f, -280f)
                horizontalLineToRelative(240f)
                horizontalLineToRelative(-240f)
                close()
            }
        }.build()
        
        return _Stylus_highlighter!!
    }

private var _Stylus_highlighter: ImageVector? = null

