package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.`60fps`: ImageVector
    get() {
        if (_60fps != null) return _60fps!!
        
        _60fps = ImageVector.Builder(
            name = "60fps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(120f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(360f)
                horizontalLineTo(80f)
                close()
                moveToRelative(120f, -120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-320f)
                horizontalLineTo(600f)
                verticalLineToRelative(320f)
                close()
                moveTo(480f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(560f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _60fps!!
    }

private var _60fps: ImageVector? = null

