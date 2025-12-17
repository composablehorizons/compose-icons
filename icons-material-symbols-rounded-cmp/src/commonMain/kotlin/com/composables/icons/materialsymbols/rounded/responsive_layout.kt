package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Responsive_layout: ImageVector
    get() {
        if (_Responsive_layout != null) return _Responsive_layout!!
        
        _Responsive_layout = ImageVector.Builder(
            name = "responsive_layout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 120f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                close()
                moveToRelative(520f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-560f)
                horizontalLineTo(400f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 400f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(-240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-360f)
                horizontalLineTo(400f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(-200f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Responsive_layout!!
    }

private var _Responsive_layout: ImageVector? = null

