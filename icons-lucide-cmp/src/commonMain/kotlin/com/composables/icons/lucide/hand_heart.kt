package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HandHeart: ImageVector
    get() {
        if (_HandHeart != null) return _HandHeart!!
        
        _HandHeart = ImageVector.Builder(
            name = "hand-heart",
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
                moveTo(11f, 14f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.6f, 0f, -1.1f, 0.2f, -1.4f, 0.6f)
                lineTo(3f, 16f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.45f, 13.39f)
                lineToRelative(5.05f, -4.694f)
                curveTo(20.196f, 8f, 21f, 6.85f, 21f, 5.75f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, -4.797f, -1.837f)
                arcToRelative(0.276f, 0.276f, 0f, false, true, -0.406f, 0f)
                arcTo(2.75f, 2.75f, 0f, false, false, 11f, 5.75f)
                curveToRelative(0f, 1.2f, 0.802f, 2.248f, 1.5f, 2.946f)
                lineTo(16f, 11.95f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 15f)
                lineToRelative(6f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 20f)
                lineToRelative(1.6f, -1.4f)
                curveToRelative(0.3f, -0.4f, 0.8f, -0.6f, 1.4f, -0.6f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2.1f, -0.4f, 2.8f, -1.2f)
                lineToRelative(4.6f, -4.4f)
                arcToRelative(1f, 1f, 0f, false, false, -2.75f, -2.91f)
            }
        }.build()
        
        return _HandHeart!!
    }

private var _HandHeart: ImageVector? = null

