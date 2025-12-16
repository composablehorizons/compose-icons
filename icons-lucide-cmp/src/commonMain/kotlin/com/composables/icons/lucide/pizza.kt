package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pizza: ImageVector
    get() {
        if (_Pizza != null) return _Pizza!!
        
        _Pizza = ImageVector.Builder(
            name = "pizza",
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
                moveTo(12f, 14f)
                lineToRelative(-1f, 1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.75f, 18.25f)
                lineToRelative(-1.25f, 1.42f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.775f, 5.654f)
                arcToRelative(15.68f, 15.68f, 0f, false, false, -12.121f, 12.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.8f, 9.3f)
                arcToRelative(1f, 1f, 0f, false, false, 2.1f, 7.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.964f, 20.732f)
                arcToRelative(1f, 1f, 0f, false, true, -1.232f, 1.232f)
                lineToRelative(-18f, -5f)
                arcToRelative(1f, 1f, 0f, false, true, -0.695f, -1.232f)
                arcTo(19.68f, 19.68f, 0f, false, true, 15.732f, 2.037f)
                arcToRelative(1f, 1f, 0f, false, true, 1.232f, 0.695f)
                close()
            }
        }.build()
        
        return _Pizza!!
    }

private var _Pizza: ImageVector? = null

