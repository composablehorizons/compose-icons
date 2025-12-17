package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bone: ImageVector
    get() {
        if (_Bone != null) return _Bone!!
        
        _Bone = ImageVector.Builder(
            name = "bone",
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
                moveTo(15f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                arcToRelative(3f, 3f, 0f, true, true, -2.12f, 5.122f)
                lineToRelative(-4.758f, 4.758f)
                arcToRelative(3f, 3f, 0f, true, true, -5.117f, 2.297f)
                lineToRelative(0f, -0.177f)
                lineToRelative(-0.176f, 0f)
                arcToRelative(3f, 3f, 0f, true, true, 2.298f, -5.115f)
                lineToRelative(4.758f, -4.758f)
                arcToRelative(3f, 3f, 0f, false, true, 2.12f, -5.122f)
                close()
            }
        }.build()
        
        return _Bone!!
    }

private var _Bone: ImageVector? = null

