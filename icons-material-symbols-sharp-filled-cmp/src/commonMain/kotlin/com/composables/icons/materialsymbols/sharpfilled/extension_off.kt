package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Extension_off: ImageVector
    get() {
        if (_Extension_off != null) return _Extension_off!!
        
        _Extension_off = ImageVector.Builder(
            name = "extension_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-232f)
                quadToRelative(48f, 0f, 84f, -30.5f)
                reflectiveQuadToRelative(36f, -77.5f)
                quadToRelative(0f, -47f, -36f, -77.5f)
                reflectiveQuadTo(120f, 392f)
                verticalLineToRelative(-232f)
                lineToRelative(680f, 680f)
                horizontalLineTo(568f)
                quadToRelative(0f, -48f, -30.5f, -84f)
                reflectiveQuadTo(460f, 720f)
                quadToRelative(-47f, 0f, -77.5f, 36f)
                reflectiveQuadTo(352f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(680f, -154f)
                lineTo(274f, 160f)
                horizontalLineToRelative(86f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                verticalLineToRelative(86f)
                close()
                moveToRelative(-9f, 219f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Extension_off!!
    }

private var _Extension_off: ImageVector? = null

