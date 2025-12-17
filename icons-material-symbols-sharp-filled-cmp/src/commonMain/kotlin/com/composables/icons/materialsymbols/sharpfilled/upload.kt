package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Upload: ImageVector
    get() {
        if (_Upload != null) return _Upload!!
        
        _Upload = ImageVector.Builder(
            name = "upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 640f)
                verticalLineToRelative(-326f)
                lineTo(336f, 418f)
                lineToRelative(-56f, -58f)
                lineToRelative(200f, -200f)
                lineToRelative(200f, 200f)
                lineToRelative(-56f, 58f)
                lineToRelative(-104f, -104f)
                verticalLineToRelative(326f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Upload!!
    }

private var _Upload: ImageVector? = null

