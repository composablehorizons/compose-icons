package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Quick_reference_all: ImageVector
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
                moveTo(200f, 160f)
                verticalLineToRelative(241f)
                verticalLineToRelative(-1f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                close()
                moveToRelative(80f, 400f)
                horizontalLineToRelative(140f)
                quadToRelative(9f, -23f, 22f, -43f)
                reflectiveQuadToRelative(30f, -37f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(127f)
                quadToRelative(-5f, -20f, -6.5f, -40f)
                reflectiveQuadToRelative(0.5f, -40f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(100f)
                quadToRelative(-19f, -8f, -39f, -12.5f)
                reflectiveQuadToRelative(-41f, -6.5f)
                verticalLineToRelative(-41f)
                horizontalLineTo(480f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(241f)
                quadToRelative(16f, 24f, 36f, 44.5f)
                reflectiveQuadTo(521f, 880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(540f, -120f)
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
                lineTo(756f, 812f)
                quadToRelative(-21f, 14f, -45.5f, 21f)
                reflectiveQuadToRelative(-50.5f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 26f, -7f, 50.5f)
                reflectiveQuadTo(812f, 756f)
                lineTo(920f, 864f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Quick_reference_all!!
    }

private var _Quick_reference_all: ImageVector? = null

