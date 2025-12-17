package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Desktop_portrait: ImageVector
    get() {
        if (_Desktop_portrait != null) return _Desktop_portrait!!
        
        _Desktop_portrait = ImageVector.Builder(
            name = "desktop_portrait",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 720f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-360f)
                horizontalLineTo(440f)
                verticalLineToRelative(360f)
                close()
                moveTo(320f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-300f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-60f)
                horizontalLineTo(320f)
                verticalLineToRelative(360f)
                close()
                moveTo(800f, 880f)
                horizontalLineTo(160f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                close()
            }
        }.build()
        
        return _Desktop_portrait!!
    }

private var _Desktop_portrait: ImageVector? = null

