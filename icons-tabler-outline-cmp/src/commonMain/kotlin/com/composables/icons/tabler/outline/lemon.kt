package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Lemon: ImageVector
    get() {
        if (_Lemon != null) return _Lemon!!
        
        _Lemon = ImageVector.Builder(
            name = "lemon",
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
                moveTo(17.536f, 3.393f)
                curveToRelative(3.905f, 3.906f, 3.905f, 10.237f, 0f, 14.143f)
                curveToRelative(-3.906f, 3.905f, -10.237f, 3.905f, -14.143f, 0f)
                lineToRelative(14.143f, -14.143f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.868f, 15.06f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, 9.193f, -9.192f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.464f, 10.464f)
                lineToRelative(4.597f, 4.597f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.464f, 10.464f)
                verticalLineToRelative(6.364f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.464f, 10.464f)
                horizontalLineToRelative(6.364f)
            }
        }.build()
        
        return _Lemon!!
    }

private var _Lemon: ImageVector? = null

