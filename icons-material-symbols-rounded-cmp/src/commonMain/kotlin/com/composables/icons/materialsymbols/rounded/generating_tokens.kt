package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Generating_tokens: ImageVector
    get() {
        if (_Generating_tokens != null) return _Generating_tokens!!
        
        _Generating_tokens = ImageVector.Builder(
            name = "generating_tokens",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 20f)
                quadToRelative(-3.35f, 0f, -5.675f, -2.325f)
                quadTo(1f, 15.35f, 1f, 12f)
                quadToRelative(0f, -3.35f, 2.325f, -5.675f)
                quadTo(5.65f, 4f, 9f, 4f)
                quadToRelative(3.35f, 0f, 5.675f, 2.325f)
                quadTo(17f, 8.65f, 17f, 12f)
                quadToRelative(0f, 3.35f, -2.325f, 5.675f)
                quadTo(12.35f, 20f, 9f, 20f)
                close()
                moveToRelative(0f, -2f)
                quadToRelative(2.5f, 0f, 4.25f, -1.75f)
                reflectiveQuadTo(15f, 12f)
                quadToRelative(0f, -2.5f, -1.75f, -4.25f)
                reflectiveQuadTo(9f, 6f)
                quadTo(6.5f, 6f, 4.75f, 7.75f)
                reflectiveQuadTo(3f, 12f)
                quadToRelative(0f, 2.5f, 1.75f, 4.25f)
                reflectiveQuadTo(9f, 18f)
                close()
                moveToRelative(0f, -2.5f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadToRelative(0.287f, -0.287f, 0.287f, -0.712f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.25f)
                quadToRelative(0.325f, 0f, 0.538f, -0.213f)
                quadToRelative(0.212f, -0.212f, 0.212f, -0.537f)
                quadToRelative(0f, -0.325f, -0.212f, -0.538f)
                quadTo(11.575f, 9f, 11.25f, 9f)
                horizontalLineToRelative(-4.5f)
                quadToRelative(-0.325f, 0f, -0.537f, 0.212f)
                quadTo(6f, 9.425f, 6f, 9.75f)
                quadToRelative(0f, 0.325f, 0.213f, 0.537f)
                quadToRelative(0.212f, 0.213f, 0.537f, 0.213f)
                horizontalLineTo(8f)
                verticalLineToRelative(4f)
                quadToRelative(0f, 0.425f, 0.288f, 0.712f)
                quadToRelative(0.287f, 0.288f, 0.712f, 0.288f)
                close()
                moveTo(18.55f, 8f)
                lineToRelative(-0.8f, -1.75f)
                lineToRelative(-1.75f, -0.8f)
                quadToRelative(-0.275f, -0.125f, -0.275f, -0.45f)
                reflectiveQuadTo(16f, 4.55f)
                lineToRelative(1.75f, -0.8f)
                lineToRelative(0.8f, -1.75f)
                quadToRelative(0.125f, -0.275f, 0.45f, -0.275f)
                reflectiveQuadToRelative(0.45f, 0.275f)
                lineToRelative(0.8f, 1.75f)
                lineToRelative(1.75f, 0.8f)
                quadToRelative(0.275f, 0.125f, 0.275f, 0.45f)
                reflectiveQuadTo(22f, 5.45f)
                lineToRelative(-1.75f, 0.8f)
                lineToRelative(-0.8f, 1.75f)
                quadToRelative(-0.125f, 0.275f, -0.45f, 0.275f)
                reflectiveQuadTo(18.55f, 8f)
                close()
                moveToRelative(0f, 14f)
                lineToRelative(-0.8f, -1.75f)
                lineToRelative(-1.75f, -0.8f)
                quadToRelative(-0.275f, -0.125f, -0.275f, -0.45f)
                reflectiveQuadToRelative(0.275f, -0.45f)
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
                reflectiveQuadTo(18.55f, 22f)
                close()
                moveTo(9f, 12f)
                close()
            }
        }.build()
        
        return _Generating_tokens!!
    }

private var _Generating_tokens: ImageVector? = null

