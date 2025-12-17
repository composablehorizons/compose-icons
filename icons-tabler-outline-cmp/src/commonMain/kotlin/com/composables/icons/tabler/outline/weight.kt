package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Weight: ImageVector
    get() {
        if (_Weight != null) return _Weight!!
        
        _Weight = ImageVector.Builder(
            name = "weight",
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
                moveTo(12f, 6f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.835f, 9f)
                horizontalLineToRelative(10.33f)
                arcToRelative(1f, 1f, 0f, false, true, 0.984f, 0.821f)
                lineToRelative(1.637f, 9f)
                arcToRelative(1f, 1f, 0f, false, true, -0.984f, 1.179f)
                horizontalLineToRelative(-13.604f)
                arcToRelative(1f, 1f, 0f, false, true, -0.984f, -1.179f)
                lineToRelative(1.637f, -9f)
                arcToRelative(1f, 1f, 0f, false, true, 0.984f, -0.821f)
                close()
            }
        }.build()
        
        return _Weight!!
    }

private var _Weight: ImageVector? = null

