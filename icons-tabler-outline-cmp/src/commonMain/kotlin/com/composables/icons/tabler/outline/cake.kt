package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cake: ImageVector
    get() {
        if (_Cake != null) return _Cake!!
        
        _Cake = ImageVector.Builder(
            name = "cake",
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
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 14.803f)
                curveToRelative(0.312f, 0.135f, 0.654f, 0.204f, 1f, 0.197f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, 1f)
                curveToRelative(0.35f, 0.007f, 0.692f, -0.062f, 1f, -0.197f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                lineToRelative(1.465f, 1.638f)
                arcToRelative(2f, 2f, 0f, true, true, -3.015f, 0.099f)
                lineToRelative(1.55f, -1.737f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

