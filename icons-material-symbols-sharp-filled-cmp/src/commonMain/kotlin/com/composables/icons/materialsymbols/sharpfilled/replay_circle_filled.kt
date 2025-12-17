package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Replay_circle_filled: ImageVector
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
                lineToRelative(1.6f, -1.6f)
                lineTo(12f, 3.5f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(-1.55f, -1.6f)
                quadToRelative(1.725f, 0f, 2.938f, 1.162f)
                quadTo(16f, 10.825f, 16f, 12.5f)
                quadToRelative(0f, 1.65f, -1.175f, 2.825f)
                quadTo(13.65f, 16.5f, 12f, 16.5f)
                quadToRelative(-1.65f, 0f, -2.825f, -1.175f)
                quadTo(8f, 14.15f, 8f, 12.5f)
                horizontalLineTo(6f)
                quadToRelative(0f, 2.5f, 1.75f, 4.25f)
                reflectiveQuadTo(12f, 18.5f)
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

