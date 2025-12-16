package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Edit2: ImageVector
    get() {
        if (_Edit2 != null) return _Edit2!!
        
        _Edit2 = ImageVector.Builder(
            name = "edit-2",
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
                moveTo(17f, 3f)
                arcToRelative(2.828f, 2.828f, 0f, true, true, 4f, 4f)
                lineTo(7.5f, 20.5f)
                lineTo(2f, 22f)
                lineToRelative(1.5f, -5.5f)
                lineTo(17f, 3f)
                close()
            }
        }.build()
        
        return _Edit2!!
    }

private var _Edit2: ImageVector? = null

