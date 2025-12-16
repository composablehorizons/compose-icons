package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BrainCog: ImageVector
    get() {
        if (_BrainCog != null) return _BrainCog!!
        
        _BrainCog = ImageVector.Builder(
            name = "brain-cog",
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
                moveTo(10.852f, 14.772f)
                lineToRelative(-0.383f, 0.923f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.852f, 9.228f)
                lineToRelative(-0.383f, -0.923f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.148f, 14.772f)
                lineToRelative(0.382f, 0.924f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.531f, 8.305f)
                lineToRelative(-0.383f, 0.923f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.772f, 10.852f)
                lineToRelative(0.923f, -0.383f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.772f, 13.148f)
                lineToRelative(0.923f, 0.383f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.598f, 6.5f)
                arcTo(3f, 3f, 0f, true, false, 12f, 5f)
                arcToRelative(3f, 3f, 0f, false, false, -5.63f, -1.446f)
                arcToRelative(3f, 3f, 0f, false, false, -0.368f, 1.571f)
                arcToRelative(4f, 4f, 0f, false, false, -2.525f, 5.771f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.998f, 5.125f)
                arcToRelative(4f, 4f, 0f, false, true, 2.525f, 5.771f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.505f, 10.294f)
                arcToRelative(4f, 4f, 0f, false, true, -1.5f, 7.706f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.032f, 17.483f)
                arcTo(4f, 4f, 0f, false, false, 11.464f, 20f)
                curveToRelative(0.18f, -0.311f, 0.892f, -0.311f, 1.072f, 0f)
                arcToRelative(4f, 4f, 0f, false, false, 7.432f, -2.516f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 10.291f)
                arcTo(4f, 4f, 0f, false, false, 6f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.002f, 5.125f)
                arcToRelative(3f, 3f, 0f, false, false, 0.4f, 1.375f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.228f, 10.852f)
                lineToRelative(-0.923f, -0.383f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.228f, 13.148f)
                lineToRelative(-0.923f, 0.383f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                arcTo(3f, 3f, 0f, false, true, 12f, 15f)
                arcTo(3f, 3f, 0f, false, true, 9f, 12f)
                arcTo(3f, 3f, 0f, false, true, 15f, 12f)
                close()
            }
        }.build()
        
        return _BrainCog!!
    }

private var _BrainCog: ImageVector? = null

