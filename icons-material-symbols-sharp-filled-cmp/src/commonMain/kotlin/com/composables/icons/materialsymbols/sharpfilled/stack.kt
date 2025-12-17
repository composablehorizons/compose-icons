package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stack: ImageVector
    get() {
        if (_Stack != null) return _Stack!!
        
        _Stack = ImageVector.Builder(
            name = "stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(80f, 320f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(560f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Stack!!
    }

private var _Stack: ImageVector? = null

