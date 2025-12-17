package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Phone_in_talk_watchface_indicator: ImageVector
    get() {
        if (_Phone_in_talk_watchface_indicator != null) return _Phone_in_talk_watchface_indicator!!
        
        _Phone_in_talk_watchface_indicator = ImageVector.Builder(
            name = "phone_in_talk_watchface_indicator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.875f, 22f)
                quadToRelative(-3.9f, 0f, -7.337f, -1.475f)
                quadToRelative(-3.438f, -1.475f, -6f, -4.037f)
                quadToRelative(-2.563f, -2.563f, -4.05f, -6f)
                quadTo(2f, 7.05f, 2f, 3.125f)
                quadToRelative(-0.025f, -0.45f, 0.3f, -0.788f)
                quadTo(2.625f, 2f, 3.1f, 2f)
                horizontalLineTo(7f)
                quadToRelative(0.45f, 0f, 0.775f, 0.337f)
                quadToRelative(0.325f, 0.338f, 0.325f, 0.813f)
                quadToRelative(0f, 1.1f, 0.15f, 2.075f)
                quadToRelative(0.15f, 0.975f, 0.475f, 1.85f)
                quadToRelative(0.125f, 0.275f, 0.05f, 0.562f)
                quadToRelative(-0.075f, 0.288f, -0.3f, 0.538f)
                lineToRelative(-2.5f, 2.5f)
                quadToRelative(1.075f, 2.2f, 3.05f, 4.175f)
                quadTo(11f, 16.825f, 13.275f, 18f)
                lineToRelative(2.5f, -2.5f)
                quadToRelative(0.225f, -0.225f, 0.525f, -0.3f)
                quadToRelative(0.3f, -0.075f, 0.6f, 0.05f)
                quadToRelative(0.925f, 0.3f, 1.912f, 0.462f)
                quadToRelative(0.988f, 0.163f, 2.038f, 0.163f)
                quadToRelative(0.475f, 0f, 0.813f, 0.35f)
                quadToRelative(0.337f, 0.35f, 0.337f, 0.85f)
                verticalLineTo(20.9f)
                quadToRelative(0f, 0.45f, -0.325f, 0.775f)
                reflectiveQuadToRelative(-0.8f, 0.325f)
                close()
                moveToRelative(-5.75f, -3f)
                quadToRelative(1.125f, 0.425f, 2.35f, 0.675f)
                quadTo(18.7f, 19.925f, 20f, 20f)
                horizontalLineToRelative(-0.012f)
                horizontalLineTo(20f)
                verticalLineToRelative(-2.15f)
                quadToRelative(-0.775f, -0.05f, -1.587f, -0.175f)
                quadToRelative(-0.813f, -0.125f, -1.613f, -0.375f)
                lineToRelative(0.012f, 0.012f)
                lineToRelative(-0.012f, -0.012f)
                close()
                moveTo(20f, 12f)
                quadToRelative(0f, -3.35f, -2.325f, -5.675f)
                quadTo(15.35f, 4f, 12f, 4f)
                verticalLineTo(2f)
                quadToRelative(2.075f, 0f, 3.9f, 0.787f)
                quadToRelative(1.825f, 0.788f, 3.175f, 2.138f)
                quadToRelative(1.35f, 1.35f, 2.137f, 3.175f)
                quadTo(22f, 9.925f, 22f, 12f)
                close()
                moveToRelative(-4f, 0f)
                quadToRelative(0f, -1.65f, -1.175f, -2.825f)
                quadTo(13.65f, 8f, 12f, 8f)
                verticalLineTo(6f)
                quadToRelative(2.5f, 0f, 4.25f, 1.75f)
                reflectiveQuadTo(18f, 12f)
                close()
                moveTo(5f, 8.825f)
                lineTo(6.65f, 7.15f)
                quadToRelative(-0.2f, -0.725f, -0.338f, -1.525f)
                quadToRelative(-0.137f, -0.8f, -0.187f, -1.625f)
                verticalLineToRelative(0.012f)
                verticalLineTo(4f)
                horizontalLineToRelative(-2.1f)
                quadToRelative(0.05f, 1.2f, 0.3f, 2.4f)
                reflectiveQuadTo(5f, 8.825f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveTo(15.125f, 19f)
                close()
            }
        }.build()
        
        return _Phone_in_talk_watchface_indicator!!
    }

private var _Phone_in_talk_watchface_indicator: ImageVector? = null

