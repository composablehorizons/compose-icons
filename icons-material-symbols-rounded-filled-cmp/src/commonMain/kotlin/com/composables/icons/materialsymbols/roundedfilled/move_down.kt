package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Move_down: ImageVector
    get() {
        if (_Move_down != null) return _Move_down!!
        
        _Move_down = ImageVector.Builder(
            name = "move_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 440f)
                quadToRelative(0f, 72f, 46f, 127f)
                reflectiveQuadToRelative(117f, 69f)
                lineToRelative(-31f, -31f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(103f, 103f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(308f, 812f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-29f, -12f)
                quadToRelative(-11f, -11f, -11f, -27f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(36f, -38f)
                quadToRelative(-106f, -12f, -176.5f, -91.5f)
                reflectiveQuadTo(40f, 440f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 240f)
                horizontalLineToRelative(-80f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(120f, 440f)
                close()
                moveToRelative(440f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 760f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 520f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(560f)
                close()
                moveToRelative(0f, -360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 400f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 160f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 440f)
                horizontalLineTo(560f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Move_down!!
    }

private var _Move_down: ImageVector? = null

