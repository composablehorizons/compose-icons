package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Rows: ImageVector
    get() {
        if (_Rows != null) return _Rows!!
        
        _Rows = ImageVector.Builder(
            name = "rows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 12.8492f)
                lineTo(14f, 14.15f)
                lineTo(1f, 14.15f)
                lineTo(1f, 12.8492f)
                lineTo(14f, 12.8492f)
                close()
                moveTo(14f, 8.84921f)
                lineTo(14f, 10.15f)
                lineTo(1f, 10.15f)
                lineTo(1f, 8.84921f)
                lineTo(14f, 8.84921f)
                close()
                moveTo(14f, 4.84921f)
                lineTo(14f, 6.14999f)
                lineTo(1f, 6.14999f)
                lineTo(1f, 4.84921f)
                lineTo(14f, 4.84921f)
                close()
                moveTo(14f, 0.849213f)
                lineTo(14f, 2.14999f)
                lineTo(1f, 2.14999f)
                lineTo(1f, 0.849213f)
                lineTo(14f, 0.849213f)
                close()
            }
        }.build()
        
        return _Rows!!
    }

private var _Rows: ImageVector? = null

