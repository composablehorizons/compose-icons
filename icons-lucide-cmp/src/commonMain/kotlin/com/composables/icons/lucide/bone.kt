package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bone: ImageVector
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
                moveTo(17f, 10f)
                curveToRelative(0.7f, -0.7f, 1.69f, 0f, 2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5f, 0f)
                curveToRelative(0f, 0.81f, 0.7f, 1.8f, 0f, 2.5f)
                lineToRelative(-7f, 7f)
                curveToRelative(-0.7f, 0.7f, -1.69f, 0f, -2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                curveToRelative(0f, -0.81f, -0.7f, -1.8f, 0f, -2.5f)
                close()
            }
        }.build()
        
        return _Bone!!
    }

private var _Bone: ImageVector? = null

