package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Error_circle_rounded: ImageVector
    get() {
        if (_Error_circle_rounded != null) return _Error_circle_rounded!!
        
        _Error_circle_rounded = ImageVector.Builder(
            name = "error_circle_rounded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 13f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(13f, 12.425f, 13f, 12f)
                verticalLineTo(7.975f)
                quadToRelative(0f, -0.425f, -0.287f, -0.7f)
                quadTo(12.425f, 7f, 12f, 7f)
                reflectiveQuadToRelative(-0.712f, 0.287f)
                quadTo(11f, 7.575f, 11f, 8f)
                verticalLineToRelative(4.025f)
                quadToRelative(0f, 0.425f, 0.288f, 0.7f)
                quadToRelative(0.287f, 0.275f, 0.712f, 0.275f)
                close()
                moveToRelative(0f, 4f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(13f, 16.425f, 13f, 16f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(12.425f, 15f, 12f, 15f)
                reflectiveQuadToRelative(-0.712f, 0.287f)
                quadTo(11f, 15.575f, 11f, 16f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadTo(11.575f, 17f, 12f, 17f)
                close()
                moveToRelative(0f, 5f)
                quadToRelative(-2.075f, 0f, -3.9f, -0.788f)
                quadToRelative(-1.825f, -0.787f, -3.175f, -2.137f)
                quadToRelative(-1.35f, -1.35f, -2.137f, -3.175f)
                quadTo(2f, 14.075f, 2f, 12f)
                reflectiveQuadToRelative(0.788f, -3.9f)
                quadToRelative(0.787f, -1.825f, 2.137f, -3.175f)
                quadToRelative(1.35f, -1.35f, 3.175f, -2.138f)
                quadTo(9.925f, 2f, 12f, 2f)
                reflectiveQuadToRelative(3.9f, 0.787f)
                quadToRelative(1.825f, 0.788f, 3.175f, 2.138f)
                quadToRelative(1.35f, 1.35f, 2.137f, 3.175f)
                quadTo(22f, 9.925f, 22f, 12f)
                reflectiveQuadToRelative(-0.788f, 3.9f)
                quadToRelative(-0.787f, 1.825f, -2.137f, 3.175f)
                quadToRelative(-1.35f, 1.35f, -3.175f, 2.137f)
                quadTo(14.075f, 22f, 12f, 22f)
                close()
            }
        }.build()
        
        return _Error_circle_rounded!!
    }

private var _Error_circle_rounded: ImageVector? = null

