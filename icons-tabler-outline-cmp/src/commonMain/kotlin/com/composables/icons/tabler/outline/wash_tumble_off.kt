package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WashTumbleOff: ImageVector
    get() {
        if (_WashTumbleOff != null) return _WashTumbleOff!!
        
        _WashTumbleOff = ImageVector.Builder(
            name = "wash-tumble-off",
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
                moveTo(20.116f, 20.127f)
                arcToRelative(2.99f, 2.99f, 0f, false, true, -2.116f, 0.873f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.827f, 0.335f, -1.576f, 0.877f, -2.12f)
                moveToRelative(3.123f, -0.88f)
                horizontalLineToRelative(11f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.744f, 13.74f)
                arcToRelative(6f, 6f, 0f, false, false, -7.486f, -7.482f)
                moveToRelative(-2.499f, 1.497f)
                arcToRelative(6f, 6f, 0f, true, false, 8.48f, 8.49f)
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
        
        return _WashTumbleOff!!
    }

private var _WashTumbleOff: ImageVector? = null

