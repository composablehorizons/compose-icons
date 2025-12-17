package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pages: ImageVector
    get() {
        if (_Pages != null) return _Pages!!
        
        _Pages = ImageVector.Builder(
            name = "pages",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -261f)
                lineToRelative(77f, 46f)
                quadToRelative(11f, 7f, 21.5f, -0.5f)
                reflectiveQuadTo(586f, 604f)
                lineToRelative(-20f, -87f)
                lineToRelative(68f, -59f)
                quadToRelative(10f, -9f, 6f, -21.5f)
                reflectiveQuadTo(622f, 423f)
                lineToRelative(-89f, -7f)
                lineToRelative(-35f, -83f)
                quadToRelative(-5f, -12f, -18f, -12f)
                reflectiveQuadToRelative(-18f, 12f)
                lineToRelative(-35f, 83f)
                lineToRelative(-89f, 7f)
                quadToRelative(-14f, 1f, -18f, 13.5f)
                reflectiveQuadToRelative(6f, 21.5f)
                lineToRelative(68f, 59f)
                lineToRelative(-20f, 87f)
                quadToRelative(-3f, 13f, 7.5f, 20.5f)
                reflectiveQuadToRelative(21.5f, 0.5f)
                lineToRelative(77f, -46f)
                close()
            }
        }.build()
        
        return _Pages!!
    }

private var _Pages: ImageVector? = null

