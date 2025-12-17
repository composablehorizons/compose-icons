package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Route: ImageVector
    get() {
        if (_Route != null) return _Route!!
        
        _Route = ImageVector.Builder(
            name = "route",
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
                moveTo(9f, 19f)
                arcTo(3f, 3f, 0f, false, true, 6f, 22f)
                arcTo(3f, 3f, 0f, false, true, 3f, 19f)
                arcTo(3f, 3f, 0f, false, true, 9f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 19f)
                horizontalLineToRelative(8.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, -7f)
                horizontalLineToRelative(-11f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -7f)
                horizontalLineTo(15f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 5f)
                arcTo(3f, 3f, 0f, false, true, 18f, 8f)
                arcTo(3f, 3f, 0f, false, true, 15f, 5f)
                arcTo(3f, 3f, 0f, false, true, 21f, 5f)
                close()
            }
        }.build()
        
        return _Route!!
    }

private var _Route: ImageVector? = null

