package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Auto_schedule: ImageVector
    get() {
        if (_Auto_schedule != null) return _Auto_schedule!!
        
        _Auto_schedule = ImageVector.Builder(
            name = "auto_schedule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 22f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadTo(3f, 20.825f, 3f, 20f)
                verticalLineTo(6f)
                quadToRelative(0f, -0.825f, 0.587f, -1.412f)
                quadTo(4.175f, 4f, 5f, 4f)
                horizontalLineToRelative(1f)
                verticalLineTo(3f)
                quadToRelative(0f, -0.425f, 0.287f, -0.713f)
                quadTo(6.575f, 2f, 7f, 2f)
                reflectiveQuadToRelative(0.713f, 0.287f)
                quadTo(8f, 2.575f, 8f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineTo(3f)
                quadToRelative(0f, -0.425f, 0.288f, -0.713f)
                quadTo(16.575f, 2f, 17f, 2f)
                reflectiveQuadToRelative(0.712f, 0.287f)
                quadTo(18f, 2.575f, 18f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(21f, 5.175f, 21f, 6f)
                verticalLineToRelative(14f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(19.825f, 22f, 19f, 22f)
                close()
                moveToRelative(0f, -2f)
                horizontalLineToRelative(14f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineToRelative(10f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(14f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                close()
                moveToRelative(0f, 0f)
                verticalLineTo(6f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(6.575f, 10.1f)
                lineToRelative(-0.825f, -1.85f)
                lineToRelative(-1.85f, -0.825f)
                quadTo(8.625f, 15.3f, 8.625f, 15f)
                reflectiveQuadToRelative(0.275f, -0.425f)
                lineToRelative(1.85f, -0.825f)
                lineToRelative(0.825f, -1.85f)
                quadToRelative(0.125f, -0.275f, 0.425f, -0.275f)
                reflectiveQuadToRelative(0.425f, 0.275f)
                lineToRelative(0.825f, 1.85f)
                lineToRelative(1.85f, 0.825f)
                quadToRelative(0.275f, 0.125f, 0.275f, 0.425f)
                reflectiveQuadToRelative(-0.275f, 0.425f)
                lineToRelative(-1.85f, 0.825f)
                lineToRelative(-0.825f, 1.85f)
                quadToRelative(-0.125f, 0.275f, -0.425f, 0.275f)
                reflectiveQuadToRelative(-0.425f, -0.275f)
                close()
            }
        }.build()
        
        return _Auto_schedule!!
    }

private var _Auto_schedule: ImageVector? = null

