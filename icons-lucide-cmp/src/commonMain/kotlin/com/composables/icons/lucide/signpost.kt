package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Signpost: ImageVector
    get() {
        if (_Signpost != null) return _Signpost!!
        
        _Signpost = ImageVector.Builder(
            name = "signpost",
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
                moveTo(12f, 13f)
                verticalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 1.387f, 0.56f)
                lineToRelative(2.307f, 2.22f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.44f)
                lineToRelative(-2.307f, 2.22f)
                arcTo(2f, 2f, 0f, false, true, 18f, 13f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -1.387f, -0.56f)
                lineToRelative(-2.306f, -2.22f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.44f)
                lineToRelative(2.306f, -2.22f)
                arcTo(2f, 2f, 0f, false, true, 6f, 6f)
                close()
            }
        }.build()
        
        return _Signpost!!
    }

private var _Signpost: ImageVector? = null

