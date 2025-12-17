package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ripples: ImageVector
    get() {
        if (_Ripples != null) return _Ripples!!
        
        _Ripples = ImageVector.Builder(
            name = "ripples",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(542f, 200f)
                quadToRelative(-11f, 18f, -16.5f, 38.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(21f, 0f, 41.5f, -5.5f)
                reflectiveQuadTo(760f, 418f)
                verticalLineToRelative(-218f)
                horizontalLineTo(542f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Ripples!!
    }

private var _Ripples: ImageVector? = null

