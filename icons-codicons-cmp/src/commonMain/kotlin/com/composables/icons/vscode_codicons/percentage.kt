package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Percentage: ImageVector
    get() {
        if (_Percentage != null) return _Percentage!!
        
        _Percentage = ImageVector.Builder(
            name = "percentage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 7f)
                curveTo(3.121f, 7f, 2f, 5.879f, 2f, 4.5f)
                curveTo(2f, 3.121f, 3.121f, 2f, 4.5f, 2f)
                curveTo(5.879f, 2f, 7f, 3.121f, 7f, 4.5f)
                curveTo(7f, 5.879f, 5.879f, 7f, 4.5f, 7f)
                close()
                moveTo(4.5f, 3f)
                curveTo(3.673f, 3f, 3f, 3.673f, 3f, 4.5f)
                curveTo(3f, 5.327f, 3.673f, 6f, 4.5f, 6f)
                curveTo(5.327f, 6f, 6f, 5.327f, 6f, 4.5f)
                curveTo(6f, 3.673f, 5.327f, 3f, 4.5f, 3f)
                close()
                moveTo(11.5f, 14f)
                curveTo(10.121f, 14f, 9f, 12.879f, 9f, 11.5f)
                curveTo(9f, 10.121f, 10.121f, 9f, 11.5f, 9f)
                curveTo(12.879f, 9f, 14f, 10.121f, 14f, 11.5f)
                curveTo(14f, 12.879f, 12.879f, 14f, 11.5f, 14f)
                close()
                moveTo(11.5f, 10f)
                curveTo(10.673f, 10f, 10f, 10.673f, 10f, 11.5f)
                curveTo(10f, 12.327f, 10.673f, 13f, 11.5f, 13f)
                curveTo(12.327f, 13f, 13f, 12.327f, 13f, 11.5f)
                curveTo(13f, 10.673f, 12.327f, 10f, 11.5f, 10f)
                close()
                moveTo(3.854f, 12.854f)
                lineTo(12.854f, 3.854f)
                curveTo(13.049f, 3.659f, 13.049f, 3.342f, 12.854f, 3.147f)
                curveTo(12.659f, 2.952f, 12.342f, 2.952f, 12.147f, 3.147f)
                lineTo(3.146f, 12.146f)
                curveTo(2.951f, 12.341f, 2.951f, 12.658f, 3.146f, 12.853f)
                curveTo(3.244f, 12.951f, 3.372f, 12.999f, 3.5f, 12.999f)
                curveTo(3.628f, 12.999f, 3.756f, 12.95f, 3.854f, 12.853f)
                verticalLineTo(12.854f)
                close()
            }
        }.build()
        
        return _Percentage!!
    }

private var _Percentage: ImageVector? = null

