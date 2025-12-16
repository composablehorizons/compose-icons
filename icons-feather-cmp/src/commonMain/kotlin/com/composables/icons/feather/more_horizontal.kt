package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.MoreHorizontal: ImageVector
    get() {
        if (_MoreHorizontal != null) return _MoreHorizontal!!
        
        _MoreHorizontal = ImageVector.Builder(
            name = "more-horizontal",
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
                moveTo(13f, 12f)
                arcTo(1f, 1f, 0f, false, true, 12f, 13f)
                arcTo(1f, 1f, 0f, false, true, 11f, 12f)
                arcTo(1f, 1f, 0f, false, true, 13f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                arcTo(1f, 1f, 0f, false, true, 19f, 13f)
                arcTo(1f, 1f, 0f, false, true, 18f, 12f)
                arcTo(1f, 1f, 0f, false, true, 20f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                arcTo(1f, 1f, 0f, false, true, 5f, 13f)
                arcTo(1f, 1f, 0f, false, true, 4f, 12f)
                arcTo(1f, 1f, 0f, false, true, 6f, 12f)
                close()
            }
        }.build()
        
        return _MoreHorizontal!!
    }

private var _MoreHorizontal: ImageVector? = null

