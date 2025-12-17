package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Target: ImageVector
    get() {
        if (_Target != null) return _Target!!
        
        _Target = ImageVector.Builder(
            name = "target",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 8f)
                curveTo(9f, 8.552f, 8.552f, 9f, 8f, 9f)
                curveTo(7.448f, 9f, 7f, 8.552f, 7f, 8f)
                curveTo(7f, 7.448f, 7.448f, 7f, 8f, 7f)
                curveTo(8.552f, 7f, 9f, 7.448f, 9f, 8f)
                close()
                moveTo(12f, 8f)
                curveTo(12f, 10.209f, 10.209f, 12f, 8f, 12f)
                curveTo(5.791f, 12f, 4f, 10.209f, 4f, 8f)
                curveTo(4f, 5.791f, 5.791f, 4f, 8f, 4f)
                curveTo(10.209f, 4f, 12f, 5.791f, 12f, 8f)
                close()
                moveTo(11f, 8f)
                curveTo(11f, 6.343f, 9.657f, 5f, 8f, 5f)
                curveTo(6.343f, 5f, 5f, 6.343f, 5f, 8f)
                curveTo(5f, 9.657f, 6.343f, 11f, 8f, 11f)
                curveTo(9.657f, 11f, 11f, 9.657f, 11f, 8f)
                close()
                moveTo(15f, 8f)
                curveTo(15f, 11.866f, 11.866f, 15f, 8f, 15f)
                curveTo(4.134f, 15f, 1f, 11.866f, 1f, 8f)
                curveTo(1f, 4.134f, 4.134f, 1f, 8f, 1f)
                curveTo(11.866f, 1f, 15f, 4.134f, 15f, 8f)
                close()
                moveTo(14f, 8f)
                curveTo(14f, 4.686f, 11.314f, 2f, 8f, 2f)
                curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
                curveTo(2f, 11.314f, 4.686f, 14f, 8f, 14f)
                curveTo(11.314f, 14f, 14f, 11.314f, 14f, 8f)
                close()
            }
        }.build()
        
        return _Target!!
    }

private var _Target: ImageVector? = null

