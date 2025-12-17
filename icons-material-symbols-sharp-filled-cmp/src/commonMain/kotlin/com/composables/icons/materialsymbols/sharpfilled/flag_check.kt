package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Flag_check: ImageVector
    get() {
        if (_Flag_check != null) return _Flag_check!!
        
        _Flag_check = ImageVector.Builder(
            name = "flag_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-680f)
                horizontalLineToRelative(250f)
                quadToRelative(-5f, 19f, -7.5f, 37.5f)
                reflectiveQuadTo(440f, 234f)
                quadToRelative(0f, 121f, 84f, 200.5f)
                reflectiveQuadTo(720f, 514f)
                quadToRelative(20f, 0f, 40f, -3f)
                reflectiveQuadToRelative(40f, -9f)
                verticalLineToRelative(138f)
                horizontalLineTo(520f)
                lineToRelative(-16f, -80f)
                horizontalLineTo(280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(520f, -806f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 234f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 434f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 234f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 34f)
                close()
                moveToRelative(-29f, 290f)
                lineToRelative(139f, -138f)
                lineToRelative(-42f, -42f)
                lineToRelative(-97f, 95f)
                lineToRelative(-39f, -39f)
                lineToRelative(-42f, 43f)
                lineToRelative(81f, 81f)
                close()
            }
        }.build()
        
        return _Flag_check!!
    }

private var _Flag_check: ImageVector? = null

