package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shoppingmode: ImageVector
    get() {
        if (_Shoppingmode != null) return _Shoppingmode!!
        
        _Shoppingmode = ImageVector.Builder(
            name = "shoppingmode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(479f, 913f)
                lineTo(80f, 514f)
                lineToRelative(432f, -434f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(400f)
                lineTo(479f, 913f)
                close()
                moveToRelative(253f, -593f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(792f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(732f, 200f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(672f, 260f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(732f, 320f)
                close()
            }
        }.build()
        
        return _Shoppingmode!!
    }

private var _Shoppingmode: ImageVector? = null

