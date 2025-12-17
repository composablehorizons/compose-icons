package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Desktop_mac: ImageVector
    get() {
        if (_Desktop_mac != null) return _Desktop_mac!!
        
        _Desktop_mac = ImageVector.Builder(
            name = "desktop_mac",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-40f)
                lineToRelative(80f, -80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(600f)
                horizontalLineTo(560f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(40f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Desktop_mac!!
    }

private var _Desktop_mac: ImageVector? = null

