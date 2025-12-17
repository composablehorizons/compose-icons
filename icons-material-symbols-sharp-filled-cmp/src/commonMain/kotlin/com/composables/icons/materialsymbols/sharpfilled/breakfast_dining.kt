package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Breakfast_dining: ImageVector
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
                moveTo(160f, 840f)
                verticalLineToRelative(-422f)
                quadToRelative(-37f, -22f, -58.5f, -58.5f)
                reflectiveQuadTo(80f, 280f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(480f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 43f, -21.5f, 79.5f)
                reflectiveQuadTo(800f, 418f)
                verticalLineToRelative(422f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -144f)
                lineToRelative(176f, -176f)
                lineToRelative(-176f, -176f)
                lineToRelative(-176f, 176f)
                lineToRelative(176f, 176f)
                close()
                moveToRelative(0f, -112f)
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

