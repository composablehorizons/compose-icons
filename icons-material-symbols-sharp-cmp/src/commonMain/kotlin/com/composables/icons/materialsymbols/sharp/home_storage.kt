package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Home_storage: ImageVector
    get() {
        if (_Home_storage != null) return _Home_storage!!
        
        _Home_storage = ImageVector.Builder(
            name = "home_storage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                lineToRelative(-80f, -480f)
                horizontalLineToRelative(720f)
                lineToRelative(-80f, 480f)
                horizontalLineTo(200f)
                close()
                moveToRelative(67f, -80f)
                horizontalLineToRelative(426f)
                lineToRelative(51f, -320f)
                horizontalLineTo(216f)
                lineToRelative(51f, 320f)
                close()
                moveToRelative(93f, -160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                close()
                moveTo(200f, 320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-13f, 560f)
                horizontalLineToRelative(426f)
                horizontalLineToRelative(-426f)
                close()
            }
        }.build()
        
        return _Home_storage!!
    }

private var _Home_storage: ImageVector? = null

