package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_quote: ImageVector
    get() {
        if (_Format_quote != null) return _Format_quote!!
        
        _Format_quote = ImageVector.Builder(
            name = "format_quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(262f, 660f)
                lineToRelative(58f, -100f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 23f, -5.5f, 42.5f)
                reflectiveQuadTo(458f, 480f)
                lineTo(331f, 700f)
                quadToRelative(-5f, 9f, -14f, 14.5f)
                reflectiveQuadToRelative(-20f, 5.5f)
                quadToRelative(-23f, 0f, -34.5f, -20f)
                reflectiveQuadToRelative(-0.5f, -40f)
                close()
                moveToRelative(360f, 0f)
                lineToRelative(58f, -100f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 23f, -5.5f, 42.5f)
                reflectiveQuadTo(818f, 480f)
                lineTo(691f, 700f)
                quadToRelative(-5f, 9f, -14f, 14.5f)
                reflectiveQuadToRelative(-20f, 5.5f)
                quadToRelative(-23f, 0f, -34.5f, -20f)
                reflectiveQuadToRelative(-0.5f, -40f)
                close()
            }
        }.build()
        
        return _Format_quote!!
    }

private var _Format_quote: ImageVector? = null

