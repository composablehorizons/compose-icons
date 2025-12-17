package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.`30fps`: ImageVector
    get() {
        if (_30fps != null) return _30fps!!
        
        _30fps = ImageVector.Builder(
            name = "30fps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(220f)
                lineToRelative(-60f, 60f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(220f)
                horizontalLineTo(80f)
                close()
                moveToRelative(520f, -120f)
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
        
        return _30fps!!
    }

private var _30fps: ImageVector? = null

