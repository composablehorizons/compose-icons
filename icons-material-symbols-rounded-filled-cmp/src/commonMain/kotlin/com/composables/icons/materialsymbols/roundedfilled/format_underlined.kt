package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_underlined: ImageVector
    get() {
        if (_Format_underlined != null) return _Format_underlined!!
        
        _Format_underlined = ImageVector.Builder(
            name = "format_underlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 760f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -160f)
                quadToRelative(-101f, 0f, -157f, -63f)
                reflectiveQuadToRelative(-56f, -167f)
                verticalLineToRelative(-279f)
                quadToRelative(0f, -21f, 15.5f, -36f)
                reflectiveQuadToRelative(36.5f, -15f)
                quadToRelative(21f, 0f, 36f, 15f)
                reflectiveQuadToRelative(15f, 36f)
                verticalLineToRelative(285f)
                quadToRelative(0f, 56f, 28f, 91f)
                reflectiveQuadToRelative(82f, 35f)
                quadToRelative(54f, 0f, 82f, -35f)
                reflectiveQuadToRelative(28f, -91f)
                verticalLineToRelative(-285f)
                quadToRelative(0f, -21f, 15.5f, -36f)
                reflectiveQuadToRelative(36.5f, -15f)
                quadToRelative(21f, 0f, 36f, 15f)
                reflectiveQuadToRelative(15f, 36f)
                verticalLineToRelative(279f)
                quadToRelative(0f, 104f, -56f, 167f)
                reflectiveQuadToRelative(-157f, 63f)
                close()
            }
        }.build()
        
        return _Format_underlined!!
    }

private var _Format_underlined: ImageVector? = null

