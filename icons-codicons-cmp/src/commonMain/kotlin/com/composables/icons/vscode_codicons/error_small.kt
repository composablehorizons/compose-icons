package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ErrorSmall: ImageVector
    get() {
        if (_ErrorSmall != null) return _ErrorSmall!!
        
        _ErrorSmall = ImageVector.Builder(
            name = "error-small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.35355f, 6.64645f)
                curveTo(7.15829f, 6.45118f, 6.84171f, 6.45118f, 6.64645f, 6.64645f)
                curveTo(6.45118f, 6.84171f, 6.45118f, 7.15829f, 6.64645f, 7.35355f)
                lineTo(7.29289f, 8f)
                lineTo(6.64645f, 8.64645f)
                curveTo(6.45118f, 8.84171f, 6.45118f, 9.15829f, 6.64645f, 9.35355f)
                curveTo(6.84171f, 9.54882f, 7.15829f, 9.54882f, 7.35355f, 9.35355f)
                lineTo(8f, 8.70711f)
                lineTo(8.64645f, 9.35355f)
                curveTo(8.84171f, 9.54882f, 9.15829f, 9.54882f, 9.35355f, 9.35355f)
                curveTo(9.54882f, 9.15829f, 9.54882f, 8.84171f, 9.35355f, 8.64645f)
                lineTo(8.70711f, 8f)
                lineTo(9.35355f, 7.35355f)
                curveTo(9.54882f, 7.15829f, 9.54882f, 6.84171f, 9.35355f, 6.64645f)
                curveTo(9.15829f, 6.45118f, 8.84171f, 6.45118f, 8.64645f, 6.64645f)
                lineTo(8f, 7.29289f)
                lineTo(7.35355f, 6.64645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11.9999f)
                curveTo(10.2091f, 11.9999f, 12f, 10.209f, 12f, 7.99988f)
                curveTo(12f, 5.79074f, 10.2091f, 3.99988f, 8f, 3.99988f)
                curveTo(5.79086f, 3.99988f, 4f, 5.79074f, 4f, 7.99988f)
                curveTo(4f, 10.209f, 5.79086f, 11.9999f, 8f, 11.9999f)
                close()
                moveTo(8f, 4.99988f)
                curveTo(9.65685f, 4.99988f, 11f, 6.34302f, 11f, 7.99988f)
                curveTo(11f, 9.65673f, 9.65685f, 10.9999f, 8f, 10.9999f)
                curveTo(6.34315f, 10.9999f, 5f, 9.65673f, 5f, 7.99988f)
                curveTo(5f, 6.34302f, 6.34315f, 4.99988f, 8f, 4.99988f)
                close()
            }
        }.build()
        
        return _ErrorSmall!!
    }

private var _ErrorSmall: ImageVector? = null

