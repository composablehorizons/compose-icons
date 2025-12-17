package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pageless: ImageVector
    get() {
        if (_Pageless != null) return _Pageless!!
        
        _Pageless = ImageVector.Builder(
            name = "pageless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(520f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineTo(560f)
                close()
                moveTo(40f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(40f)
                close()
                moveToRelative(800f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Pageless!!
    }

private var _Pageless: ImageVector? = null

