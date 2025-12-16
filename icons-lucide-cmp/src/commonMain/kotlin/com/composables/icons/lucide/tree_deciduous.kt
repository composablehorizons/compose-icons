package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TreeDeciduous: ImageVector
    get() {
        if (_TreeDeciduous != null) return _TreeDeciduous!!
        
        _TreeDeciduous = ImageVector.Builder(
            name = "tree-deciduous",
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
                moveTo(8f, 19f)
                arcToRelative(4f, 4f, 0f, false, true, -2.24f, -7.32f)
                arcTo(3.5f, 3.5f, 0f, false, true, 9f, 6.03f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                verticalLineToRelative(0.04f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.24f, 5.65f)
                arcTo(4f, 4f, 0f, false, true, 16f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                verticalLineToRelative(3f)
            }
        }.build()
        
        return _TreeDeciduous!!
    }

private var _TreeDeciduous: ImageVector? = null

