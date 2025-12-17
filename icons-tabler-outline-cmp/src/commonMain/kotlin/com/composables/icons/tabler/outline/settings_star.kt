package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SettingsStar: ImageVector
    get() {
        if (_SettingsStar != null) return _SettingsStar!!
        
        _SettingsStar = ImageVector.Builder(
            name = "settings-star",
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
                moveTo(10.325f, 19.683f)
                arcToRelative(1.723f, 1.723f, 0f, false, false, -2.573f, -1.066f)
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
                arcToRelative(1.67f, 1.67f, 0f, false, true, 1.106f, 0.831f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.89f, 11.195f)
                arcToRelative(3.001f, 3.001f, 0f, true, false, -4.457f, 3.364f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.8f, 20.817f)
                lineToRelative(-2.172f, 1.138f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, -0.568f, -0.41f)
                lineToRelative(0.415f, -2.411f)
                lineToRelative(-1.757f, -1.707f)
                arcToRelative(0.389f, 0.389f, 0f, false, true, 0.217f, -0.665f)
                lineToRelative(2.428f, -0.352f)
                lineToRelative(1.086f, -2.193f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, 0.702f, 0f)
                lineToRelative(1.086f, 2.193f)
                lineToRelative(2.428f, 0.352f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.217f, 0.665f)
                lineToRelative(-1.757f, 1.707f)
                lineToRelative(0.414f, 2.41f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, -0.567f, 0.411f)
                lineToRelative(-2.172f, -1.138f)
                close()
            }
        }.build()
        
        return _SettingsStar!!
    }

private var _SettingsStar: ImageVector? = null

