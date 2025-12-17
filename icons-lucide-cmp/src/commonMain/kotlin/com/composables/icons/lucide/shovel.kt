package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shovel: ImageVector
    get() {
        if (_Shovel != null) return _Shovel!!
        
        _Shovel = ImageVector.Builder(
            name = "shovel",
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
                moveTo(21.56f, 4.56f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 2.122f)
                lineToRelative(-0.47f, 0.47f)
                arcToRelative(3f, 3f, 0f, false, true, -4.212f, -0.03f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -4.243f)
                lineToRelative(0.44f, -0.44f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.121f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 22f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-3.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, -0.707f)
                lineToRelative(3.355f, -3.355f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 1.704f, 0f)
                lineToRelative(3.296f, 3.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 0f, 1.704f)
                lineToRelative(-3.355f, 3.355f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, 0.293f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                lineToRelative(7.879f, -7.878f)
            }
        }.build()
        
        return _Shovel!!
    }

private var _Shovel: ImageVector? = null

