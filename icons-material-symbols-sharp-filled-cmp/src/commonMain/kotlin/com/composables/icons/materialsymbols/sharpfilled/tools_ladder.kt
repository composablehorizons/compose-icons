package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tools_ladder: ImageVector
    get() {
        if (_Tools_ladder != null) return _Tools_ladder!!
        
        _Tools_ladder = ImageVector.Builder(
            name = "tools_ladder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(188f, 840f)
                lineToRelative(200f, -720f)
                horizontalLineToRelative(80f)
                lineToRelative(-34f, 120f)
                horizontalLineToRelative(225f)
                lineToRelative(33f, -120f)
                horizontalLineToRelative(80f)
                lineTo(572f, 840f)
                horizontalLineToRelative(-80f)
                lineToRelative(34f, -120f)
                horizontalLineTo(301f)
                lineToRelative(-33f, 120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(191f, -400f)
                horizontalLineToRelative(224f)
                lineToRelative(33f, -120f)
                horizontalLineTo(412f)
                lineToRelative(-33f, 120f)
                close()
                moveToRelative(-55f, 200f)
                horizontalLineToRelative(224f)
                lineToRelative(33f, -120f)
                horizontalLineTo(357f)
                lineToRelative(-33f, 120f)
                close()
            }
        }.build()
        
        return _Tools_ladder!!
    }

private var _Tools_ladder: ImageVector? = null

