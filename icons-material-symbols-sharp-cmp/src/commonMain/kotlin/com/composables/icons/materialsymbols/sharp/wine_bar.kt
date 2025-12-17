package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wine_bar: ImageVector
    get() {
        if (_Wine_bar != null) return _Wine_bar!!
        
        _Wine_bar = ImageVector.Builder(
            name = "wine_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-164f)
                quadToRelative(-86f, -14f, -143f, -80f)
                reflectiveQuadToRelative(-57f, -156f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 90f, -57f, 156f)
                reflectiveQuadToRelative(-143f, 80f)
                verticalLineToRelative(164f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(160f, -320f)
                quadToRelative(56f, 0f, 98f, -34f)
                reflectiveQuadToRelative(56f, -86f)
                horizontalLineTo(326f)
                quadToRelative(14f, 52f, 56f, 86f)
                reflectiveQuadToRelative(98f, 34f)
                close()
                moveTo(320f, 320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(160f, 200f)
                close()
            }
        }.build()
        
        return _Wine_bar!!
    }

private var _Wine_bar: ImageVector? = null

