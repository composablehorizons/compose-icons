package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Emergency: ImageVector
    get() {
        if (_Emergency != null) return _Emergency!!
        
        _Emergency = ImageVector.Builder(
            name = "emergency",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(410f, 840f)
                verticalLineToRelative(-238f)
                lineTo(204f, 721f)
                lineToRelative(-70f, -121f)
                lineToRelative(206f, -120f)
                lineToRelative(-206f, -119f)
                lineToRelative(70f, -121f)
                lineToRelative(206f, 119f)
                verticalLineToRelative(-239f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(239f)
                lineToRelative(206f, -119f)
                lineToRelative(70f, 121f)
                lineToRelative(-206f, 119f)
                lineToRelative(206f, 120f)
                lineToRelative(-70f, 121f)
                lineToRelative(-206f, -119f)
                verticalLineToRelative(238f)
                horizontalLineTo(410f)
                close()
            }
        }.build()
        
        return _Emergency!!
    }

private var _Emergency: ImageVector? = null

