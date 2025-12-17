package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Info: ImageVector
    get() {
        if (_Info != null) return _Info!!
        
        _Info = ImageVector.Builder(
            name = "info",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.49902f, 7.49998f)
                curveTo(8.49902f, 7.22384f, 8.27517f, 6.99998f, 7.99902f, 6.99998f)
                curveTo(7.72288f, 6.99998f, 7.49902f, 7.22384f, 7.49902f, 7.49998f)
                verticalLineTo(10.5f)
                curveTo(7.49902f, 10.7761f, 7.72288f, 11f, 7.99902f, 11f)
                curveTo(8.27517f, 11f, 8.49902f, 10.7761f, 8.49902f, 10.5f)
                verticalLineTo(7.49998f)
                close()
                moveTo(8.74807f, 5.50001f)
                curveTo(8.74807f, 5.91369f, 8.41271f, 6.24905f, 7.99903f, 6.24905f)
                curveTo(7.58535f, 6.24905f, 7.25f, 5.91369f, 7.25f, 5.50001f)
                curveTo(7.25f, 5.08633f, 7.58535f, 4.75098f, 7.99903f, 4.75098f)
                curveTo(8.41271f, 4.75098f, 8.74807f, 5.08633f, 8.74807f, 5.50001f)
                close()
                moveTo(8f, 1f)
                curveTo(4.13401f, 1f, 1f, 4.13401f, 1f, 8f)
                curveTo(1f, 11.866f, 4.13401f, 15f, 8f, 15f)
                curveTo(11.866f, 15f, 15f, 11.866f, 15f, 8f)
                curveTo(15f, 4.13401f, 11.866f, 1f, 8f, 1f)
                close()
                moveTo(2f, 8f)
                curveTo(2f, 4.68629f, 4.68629f, 2f, 8f, 2f)
                curveTo(11.3137f, 2f, 14f, 4.68629f, 14f, 8f)
                curveTo(14f, 11.3137f, 11.3137f, 14f, 8f, 14f)
                curveTo(4.68629f, 14f, 2f, 11.3137f, 2f, 8f)
                close()
            }
        }.build()
        
        return _Info!!
    }

private var _Info: ImageVector? = null

