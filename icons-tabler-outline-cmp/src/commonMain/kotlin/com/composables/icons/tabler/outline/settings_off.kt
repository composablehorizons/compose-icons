package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SettingsOff: ImageVector
    get() {
        if (_SettingsOff != null) return _SettingsOff!!
        
        _SettingsOff = ImageVector.Builder(
            name = "settings-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.451f, 5.437f)
                curveToRelative(0.418f, -0.218f, 0.75f, -0.609f, 0.874f, -1.12f)
                curveToRelative(0.426f, -1.756f, 2.924f, -1.756f, 3.35f, 0f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, 2.573f, 1.066f)
                curveToRelative(1.543f, -0.94f, 3.31f, 0.826f, 2.37f, 2.37f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, 1.065f, 2.572f)
                curveToRelative(1.756f, 0.426f, 1.756f, 2.924f, 0f, 3.35f)
                curveToRelative(-0.486f, 0.118f, -0.894f, 0.44f, -1.123f, 0.878f)
                moveToRelative(-0.188f, 3.803f)
                curveToRelative(-0.517f, 0.523f, -1.349f, 0.734f, -2.125f, 0.262f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, -2.572f, 1.065f)
                curveToRelative(-0.426f, 1.756f, -2.924f, 1.756f, -3.35f, 0f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, -2.573f, -1.066f)
                curveToRelative(-1.543f, 0.94f, -3.31f, -0.826f, -2.37f, -2.37f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, -1.065f, -2.572f)
                curveToRelative(-1.756f, -0.426f, -1.756f, -2.924f, 0f, -3.35f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, 1.066f, -2.573f)
                curveToRelative(-0.472f, -0.774f, -0.262f, -1.604f, 0.259f, -2.121f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.889f, 9.869f)
                arcToRelative(3f, 3f, 0f, true, false, 4.226f, 4.26f)
                moveToRelative(0.592f, -3.424f)
                arcToRelative(3.012f, 3.012f, 0f, false, false, -1.419f, -1.415f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _SettingsOff!!
    }

private var _SettingsOff: ImageVector? = null

