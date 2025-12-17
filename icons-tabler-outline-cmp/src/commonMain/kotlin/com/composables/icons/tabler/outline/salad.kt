package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Salad: ImageVector
    get() {
        if (_Salad != null) return _Salad!!
        
        _Salad = ImageVector.Builder(
            name = "salad",
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
                moveTo(4f, 11f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.5f, -2.517f, 5.573f, -4f, 6.5f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.687f, -1.054f, -4f, -5f, -4f, -6.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 11f)
                curveToRelative(0.351f, -1.017f, 0.426f, -2.236f, 0.5f, -3.714f)
                verticalLineToRelative(-1.286f)
                horizontalLineToRelative(-2.256f)
                curveToRelative(-2.83f, 0f, -4.616f, 0.804f, -5.64f, 2.076f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.255f, 11.008f)
                arcToRelative(12.204f, 12.204f, 0f, false, true, -0.255f, -2.008f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.755f)
                curveToRelative(0.98f, 0f, 1.801f, 0.124f, 2.479f, 0.35f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8f)
                lineToRelative(1f, -4f)
                lineToRelative(4f, 2.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 11f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5f, 0f)
                verticalLineToRelative(0.5f)
            }
        }.build()
        
        return _Salad!!
    }

private var _Salad: ImageVector? = null

