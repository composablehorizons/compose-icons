package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Quick_reference_all: ImageVector
    get() {
        if (_Quick_reference_all != null) return _Quick_reference_all!!
        
        _Quick_reference_all = ImageVector.Builder(
            name = "quick_reference_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 760f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(864f, 920f)
                lineTo(756f, 813f)
                quadToRelative(-21f, 13f, -45.5f, 20f)
                reflectiveQuadToRelative(-50.5f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 27f, -7.5f, 51.5f)
                reflectiveQuadTo(812f, 757f)
                lineTo(920f, 864f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(100f)
                quadToRelative(-24f, -10f, -49f, -15f)
                reflectiveQuadToRelative(-51f, -5f)
                quadToRelative(-56f, 0f, -104.5f, 21f)
                reflectiveQuadTo(472f, 480f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(140f)
                quadToRelative(-8f, 19f, -12.5f, 39f)
                reflectiveQuadToRelative(-6.5f, 41f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(127f)
                quadToRelative(11f, 50f, 40f, 91.5f)
                reflectiveQuadTo(521f, 880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -520f)
                horizontalLineToRelative(200f)
                lineTo(480f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, -200f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Quick_reference_all!!
    }

private var _Quick_reference_all: ImageVector? = null

