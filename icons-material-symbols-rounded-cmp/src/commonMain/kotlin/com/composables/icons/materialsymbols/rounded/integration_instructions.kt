package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Integration_instructions: ImageVector
    get() {
        if (_Integration_instructions != null) return _Integration_instructions!!
        
        _Integration_instructions = ImageVector.Builder(
            name = "integration_instructions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(354f, 480f)
                lineToRelative(58f, -58f)
                quadToRelative(12f, -12f, 11.5f, -28f)
                reflectiveQuadTo(412f, 366f)
                quadToRelative(-12f, -12f, -28.5f, -12.5f)
                reflectiveQuadTo(355f, 365f)
                lineToRelative(-87f, 87f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                lineToRelative(87f, 87f)
                quadToRelative(12f, 12f, 28.5f, 11.5f)
                reflectiveQuadTo(412f, 594f)
                quadToRelative(11f, -12f, 11.5f, -28f)
                reflectiveQuadTo(412f, 538f)
                lineToRelative(-58f, -58f)
                close()
                moveToRelative(252f, 0f)
                lineToRelative(-58f, 58f)
                quadToRelative(-12f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                quadToRelative(12f, 12f, 28.5f, 12.5f)
                reflectiveQuadTo(605f, 595f)
                lineToRelative(87f, -87f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineToRelative(-87f, -87f)
                quadToRelative(-12f, -12f, -28.5f, -11.5f)
                reflectiveQuadTo(548f, 366f)
                quadToRelative(-11f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                lineToRelative(58f, 58f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(168f)
                quadToRelative(13f, -36f, 43.5f, -58f)
                reflectiveQuadToRelative(68.5f, -22f)
                quadToRelative(38f, 0f, 68.5f, 22f)
                reflectiveQuadToRelative(43.5f, 58f)
                horizontalLineToRelative(168f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(280f, -590f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(510f, 140f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 110f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 140f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(480f, 170f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Integration_instructions!!
    }

private var _Integration_instructions: ImageVector? = null

