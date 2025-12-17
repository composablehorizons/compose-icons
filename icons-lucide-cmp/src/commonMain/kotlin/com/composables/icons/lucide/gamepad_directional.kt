package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GamepadDirectional: ImageVector
    get() {
        if (_GamepadDirectional != null) return _GamepadDirectional!!
        
        _GamepadDirectional = ImageVector.Builder(
            name = "gamepad-directional",
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
                moveTo(11.146f, 15.854f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 1.708f, 0f)
                lineToRelative(1.56f, 1.56f)
                arcTo(2f, 2f, 0f, false, true, 15f, 18.828f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-2.172f)
                arcToRelative(2f, 2f, 0f, false, true, 0.586f, -1.414f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.828f, 15f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -0.586f)
                lineToRelative(-1.56f, -1.56f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 0f, -1.708f)
                lineToRelative(1.56f, -1.56f)
                arcTo(2f, 2f, 0f, false, true, 18.828f, 9f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.586f, 14.414f)
                arcTo(2f, 2f, 0f, false, true, 5.172f, 15f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, 0.586f)
                lineToRelative(1.56f, 1.56f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 0f, 1.708f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, false, true, -0.586f, 1.414f)
                lineToRelative(-1.56f, 1.56f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, -1.708f, 0f)
                lineToRelative(-1.56f, -1.56f)
                arcTo(2f, 2f, 0f, false, true, 9f, 5.172f)
                close()
            }
        }.build()
        
        return _GamepadDirectional!!
    }

private var _GamepadDirectional: ImageVector? = null

