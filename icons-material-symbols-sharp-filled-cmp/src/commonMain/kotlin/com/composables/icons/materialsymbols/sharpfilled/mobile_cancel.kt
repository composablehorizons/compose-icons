package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_cancel: ImageVector
    get() {
        if (_Mobile_cancel != null) return _Mobile_cancel!!
        
        _Mobile_cancel = ImageVector.Builder(
            name = "mobile_cancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(386f, 630f)
                lineToRelative(94f, -93f)
                lineToRelative(93f, 93f)
                lineToRelative(57f, -56f)
                lineToRelative(-94f, -94f)
                lineToRelative(94f, -93f)
                lineToRelative(-57f, -57f)
                lineToRelative(-93f, 94f)
                lineToRelative(-94f, -94f)
                lineToRelative(-56f, 57f)
                lineToRelative(93f, 93f)
                lineToRelative(-93f, 94f)
                lineToRelative(56f, 56f)
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
        
        return _Mobile_cancel!!
    }

private var _Mobile_cancel: ImageVector? = null

