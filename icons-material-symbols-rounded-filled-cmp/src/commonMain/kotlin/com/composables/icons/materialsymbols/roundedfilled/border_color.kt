package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Border_color: ImageVector
    get() {
        if (_Border_color != null) return _Border_color!!
        
        _Border_color = ImageVector.Builder(
            name = "border_color",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 960f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 880f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 800f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 880f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 960f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -280f)
                verticalLineToRelative(-113f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(436f, -435f)
                quadToRelative(11f, -11f, 25.5f, -17f)
                reflectiveQuadToRelative(30.5f, -6f)
                quadToRelative(16f, 0f, 31f, 6f)
                reflectiveQuadToRelative(27f, 18f)
                lineToRelative(55f, 56f)
                quadToRelative(12f, 11f, 17.5f, 26f)
                reflectiveQuadToRelative(5.5f, 31f)
                quadToRelative(0f, 15f, -5.5f, 29.5f)
                reflectiveQuadTo(777f, 273f)
                lineTo(342f, 708f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 680f)
                close()
                moveToRelative(504f, -408f)
                lineToRelative(56f, -56f)
                lineToRelative(-56f, -56f)
                lineToRelative(-56f, 56f)
                lineToRelative(56f, 56f)
                close()
            }
        }.build()
        
        return _Border_color!!
    }

private var _Border_color: ImageVector? = null

