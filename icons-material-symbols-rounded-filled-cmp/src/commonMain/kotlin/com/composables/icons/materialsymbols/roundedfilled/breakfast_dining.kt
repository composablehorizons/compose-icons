package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Breakfast_dining: ImageVector
    get() {
        if (_Breakfast_dining != null) return _Breakfast_dining!!
        
        _Breakfast_dining = ImageVector.Builder(
            name = "breakfast_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-342f)
                quadToRelative(-37f, -22f, -58.5f, -58.5f)
                reflectiveQuadTo(80f, 280f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(480f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 43f, -21.5f, 79.5f)
                reflectiveQuadTo(800f, 418f)
                verticalLineToRelative(342f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                close()
                moveToRelative(212f, -172f)
                quadToRelative(12f, 11f, 28.5f, 11f)
                reflectiveQuadToRelative(27.5f, -11f)
                lineToRelative(120f, -120f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(628f, 492f)
                lineTo(508f, 372f)
                quadToRelative(-11f, -12f, -27.5f, -12f)
                reflectiveQuadTo(452f, 372f)
                lineTo(332f, 492f)
                quadToRelative(-11f, 11f, -11f, 27.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                lineToRelative(120f, 120f)
                close()
                moveToRelative(28f, -84f)
                lineToRelative(-64f, -64f)
                lineToRelative(64f, -64f)
                lineToRelative(64f, 64f)
                lineToRelative(-64f, 64f)
                close()
            }
        }.build()
        
        return _Breakfast_dining!!
    }

private var _Breakfast_dining: ImageVector? = null

