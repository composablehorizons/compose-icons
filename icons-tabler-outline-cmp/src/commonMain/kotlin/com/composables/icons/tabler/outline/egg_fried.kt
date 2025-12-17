package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EggFried: ImageVector
    get() {
        if (_EggFried != null) return _EggFried!!
        
        _EggFried = ImageVector.Builder(
            name = "egg-fried",
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
                moveTo(12f, 12f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 3f)
                arcToRelative(5f, 5f, 0f, false, true, 4.872f, 6.13f)
                arcToRelative(3f, 3f, 0f, false, true, 0.178f, 5.681f)
                arcToRelative(3f, 3f, 0f, true, true, -4.684f, 3.626f)
                arcToRelative(5f, 5f, 0f, true, true, -8.662f, -5f)
                arcToRelative(5f, 5f, 0f, true, true, 4.645f, -8.856f)
                arcToRelative(4.982f, 4.982f, 0f, false, true, 3.651f, -1.585f)
                close()
            }
        }.build()
        
        return _EggFried!!
    }

private var _EggFried: ImageVector? = null

