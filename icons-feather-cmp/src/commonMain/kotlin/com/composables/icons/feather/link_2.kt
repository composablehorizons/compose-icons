package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Link2: ImageVector
    get() {
        if (_Link2 != null) return _Link2!!
        
        _Link2 = ImageVector.Builder(
            name = "link-2",
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
                moveTo(15f, 7f)
                horizontalLineToRelative(3f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineToRelative(-3f)
                moveToRelative(-6f, 0f)
                horizontalLineTo(6f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, -5f)
                horizontalLineToRelative(3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                lineTo(16f, 12f)
            }
        }.build()
        
        return _Link2!!
    }

private var _Link2: ImageVector? = null

