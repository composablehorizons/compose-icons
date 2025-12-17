package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Drumstick: ImageVector
    get() {
        if (_Drumstick != null) return _Drumstick!!
        
        _Drumstick = ImageVector.Builder(
            name = "drumstick",
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
                moveTo(15.4f, 15.63f)
                arcToRelative(7.875f, 6f, 135f, true, true, 6.23f, -6.23f)
                arcToRelative(4.5f, 3.43f, 135f, false, false, -6.23f, 6.23f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.29f, 12.71f)
                lineToRelative(-2.6f, 2.6f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -1.65f, 4.65f)
                arcTo(2.5f, 2.5f, 0f, true, false, 8.7f, 18.3f)
                lineToRelative(2.59f, -2.59f)
            }
        }.build()
        
        return _Drumstick!!
    }

private var _Drumstick: ImageVector? = null

