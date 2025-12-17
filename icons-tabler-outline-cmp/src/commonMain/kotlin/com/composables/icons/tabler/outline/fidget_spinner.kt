package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FidgetSpinner: ImageVector
    get() {
        if (_FidgetSpinner != null) return _FidgetSpinner!!
        
        _FidgetSpinner = ImageVector.Builder(
            name = "fidget-spinner",
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
                moveTo(18f, 16f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 1f)
                arcToRelative(4f, 4f, 0f, false, true, 2.001f, 7.464f)
                lineToRelative(0.001f, 0.072f)
                arcToRelative(3.998f, 3.998f, 0f, false, true, 1.987f, 3.758f)
                lineToRelative(0.22f, 0.128f)
                arcToRelative(3.978f, 3.978f, 0f, false, true, 1.591f, -0.417f)
                lineToRelative(0.2f, -0.005f)
                arcToRelative(4f, 4f, 0f, true, true, -3.994f, 3.77f)
                lineToRelative(-0.28f, -0.16f)
                curveToRelative(-0.522f, 0.25f, -1.108f, 0.39f, -1.726f, 0.39f)
                curveToRelative(-0.619f, 0f, -1.205f, -0.14f, -1.728f, -0.391f)
                lineToRelative(-0.279f, 0.16f)
                lineToRelative(0.007f, 0.231f)
                arcToRelative(4f, 4f, 0f, true, true, -2.212f, -3.579f)
                lineToRelative(0.222f, -0.129f)
                arcToRelative(3.998f, 3.998f, 0f, false, true, 1.988f, -3.756f)
                lineToRelative(0.002f, -0.071f)
                arcToRelative(4f, 4f, 0f, false, true, -1.995f, -3.265f)
                lineToRelative(-0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
            }
        }.build()
        
        return _FidgetSpinner!!
    }

private var _FidgetSpinner: ImageVector? = null

