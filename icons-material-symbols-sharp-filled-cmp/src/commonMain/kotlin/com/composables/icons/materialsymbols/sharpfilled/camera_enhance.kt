package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Camera_enhance: ImageVector
    get() {
        if (_Camera_enhance != null) return _Camera_enhance!!
        
        _Camera_enhance = ImageVector.Builder(
            name = "camera_enhance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 17.5f)
                quadToRelative(1.875f, 0f, 3.188f, -1.312f)
                quadTo(16.5f, 14.875f, 16.5f, 13f)
                quadToRelative(0f, -1.875f, -1.312f, -3.188f)
                quadTo(13.875f, 8.5f, 12f, 8.5f)
                quadToRelative(-1.875f, 0f, -3.188f, 1.312f)
                quadTo(7.5f, 11.125f, 7.5f, 13f)
                quadToRelative(0f, 1.875f, 1.312f, 3.188f)
                quadTo(10.125f, 17.5f, 12f, 17.5f)
                close()
                moveToRelative(0f, -1f)
                lineToRelative(-1.1f, -2.4f)
                lineTo(8.5f, 13f)
                lineToRelative(2.4f, -1.1f)
                lineTo(12f, 9.5f)
                lineToRelative(1.1f, 2.4f)
                lineToRelative(2.4f, 1.1f)
                lineToRelative(-2.4f, 1.1f)
                close()
                moveTo(2f, 21f)
                verticalLineTo(5f)
                horizontalLineToRelative(5.15f)
                lineTo(9f, 3f)
                horizontalLineToRelative(6f)
                lineToRelative(1.85f, 2f)
                horizontalLineTo(22f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Camera_enhance!!
    }

private var _Camera_enhance: ImageVector? = null

