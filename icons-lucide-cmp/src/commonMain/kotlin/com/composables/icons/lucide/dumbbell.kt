package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Dumbbell: ImageVector
    get() {
        if (_Dumbbell != null) return _Dumbbell!!
        
        _Dumbbell = ImageVector.Builder(
            name = "dumbbell",
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
                moveTo(17.596f, 12.768f)
                arcToRelative(2f, 2f, 0f, true, false, 2.829f, -2.829f)
                lineToRelative(-1.768f, -1.767f)
                arcToRelative(2f, 2f, 0f, false, false, 2.828f, -2.829f)
                lineToRelative(-2.828f, -2.828f)
                arcToRelative(2f, 2f, 0f, false, false, -2.829f, 2.828f)
                lineToRelative(-1.767f, -1.768f)
                arcToRelative(2f, 2f, 0f, true, false, -2.829f, 2.829f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.5f, 21.5f)
                lineToRelative(1.4f, -1.4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.1f, 3.9f)
                lineToRelative(1.4f, -1.4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.343f, 21.485f)
                arcToRelative(2f, 2f, 0f, true, false, 2.829f, -2.828f)
                lineToRelative(1.767f, 1.768f)
                arcToRelative(2f, 2f, 0f, true, false, 2.829f, -2.829f)
                lineToRelative(-6.364f, -6.364f)
                arcToRelative(2f, 2f, 0f, true, false, -2.829f, 2.829f)
                lineToRelative(1.768f, 1.767f)
                arcToRelative(2f, 2f, 0f, false, false, -2.828f, 2.829f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.6f, 14.4f)
                lineToRelative(4.8f, -4.8f)
            }
        }.build()
        
        return _Dumbbell!!
    }

private var _Dumbbell: ImageVector? = null

