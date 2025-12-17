package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Star: ImageVector
    get() {
        if (_Star != null) return _Star!!
        
        _Star = ImageVector.Builder(
            name = "star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(11.48f, 3.499f)
                arcToRelative(0.562f, 0.562f, 0f, false, true, 1.04f, 0f)
                lineToRelative(2.125f, 5.111f)
                arcToRelative(0.563f, 0.563f, 0f, false, false, 0.475f, 0.345f)
                lineToRelative(5.518f, 0.442f)
                curveToRelative(0.499f, 0.04f, 0.701f, 0.663f, 0.321f, 0.988f)
                lineToRelative(-4.204f, 3.602f)
                arcToRelative(0.563f, 0.563f, 0f, false, false, -0.182f, 0.557f)
                lineToRelative(1.285f, 5.385f)
                arcToRelative(0.562f, 0.562f, 0f, false, true, -0.84f, 0.61f)
                lineToRelative(-4.725f, -2.885f)
                arcToRelative(0.562f, 0.562f, 0f, false, false, -0.586f, 0f)
                lineTo(6.982f, 20.54f)
                arcToRelative(0.562f, 0.562f, 0f, false, true, -0.84f, -0.61f)
                lineToRelative(1.285f, -5.386f)
                arcToRelative(0.562f, 0.562f, 0f, false, false, -0.182f, -0.557f)
                lineToRelative(-4.204f, -3.602f)
                arcToRelative(0.562f, 0.562f, 0f, false, true, 0.321f, -0.988f)
                lineToRelative(5.518f, -0.442f)
                arcToRelative(0.563f, 0.563f, 0f, false, false, 0.475f, -0.345f)
                lineTo(11.48f, 3.5f)
                close()
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

