package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tabs: ImageVector
    get() {
        if (_Tabs != null) return _Tabs!!
        
        _Tabs = ImageVector.Builder(
            name = "tabs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-280f)
                horizontalLineTo(200f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(0f, -360f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(280f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-280f, 80f)
                verticalLineToRelative(-200f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Tabs!!
    }

private var _Tabs: ImageVector? = null

