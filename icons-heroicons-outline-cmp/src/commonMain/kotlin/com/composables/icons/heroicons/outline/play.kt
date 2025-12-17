package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Play: ImageVector
    get() {
        if (_Play != null) return _Play!!
        
        _Play = ImageVector.Builder(
            name = "play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(5.25f, 5.653f)
                curveToRelative(0f, -0.856f, 0.917f, -1.398f, 1.667f, -0.986f)
                lineToRelative(11.54f, 6.347f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 0f, 1.972f)
                lineToRelative(-11.54f, 6.347f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.667f, -0.986f)
                verticalLineTo(5.653f)
                close()
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

