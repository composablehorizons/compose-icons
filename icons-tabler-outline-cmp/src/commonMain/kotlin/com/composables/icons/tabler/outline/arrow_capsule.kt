package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowCapsule: ImageVector
    get() {
        if (_ArrowCapsule != null) return _ArrowCapsule!!
        
        _ArrowCapsule = ImageVector.Builder(
            name = "arrow-capsule",
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
                moveTo(18f, 15f)
                arcToRelative(6f, 6f, 0f, true, true, -12f, 0f)
                verticalLineToRelative(-6f)
                arcToRelative(6f, 6f, 0f, true, true, 12f, 0f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 8f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
        }.build()
        
        return _ArrowCapsule!!
    }

private var _ArrowCapsule: ImageVector? = null

