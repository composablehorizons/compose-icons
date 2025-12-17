package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Submarine: ImageVector
    get() {
        if (_Submarine != null) return _Submarine!!
        
        _Submarine = ImageVector.Builder(
            name = "submarine",
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
                moveTo(3f, 11f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                lineToRelative(1f, -1.5f)
                lineToRelative(3f, 1.5f)
                horizontalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                horizontalLineToRelative(-10f)
                horizontalLineToRelative(0f)
                lineToRelative(-3f, 1.5f)
                lineToRelative(-1f, -1.5f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 11f)
                lineToRelative(-1f, -3f)
                horizontalLineToRelative(-5f)
                lineToRelative(-1f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 8f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
            }
        }.build()
        
        return _Submarine!!
    }

private var _Submarine: ImageVector? = null

