package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Sailboat: ImageVector
    get() {
        if (_Sailboat != null) return _Sailboat!!
        
        _Sailboat = ImageVector.Builder(
            name = "sailboat",
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
                moveTo(2f, 20f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, -1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 18f)
                lineToRelative(-1f, -3f)
                horizontalLineToRelative(18f)
                lineToRelative(-1f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 12f)
                horizontalLineToRelative(7f)
                lineToRelative(-7f, -9f)
                verticalLineToRelative(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 7f)
                lineToRelative(-2f, 5f)
            }
        }.build()
        
        return _Sailboat!!
    }

private var _Sailboat: ImageVector? = null

