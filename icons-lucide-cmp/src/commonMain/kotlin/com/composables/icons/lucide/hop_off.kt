package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HopOff: ImageVector
    get() {
        if (_HopOff != null) return _HopOff!!
        
        _HopOff = ImageVector.Builder(
            name = "hop-off",
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
                moveTo(10.82f, 16.12f)
                curveToRelative(1.69f, 0.6f, 3.91f, 0.79f, 5.18f, 0.85f)
                curveToRelative(0.28f, 0.01f, 0.53f, -0.09f, 0.7f, -0.27f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.14f, 20.57f)
                curveToRelative(0.52f, 0.24f, 2.44f, 1.12f, 4.08f, 1.37f)
                curveToRelative(0.46f, 0.06f, 0.86f, -0.25f, 0.9f, -0.71f)
                curveToRelative(0.12f, -1.52f, -0.3f, -3.43f, -0.5f, -4.28f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.13f, 21.05f)
                curveToRelative(1.65f, 0.63f, 3.68f, 0.84f, 4.87f, 0.91f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.7f, -0.26f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.99f, 5.52f)
                arcToRelative(20.83f, 20.83f, 0f, false, true, 3.15f, 4.5f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.68f, 1.13f)
                curveToRelative(-1.17f, 0.1f, -2.5f, 0.02f, -3.9f, -0.25f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.57f, 11.14f)
                curveToRelative(0.24f, 0.52f, 1.12f, 2.44f, 1.37f, 4.08f)
                curveToRelative(0.04f, 0.3f, -0.08f, 0.59f, -0.31f, 0.75f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.93f, 4.93f)
                arcToRelative(10f, 10f, 0f, false, false, -0.67f, 13.4f)
                curveToRelative(0.35f, 0.43f, 0.96f, 0.4f, 1.17f, -0.12f)
                curveToRelative(0.69f, -1.71f, 1.07f, -5.07f, 1.07f, -6.71f)
                curveToRelative(1.34f, 0.45f, 3.1f, 0.9f, 4.88f, 0.62f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, 0.48f, -0.24f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.52f, 17.99f)
                curveToRelative(1.05f, 0.95f, 2.91f, 2.42f, 4.5f, 3.15f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 1.13f, -0.68f)
                curveToRelative(0.2f, -2.34f, -0.33f, -5.3f, -1.57f, -8.28f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.35f, 2.68f)
                arcToRelative(10f, 10f, 0f, false, true, 9.98f, 1.58f)
                curveToRelative(0.43f, 0.35f, 0.4f, 0.96f, -0.12f, 1.17f)
                curveToRelative(-1.5f, 0.6f, -4.3f, 0.98f, -6.07f, 1.05f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
        }.build()
        
        return _HopOff!!
    }

private var _HopOff: ImageVector? = null

