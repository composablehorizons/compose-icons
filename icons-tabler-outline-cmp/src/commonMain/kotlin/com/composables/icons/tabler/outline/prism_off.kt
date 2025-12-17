package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PrismOff: ImageVector
    get() {
        if (_PrismOff != null) return _PrismOff!!
        
        _PrismOff = ImageVector.Builder(
            name = "prism-off",
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
                moveTo(12f, 12f)
                verticalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.957f, 17.952f)
                lineToRelative(-4.937f, 3.703f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -2.04f, 0f)
                lineToRelative(-5.98f, -4.485f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1f, -2f)
                verticalLineToRelative(-11.17f)
                moveToRelative(3f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(11.17f)
                curveToRelative(0f, 0.25f, -0.037f, 0.495f, -0.109f, 0.729f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.688f, 8.7f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, 0.357f, -0.214f)
                lineToRelative(6.655f, -5.186f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _PrismOff!!
    }

private var _PrismOff: ImageVector? = null

