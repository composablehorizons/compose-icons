package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TreePine: ImageVector
    get() {
        if (_TreePine != null) return _TreePine!!
        
        _TreePine = ImageVector.Builder(
            name = "tree-pine",
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
                moveTo(17f, 14f)
                lineToRelative(3f, 3.3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.7f, 1.7f)
                horizontalLineTo(4.7f)
                arcToRelative(1f, 1f, 0f, false, true, -0.7f, -1.7f)
                lineTo(7f, 14f)
                horizontalLineToRelative(-0.3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.7f, -1.7f)
                lineTo(9f, 9f)
                horizontalLineToRelative(-0.2f)
                arcTo(1f, 1f, 0f, false, true, 8f, 7.3f)
                lineTo(12f, 3f)
                lineToRelative(4f, 4.3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.8f, 1.7f)
                horizontalLineTo(15f)
                lineToRelative(3f, 3.3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.7f, 1.7f)
                horizontalLineTo(17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineToRelative(-3f)
            }
        }.build()
        
        return _TreePine!!
    }

private var _TreePine: ImageVector? = null

