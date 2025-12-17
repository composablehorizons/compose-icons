package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Camera_enhance: ImageVector
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
                moveTo(4f, 21f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 19.825f, 2f, 19f)
                verticalLineTo(7f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(3.175f, 5f, 4f, 5f)
                horizontalLineToRelative(3.15f)
                lineTo(9f, 3f)
                horizontalLineToRelative(6f)
                lineToRelative(1.85f, 2f)
                horizontalLineTo(20f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(22f, 6.175f, 22f, 7f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 21f, 20f, 21f)
                close()
                moveToRelative(16f, -2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-4.05f)
                lineToRelative(-1.825f, -2f)
                horizontalLineToRelative(-4.25f)
                lineTo(8.05f, 7f)
                horizontalLineTo(4f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(-8f, -6f)
                close()
            }
        }.build()
        
        return _Camera_enhance!!
    }

private var _Camera_enhance: ImageVector? = null

