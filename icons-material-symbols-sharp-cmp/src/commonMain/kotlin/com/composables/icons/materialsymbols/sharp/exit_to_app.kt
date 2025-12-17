package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Exit_to_app: ImageVector
    get() {
        if (_Exit_to_app != null) return _Exit_to_app!!
        
        _Exit_to_app = ImageVector.Builder(
            name = "exit_to_app",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(300f, -160f)
                lineToRelative(-56f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(346f)
                lineTo(364f, 338f)
                lineToRelative(56f, -58f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Exit_to_app!!
    }

private var _Exit_to_app: ImageVector? = null

