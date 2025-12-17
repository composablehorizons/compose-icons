package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CameraMoon: ImageVector
    get() {
        if (_CameraMoon != null) return _CameraMoon!!
        
        _CameraMoon = ImageVector.Builder(
            name = "camera-moon",
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
                moveTo(11.5f, 20f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-9f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.815f, 11.96f)
                arcToRelative(3.001f, 3.001f, 0f, true, false, -3.398f, 3.983f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.62f, 22f)
                curveToRelative(-2f, 0f, -3.62f, -1.58f, -3.62f, -3.53f)
                curveToRelative(0f, -1.727f, 1.273f, -3.165f, 2.954f, -3.47f)
                arcToRelative(3.4f, 3.4f, 0f, false, false, -0.24f, 1.264f)
                curveToRelative(0f, 1.95f, 1.621f, 3.53f, 3.62f, 3.53f)
                quadToRelative(0.342f, 0f, 0.666f, -0.06f)
                curveToRelative(-0.521f, 1.326f, -1.838f, 2.266f, -3.38f, 2.266f)
            }
        }.build()
        
        return _CameraMoon!!
    }

private var _CameraMoon: ImageVector? = null

