package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Subdirectory_arrow_right: ImageVector
    get() {
        if (_Subdirectory_arrow_right != null) return _Subdirectory_arrow_right!!
        
        _Subdirectory_arrow_right = ImageVector.Builder(
            name = "subdirectory_arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 840f)
                lineToRelative(-57f, -57f)
                lineToRelative(144f, -143f)
                horizontalLineTo(200f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(367f)
                lineTo(503f, 416f)
                lineToRelative(56f, -57f)
                lineToRelative(241f, 241f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Subdirectory_arrow_right!!
    }

private var _Subdirectory_arrow_right: ImageVector? = null

