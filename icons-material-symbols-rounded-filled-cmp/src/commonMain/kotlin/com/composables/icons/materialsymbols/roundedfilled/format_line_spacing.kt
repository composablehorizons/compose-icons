package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_line_spacing: ImageVector
    get() {
        if (_Format_line_spacing != null) return _Format_line_spacing!!
        
        _Format_line_spacing = ImageVector.Builder(
            name = "format_line_spacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 314f)
                lineToRelative(-36f, 35f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(108f, 348f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(372f, 348f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(316f, 349f)
                lineToRelative(-36f, -35f)
                verticalLineToRelative(332f)
                lineToRelative(36f, -35f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(268f, 772f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(108f, 668f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(108f, 612f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(164f, 611f)
                lineToRelative(36f, 35f)
                verticalLineToRelative(-332f)
                close()
                moveToRelative(320f, 446f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 680f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 760f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, -240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 440f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, -240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 200f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 280f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Format_line_spacing!!
    }

private var _Format_line_spacing: ImageVector? = null

