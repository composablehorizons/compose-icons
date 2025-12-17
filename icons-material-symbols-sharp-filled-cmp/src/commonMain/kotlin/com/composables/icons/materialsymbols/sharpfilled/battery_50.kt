package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_50: ImageVector
    get() {
        if (_Battery_50 != null) return _Battery_50!!
        
        _Battery_50 = ImageVector.Builder(
            name = "battery_50",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 22f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(18f)
                close()
            }
        }.build()
        
        return _Battery_50!!
    }

private var _Battery_50: ImageVector? = null

