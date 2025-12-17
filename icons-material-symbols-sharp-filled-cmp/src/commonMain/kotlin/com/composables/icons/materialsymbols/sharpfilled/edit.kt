package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Edit: ImageVector
    get() {
        if (_Edit != null) return _Edit!!
        
        _Edit = ImageVector.Builder(
            name = "edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-170f)
                lineToRelative(585f, -583f)
                lineToRelative(167f, 171f)
                lineToRelative(-582f, 582f)
                horizontalLineTo(120f)
                close()
                moveToRelative(584f, -528f)
                lineToRelative(56f, -56f)
                lineToRelative(-56f, -56f)
                lineToRelative(-56f, 56f)
                lineToRelative(56f, 56f)
                close()
            }
        }.build()
        
        return _Edit!!
    }

private var _Edit: ImageVector? = null

