package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Coffee: ImageVector
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
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 120f)
                horizontalLineToRelative(500f)
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
                moveToRelative(480f, 0f)
                horizontalLineToRelative(20f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(800f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(740f, 200f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(120f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 760f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Coffee!!
    }

private var _Coffee: ImageVector? = null

