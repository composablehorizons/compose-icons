package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SearchStop: ImageVector
    get() {
        if (_SearchStop != null) return _SearchStop!!
        
        _SearchStop = ImageVector.Builder(
            name = "search-stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.854f, 13.854f)
                curveTo(13.659f, 14.049f, 13.342f, 14.049f, 13.147f, 13.854f)
                lineTo(9.925f, 10.632f)
                curveTo(9.813f, 9.92901f, 9.568f, 9.27201f, 9.216f, 8.68401f)
                curveTo(9.699f, 8.08401f, 10.001f, 7.33101f, 10.001f, 6.50101f)
                curveTo(10.001f, 4.56801f, 8.434f, 3.00101f, 6.501f, 3.00101f)
                curveTo(4.669f, 3.00101f, 3.183f, 4.41401f, 3.031f, 6.20701f)
                curveTo(2.675f, 6.30601f, 2.335f, 6.43901f, 2.012f, 6.60401f)
                curveTo(2.012f, 6.56901f, 2.002f, 6.53701f, 2.002f, 6.50201f)
                curveTo(2.002f, 4.01701f, 4.017f, 2.00201f, 6.502f, 2.00201f)
                curveTo(8.987f, 2.00201f, 11.002f, 4.01701f, 11.002f, 6.50201f)
                curveTo(11.002f, 7.56401f, 10.634f, 8.54101f, 10.018f, 9.31101f)
                lineTo(13.856f, 13.149f)
                curveTo(14.051f, 13.344f, 14.051f, 13.661f, 13.856f, 13.856f)
                lineTo(13.854f, 13.854f)
                close()
                moveTo(9f, 11.5f)
                curveTo(9f, 13.985f, 6.985f, 16f, 4.5f, 16f)
                curveTo(2.015f, 16f, 0f, 13.985f, 0f, 11.5f)
                curveTo(0f, 9.01501f, 2.015f, 7.00001f, 4.5f, 7.00001f)
                curveTo(6.985f, 7.00001f, 9f, 9.01501f, 9f, 11.5f)
                close()
                moveTo(1.697f, 13.596f)
                lineTo(6.596f, 8.69701f)
                curveTo(6.012f, 8.25901f, 5.286f, 8.00001f, 4.5f, 8.00001f)
                curveTo(2.567f, 8.00001f, 1f, 9.56701f, 1f, 11.5f)
                curveTo(1f, 12.286f, 1.259f, 13.012f, 1.697f, 13.596f)
                close()
                moveTo(8f, 11.5f)
                curveTo(8f, 10.714f, 7.741f, 9.98801f, 7.303f, 9.40401f)
                lineTo(2.404f, 14.303f)
                curveTo(2.988f, 14.741f, 3.714f, 15f, 4.5f, 15f)
                curveTo(6.433f, 15f, 8f, 13.433f, 8f, 11.5f)
                close()
            }
        }.build()
        
        return _SearchStop!!
    }

private var _SearchStop: ImageVector? = null

