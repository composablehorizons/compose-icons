package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Hop: ImageVector
    get() {
        if (_Hop != null) return _Hop!!
        
        _Hop = ImageVector.Builder(
            name = "hop",
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
                moveTo(10.82f, 16.12f)
                curveToRelative(1.69f, 0.6f, 3.91f, 0.79f, 5.18f, 0.85f)
                curveToRelative(0.55f, 0.03f, 1f, -0.42f, 0.97f, -0.97f)
                curveToRelative(-0.06f, -1.27f, -0.26f, -3.5f, -0.85f, -5.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 6.5f)
                curveToRelative(1.64f, 0f, 5f, -0.38f, 6.71f, -1.07f)
                curveToRelative(0.52f, -0.2f, 0.55f, -0.82f, 0.12f, -1.17f)
                arcTo(10f, 10f, 0f, false, false, 4.26f, 18.33f)
                curveToRelative(0.35f, 0.43f, 0.96f, 0.4f, 1.17f, -0.12f)
                curveToRelative(0.69f, -1.71f, 1.07f, -5.07f, 1.07f, -6.71f)
                curveToRelative(1.34f, 0.45f, 3.1f, 0.9f, 4.88f, 0.62f)
                arcToRelative(0.88f, 0.88f, 0f, false, false, 0.73f, -0.74f)
                curveToRelative(0.3f, -2.14f, -0.15f, -3.5f, -0.61f, -4.88f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.62f, 16.95f)
                curveToRelative(0.2f, 0.85f, 0.62f, 2.76f, 0.5f, 4.28f)
                arcToRelative(0.77f, 0.77f, 0f, false, true, -0.9f, 0.7f)
                arcToRelative(16.64f, 16.64f, 0f, false, true, -4.08f, -1.36f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.13f, 21.05f)
                curveToRelative(1.65f, 0.63f, 3.68f, 0.84f, 4.87f, 0.91f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.96f, -0.96f)
                arcToRelative(17.68f, 17.68f, 0f, false, false, -0.9f, -4.87f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.94f, 15.62f)
                curveToRelative(0.86f, 0.2f, 2.77f, 0.62f, 4.29f, 0.5f)
                arcToRelative(0.77f, 0.77f, 0f, false, false, 0.7f, -0.9f)
                arcToRelative(16.64f, 16.64f, 0f, false, false, -1.36f, -4.08f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.99f, 5.52f)
                arcToRelative(20.82f, 20.82f, 0f, false, true, 3.15f, 4.5f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.68f, 1.13f)
                curveToRelative(-2.33f, 0.2f, -5.3f, -0.32f, -8.27f, -1.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.93f, 4.93f)
                lineTo(3f, 3f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, 0f, -1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.58f, 12.18f)
                curveToRelative(1.24f, 2.98f, 1.77f, 5.95f, 1.57f, 8.28f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -1.13f, 0.68f)
                arcToRelative(20.82f, 20.82f, 0f, false, true, -4.5f, -3.15f)
            }
        }.build()
        
        return _Hop!!
    }

private var _Hop: ImageVector? = null

