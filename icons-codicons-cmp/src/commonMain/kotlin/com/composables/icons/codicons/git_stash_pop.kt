package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitStashPop: ImageVector
    get() {
        if (_GitStashPop != null) return _GitStashPop!!
        
        _GitStashPop = ImageVector.Builder(
            name = "git-stash-pop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 8.00025f)
                curveTo(5.776f, 8.00025f, 6f, 8.22425f, 6f, 8.50025f)
                curveTo(6.00013f, 9.60314f, 6.89708f, 10.5003f, 8f, 10.5003f)
                curveTo(9.10292f, 10.5003f, 9.99987f, 9.60314f, 10f, 8.50025f)
                curveTo(10f, 8.22425f, 10.224f, 8.00025f, 10.5f, 8.00025f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 8.00025f, 15f, 8.22425f, 15f, 8.50025f)
                verticalLineTo(12.5003f)
                curveTo(14.9999f, 13.8781f, 13.8789f, 15.0003f, 12.5f, 15.0003f)
                horizontalLineTo(3.5f)
                curveTo(2.12108f, 15.0003f, 1.00013f, 13.8781f, 1f, 12.5003f)
                verticalLineTo(8.50025f)
                curveTo(1f, 8.22425f, 1.224f, 8.00025f, 1.5f, 8.00025f)
                horizontalLineTo(5.5f)
                close()
                moveTo(2f, 9.00025f)
                verticalLineTo(12.5003f)
                curveTo(2.00013f, 13.3271f, 2.67308f, 14.0003f, 3.5f, 14.0003f)
                horizontalLineTo(12.5f)
                curveTo(13.3269f, 14.0003f, 13.9999f, 13.3271f, 14f, 12.5003f)
                verticalLineTo(9.00025f)
                horizontalLineTo(10.958f)
                curveTo(10.7199f, 10.4171f, 9.48292f, 11.5003f, 8f, 11.5003f)
                curveTo(6.51708f, 11.5003f, 5.28009f, 10.4171f, 5.04199f, 9.00025f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.64746f, 1.14576f)
                curveTo(7.84237f, 0.951247f, 8.15861f, 0.951254f, 8.35352f, 1.14576f)
                lineTo(10.3535f, 3.14576f)
                curveTo(10.5485f, 3.34076f, 10.5485f, 3.65779f, 10.3535f, 3.85279f)
                curveTo(10.2555f, 3.94971f, 10.1279f, 3.99928f, 10f, 3.99928f)
                curveTo(9.87206f, 3.99928f, 9.74447f, 3.95071f, 9.64648f, 3.85279f)
                lineTo(8.5f, 2.70728f)
                verticalLineTo(7.50123f)
                curveTo(8.49989f, 7.77713f, 8.27593f, 8.00123f, 8f, 8.00123f)
                curveTo(7.72407f, 8.00123f, 7.50011f, 7.77713f, 7.5f, 7.50123f)
                verticalLineTo(2.70826f)
                lineTo(6.35352f, 3.85377f)
                curveTo(6.15854f, 4.0486f, 5.84243f, 4.04763f, 5.64746f, 3.85279f)
                curveTo(5.45246f, 3.65779f, 5.45246f, 3.34076f, 5.64746f, 3.14576f)
                lineTo(7.64746f, 1.14576f)
                close()
            }
        }.build()
        
        return _GitStashPop!!
    }

private var _GitStashPop: ImageVector? = null

