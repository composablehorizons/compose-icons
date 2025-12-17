package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Desktop_landscape_add: ImageVector
    get() {
        if (_Desktop_landscape_add != null) return _Desktop_landscape_add!!
        
        _Desktop_landscape_add = ImageVector.Builder(
            name = "desktop_landscape_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(200f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(580f, -320f)
                verticalLineToRelative(-100f)
                horizontalLineTo(360f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(60f, 400f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Desktop_landscape_add!!
    }

private var _Desktop_landscape_add: ImageVector? = null

