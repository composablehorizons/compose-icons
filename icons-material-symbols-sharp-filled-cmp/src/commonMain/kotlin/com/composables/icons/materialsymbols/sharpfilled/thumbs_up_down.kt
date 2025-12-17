package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Thumbs_up_down: ImageVector
    get() {
        if (_Thumbs_up_down != null) return _Thumbs_up_down!!
        
        _Thumbs_up_down = ImageVector.Builder(
            name = "thumbs_up_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 560f)
                verticalLineToRelative(-344f)
                lineToRelative(216f, -216f)
                lineToRelative(49f, 49f)
                lineToRelative(-33f, 151f)
                horizontalLineToRelative(248f)
                verticalLineToRelative(103f)
                lineTo(371f, 560f)
                horizontalLineTo(0f)
                close()
                moveTo(744f, 960f)
                lineToRelative(-49f, -49f)
                lineToRelative(33f, -151f)
                horizontalLineTo(480f)
                verticalLineToRelative(-103f)
                lineToRelative(109f, -257f)
                horizontalLineToRelative(371f)
                verticalLineToRelative(344f)
                lineTo(744f, 960f)
                close()
            }
        }.build()
        
        return _Thumbs_up_down!!
    }

private var _Thumbs_up_down: ImageVector? = null

