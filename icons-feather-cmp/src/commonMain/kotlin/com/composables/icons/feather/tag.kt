package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
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
                moveTo(20.59f, 13.41f)
                lineToRelative(-7.17f, 7.17f)
                arcToRelative(2f, 2f, 0f, false, true, -2.83f, 0f)
                lineTo(2f, 12f)
                verticalLineTo(2f)
                horizontalLineToRelative(10f)
                lineToRelative(8.59f, 8.59f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.82f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 7f)
                lineTo(7.01f, 7f)
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

