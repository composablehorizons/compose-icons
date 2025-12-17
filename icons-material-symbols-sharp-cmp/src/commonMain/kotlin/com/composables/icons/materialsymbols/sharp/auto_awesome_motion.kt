package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Auto_awesome_motion: ImageVector
    get() {
        if (_Auto_awesome_motion != null) return _Auto_awesome_motion!!
        
        _Auto_awesome_motion = ImageVector.Builder(
            name = "auto_awesome_motion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(480f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-320f)
                horizontalLineTo(480f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(-240f, -80f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 560f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, 240f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Auto_awesome_motion!!
    }

private var _Auto_awesome_motion: ImageVector? = null

