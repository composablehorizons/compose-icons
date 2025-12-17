package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_cool_down: ImageVector
    get() {
        if (_Arrow_cool_down != null) return _Arrow_cool_down!!
        
        _Arrow_cool_down = ImageVector.Builder(
            name = "arrow_cool_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 876f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -9f)
                lineTo(228f, 641f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -29f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(155f, 156f)
                verticalLineToRelative(-247f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 453f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 493f)
                verticalLineToRelative(247f)
                lineToRelative(156f, -156f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(508f, 864f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                close()
                moveToRelative(0f, -503f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 333f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 253f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 293f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 373f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 133f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 93f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 133f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 173f)
                close()
            }
        }.build()
        
        return _Arrow_cool_down!!
    }

private var _Arrow_cool_down: ImageVector? = null

