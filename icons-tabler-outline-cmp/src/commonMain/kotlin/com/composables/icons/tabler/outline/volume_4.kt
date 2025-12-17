package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Volume4: ImageVector
    get() {
        if (_Volume4 != null) return _Volume4!!
        
        _Volume4 = ImageVector.Builder(
            name = "volume-4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent),
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(8f, 15f)
                    horizontalLineToRelative(-2f)
                    arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                    verticalLineToRelative(-4f)
                    arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                    horizontalLineToRelative(2f)
                    lineToRelative(3.5f, -4.5f)
                    arcToRelative(0.8f, 0.8f, 0f, false, true, 1.5f, 0.5f)
                    verticalLineToRelative(14f)
                    arcToRelative(0.8f, 0.8f, 0f, false, true, -1.5f, 0.5f)
                    lineToRelative(-3.5f, -4.5f)
                }
            }
        }.build()
        
        return _Volume4!!
    }

private var _Volume4: ImageVector? = null

