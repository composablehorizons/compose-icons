package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Live_tv: ImageVector
    get() {
        if (_Live_tv != null) return _Live_tv!!
        
        _Live_tv = ImageVector.Builder(
            name = "live_tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 620f)
                lineToRelative(280f, -180f)
                lineToRelative(-280f, -180f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(-60f, 220f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Live_tv!!
    }

private var _Live_tv: ImageVector? = null

