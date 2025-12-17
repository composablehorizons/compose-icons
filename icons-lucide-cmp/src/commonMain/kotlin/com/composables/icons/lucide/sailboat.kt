package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Sailboat: ImageVector
    get() {
        if (_Sailboat != null) return _Sailboat!!
        
        _Sailboat = ImageVector.Builder(
            name = "sailboat",
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
                moveTo(10f, 2f)
                verticalLineToRelative(15f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 22f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.159f, 2.46f)
                arcToRelative(1f, 1f, 0f, false, true, 1.521f, -0.193f)
                lineToRelative(9.977f, 8.98f)
                arcTo(1f, 1f, 0f, false, true, 20f, 13f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.824f, -1.567f)
                close()
            }
        }.build()
        
        return _Sailboat!!
    }

private var _Sailboat: ImageVector? = null

