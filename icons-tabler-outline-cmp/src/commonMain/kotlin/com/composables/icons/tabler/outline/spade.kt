package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Spade: ImageVector
    get() {
        if (_Spade != null) return _Spade!!
        
        _Spade = ImageVector.Builder(
            name = "spade",
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
                moveTo(12f, 3f)
                lineToRelative(4.919f, 4.5f)
                curveToRelative(0.61f, 0.587f, 1.177f, 1.177f, 1.703f, 1.771f)
                arcToRelative(5.527f, 5.527f, 0f, false, true, 0.264f, 6.979f)
                curveToRelative(-1.18f, 1.56f, -3.338f, 1.92f, -4.886f, 0.75f)
                verticalLineToRelative(1f)
                lineToRelative(1f, 3f)
                horizontalLineToRelative(-6f)
                lineToRelative(1f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.54f, 1.07f, -3.735f, 0.772f, -4.886f, -0.75f)
                arcToRelative(5.527f, 5.527f, 0f, false, true, 0.264f, -6.979f)
                arcToRelative(30.883f, 30.883f, 0f, false, true, 1.703f, -1.771f)
                arcToRelative(1541.72f, 1541.72f, 0f, false, true, 4.919f, -4.5f)
                close()
            }
        }.build()
        
        return _Spade!!
    }

private var _Spade: ImageVector? = null

