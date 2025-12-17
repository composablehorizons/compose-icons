package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SettingsCheck: ImageVector
    get() {
        if (_SettingsCheck != null) return _SettingsCheck!!
        
        _SettingsCheck = ImageVector.Builder(
            name = "settings-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.445f, 20.913f)
                arcToRelative(1.665f, 1.665f, 0f, false, true, -1.12f, -1.23f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, -2.573f, -1.066f)
                curveToRelative(-1.543f, 0.94f, -3.31f, -0.826f, -2.37f, -2.37f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, -1.065f, -2.572f)
                curveToRelative(-1.756f, -0.426f, -1.756f, -2.924f, 0f, -3.35f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, 1.066f, -2.573f)
                curveToRelative(-0.94f, -1.543f, 0.826f, -3.31f, 2.37f, -2.37f)
                curveToRelative(1f, 0.608f, 2.296f, 0.07f, 2.572f, -1.065f)
                curveToRelative(0.426f, -1.756f, 2.924f, -1.756f, 3.35f, 0f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, 2.573f, 1.066f)
                curveToRelative(1.543f, -0.94f, 3.31f, 0.826f, 2.37f, 2.37f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, 1.065f, 2.572f)
                curveToRelative(1.31f, 0.318f, 1.643f, 1.79f, 0.997f, 2.694f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -6f, 0f)
            }
        }.build()
        
        return _SettingsCheck!!
    }

private var _SettingsCheck: ImageVector? = null

