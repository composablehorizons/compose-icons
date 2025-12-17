package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Keyboard_voice: ImageVector
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
                moveToRelative(-1f, 7f)
                verticalLineToRelative(-3.075f)
                quadToRelative(-2.6f, -0.35f, -4.3f, -2.325f)
                quadTo(5f, 13.625f, 5f, 11f)
                horizontalLineToRelative(2f)
                quadToRelative(0f, 2.075f, 1.463f, 3.537f)
                quadTo(9.925f, 16f, 12f, 16f)
                reflectiveQuadToRelative(3.538f, -1.463f)
                quadTo(17f, 13.075f, 17f, 11f)
                horizontalLineToRelative(2f)
                quadToRelative(0f, 2.625f, -1.7f, 4.6f)
                quadToRelative(-1.7f, 1.975f, -4.3f, 2.325f)
                verticalLineTo(21f)
                close()
            }
        }.build()
        
        return _Keyboard_voice!!
    }

private var _Keyboard_voice: ImageVector? = null

