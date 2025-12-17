package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Record: ImageVector
    get() {
        if (_Record != null) return _Record!!
        
        _Record = ImageVector.Builder(
            name = "record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 12f)
                curveTo(10.2091f, 12f, 12f, 10.2091f, 12f, 8f)
                curveTo(12f, 5.79086f, 10.2091f, 4f, 8f, 4f)
                curveTo(5.79086f, 4f, 4f, 5.79086f, 4f, 8f)
                curveTo(4f, 10.2091f, 5.79086f, 12f, 8f, 12f)
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
        
        return _Record!!
    }

private var _Record: ImageVector? = null

