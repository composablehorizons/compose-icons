package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Screen_rotation_up: ImageVector
    get() {
        if (_Screen_rotation_up != null) return _Screen_rotation_up!!
        
        _Screen_rotation_up = ImageVector.Builder(
            name = "screen_rotation_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(550f, 930f)
                lineToRelative(-56f, -57f)
                lineToRelative(73f, -73f)
                horizontalLineTo(240f)
                verticalLineToRelative(-487f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(327f)
                horizontalLineToRelative(247f)
                lineToRelative(-73f, -73f)
                lineToRelative(56f, -57f)
                lineToRelative(170f, 170f)
                lineTo(550f, 930f)
                close()
                moveToRelative(170f, -283f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-327f)
                horizontalLineTo(393f)
                lineToRelative(73f, 73f)
                lineToRelative(-56f, 57f)
                lineToRelative(-170f, -170f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineToRelative(-73f, 73f)
                horizontalLineToRelative(327f)
                verticalLineToRelative(487f)
                close()
            }
        }.build()
        
        return _Screen_rotation_up!!
    }

private var _Screen_rotation_up: ImageVector? = null

