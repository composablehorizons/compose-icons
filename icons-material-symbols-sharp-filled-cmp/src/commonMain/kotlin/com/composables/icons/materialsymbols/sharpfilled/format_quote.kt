package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Format_quote: ImageVector
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
                moveTo(228f, 720f)
                lineToRelative(92f, -160f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 23f, -5.5f, 42.5f)
                reflectiveQuadTo(458f, 480f)
                lineTo(320f, 720f)
                horizontalLineToRelative(-92f)
                close()
                moveToRelative(360f, 0f)
                lineToRelative(92f, -160f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 23f, -5.5f, 42.5f)
                reflectiveQuadTo(818f, 480f)
                lineTo(680f, 720f)
                horizontalLineToRelative(-92f)
                close()
            }
        }.build()
        
        return _Format_quote!!
    }

private var _Format_quote: ImageVector? = null

