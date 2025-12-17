package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_arrow_down: ImageVector
    get() {
        if (_Mobile_arrow_down != null) return _Mobile_arrow_down!!
        
        _Mobile_arrow_down = ImageVector.Builder(
            name = "mobile_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                lineToRelative(160f, -160f)
                lineToRelative(-56f, -56f)
                lineToRelative(-64f, 62f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(166f)
                lineToRelative(-64f, -62f)
                lineToRelative(-56f, 56f)
                lineToRelative(160f, 160f)
                close()
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(204f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(484f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Mobile_arrow_down!!
    }

private var _Mobile_arrow_down: ImageVector? = null

