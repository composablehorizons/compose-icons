package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.StarHalf: ImageVector
    get() {
        if (_StarHalf != null) return _StarHalf!!
        
        _StarHalf = ImageVector.Builder(
            name = "star-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.264f, 6.27501f)
                curveTo(15.149f, 5.92301f, 14.862f, 5.68101f, 14.494f, 5.62701f)
                lineTo(10.598f, 5.06101f)
                lineTo(8.85602f, 1.53001f)
                curveTo(8.52602f, 0.865009f, 7.47502f, 0.864009f, 7.14502f, 1.53001f)
                lineTo(5.40302f, 5.06001f)
                lineTo(1.50602f, 5.62601f)
                curveTo(1.14002f, 5.68001f, 0.853018f, 5.92201f, 0.735018f, 6.28001f)
                curveTo(0.625018f, 6.63301f, 0.715017f, 6.99701f, 0.979017f, 7.25301f)
                lineTo(3.79702f, 10.001f)
                lineTo(3.13102f, 13.881f)
                curveTo(3.08302f, 14.165f, 3.15702f, 14.439f, 3.33902f, 14.654f)
                curveTo(3.62702f, 14.993f, 4.12202f, 15.094f, 4.51602f, 14.886f)
                lineTo(8.00002f, 13.054f)
                lineTo(11.483f, 14.886f)
                curveTo(11.624f, 14.961f, 11.773f, 14.998f, 11.927f, 14.998f)
                curveTo(12.207f, 14.998f, 12.475f, 14.873f, 12.659f, 14.654f)
                curveTo(12.842f, 14.439f, 12.916f, 14.164f, 12.868f, 13.88f)
                lineTo(12.202f, 10f)
                lineTo(15.021f, 7.25201f)
                curveTo(15.284f, 6.99601f, 15.375f, 6.63201f, 15.262f, 6.27301f)
                lineTo(15.264f, 6.27501f)
                close()
                moveTo(11.317f, 9.47001f)
                curveTo(11.199f, 9.58501f, 11.145f, 9.75001f, 11.172f, 9.91201f)
                lineTo(11.891f, 13.972f)
                lineTo(8.23202f, 12.048f)
                curveTo(8.16002f, 12.009f, 8.08002f, 11.99f, 8.00002f, 11.99f)
                verticalLineTo(2.05701f)
                lineTo(9.81702f, 5.73901f)
                curveTo(9.88902f, 5.88601f, 10.031f, 5.98901f, 10.193f, 6.01201f)
                lineTo(14.324f, 6.53801f)
                lineTo(11.317f, 9.46901f)
                verticalLineTo(9.47001f)
                close()
            }
        }.build()
        
        return _StarHalf!!
    }

private var _StarHalf: ImageVector? = null

