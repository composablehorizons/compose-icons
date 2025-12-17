package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Equal: ImageVector
    get() {
        if (_Equal != null) return _Equal!!
        
        _Equal = ImageVector.Builder(
            name = "equal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 680f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(160f, 620f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(220f, 560f)
                horizontalLineToRelative(520f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(800f, 620f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(740f, 680f)
                horizontalLineTo(220f)
                close()
                moveToRelative(0f, -280f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(160f, 340f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(220f, 280f)
                horizontalLineToRelative(520f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(800f, 340f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(740f, 400f)
                horizontalLineTo(220f)
                close()
            }
        }.build()
        
        return _Equal!!
    }

private var _Equal: ImageVector? = null

