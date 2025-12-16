package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.AlertOctagon: ImageVector
    get() {
        if (_AlertOctagon != null) return _AlertOctagon!!
        
        _AlertOctagon = ImageVector.Builder(
            name = "alert-octagon",
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
                moveTo(7.86f, 2f)
                lineTo(16.14f, 2f)
                lineTo(22f, 7.86f)
                lineTo(22f, 16.14f)
                lineTo(16.14f, 22f)
                lineTo(7.86f, 22f)
                lineTo(2f, 16.14f)
                lineTo(2f, 7.86f)
                lineTo(7.86f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineTo(12f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                lineTo(12.01f, 16f)
            }
        }.build()
        
        return _AlertOctagon!!
    }

private var _AlertOctagon: ImageVector? = null

