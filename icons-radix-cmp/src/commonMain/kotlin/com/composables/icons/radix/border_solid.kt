package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BorderSolid: ImageVector
    get() {
        if (_BorderSolid != null) return _BorderSolid!!
        
        _BorderSolid = ImageVector.Builder(
            name = "border-solid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.3506f, 7.00977f)
                curveTo(13.5786f, 7.05629f, 13.75f, 7.25829f, 13.75f, 7.5f)
                curveTo(13.75f, 7.74171f, 13.5786f, 7.94371f, 13.3506f, 7.99023f)
                lineTo(13.25f, 8f)
                horizontalLineTo(1.75f)
                curveTo(1.47386f, 8f, 1.25f, 7.77614f, 1.25f, 7.5f)
                curveTo(1.25f, 7.22386f, 1.47386f, 7f, 1.75f, 7f)
                horizontalLineTo(13.25f)
                lineTo(13.3506f, 7.00977f)
                close()
            }
        }.build()
        
        return _BorderSolid!!
    }

private var _BorderSolid: ImageVector? = null

