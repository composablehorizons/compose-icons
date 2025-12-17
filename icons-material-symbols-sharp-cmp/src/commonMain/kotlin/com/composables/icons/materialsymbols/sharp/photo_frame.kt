package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Photo_frame: ImageVector
    get() {
        if (_Photo_frame != null) return _Photo_frame!!
        
        _Photo_frame = ImageVector.Builder(
            name = "photo_frame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(40f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(600f)
                horizontalLineTo(760f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(-80f, -160f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-440f)
                horizontalLineTo(120f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                lineTo(580f, 360f)
                lineTo(440f, 540f)
                lineTo(340f, 420f)
                lineTo(200f, 600f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Photo_frame!!
    }

private var _Photo_frame: ImageVector? = null

