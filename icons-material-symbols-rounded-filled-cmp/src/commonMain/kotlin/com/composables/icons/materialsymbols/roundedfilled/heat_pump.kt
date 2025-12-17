package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Heat_pump: ImageVector
    get() {
        if (_Heat_pump != null) return _Heat_pump!!
        
        _Heat_pump = ImageVector.Builder(
            name = "heat_pump",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(450f, 678f)
                verticalLineToRelative(-126f)
                lineToRelative(-89f, 89f)
                quadToRelative(20f, 14f, 42.5f, 23f)
                reflectiveQuadToRelative(46.5f, 14f)
                close()
                moveToRelative(60f, -1f)
                quadToRelative(24f, -4f, 46.5f, -13f)
                reflectiveQuadToRelative(42.5f, -23f)
                lineToRelative(-89f, -89f)
                verticalLineToRelative(125f)
                close()
                moveToRelative(131f, -78f)
                quadToRelative(14f, -20f, 22.5f, -42.5f)
                reflectiveQuadTo(677f, 510f)
                horizontalLineTo(552f)
                lineToRelative(89f, 89f)
                close()
                moveToRelative(-89f, -149f)
                horizontalLineToRelative(125f)
                quadToRelative(-5f, -23f, -13.5f, -45.5f)
                reflectiveQuadTo(641f, 362f)
                lineToRelative(-89f, 88f)
                close()
                moveToRelative(-42f, -42f)
                lineToRelative(89f, -89f)
                quadToRelative(-20f, -14f, -42.5f, -23f)
                reflectiveQuadTo(510f, 282f)
                verticalLineToRelative(126f)
                close()
                moveToRelative(-30f, 112f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveToRelative(-30f, -112f)
                verticalLineToRelative(-125f)
                quadToRelative(-24f, 4f, -46.5f, 13f)
                reflectiveQuadTo(361f, 319f)
                lineToRelative(89f, 89f)
                close()
                moveToRelative(-167f, 42f)
                horizontalLineToRelative(125f)
                lineToRelative(-89f, -88f)
                quadToRelative(-14f, 20f, -23f, 42f)
                reflectiveQuadToRelative(-13f, 46f)
                close()
                moveToRelative(36f, 149f)
                lineToRelative(89f, -89f)
                horizontalLineTo(282f)
                quadToRelative(5f, 24f, 14f, 46.5f)
                reflectiveQuadToRelative(23f, 42.5f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Heat_pump!!
    }

private var _Heat_pump: ImageVector? = null

