package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Splitscreen_vertical_add: ImageVector
    get() {
        if (_Splitscreen_vertical_add != null) return _Splitscreen_vertical_add!!
        
        _Splitscreen_vertical_add = ImageVector.Builder(
            name = "splitscreen_vertical_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 200f)
                horizontalLineTo(599f)
                horizontalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                horizontalLineToRelative(160f)
                close()
                moveToRelative(-240f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(600f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-720f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(240f, -640f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-560f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineTo(200f)
                horizontalLineToRelative(160f)
                close()
                moveTo(760f, 920f)
                verticalLineToRelative(-80f)
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
                close()
            }
        }.build()
        
        return _Splitscreen_vertical_add!!
    }

private var _Splitscreen_vertical_add: ImageVector? = null

