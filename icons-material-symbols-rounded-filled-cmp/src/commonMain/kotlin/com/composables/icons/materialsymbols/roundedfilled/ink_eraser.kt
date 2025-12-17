package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ink_eraser: ImageVector
    get() {
        if (_Ink_eraser != null) return _Ink_eraser!!
        
        _Ink_eraser = ImageVector.Builder(
            name = "ink_eraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(690f, 720f)
                horizontalLineToRelative(150f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(610f)
                lineToRelative(80f, -80f)
                close()
                moveToRelative(-483f, 80f)
                quadToRelative(-8f, 0f, -15.5f, -3f)
                reflectiveQuadToRelative(-13.5f, -9f)
                lineToRelative(-73f, -73f)
                quadToRelative(-23f, -23f, -23.5f, -57f)
                reflectiveQuadToRelative(22.5f, -58f)
                lineToRelative(440f, -456f)
                quadToRelative(23f, -24f, 56.5f, -24f)
                reflectiveQuadToRelative(56.5f, 23f)
                lineToRelative(199f, 199f)
                quadToRelative(23f, 23f, 23f, 57f)
                reflectiveQuadToRelative(-23f, 57f)
                lineTo(532f, 788f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineTo(207f)
                close()
            }
        }.build()
        
        return _Ink_eraser!!
    }

private var _Ink_eraser: ImageVector? = null

