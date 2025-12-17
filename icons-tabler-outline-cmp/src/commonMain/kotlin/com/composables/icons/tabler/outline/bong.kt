package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bong: ImageVector
    get() {
        if (_Bong != null) return _Bong!!
        
        _Bong = ImageVector.Builder(
            name = "bong",
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
                verticalLineToRelative(8.416f)
                curveToRelative(0.134f, 0.059f, 0.265f, 0.123f, 0.393f, 0.193f)
                lineToRelative(3.607f, -3.609f)
                lineToRelative(2f, 2f)
                lineToRelative(-3.608f, 3.608f)
                arcToRelative(5f, 5f, 0f, true, true, -6.392f, -2.192f)
                verticalLineToRelative(-8.416f)
                horizontalLineToRelative(4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 3f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.1f, 17f)
                horizontalLineToRelative(9.8f)
            }
        }.build()
        
        return _Bong!!
    }

private var _Bong: ImageVector? = null

