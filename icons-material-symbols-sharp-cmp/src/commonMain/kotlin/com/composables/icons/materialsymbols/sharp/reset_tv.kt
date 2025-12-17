package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Reset_tv: ImageVector
    get() {
        if (_Reset_tv != null) return _Reset_tv!!
        
        _Reset_tv = ImageVector.Builder(
            name = "reset_tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-200f)
                horizontalLineTo(512f)
                lineToRelative(74f, 74f)
                lineToRelative(-56f, 56f)
                lineToRelative(-170f, -170f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 56f)
                lineToRelative(-74f, 74f)
                horizontalLineToRelative(368f)
                verticalLineToRelative(360f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(200f, -400f)
                close()
            }
        }.build()
        
        return _Reset_tv!!
    }

private var _Reset_tv: ImageVector? = null

