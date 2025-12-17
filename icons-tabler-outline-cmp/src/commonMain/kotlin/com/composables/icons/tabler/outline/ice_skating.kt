package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.IceSkating: ImageVector
    get() {
        if (_IceSkating != null) return _IceSkating!!
        
        _IceSkating = ImageVector.Builder(
            name = "ice-skating",
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
                moveTo(5.905f, 5f)
                horizontalLineToRelative(3.418f)
                arcToRelative(1f, 1f, 0f, false, true, 0.928f, 0.629f)
                lineToRelative(1.143f, 2.856f)
                arcToRelative(3f, 3f, 0f, false, false, 2.207f, 1.83f)
                lineToRelative(4.717f, 0.926f)
                arcToRelative(2.084f, 2.084f, 0f, false, true, 1.682f, 2.045f)
                verticalLineToRelative(0.714f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-13.895f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1.1f)
                lineToRelative(0.8f, -8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -0.9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 19f)
                horizontalLineToRelative(17f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                verticalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                verticalLineToRelative(4f)
            }
        }.build()
        
        return _IceSkating!!
    }

private var _IceSkating: ImageVector? = null

