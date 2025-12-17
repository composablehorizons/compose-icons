package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Select_window: ImageVector
    get() {
        if (_Select_window != null) return _Select_window!!
        
        _Select_window = ImageVector.Builder(
            name = "select_window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(520f)
                horizontalLineTo(720f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-280f)
                horizontalLineTo(160f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(560f, -280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Select_window!!
    }

private var _Select_window: ImageVector? = null

