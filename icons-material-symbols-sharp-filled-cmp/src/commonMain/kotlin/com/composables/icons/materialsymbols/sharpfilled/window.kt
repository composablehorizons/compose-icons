package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Window: ImageVector
    get() {
        if (_Window != null) return _Window!!
        
        _Window = ImageVector.Builder(
            name = "window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 520f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                verticalLineToRelative(-320f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineTo(120f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Window!!
    }

private var _Window: ImageVector? = null

