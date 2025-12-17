package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Smart_button: ImageVector
    get() {
        if (_Smart_button != null) return _Smart_button!!
        
        _Smart_button = ImageVector.Builder(
            name = "smart_button",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 17f)
                verticalLineTo(7f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(12.5f, 2f)
                lineToRelative(-1.1f, -2.4f)
                lineToRelative(-2.4f, -1.1f)
                lineToRelative(2.4f, -1.1f)
                lineToRelative(1.1f, -2.4f)
                lineToRelative(1.1f, 2.4f)
                lineToRelative(2.4f, 1.1f)
                lineToRelative(-2.4f, 1.1f)
                close()
                moveToRelative(2.5f, -5f)
                lineToRelative(-0.625f, -1.375f)
                lineTo(15f, 12f)
                lineToRelative(1.375f, -0.625f)
                lineTo(17f, 10f)
                lineToRelative(0.625f, 1.375f)
                lineTo(19f, 12f)
                lineToRelative(-1.375f, 0.625f)
                close()
            }
        }.build()
        
        return _Smart_button!!
    }

private var _Smart_button: ImageVector? = null

