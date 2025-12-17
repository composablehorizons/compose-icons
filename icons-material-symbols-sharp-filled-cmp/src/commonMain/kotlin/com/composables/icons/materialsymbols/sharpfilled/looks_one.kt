package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Looks_one: ImageVector
    get() {
        if (_Looks_one != null) return _Looks_one!!
        
        _Looks_one = ImageVector.Builder(
            name = "looks_one",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(360f, 160f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                close()
            }
        }.build()
        
        return _Looks_one!!
    }

private var _Looks_one: ImageVector? = null

