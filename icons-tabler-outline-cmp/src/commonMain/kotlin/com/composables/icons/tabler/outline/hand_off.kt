package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HandOff: ImageVector
    get() {
        if (_HandOff != null) return _HandOff!!
        
        _HandOff = ImageVector.Builder(
            name = "hand-off",
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
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 13.5f)
                verticalLineToRelative(-5.5f)
                moveToRelative(0.44f, -3.562f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.56f, 1.062f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, 4.008f)
                verticalLineToRelative(0.992f)
                moveToRelative(0f, -6.5f)
                verticalLineToRelative(-2f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 3f, 0f)
                verticalLineToRelative(6.5f)
                moveToRelative(0f, -4.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                verticalLineToRelative(6.5f)
                moveToRelative(0f, -4.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                verticalLineToRelative(8.5f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.114f, -0.292f, -3.956f, -1.397f, -5f, -3f)
                lineToRelative(-2.7f, -5.25f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, 2.75f, -2f)
                lineToRelative(0.9f, 1.75f)
            }
        }.build()
        
        return _HandOff!!
    }

private var _HandOff: ImageVector? = null

