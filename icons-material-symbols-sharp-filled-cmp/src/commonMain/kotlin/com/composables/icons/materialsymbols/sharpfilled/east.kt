package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.East: ImageVector
    get() {
        if (_East != null) return _East!!
        
        _East = ImageVector.Builder(
            name = "east",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 760f)
                lineToRelative(-57f, -56f)
                lineToRelative(184f, -184f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(647f)
                lineTo(544f, 256f)
                lineToRelative(56f, -56f)
                lineToRelative(280f, 280f)
                lineToRelative(-280f, 280f)
                close()
            }
        }.build()
        
        return _East!!
    }

private var _East: ImageVector? = null

