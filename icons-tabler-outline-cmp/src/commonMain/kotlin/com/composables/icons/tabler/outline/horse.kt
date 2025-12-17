package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Horse: ImageVector
    get() {
        if (_Horse != null) return _Horse!!
        
        _Horse = ImageVector.Builder(
            name = "horse",
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
                moveTo(7f, 10f)
                lineToRelative(-0.85f, 8.507f)
                arcToRelative(1.357f, 1.357f, 0f, false, false, 1.35f, 1.493f)
                horizontalLineToRelative(0.146f)
                arcToRelative(2f, 2f, 0f, false, false, 1.857f, -1.257f)
                lineToRelative(0.994f, -2.486f)
                arcToRelative(2f, 2f, 0f, false, true, 1.857f, -1.257f)
                horizontalLineToRelative(1.292f)
                arcToRelative(2f, 2f, 0f, false, true, 1.857f, 1.257f)
                lineToRelative(0.994f, 2.486f)
                arcToRelative(2f, 2f, 0f, false, false, 1.857f, 1.257f)
                horizontalLineToRelative(0.146f)
                arcToRelative(1.37f, 1.37f, 0f, false, false, 1.364f, -1.494f)
                lineToRelative(-0.864f, -9.506f)
                horizontalLineToRelative(-8f)
                curveToRelative(0f, -3f, -3f, -5f, -6f, -5f)
                lineToRelative(-3f, 6f)
                lineToRelative(2f, 2f)
                lineToRelative(3f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 14f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
            }
        }.build()
        
        return _Horse!!
    }

private var _Horse: ImageVector? = null

