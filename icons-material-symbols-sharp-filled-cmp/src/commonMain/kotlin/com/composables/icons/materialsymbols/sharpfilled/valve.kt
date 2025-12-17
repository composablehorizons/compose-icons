package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Valve: ImageVector
    get() {
        if (_Valve != null) return _Valve!!
        
        _Valve = ImageVector.Builder(
            name = "valve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 320f)
                verticalLineToRelative(-120f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Valve!!
    }

private var _Valve: ImageVector? = null

