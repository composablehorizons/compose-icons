package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Coffee: ImageVector
    get() {
        if (_Coffee != null) return _Coffee!!
        
        _Coffee = ImageVector.Builder(
            name = "coffee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 720f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(160f, 440f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(580f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(440f, 720f)
                close()
                moveTo(240f, 320f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(200f, 320f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(640f, 440f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(440f, 640f)
                close()
                moveToRelative(280f, -320f)
                horizontalLineToRelative(20f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(800f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(740f, 200f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(120f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, -440f)
                close()
            }
        }.build()
        
        return _Coffee!!
    }

private var _Coffee: ImageVector? = null

