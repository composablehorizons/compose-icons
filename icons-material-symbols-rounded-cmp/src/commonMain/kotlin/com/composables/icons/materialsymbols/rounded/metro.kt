package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Metro: ImageVector
    get() {
        if (_Metro != null) return _Metro!!
        
        _Metro = ImageVector.Builder(
            name = "metro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 780f)
                verticalLineToRelative(-584f)
                quadToRelative(0f, -32f, 22f, -54f)
                reflectiveQuadToRelative(54f, -22f)
                horizontalLineToRelative(34f)
                quadToRelative(24f, 0f, 43.5f, 13f)
                reflectiveQuadToRelative(27.5f, 36f)
                lineToRelative(179f, 473f)
                lineToRelative(176f, -469f)
                quadToRelative(9f, -24f, 30f, -38.5f)
                reflectiveQuadToRelative(47f, -14.5f)
                horizontalLineToRelative(25f)
                quadToRelative(34f, 0f, 58f, 24f)
                reflectiveQuadToRelative(24f, 58f)
                verticalLineToRelative(578f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 780f)
                verticalLineToRelative(-430f)
                lineTo(543f, 809f)
                quadToRelative(-5f, 14f, -17f, 22.5f)
                reflectiveQuadToRelative(-27f, 8.5f)
                horizontalLineToRelative(-38f)
                quadToRelative(-15f, 0f, -27f, -8.5f)
                reflectiveQuadTo(417f, 809f)
                lineTo(240f, 353f)
                verticalLineToRelative(427f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(180f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 780f)
                close()
            }
        }.build()
        
        return _Metro!!
    }

private var _Metro: ImageVector? = null

