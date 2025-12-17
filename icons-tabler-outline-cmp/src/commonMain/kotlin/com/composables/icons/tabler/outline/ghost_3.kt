package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Ghost3: ImageVector
    get() {
        if (_Ghost3 != null) return _Ghost3!!
        
        _Ghost3 = ImageVector.Builder(
            name = "ghost-3",
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
                moveTo(5f, 11f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
                verticalLineToRelative(7f)
                arcToRelative(1.78f, 1.78f, 0f, false, true, -3.1f, 1.4f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -2.6f, 0f)
                arcToRelative(1.65f, 1.65f, 0f, false, true, -2.6f, 0f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -2.6f, 0f)
                arcToRelative(1.78f, 1.78f, 0f, false, true, -3.1f, -1.4f)
                verticalLineToRelative(-7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _Ghost3!!
    }

private var _Ghost3: ImageVector? = null

