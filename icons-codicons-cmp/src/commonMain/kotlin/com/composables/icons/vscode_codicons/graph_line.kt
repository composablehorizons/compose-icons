package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GraphLine: ImageVector
    get() {
        if (_GraphLine != null) return _GraphLine!!
        
        _GraphLine = ImageVector.Builder(
            name = "graph-line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 15f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 15f, 15f, 14.776f, 15f, 14.5f)
                curveTo(15f, 14.224f, 14.776f, 14f, 14.5f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(9.70799f)
                lineTo(5.00001f, 6.70798f)
                lineTo(6.64601f, 8.35398f)
                curveTo(6.84101f, 8.54898f, 7.15801f, 8.54898f, 7.35301f, 8.35398f)
                lineTo(11.499f, 4.20798f)
                lineTo(13.145f, 5.85398f)
                curveTo(13.34f, 6.04898f, 13.657f, 6.04898f, 13.852f, 5.85398f)
                curveTo(14.047f, 5.65898f, 14.047f, 5.34198f, 13.852f, 5.14698f)
                lineTo(11.852f, 3.14698f)
                curveTo(11.657f, 2.95198f, 11.34f, 2.95198f, 11.145f, 3.14698f)
                lineTo(6.99901f, 7.29298f)
                lineTo(5.35301f, 5.64698f)
                curveTo(5.15801f, 5.45198f, 4.84101f, 5.45198f, 4.64601f, 5.64698f)
                lineTo(2f, 8.29299f)
                verticalLineTo(1.5f)
                curveTo(2f, 1.224f, 1.776f, 1f, 1.5f, 1f)
                curveTo(1.224f, 1f, 1f, 1.224f, 1f, 1.5f)
                verticalLineTo(9.4848f)
                curveTo(0.999674f, 9.49525f, 0.999674f, 9.50571f, 1f, 9.51617f)
                verticalLineTo(14.5f)
                curveTo(1f, 14.776f, 1.224f, 15f, 1.5f, 15f)
                close()
            }
        }.build()
        
        return _GraphLine!!
    }

private var _GraphLine: ImageVector? = null

