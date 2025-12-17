package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.VenetianMask: ImageVector
    get() {
        if (_VenetianMask != null) return _VenetianMask!!
        
        _VenetianMask = ImageVector.Builder(
            name = "venetian-mask",
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
                moveTo(18f, 11f)
                curveToRelative(-1.5f, 0f, -2.5f, 0.5f, -3f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
                arcToRelative(8f, 8f, 0f, false, true, 5f, 2f)
                arcToRelative(8f, 8f, 0f, false, true, 5f, -2f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, -5f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-3f)
                arcToRelative(8f, 8f, 0f, false, false, -5f, 2f)
                arcToRelative(8f, 8f, 0f, false, false, -5f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 11f)
                curveToRelative(1.5f, 0f, 2.5f, 0.5f, 3f, 2f)
            }
        }.build()
        
        return _VenetianMask!!
    }

private var _VenetianMask: ImageVector? = null

