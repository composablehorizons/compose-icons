package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Sausage: ImageVector
    get() {
        if (_Sausage != null) return _Sausage!!
        
        _Sausage = ImageVector.Builder(
            name = "sausage",
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
                moveTo(5.5f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, 2.5f)
                curveToRelative(0f, 7.18f, 5.82f, 13f, 13f, 13f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, -2.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.195f, 5.519f)
                lineToRelative(-1.243f, -1.989f)
                arcToRelative(1f, 1f, 0f, false, true, 0.848f, -1.53f)
                horizontalLineToRelative(1.392f)
                arcToRelative(1f, 1f, 0f, false, true, 0.848f, 1.53f)
                lineToRelative(-1.245f, 1.99f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.482f, 18.225f)
                lineToRelative(1.989f, -1.243f)
                arcToRelative(1f, 1f, 0f, false, true, 1.53f, 0.848f)
                verticalLineToRelative(1.392f)
                arcToRelative(1f, 1f, 0f, false, true, -1.53f, 0.848f)
                lineToRelative(-1.991f, -1.245f)
            }
        }.build()
        
        return _Sausage!!
    }

private var _Sausage: ImageVector? = null

