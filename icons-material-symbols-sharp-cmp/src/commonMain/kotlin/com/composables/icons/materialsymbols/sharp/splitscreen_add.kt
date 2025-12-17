package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Splitscreen_add: ImageVector
    get() {
        if (_Splitscreen_add != null) return _Splitscreen_add!!
        
        _Splitscreen_add = ImageVector.Builder(
            name = "splitscreen_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-160f)
                verticalLineToRelative(4f)
                verticalLineToRelative(-4f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(560f, 480f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Splitscreen_add!!
    }

private var _Splitscreen_add: ImageVector? = null

