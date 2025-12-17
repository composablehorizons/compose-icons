package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EditCircleOff: ImageVector
    get() {
        if (_EditCircleOff != null) return _EditCircleOff!!
        
        _EditCircleOff = ImageVector.Builder(
            name = "edit-circle-off",
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
                moveTo(10.507f, 10.498f)
                lineToRelative(-1.507f, 1.502f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                lineToRelative(1.493f, -1.498f)
                moveToRelative(2f, -2.01f)
                lineToRelative(4.89f, -4.907f)
                arcToRelative(2.1f, 2.1f, 0f, false, false, -2.97f, -2.97f)
                lineToRelative(-4.913f, 4.896f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 5f)
                lineToRelative(3f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.476f, 7.471f)
                arcToRelative(7f, 7f, 0f, false, false, 2.524f, 13.529f)
                arcToRelative(7f, 7f, 0f, false, false, 6.53f, -4.474f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _EditCircleOff!!
    }

private var _EditCircleOff: ImageVector? = null

