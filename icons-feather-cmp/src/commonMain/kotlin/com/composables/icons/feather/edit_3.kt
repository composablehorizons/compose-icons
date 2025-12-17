package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Edit3: ImageVector
    get() {
        if (_Edit3 != null) return _Edit3!!
        
        _Edit3 = ImageVector.Builder(
            name = "edit-3",
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
                moveTo(12f, 20f)
                horizontalLineToRelative(9f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 3.5f)
                arcToRelative(2.121f, 2.121f, 0f, false, true, 3f, 3f)
                lineTo(7f, 19f)
                lineToRelative(-4f, 1f)
                lineToRelative(1f, -4f)
                lineTo(16.5f, 3.5f)
                close()
            }
        }.build()
        
        return _Edit3!!
    }

private var _Edit3: ImageVector? = null

