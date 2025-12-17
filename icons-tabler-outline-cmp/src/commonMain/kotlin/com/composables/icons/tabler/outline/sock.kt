package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Sock: ImageVector
    get() {
        if (_Sock != null) return _Sock!!
        
        _Sock = ImageVector.Builder(
            name = "sock",
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
                moveTo(13f, 3f)
                verticalLineToRelative(6f)
                lineToRelative(4.798f, 5.142f)
                arcToRelative(4f, 4f, 0f, false, true, -5.441f, 5.86f)
                lineToRelative(-6.736f, -6.41f)
                arcToRelative(2f, 2f, 0f, false, true, -0.621f, -1.451f)
                verticalLineToRelative(-9.141f)
                horizontalLineToRelative(8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.895f, 15.768f)
                curveToRelative(0.708f, -0.721f, 1.105f, -1.677f, 1.105f, -2.768f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
            }
        }.build()
        
        return _Sock!!
    }

private var _Sock: ImageVector? = null

