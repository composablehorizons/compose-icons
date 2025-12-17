package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MousePointerBan: ImageVector
    get() {
        if (_MousePointerBan != null) return _MousePointerBan!!
        
        _MousePointerBan = ImageVector.Builder(
            name = "mouse-pointer-ban",
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
                moveTo(2.034f, 2.681f)
                arcToRelative(0.498f, 0.498f, 0f, false, true, 0.647f, -0.647f)
                lineToRelative(9f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.033f, 0.944f)
                lineTo(8.204f, 7.545f)
                arcToRelative(1f, 1f, 0f, false, false, -0.66f, 0.66f)
                lineToRelative(-1.066f, 3.443f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.944f, 0.033f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 16f)
                arcTo(6f, 6f, 0f, false, true, 16f, 22f)
                arcTo(6f, 6f, 0f, false, true, 10f, 16f)
                arcTo(6f, 6f, 0f, false, true, 22f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.8f, 11.8f)
                lineToRelative(8.4f, 8.4f)
            }
        }.build()
        
        return _MousePointerBan!!
    }

private var _MousePointerBan: ImageVector? = null

