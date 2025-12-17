package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Forward: ImageVector
    get() {
        if (_Forward != null) return _Forward!!
        
        _Forward = ImageVector.Builder(
            name = "forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(767f, 440f)
                lineTo(612f, 285f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -11f, 28.5f, -11f)
                reflectiveQuadToRelative(27.5f, 11f)
                lineToRelative(184f, 184f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(668f, 652f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(612f, 652f)
                quadToRelative(-12f, -12f, -12.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(156f, -156f)
                close()
                moveToRelative(-240f, 40f)
                horizontalLineTo(280f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(280f, 400f)
                horizontalLineToRelative(247f)
                lineTo(412f, 285f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -11f, 28.5f, -11f)
                reflectiveQuadToRelative(27.5f, 11f)
                lineToRelative(184f, 184f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(468f, 652f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(412f, 652f)
                quadToRelative(-12f, -12f, -12.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(116f, -116f)
                close()
            }
        }.build()
        
        return _Forward!!
    }

private var _Forward: ImageVector? = null

