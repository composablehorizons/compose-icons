package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tablet_android: ImageVector
    get() {
        if (_Tablet_android != null) return _Tablet_android!!
        
        _Tablet_android = ImageVector.Builder(
            name = "tablet_android",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                close()
                moveToRelative(200f, 80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                verticalLineToRelative(40f)
                close()
                moveTo(200f, 640f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, -480f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 560f)
                verticalLineToRelative(120f)
                verticalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _Tablet_android!!
    }

private var _Tablet_android: ImageVector? = null

