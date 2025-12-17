package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cleaning: ImageVector
    get() {
        if (_Cleaning != null) return _Cleaning!!
        
        _Cleaning = ImageVector.Builder(
            name = "cleaning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 240f)
                verticalLineToRelative(-40f)
                lineToRelative(-75f, 75f)
                quadToRelative(-1f, 1f, -16f, 5f)
                quadToRelative(-10f, 0f, -15.5f, -8.5f)
                reflectiveQuadTo(373f, 254f)
                lineToRelative(27f, -54f)
                verticalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 80f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 120f)
                verticalLineToRelative(31f)
                quadToRelative(0f, 5f, -1f, 8.5f)
                reflectiveQuadToRelative(-3f, 8.5f)
                lineToRelative(-36f, 72f)
                horizontalLineTo(480f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-197f)
                quadToRelative(0f, -10f, 2f, -19.5f)
                reflectiveQuadToRelative(7f, -18.5f)
                lineToRelative(128f, -242f)
                quadToRelative(11f, -20f, 29.5f, -31.5f)
                reflectiveQuadTo(528f, 280f)
                horizontalLineToRelative(72f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 320f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Cleaning!!
    }

private var _Cleaning: ImageVector? = null

