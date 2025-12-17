package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowDownRightCircle: ImageVector
    get() {
        if (_ArrowDownRightCircle != null) return _ArrowDownRightCircle!!
        
        _ArrowDownRightCircle = ImageVector.Builder(
            name = "arrow-down-right-circle",
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
                moveTo(8.464f, 8.464f)
                lineToRelative(9.536f, 9.536f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.414f, 8.414f)
                arcToRelative(2f, 2f, 0f, true, false, -2.828f, -2.828f)
                arcToRelative(2f, 2f, 0f, false, false, 2.828f, 2.828f)
            }
        }.build()
        
        return _ArrowDownRightCircle!!
    }

private var _ArrowDownRightCircle: ImageVector? = null

