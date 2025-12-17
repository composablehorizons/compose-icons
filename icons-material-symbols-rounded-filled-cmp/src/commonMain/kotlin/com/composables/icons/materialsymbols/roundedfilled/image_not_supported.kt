package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Image_not_supported: ImageVector
    get() {
        if (_Image_not_supported != null) return _Image_not_supported!!
        
        _Image_not_supported = ImageVector.Builder(
            name = "image_not_supported",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.775f, 22.6f)
                lineToRelative(-1.6f, -1.6f)
                horizontalLineTo(5f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadTo(3f, 19.825f, 3f, 19f)
                verticalLineTo(5.8f)
                lineTo(1.4f, 4.2f)
                quadToRelative(-0.275f, -0.275f, -0.275f, -0.7f)
                quadToRelative(0f, -0.425f, 0.275f, -0.7f)
                quadToRelative(0.275f, -0.275f, 0.7f, -0.275f)
                quadToRelative(0.425f, 0f, 0.7f, 0.275f)
                lineToRelative(18.4f, 18.4f)
                quadToRelative(0.3f, 0.3f, 0.288f, 0.7f)
                quadToRelative(-0.013f, 0.4f, -0.313f, 0.7f)
                quadToRelative(-0.3f, 0.275f, -0.7f, 0.287f)
                quadToRelative(-0.4f, 0.013f, -0.7f, -0.287f)
                close()
                moveTo(7f, 17f)
                horizontalLineToRelative(7.175f)
                lineToRelative(-2.325f, -2.325f)
                lineToRelative(-0.85f, 1.05f)
                lineToRelative(-1.6f, -2.175f)
                quadToRelative(-0.15f, -0.2f, -0.4f, -0.2f)
                reflectiveQuadToRelative(-0.4f, 0.2f)
                lineToRelative(-2f, 2.65f)
                quadToRelative(-0.2f, 0.25f, -0.05f, 0.525f)
                quadTo(6.7f, 17f, 7f, 17f)
                close()
                moveToRelative(14f, 1.175f)
                lineTo(5.825f, 3f)
                horizontalLineTo(19f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(21f, 4.175f, 21f, 5f)
                close()
            }
        }.build()
        
        return _Image_not_supported!!
    }

private var _Image_not_supported: ImageVector? = null

