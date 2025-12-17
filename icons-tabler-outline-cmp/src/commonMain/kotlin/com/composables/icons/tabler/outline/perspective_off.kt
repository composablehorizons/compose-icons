package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PerspectiveOff: ImageVector
    get() {
        if (_PerspectiveOff != null) return _PerspectiveOff!!
        
        _PerspectiveOff = ImageVector.Builder(
            name = "perspective-off",
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
                moveTo(8.511f, 4.502f)
                lineToRelative(9.63f, 1.375f)
                arcToRelative(1f, 1f, 0f, false, true, 0.859f, 0.99f)
                verticalLineToRelative(8.133f)
                moveToRelative(-0.859f, 3.123f)
                lineToRelative(-12f, 1.714f)
                arcToRelative(1f, 1f, 0f, false, true, -1.141f, -0.99f)
                verticalLineToRelative(-13.694f)
                arcToRelative(1f, 1f, 0f, false, true, 0.01f, -0.137f)
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
        
        return _PerspectiveOff!!
    }

private var _PerspectiveOff: ImageVector? = null

