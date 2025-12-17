package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Pizza: ImageVector
    get() {
        if (_Pizza != null) return _Pizza!!
        
        _Pizza = ImageVector.Builder(
            name = "pizza",
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
                moveTo(12f, 21.5f)
                curveToRelative(-3.04f, 0f, -5.952f, -0.714f, -8.5f, -1.983f)
                lineToRelative(8.5f, -16.517f)
                lineToRelative(8.5f, 16.517f)
                arcToRelative(19.09f, 19.09f, 0f, false, true, -8.5f, 1.983f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.38f, 15.866f)
                arcToRelative(14.94f, 14.94f, 0f, false, false, 6.815f, 1.634f)
                arcToRelative(14.944f, 14.944f, 0f, false, false, 6.502f, -1.479f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 11.01f)
                verticalLineToRelative(-0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 14f)
                verticalLineToRelative(-0.01f)
            }
        }.build()
        
        return _Pizza!!
    }

private var _Pizza: ImageVector? = null

