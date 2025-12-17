package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HeartHandshake: ImageVector
    get() {
        if (_HeartHandshake != null) return _HeartHandshake!!
        
        _HeartHandshake = ImageVector.Builder(
            name = "heart-handshake",
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
                moveTo(19.414f, 14.414f)
                curveTo(21f, 12.828f, 22f, 11.5f, 22f, 9.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -9.591f, -3.676f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, -0.818f, 0.001f)
                arcTo(5.5f, 5.5f, 0f, false, false, 2f, 9.5f)
                curveToRelative(0f, 2.3f, 1.5f, 4f, 3f, 5.5f)
                lineToRelative(5.535f, 5.362f)
                arcToRelative(2f, 2f, 0f, false, false, 2.879f, 0.052f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, -0.004f, -3f)
                arcToRelative(2.124f, 2.124f, 0f, true, false, 3f, -3f)
                arcToRelative(2.124f, 2.124f, 0f, false, false, 3.004f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -2.828f)
                lineToRelative(-1.881f, -1.882f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, -3.409f, 0f)
                lineToRelative(-1.71f, 1.71f)
                arcToRelative(2f, 2f, 0f, false, true, -2.828f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.828f)
                lineToRelative(2.823f, -2.762f)
            }
        }.build()
        
        return _HeartHandshake!!
    }

private var _HeartHandshake: ImageVector? = null

