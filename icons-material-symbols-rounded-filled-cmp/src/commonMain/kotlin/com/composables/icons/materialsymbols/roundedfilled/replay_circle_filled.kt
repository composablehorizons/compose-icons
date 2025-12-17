package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Replay_circle_filled: ImageVector
    get() {
        if (_Replay_circle_filled != null) return _Replay_circle_filled!!
        
        _Replay_circle_filled = ImageVector.Builder(
            name = "replay_circle_filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 18.5f)
                quadToRelative(2.5f, 0f, 4.25f, -1.75f)
                reflectiveQuadTo(18f, 12.5f)
                quadToRelative(0f, -2.525f, -1.812f, -4.262f)
                quadTo(14.375f, 6.5f, 11.8f, 6.5f)
                lineToRelative(0.9f, -0.9f)
                quadToRelative(0.275f, -0.275f, 0.275f, -0.7f)
                quadToRelative(0f, -0.425f, -0.275f, -0.7f)
                quadToRelative(-0.275f, -0.275f, -0.7f, -0.275f)
                quadToRelative(-0.425f, 0f, -0.7f, 0.275f)
                lineTo(8.7f, 6.8f)
                quadToRelative(-0.15f, 0.15f, -0.212f, 0.325f)
                quadToRelative(-0.063f, 0.175f, -0.063f, 0.375f)
                reflectiveQuadToRelative(0.063f, 0.375f)
                quadToRelative(0.062f, 0.175f, 0.212f, 0.325f)
                lineToRelative(2.6f, 2.6f)
                quadToRelative(0.275f, 0.275f, 0.688f, 0.287f)
                quadToRelative(0.412f, 0.013f, 0.712f, -0.287f)
                quadToRelative(0.275f, -0.275f, 0.288f, -0.688f)
                quadTo(13f, 9.7f, 12.725f, 9.4f)
                lineToRelative(-0.875f, -0.9f)
                quadToRelative(1.725f, 0f, 2.938f, 1.162f)
                quadTo(16f, 10.825f, 16f, 12.5f)
                quadToRelative(0f, 1.65f, -1.175f, 2.825f)
                quadTo(13.65f, 16.5f, 12f, 16.5f)
                quadToRelative(-1.425f, 0f, -2.512f, -0.887f)
                quadTo(8.4f, 14.725f, 8.1f, 13.375f)
                quadTo(8f, 13f, 7.725f, 12.75f)
                reflectiveQuadTo(7.1f, 12.5f)
                quadToRelative(-0.475f, 0f, -0.775f, 0.337f)
                quadToRelative(-0.3f, 0.338f, -0.225f, 0.763f)
                quadToRelative(0.375f, 2.125f, 2.025f, 3.513f)
                quadTo(9.775f, 18.5f, 12f, 18.5f)
                close()
                moveToRelative(0f, 3.5f)
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
        
        return _Replay_circle_filled!!
    }

private var _Replay_circle_filled: ImageVector? = null

