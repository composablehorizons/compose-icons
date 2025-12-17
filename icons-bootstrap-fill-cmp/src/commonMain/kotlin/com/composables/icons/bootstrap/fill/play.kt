package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Play: ImageVector
    get() {
        if (_Play != null) return _Play!!
        
        _Play = ImageVector.Builder(
            name = "play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.596f, 8.697f)
                lineToRelative(-6.363f, 3.692f)
                curveToRelative(-0.54f, 0.313f, -1.233f, -0.066f, -1.233f, -0.697f)
                verticalLineTo(4.308f)
                curveToRelative(0f, -0.63f, 0.692f, -1.01f, 1.233f, -0.696f)
                lineToRelative(6.363f, 3.692f)
                arcToRelative(0.802f, 0.802f, 0f, false, true, 0f, 1.393f)
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

