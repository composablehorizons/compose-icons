package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Mickey: ImageVector
    get() {
        if (_Mickey != null) return _Mickey!!
        
        _Mickey = ImageVector.Builder(
            name = "mickey",
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
                moveTo(5.5f, 3f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.25f, 4.8f)
                arcToRelative(7.017f, 7.017f, 0f, false, false, -2.424f, 2.1f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -0.826f, -6.9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 3f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -0.826f, 6.902f)
                arcToRelative(7.013f, 7.013f, 0f, false, false, -2.424f, -2.103f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.25f, -4.799f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                moveToRelative(-7f, 0f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcToRelative(7f, 7f, 0f, true, false, -14f, 0f)
            }
        }.build()
        
        return _Mickey!!
    }

private var _Mickey: ImageVector? = null

