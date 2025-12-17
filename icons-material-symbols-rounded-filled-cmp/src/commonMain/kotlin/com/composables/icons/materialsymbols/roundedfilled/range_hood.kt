package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Range_hood: ImageVector
    get() {
        if (_Range_hood != null) return _Range_hood!!
        
        _Range_hood = ImageVector.Builder(
            name = "range_hood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(194f, 480f)
                quadToRelative(-20f, 0f, -28f, -18.5f)
                reflectiveQuadToRelative(6f, -32.5f)
                lineToRelative(108f, -109f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(120f)
                lineToRelative(109f, 109f)
                quadToRelative(14f, 14f, 6.5f, 32.5f)
                reflectiveQuadTo(768f, 480f)
                horizontalLineTo(194f)
                close()
                moveToRelative(-34f, 320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 560f)
                horizontalLineToRelative(720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 600f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(270f, -132f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(560f, 638f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(530f, 608f)
                horizontalLineTo(430f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(400f, 638f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(430f, 668f)
                close()
            }
        }.build()
        
        return _Range_hood!!
    }

private var _Range_hood: ImageVector? = null

