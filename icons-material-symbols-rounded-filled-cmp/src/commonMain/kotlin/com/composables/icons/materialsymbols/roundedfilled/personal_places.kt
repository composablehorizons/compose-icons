package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Personal_places: ImageVector
    get() {
        if (_Personal_places != null) return _Personal_places!!
        
        _Personal_places = ImageVector.Builder(
            name = "personal_places",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(298f)
                quadToRelative(20f, 0f, 37f, 9f)
                reflectiveQuadToRelative(28f, 25f)
                lineToRelative(85f, 120f)
                quadToRelative(14f, 21f, 14f, 46f)
                reflectiveQuadToRelative(-14f, 46f)
                lineToRelative(-85f, 120f)
                quadToRelative(-11f, 16f, -28f, 25f)
                reflectiveQuadToRelative(-37f, 9f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 800f)
                close()
            }
        }.build()
        
        return _Personal_places!!
    }

private var _Personal_places: ImageVector? = null

