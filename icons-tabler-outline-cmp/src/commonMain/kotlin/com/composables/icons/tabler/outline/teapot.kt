package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Teapot: ImageVector
    get() {
        if (_Teapot != null) return _Teapot!!
        
        _Teapot = ImageVector.Builder(
            name = "teapot",
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
                moveTo(10.29f, 3f)
                horizontalLineToRelative(3.42f)
                arcToRelative(2f, 2f, 0f, false, true, 1.988f, 1.78f)
                lineToRelative(1.555f, 14f)
                arcToRelative(2f, 2f, 0f, false, true, -1.988f, 2.22f)
                horizontalLineToRelative(-6.53f)
                arcToRelative(2f, 2f, 0f, false, true, -1.988f, -2.22f)
                lineToRelative(1.555f, -14f)
                arcToRelative(2f, 2f, 0f, false, true, 1.988f, -1.78f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.47f, 12.5f)
                lineToRelative(-4.257f, -5.019f)
                arcToRelative(0.899f, 0.899f, 0f, false, true, 0.69f, -1.481f)
                horizontalLineToRelative(13.09f)
                arcToRelative(3f, 3f, 0f, false, true, 3.007f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.657f, -1.346f, 3f, -3.007f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 17f)
                horizontalLineToRelative(10f)
            }
        }.build()
        
        return _Teapot!!
    }

private var _Teapot: ImageVector? = null

