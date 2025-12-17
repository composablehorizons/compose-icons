package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.KeyOff: ImageVector
    get() {
        if (_KeyOff != null) return _KeyOff!!
        
        _KeyOff = ImageVector.Builder(
            name = "key-off",
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
                moveTo(10.17f, 6.159f)
                lineToRelative(2.316f, -2.316f)
                arcToRelative(2.877f, 2.877f, 0f, false, true, 4.069f, 0f)
                lineToRelative(3.602f, 3.602f)
                arcToRelative(2.877f, 2.877f, 0f, false, true, 0f, 4.069f)
                lineToRelative(-2.33f, 2.33f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.931f, 14.948f)
                arcToRelative(2.863f, 2.863f, 0f, false, true, -1.486f, -0.79f)
                lineToRelative(-0.301f, -0.302f)
                lineToRelative(-6.558f, 6.558f)
                arcToRelative(2f, 2f, 0f, false, true, -1.239f, 0.578f)
                lineToRelative(-0.175f, 0.008f)
                horizontalLineToRelative(-1.172f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-1.172f)
                arcToRelative(2f, 2f, 0f, false, true, 0.467f, -1.284f)
                lineToRelative(0.119f, -0.13f)
                lineToRelative(0.414f, -0.414f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                lineToRelative(2.144f, -2.144f)
                lineToRelative(-0.301f, -0.301f)
                arcToRelative(2.863f, 2.863f, 0f, false, true, -0.794f, -1.504f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                horizontalLineToRelative(0.01f)
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
        
        return _KeyOff!!
    }

private var _KeyOff: ImageVector? = null

