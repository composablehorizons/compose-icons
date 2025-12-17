package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Box: ImageVector
    get() {
        if (_Box != null) return _Box!!
        
        _Box = ImageVector.Builder(
            name = "box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 320f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-440f)
                horizontalLineTo(640f)
                verticalLineToRelative(320f)
                lineToRelative(-160f, -80f)
                lineToRelative(-160f, 80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                close()
                moveToRelative(-80f, 520f)
                verticalLineToRelative(-608f)
                lineToRelative(92f, -112f)
                horizontalLineToRelative(536f)
                lineToRelative(92f, 112f)
                verticalLineToRelative(608f)
                horizontalLineTo(120f)
                close()
                moveToRelative(96f, -600f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
                moveToRelative(184f, 80f)
                verticalLineToRelative(190f)
                lineToRelative(80f, -40f)
                lineToRelative(80f, 40f)
                verticalLineToRelative(-190f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-200f, 0f)
                horizontalLineToRelative(560f)
                horizontalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Box!!
    }

private var _Box: ImageVector? = null

