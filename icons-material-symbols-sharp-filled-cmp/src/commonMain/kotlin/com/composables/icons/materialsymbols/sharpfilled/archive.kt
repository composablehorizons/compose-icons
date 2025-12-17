package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Archive: ImageVector
    get() {
        if (_Archive != null) return _Archive!!
        
        _Archive = ImageVector.Builder(
            name = "archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                lineToRelative(160f, -160f)
                lineToRelative(-56f, -56f)
                lineToRelative(-64f, 64f)
                verticalLineToRelative(-168f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(168f)
                lineToRelative(-64f, -64f)
                lineToRelative(-56f, 56f)
                lineToRelative(160f, 160f)
                close()
                moveTo(120f, 840f)
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
            }
        }.build()
        
        return _Archive!!
    }

private var _Archive: ImageVector? = null

