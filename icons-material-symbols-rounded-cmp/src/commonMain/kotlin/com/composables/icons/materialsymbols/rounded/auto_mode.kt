package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Auto_mode: ImageVector
    get() {
        if (_Auto_mode != null) return _Auto_mode!!
        
        _Auto_mode = ImageVector.Builder(
            name = "auto_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 23f)
                quadToRelative(-2.8f, 0f, -5.15f, -1.275f)
                quadTo(4.5f, 20.45f, 3f, 18.3f)
                verticalLineTo(20f)
                quadToRelative(0f, 0.425f, -0.287f, 0.712f)
                quadTo(2.425f, 21f, 2f, 21f)
                reflectiveQuadToRelative(-0.712f, -0.288f)
                quadTo(1f, 20.425f, 1f, 20f)
                verticalLineToRelative(-4f)
                quadToRelative(0f, -0.425f, 0.288f, -0.713f)
                quadTo(1.575f, 15f, 2f, 15f)
                horizontalLineToRelative(4f)
                quadToRelative(0.425f, 0f, 0.713f, 0.287f)
                quadTo(7f, 15.575f, 7f, 16f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(6.425f, 17f, 6f, 17f)
                horizontalLineTo(4.55f)
                quadToRelative(1.2f, 1.8f, 3.15f, 2.9f)
                quadTo(9.65f, 21f, 12f, 21f)
                quadToRelative(2.75f, 0f, 4.938f, -1.462f)
                quadToRelative(2.187f, -1.463f, 3.262f, -3.813f)
                quadToRelative(0.15f, -0.325f, 0.45f, -0.475f)
                quadToRelative(0.3f, -0.15f, 0.65f, -0.075f)
                quadToRelative(0.45f, 0.125f, 0.675f, 0.55f)
                quadToRelative(0.225f, 0.425f, 0.025f, 0.85f)
                quadToRelative(-1.3f, 2.875f, -3.975f, 4.65f)
                quadTo(15.35f, 23f, 12f, 23f)
                close()
                moveTo(1.975f, 10.975f)
                quadToRelative(-0.375f, -0.1f, -0.612f, -0.425f)
                quadToRelative(-0.238f, -0.325f, -0.138f, -0.75f)
                quadToRelative(0.225f, -1.05f, 0.638f, -2.013f)
                quadToRelative(0.412f, -0.962f, 0.987f, -1.837f)
                quadToRelative(0.25f, -0.35f, 0.663f, -0.438f)
                quadToRelative(0.412f, -0.087f, 0.762f, 0.188f)
                quadToRelative(0.3f, 0.225f, 0.375f, 0.612f)
                quadToRelative(0.075f, 0.388f, -0.125f, 0.713f)
                quadToRelative(-0.475f, 0.725f, -0.825f, 1.537f)
                quadToRelative(-0.35f, 0.813f, -0.525f, 1.688f)
                quadToRelative(-0.075f, 0.425f, -0.438f, 0.625f)
                quadToRelative(-0.362f, 0.2f, -0.762f, 0.1f)
                close()
                moveTo(5.75f, 4.35f)
                quadToRelative(-0.3f, -0.3f, -0.25f, -0.775f)
                quadToRelative(0.05f, -0.475f, 0.45f, -0.75f)
                quadToRelative(0.875f, -0.575f, 1.837f, -0.988f)
                quadToRelative(0.963f, -0.412f, 2.013f, -0.612f)
                quadToRelative(0.425f, -0.075f, 0.762f, 0.15f)
                quadToRelative(0.338f, 0.225f, 0.413f, 0.6f)
                quadToRelative(0.075f, 0.425f, -0.125f, 0.775f)
                quadToRelative(-0.2f, 0.35f, -0.625f, 0.425f)
                quadToRelative(-0.875f, 0.2f, -1.675f, 0.513f)
                quadToRelative(-0.8f, 0.312f, -1.525f, 0.812f)
                quadToRelative(-0.3f, 0.2f, -0.65f, 0.162f)
                quadToRelative(-0.35f, -0.037f, -0.625f, -0.312f)
                close()
                moveToRelative(4.7f, 9.225f)
                lineTo(8f, 12.45f)
                quadToRelative(-0.3f, -0.125f, -0.3f, -0.45f)
                reflectiveQuadToRelative(0.3f, -0.45f)
                lineToRelative(2.45f, -1.1f)
                lineTo(11.55f, 8f)
                quadToRelative(0.125f, -0.3f, 0.45f, -0.3f)
                reflectiveQuadToRelative(0.45f, 0.3f)
                lineToRelative(1.1f, 2.45f)
                lineToRelative(2.45f, 1.1f)
                quadToRelative(0.3f, 0.125f, 0.3f, 0.45f)
                reflectiveQuadToRelative(-0.3f, 0.45f)
                lineToRelative(-2.45f, 1.1f)
                lineToRelative(-1.1f, 2.45f)
                quadToRelative(-0.125f, 0.3f, -0.45f, 0.3f)
                reflectiveQuadToRelative(-0.45f, -0.3f)
                close()
                moveTo(18.275f, 4.3f)
                quadToRelative(-0.25f, 0.3f, -0.612f, 0.362f)
                quadToRelative(-0.363f, 0.063f, -0.688f, -0.137f)
                quadToRelative(-0.725f, -0.475f, -1.537f, -0.825f)
                quadToRelative(-0.813f, -0.35f, -1.688f, -0.525f)
                quadToRelative(-0.425f, -0.075f, -0.637f, -0.463f)
                quadToRelative(-0.213f, -0.387f, -0.088f, -0.787f)
                quadToRelative(0.1f, -0.375f, 0.438f, -0.575f)
                quadToRelative(0.337f, -0.2f, 0.737f, -0.125f)
                quadToRelative(1.05f, 0.2f, 2.012f, 0.612f)
                quadToRelative(0.963f, 0.413f, 1.838f, 0.988f)
                quadToRelative(0.375f, 0.25f, 0.438f, 0.687f)
                quadToRelative(0.062f, 0.438f, -0.213f, 0.788f)
                close()
                moveToRelative(3.75f, 6.675f)
                quadToRelative(-0.4f, 0.1f, -0.762f, -0.1f)
                quadToRelative(-0.363f, -0.2f, -0.438f, -0.625f)
                quadToRelative(-0.175f, -0.875f, -0.513f, -1.688f)
                quadToRelative(-0.337f, -0.812f, -0.837f, -1.537f)
                quadToRelative(-0.225f, -0.35f, -0.138f, -0.738f)
                quadToRelative(0.088f, -0.387f, 0.413f, -0.612f)
                quadToRelative(0.35f, -0.25f, 0.75f, -0.163f)
                quadToRelative(0.4f, 0.088f, 0.65f, 0.438f)
                quadToRelative(0.575f, 0.875f, 0.988f, 1.837f)
                quadToRelative(0.412f, 0.963f, 0.637f, 2.013f)
                quadToRelative(0.1f, 0.425f, -0.137f, 0.75f)
                quadToRelative(-0.238f, 0.325f, -0.613f, 0.425f)
                close()
            }
        }.build()
        
        return _Auto_mode!!
    }

private var _Auto_mode: ImageVector? = null

