package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Money: ImageVector
    get() {
        if (_Money != null) return _Money!!
        
        _Money = ImageVector.Builder(
            name = "money",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 640f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-320f)
                horizontalLineTo(560f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-320f, 80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-320f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-200f, 80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(320f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -560f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
                moveToRelative(0f, 480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Money!!
    }

private var _Money: ImageVector? = null

