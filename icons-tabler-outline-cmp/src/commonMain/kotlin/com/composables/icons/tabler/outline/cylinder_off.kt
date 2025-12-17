package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CylinderOff: ImageVector
    get() {
        if (_CylinderOff != null) return _CylinderOff!!
        
        _CylinderOff = ImageVector.Builder(
            name = "cylinder-off",
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
                moveTo(5.23f, 5.233f)
                curveToRelative(-0.15f, 0.245f, -0.23f, 0.502f, -0.23f, 0.767f)
                curveToRelative(0f, 1.131f, 1.461f, 2.117f, 3.62f, 2.628f)
                moveToRelative(4.357f, 0.343f)
                curveToRelative(3.404f, -0.204f, 6.023f, -1.456f, 6.023f, -2.971f)
                curveToRelative(0f, -1.657f, -3.134f, -3f, -7f, -3f)
                curveToRelative(-1.645f, 0f, -3.158f, 0.243f, -4.353f, 0.65f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.657f, 3.134f, 3f, 7f, 3f)
                curveToRelative(3.245f, 0f, 5.974f, -0.946f, 6.767f, -2.23f)
                moveToRelative(0.233f, -3.77f)
                verticalLineToRelative(-9f)
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
        
        return _CylinderOff!!
    }

private var _CylinderOff: ImageVector? = null

