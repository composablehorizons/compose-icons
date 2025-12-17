package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Photo_filter: ImageVector
    get() {
        if (_Photo_filter != null) return _Photo_filter!!
        
        _Photo_filter = ImageVector.Builder(
            name = "photo_filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 21f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadTo(3f, 19.825f, 3f, 19f)
                verticalLineTo(5f)
                quadToRelative(0f, -0.825f, 0.587f, -1.413f)
                quadTo(4.175f, 3f, 5f, 3f)
                horizontalLineToRelative(8f)
                quadToRelative(0.425f, 0f, 0.713f, 0.287f)
                quadTo(14f, 3.575f, 14f, 4f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(13.425f, 5f, 13f, 5f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-8f)
                quadToRelative(0f, -0.425f, 0.288f, -0.713f)
                quadTo(19.575f, 10f, 20f, 10f)
                reflectiveQuadToRelative(0.712f, 0.287f)
                quadTo(21f, 10.575f, 21f, 11f)
                verticalLineToRelative(8f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(19.825f, 21f, 19f, 21f)
                close()
                moveToRelative(5.75f, -7.75f)
                lineTo(9f, 12.45f)
                quadToRelative(-0.275f, -0.125f, -0.275f, -0.45f)
                reflectiveQuadTo(9f, 11.55f)
                lineToRelative(1.75f, -0.8f)
                lineToRelative(0.8f, -1.75f)
                quadToRelative(0.125f, -0.275f, 0.45f, -0.275f)
                reflectiveQuadToRelative(0.45f, 0.275f)
                lineToRelative(0.8f, 1.75f)
                lineToRelative(1.75f, 0.8f)
                quadToRelative(0.275f, 0.125f, 0.275f, 0.45f)
                reflectiveQuadToRelative(-0.275f, 0.45f)
                lineToRelative(-1.75f, 0.8f)
                lineToRelative(-0.8f, 1.75f)
                quadToRelative(-0.125f, 0.275f, -0.45f, 0.275f)
                reflectiveQuadTo(11.55f, 15f)
                close()
                moveToRelative(5.3f, -5.3f)
                lineToRelative(-1.325f, -0.6f)
                quadToRelative(-0.2f, -0.1f, -0.2f, -0.35f)
                quadToRelative(0f, -0.25f, 0.2f, -0.35f)
                lineToRelative(1.325f, -0.6f)
                lineToRelative(0.6f, -1.325f)
                quadToRelative(0.1f, -0.2f, 0.35f, -0.2f)
                quadToRelative(0.25f, 0f, 0.35f, 0.2f)
                lineToRelative(0.6f, 1.325f)
                lineToRelative(1.325f, 0.6f)
                quadToRelative(0.2f, 0.1f, 0.2f, 0.35f)
                quadToRelative(0f, 0.25f, -0.2f, 0.35f)
                lineToRelative(-1.325f, 0.6f)
                lineToRelative(-0.6f, 1.325f)
                quadToRelative(-0.1f, 0.2f, -0.35f, 0.2f)
                quadToRelative(-0.25f, 0f, -0.35f, -0.2f)
                close()
            }
        }.build()
        
        return _Photo_filter!!
    }

private var _Photo_filter: ImageVector? = null

