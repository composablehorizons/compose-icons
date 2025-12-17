package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Quick_reference_all: ImageVector
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
                moveTo(892f, 892f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-80f, -80f)
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
                lineToRelative(80f, 80f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(18f)
                quadToRelative(0f, 18f, -14.5f, 29f)
                reflectiveQuadToRelative(-32.5f, 6f)
                quadToRelative(-13f, -3f, -26f, -4.5f)
                reflectiveQuadToRelative(-27f, -1.5f)
                quadToRelative(-56f, 0f, -104.5f, 21f)
                reflectiveQuadTo(472f, 480f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 560f)
                horizontalLineToRelative(100f)
                quadToRelative(-8f, 19f, -12.5f, 39f)
                reflectiveQuadToRelative(-6.5f, 41f)
                horizontalLineToRelative(-81f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 720f)
                horizontalLineToRelative(87f)
                quadToRelative(7f, 31f, 21f, 58.5f)
                reflectiveQuadToRelative(34f, 50.5f)
                quadToRelative(14f, 15f, 6.5f, 33f)
                reflectiveQuadTo(443f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -720f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 360f)
                horizontalLineToRelative(160f)
                lineTo(480f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, -200f)
                close()
            }
        }.build()
        
        return _Quick_reference_all!!
    }

private var _Quick_reference_all: ImageVector? = null

