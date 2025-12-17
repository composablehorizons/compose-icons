package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Home_storage: ImageVector
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
                moveToRelative(160f, -240f)
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
            }
        }.build()
        
        return _Home_storage!!
    }

private var _Home_storage: ImageVector? = null

