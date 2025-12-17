package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ScaleOutline: ImageVector
    get() {
        if (_ScaleOutline != null) return _ScaleOutline!!
        
        _ScaleOutline = ImageVector.Builder(
            name = "scale-outline",
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
                moveTo(3f, 3f)
                moveToRelative(0f, 4f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(10f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(10f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-10f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                curveToRelative(1.956f, 0f, 3.724f, 0.802f, 5f, 2.095f)
                lineToRelative(-2.956f, 2.904f)
                arcToRelative(3f, 3f, 0f, false, false, -2.038f, -0.799f)
                arcToRelative(3f, 3f, 0f, false, false, -2.038f, 0.798f)
                lineToRelative(-2.956f, -2.903f)
                arcToRelative(6.979f, 6.979f, 0f, false, true, 5f, -2.095f)
                close()
            }
        }.build()
        
        return _ScaleOutline!!
    }

private var _ScaleOutline: ImageVector? = null

