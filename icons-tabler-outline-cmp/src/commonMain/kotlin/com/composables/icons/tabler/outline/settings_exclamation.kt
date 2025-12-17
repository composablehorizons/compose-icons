package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SettingsExclamation: ImageVector
    get() {
        if (_SettingsExclamation != null) return _SettingsExclamation!!
        
        _SettingsExclamation = ImageVector.Builder(
            name = "settings-exclamation",
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
                moveTo(15.004f, 18.401f)
                arcToRelative(1.724f, 1.724f, 0f, false, false, -1.329f, 1.282f)
                curveToRelative(-0.426f, 1.756f, -2.924f, 1.756f, -3.35f, 0f)
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
                curveToRelative(1.079f, 0.262f, 1.495f, 1.305f, 1.248f, 2.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -6f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                verticalLineToRelative(0.01f)
            }
        }.build()
        
        return _SettingsExclamation!!
    }

private var _SettingsExclamation: ImageVector? = null

