package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.UserOff: ImageVector
    get() {
        if (_UserOff != null) return _UserOff!!
        
        _UserOff = ImageVector.Builder(
            name = "user-off",
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
                moveTo(8.18f, 8.189f)
                arcToRelative(4.01f, 4.01f, 0f, false, false, 2.616f, 2.627f)
                moveToRelative(3.507f, -0.545f)
                arcToRelative(4f, 4f, 0f, true, false, -5.59f, -5.552f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 21f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.412f, 0f, 0.81f, 0.062f, 1.183f, 0.178f)
                moveToRelative(2.633f, 2.618f)
                curveToRelative(0.12f, 0.38f, 0.184f, 0.785f, 0.184f, 1.204f)
                verticalLineToRelative(2f)
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
        
        return _UserOff!!
    }

private var _UserOff: ImageVector? = null

