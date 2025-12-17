package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MapPinned: ImageVector
    get() {
        if (_MapPinned != null) return _MapPinned!!
        
        _MapPinned = ImageVector.Builder(
            name = "map-pinned",
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
                moveTo(18f, 8f)
                curveToRelative(0f, 3.613f, -3.869f, 7.429f, -5.393f, 8.795f)
                arcToRelative(1f, 1f, 0f, false, true, -1.214f, 0f)
                curveTo(9.87f, 15.429f, 6f, 11.613f, 6f, 8f)
                arcToRelative(6f, 6f, 0f, false, true, 12f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 8f)
                arcTo(2f, 2f, 0f, false, true, 12f, 10f)
                arcTo(2f, 2f, 0f, false, true, 10f, 8f)
                arcTo(2f, 2f, 0f, false, true, 14f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.714f, 14f)
                horizontalLineToRelative(-3.71f)
                arcToRelative(1f, 1f, 0f, false, false, -0.948f, 0.683f)
                lineToRelative(-2.004f, 6f)
                arcTo(1f, 1f, 0f, false, false, 3f, 22f)
                horizontalLineToRelative(18f)
                arcToRelative(1f, 1f, 0f, false, false, 0.948f, -1.316f)
                lineToRelative(-2f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, -0.949f, -0.684f)
                horizontalLineToRelative(-3.712f)
            }
        }.build()
        
        return _MapPinned!!
    }

private var _MapPinned: ImageVector? = null

