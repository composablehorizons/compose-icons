package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Capsule: ImageVector
    get() {
        if (_Capsule != null) return _Capsule!!
        
        _Capsule = ImageVector.Builder(
            name = "capsule",
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
                moveTo(6f, 3f)
                moveToRelative(0f, 6f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(0f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(6f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                horizontalLineToRelative(0f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                close()
            }
        }.build()
        
        return _Capsule!!
    }

private var _Capsule: ImageVector? = null

