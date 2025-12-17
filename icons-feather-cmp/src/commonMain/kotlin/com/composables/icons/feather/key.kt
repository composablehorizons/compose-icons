package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
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
                moveTo(21f, 2f)
                lineToRelative(-2f, 2f)
                moveToRelative(-7.61f, 7.61f)
                arcToRelative(5.5f, 5.5f, 0f, true, true, -7.778f, 7.778f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 7.777f, -7.777f)
                close()
                moveToRelative(0f, 0f)
                lineTo(15.5f, 7.5f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, 3f)
                lineTo(22f, 7f)
                lineToRelative(-3f, -3f)
                moveToRelative(-3.5f, 3.5f)
                lineTo(19f, 4f)
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

