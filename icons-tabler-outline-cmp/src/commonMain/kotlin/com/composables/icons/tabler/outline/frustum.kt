package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Frustum: ImageVector
    get() {
        if (_Frustum != null) return _Frustum!!
        
        _Frustum = ImageVector.Builder(
            name = "frustum",
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
                moveTo(18.402f, 5.508f)
                lineToRelative(2.538f, 10.158f)
                arcToRelative(1.99f, 1.99f, 0f, false, true, -1.064f, 2.278f)
                lineToRelative(-7.036f, 3.366f)
                arcToRelative(1.945f, 1.945f, 0f, false, true, -1.682f, 0f)
                lineToRelative(-7.035f, -3.365f)
                arcToRelative(1.99f, 1.99f, 0f, false, true, -1.064f, -2.278f)
                lineToRelative(2.539f, -10.159f)
                arcToRelative(1.98f, 1.98f, 0f, false, true, 1.11f, -1.328f)
                lineToRelative(4.496f, -2.01f)
                arcToRelative(1.95f, 1.95f, 0f, false, true, 1.59f, 0f)
                lineToRelative(4.496f, 2.01f)
                curveToRelative(0.554f, 0.246f, 0.963f, 0.736f, 1.112f, 1.328f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 4.82f)
                lineToRelative(-5.198f, 2.324f)
                arcToRelative(1.963f, 1.963f, 0f, false, true, -1.602f, 0f)
                lineToRelative(-5.2f, -2.325f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7.32f)
                verticalLineToRelative(14.18f)
            }
        }.build()
        
        return _Frustum!!
    }

private var _Frustum: ImageVector? = null

