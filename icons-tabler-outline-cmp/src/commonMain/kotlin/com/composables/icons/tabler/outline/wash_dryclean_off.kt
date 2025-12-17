package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WashDrycleanOff: ImageVector
    get() {
        if (_WashDrycleanOff != null) return _WashDrycleanOff!!
        
        _WashDrycleanOff = ImageVector.Builder(
            name = "wash-dryclean-off",
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
                moveTo(20.048f, 16.033f)
                arcToRelative(9f, 9f, 0f, false, false, -12.094f, -12.075f)
                moveToRelative(-2.321f, 1.682f)
                arcToRelative(9f, 9f, 0f, false, false, 12.733f, 12.723f)
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
        
        return _WashDrycleanOff!!
    }

private var _WashDrycleanOff: ImageVector? = null

