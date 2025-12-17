package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.StarsOff: ImageVector
    get() {
        if (_StarsOff != null) return _StarsOff!!
        
        _StarsOff = ImageVector.Builder(
            name = "stars-off",
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
                moveTo(17.373f, 13.371f)
                lineToRelative(0.076f, -0.154f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, 0.702f, 0f)
                lineToRelative(0.907f, 1.831f)
                moveToRelative(0.367f, 0.39f)
                curveToRelative(0.498f, 0.071f, 1.245f, 0.18f, 2.24f, 0.324f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.217f, 0.665f)
                curveToRelative(-0.326f, 0.316f, -0.57f, 0.553f, -0.732f, 0.712f)
                moveToRelative(-0.611f, 3.405f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, -0.567f, 0.411f)
                lineToRelative(-2.172f, -1.138f)
                lineToRelative(-2.172f, 1.138f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, -0.568f, -0.41f)
                lineToRelative(0.415f, -2.411f)
                lineToRelative(-1.757f, -1.707f)
                arcToRelative(0.389f, 0.389f, 0f, false, true, 0.217f, -0.665f)
                lineToRelative(1.601f, -0.232f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.2f, 19.817f)
                lineToRelative(-2.172f, 1.138f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, -0.568f, -0.41f)
                lineToRelative(0.415f, -2.411f)
                lineToRelative(-1.757f, -1.707f)
                arcToRelative(0.389f, 0.389f, 0f, false, true, 0.217f, -0.665f)
                lineToRelative(2.428f, -0.352f)
                lineToRelative(1.086f, -2.193f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, 0.702f, 0f)
                lineToRelative(1.086f, 2.193f)
                lineToRelative(2.428f, 0.352f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.217f, 0.665f)
                lineToRelative(-1.757f, 1.707f)
                lineToRelative(0.414f, 2.41f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, -0.567f, 0.411f)
                lineToRelative(-2.172f, -1.138f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.557f, 5.556f)
                lineToRelative(1f, -0.146f)
                lineToRelative(1.086f, -2.193f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, 0.702f, 0f)
                lineToRelative(1.086f, 2.193f)
                lineToRelative(2.428f, 0.352f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.217f, 0.665f)
                lineToRelative(-1.757f, 1.707f)
                lineToRelative(0.414f, 2.41f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, -0.014f, 0.187f)
                moveToRelative(-4.153f, -0.166f)
                lineToRelative(-0.744f, 0.39f)
                arcToRelative(0.392f, 0.392f, 0f, false, true, -0.568f, -0.41f)
                lineToRelative(0.188f, -1.093f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _StarsOff!!
    }

private var _StarsOff: ImageVector? = null

