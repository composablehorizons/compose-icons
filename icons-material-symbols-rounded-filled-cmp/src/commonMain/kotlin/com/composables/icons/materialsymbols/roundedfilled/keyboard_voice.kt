package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Keyboard_voice: ImageVector
    get() {
        if (_Keyboard_voice != null) return _Keyboard_voice!!
        
        _Keyboard_voice = ImageVector.Builder(
            name = "keyboard_voice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 14f)
                quadToRelative(-1.25f, 0f, -2.125f, -0.875f)
                reflectiveQuadTo(9f, 11f)
                verticalLineTo(5f)
                quadToRelative(0f, -1.25f, 0.875f, -2.125f)
                reflectiveQuadTo(12f, 2f)
                quadToRelative(1.25f, 0f, 2.125f, 0.875f)
                reflectiveQuadTo(15f, 5f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 1.25f, -0.875f, 2.125f)
                reflectiveQuadTo(12f, 14f)
                close()
                moveToRelative(0f, 7f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(11f, 20.425f, 11f, 20f)
                verticalLineToRelative(-2.1f)
                quadToRelative(-2.325f, -0.3f, -3.95f, -1.925f)
                reflectiveQuadToRelative(-1.975f, -3.9f)
                quadToRelative(-0.075f, -0.425f, 0.225f, -0.75f)
                reflectiveQuadTo(6.1f, 11f)
                quadToRelative(0.35f, 0f, 0.625f, 0.262f)
                quadToRelative(0.275f, 0.263f, 0.35f, 0.638f)
                quadToRelative(0.325f, 1.75f, 1.7f, 2.925f)
                quadTo(10.15f, 16f, 12f, 16f)
                reflectiveQuadToRelative(3.225f, -1.175f)
                quadToRelative(1.375f, -1.175f, 1.7f, -2.925f)
                quadToRelative(0.075f, -0.375f, 0.363f, -0.638f)
                quadToRelative(0.287f, -0.262f, 0.637f, -0.262f)
                quadToRelative(0.475f, 0f, 0.775f, 0.325f)
                quadToRelative(0.3f, 0.325f, 0.225f, 0.75f)
                quadToRelative(-0.35f, 2.275f, -1.975f, 3.9f)
                reflectiveQuadTo(13f, 17.9f)
                verticalLineTo(20f)
                quadToRelative(0f, 0.425f, -0.287f, 0.712f)
                quadTo(12.425f, 21f, 12f, 21f)
                close()
            }
        }.build()
        
        return _Keyboard_voice!!
    }

private var _Keyboard_voice: ImageVector? = null

