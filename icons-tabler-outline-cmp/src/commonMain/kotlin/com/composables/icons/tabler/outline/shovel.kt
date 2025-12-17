package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Shovel: ImageVector
    get() {
        if (_Shovel != null) return _Shovel!!
        
        _Shovel = ImageVector.Builder(
            name = "shovel",
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
                moveTo(17f, 4f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 5.5f)
                lineToRelative(-8f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.276f, 11.284f)
                lineToRelative(4.44f, 4.44f)
                arcToRelative(0.968f, 0.968f, 0f, false, true, 0f, 1.369f)
                lineToRelative(-2.704f, 2.704f)
                arcToRelative(4.108f, 4.108f, 0f, false, true, -5.809f, -5.81f)
                lineToRelative(2.704f, -2.703f)
                arcToRelative(0.968f, 0.968f, 0f, false, true, 1.37f, 0f)
                close()
            }
        }.build()
        
        return _Shovel!!
    }

private var _Shovel: ImageVector? = null

