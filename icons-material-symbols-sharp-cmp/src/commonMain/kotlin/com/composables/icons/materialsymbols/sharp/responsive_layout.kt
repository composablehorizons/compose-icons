package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Responsive_layout: ImageVector
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
                moveTo(120f, 840f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(520f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-560f)
                horizontalLineTo(400f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(440f)
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
                moveToRelative(440f, -440f)
                verticalLineToRelative(80f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(-320f, 80f)
                close()
                moveToRelative(240f, 0f)
                close()
                moveToRelative(80f, -80f)
                close()
            }
        }.build()
        
        return _Responsive_layout!!
    }

private var _Responsive_layout: ImageVector? = null

