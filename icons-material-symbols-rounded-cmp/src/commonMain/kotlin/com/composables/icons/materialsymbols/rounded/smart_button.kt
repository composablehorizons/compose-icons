package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Smart_button: ImageVector
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
                moveTo(4f, 17f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 15.825f, 2f, 15f)
                verticalLineTo(9f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(3.175f, 7f, 4f, 7f)
                horizontalLineToRelative(16f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(22f, 8.175f, 22f, 9f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 17f, 20f, 17f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(10.075f, 1.1f)
                lineToRelative(-0.675f, -1.5f)
                lineToRelative(-1.5f, -0.675f)
                quadToRelative(-0.325f, -0.15f, -0.325f, -0.425f)
                reflectiveQuadToRelative(0.325f, -0.425f)
                lineToRelative(1.5f, -0.675f)
                lineToRelative(0.675f, -1.5f)
                quadToRelative(0.15f, -0.325f, 0.425f, -0.325f)
                reflectiveQuadToRelative(0.425f, 0.325f)
                lineToRelative(0.675f, 1.5f)
                lineToRelative(1.5f, 0.675f)
                quadToRelative(0.3f, 0.125f, 0.3f, 0.425f)
                reflectiveQuadToRelative(-0.3f, 0.425f)
                lineToRelative(-1.5f, 0.675f)
                lineToRelative(-0.675f, 1.5f)
                quadToRelative(-0.125f, 0.3f, -0.425f, 0.3f)
                reflectiveQuadToRelative(-0.425f, -0.3f)
                close()
                moveToRelative(2.625f, -4.775f)
                lineToRelative(-0.325f, -0.7f)
                lineToRelative(-0.7f, -0.325f)
                quadToRelative(-0.275f, -0.125f, -0.275f, -0.3f)
                reflectiveQuadToRelative(0.275f, -0.3f)
                lineToRelative(0.7f, -0.325f)
                lineToRelative(0.325f, -0.7f)
                quadToRelative(0.125f, -0.275f, 0.3f, -0.275f)
                reflectiveQuadToRelative(0.3f, 0.275f)
                lineToRelative(0.325f, 0.7f)
                lineToRelative(0.7f, 0.325f)
                quadToRelative(0.275f, 0.125f, 0.275f, 0.3f)
                reflectiveQuadToRelative(-0.275f, 0.3f)
                lineToRelative(-0.7f, 0.325f)
                lineToRelative(-0.325f, 0.7f)
                quadToRelative(-0.125f, 0.275f, -0.3f, 0.275f)
                reflectiveQuadToRelative(-0.3f, -0.275f)
                close()
            }
        }.build()
        
        return _Smart_button!!
    }

private var _Smart_button: ImageVector? = null

