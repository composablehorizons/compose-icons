package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Camera_enhance: ImageVector
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
                moveToRelative(-1.1f, -5.6f)
                lineToRelative(0.65f, -1.4f)
                quadToRelative(0.125f, -0.3f, 0.45f, -0.3f)
                reflectiveQuadToRelative(0.45f, 0.3f)
                lineToRelative(0.65f, 1.4f)
                lineToRelative(1.4f, 0.65f)
                quadToRelative(0.3f, 0.125f, 0.3f, 0.45f)
                reflectiveQuadToRelative(-0.3f, 0.45f)
                lineToRelative(-1.4f, 0.65f)
                lineToRelative(-0.65f, 1.4f)
                quadToRelative(-0.125f, 0.3f, -0.45f, 0.3f)
                reflectiveQuadToRelative(-0.45f, -0.3f)
                lineToRelative(-0.65f, -1.4f)
                lineToRelative(-1.4f, -0.65f)
                quadToRelative(-0.3f, -0.125f, -0.3f, -0.45f)
                reflectiveQuadToRelative(0.3f, -0.45f)
                close()
                moveTo(4f, 21f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 19.825f, 2f, 19f)
                verticalLineTo(7f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(3.175f, 5f, 4f, 5f)
                horizontalLineToRelative(3.15f)
                lineTo(8.4f, 3.65f)
                quadToRelative(0.275f, -0.325f, 0.662f, -0.488f)
                quadTo(9.45f, 3f, 9.875f, 3f)
                horizontalLineToRelative(4.25f)
                quadToRelative(0.425f, 0f, 0.813f, 0.162f)
                quadToRelative(0.387f, 0.163f, 0.662f, 0.488f)
                lineTo(16.85f, 5f)
                horizontalLineTo(20f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(22f, 6.175f, 22f, 7f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 21f, 20f, 21f)
                close()
            }
        }.build()
        
        return _Camera_enhance!!
    }

private var _Camera_enhance: ImageVector? = null

