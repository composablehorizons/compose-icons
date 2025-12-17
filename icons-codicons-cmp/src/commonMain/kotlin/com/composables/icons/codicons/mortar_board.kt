package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.MortarBoard: ImageVector
    get() {
        if (_MortarBoard != null) return _MortarBoard!!
        
        _MortarBoard = ImageVector.Builder(
            name = "mortar-board",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.36808f, 2.44715f)
                curveTo(8.53695f, 1.9037f, 7.46296f, 1.90368f, 6.63181f, 2.44712f)
                lineTo(1.22613f, 5.98153f)
                curveTo(1.08607f, 6.07311f, 1.00111f, 6.22869f, 0.999772f, 6.39602f)
                curveTo(0.999624f, 6.41452f, 1.0005f, 6.43289f, 1.00236f, 6.45106f)
                curveTo(1.0008f, 6.46716f, 1f, 6.48348f, 1f, 6.49998f)
                lineTo(1f, 10.5f)
                curveTo(1f, 10.7761f, 1.22386f, 11f, 1.5f, 11f)
                curveTo(1.77614f, 11f, 2f, 10.7761f, 2f, 10.5f)
                lineTo(2f, 7.34242f)
                lineTo(3f, 8.01932f)
                verticalLineTo(11.7f)
                curveTo(3f, 11.8186f, 3.04279f, 11.9341f, 3.11963f, 12.0245f)
                lineTo(3.12039f, 12.0254f)
                lineTo(3.12237f, 12.0277f)
                lineTo(3.12823f, 12.0345f)
                lineTo(3.14752f, 12.0563f)
                curveTo(3.16372f, 12.0743f, 3.18661f, 12.0993f, 3.21603f, 12.1303f)
                curveTo(3.27484f, 12.1922f, 3.35997f, 12.2781f, 3.47026f, 12.3799f)
                curveTo(3.69051f, 12.5832f, 4.01312f, 12.8519f, 4.42899f, 13.1201f)
                curveTo(5.25964f, 13.656f, 6.47783f, 14.2f, 8.0001f, 14.2f)
                curveTo(9.52236f, 14.2f, 10.7405f, 13.656f, 11.5711f, 13.1201f)
                curveTo(11.987f, 12.8518f, 12.3096f, 12.5832f, 12.5298f, 12.3799f)
                curveTo(12.6401f, 12.2781f, 12.7252f, 12.1922f, 12.784f, 12.1303f)
                curveTo(12.8134f, 12.0993f, 12.8363f, 12.0743f, 12.8525f, 12.0562f)
                lineTo(12.8718f, 12.0345f)
                lineTo(12.8777f, 12.0277f)
                lineTo(12.8796f, 12.0254f)
                lineTo(12.881f, 12.0238f)
                curveTo(12.9578f, 11.9334f, 13f, 11.8186f, 13f, 11.7f)
                verticalLineTo(8.01906f)
                lineTo(14.78f, 6.81407f)
                curveTo(14.9186f, 6.72027f, 15.0014f, 6.60538f, 14.9997f, 6.39602f)
                curveTo(14.9984f, 6.22869f, 14.9134f, 6.07312f, 14.7734f, 5.98154f)
                lineTo(9.36808f, 2.44715f)
                close()
                moveTo(12f, 8.696f)
                verticalLineTo(11.5022f)
                curveTo(11.9601f, 11.5424f, 11.9105f, 11.5906f, 11.8515f, 11.6451f)
                curveTo(11.6655f, 11.8168f, 11.3881f, 12.0482f, 11.029f, 12.2799f)
                curveTo(10.3096f, 12.744f, 9.27783f, 13.2f, 8.0001f, 13.2f)
                curveTo(6.72236f, 13.2f, 5.6905f, 12.744f, 4.97111f, 12.2798f)
                curveTo(4.61196f, 12.0481f, 4.33454f, 11.8168f, 4.14852f, 11.6451f)
                curveTo(4.08951f, 11.5906f, 4.0399f, 11.5423f, 4f, 11.5022f)
                verticalLineTo(8.69622f)
                lineTo(6.59853f, 10.4552f)
                curveTo(7.44497f, 11.0281f, 8.55494f, 11.0281f, 9.40136f, 10.4551f)
                lineTo(12f, 8.696f)
                close()
                moveTo(3.5f, 11.7f)
                lineTo(3.11963f, 12.0245f)
                curveTo(3.11963f, 12.0245f, 3.11904f, 12.0238f, 3.5f, 11.7f)
                close()
                moveTo(7.17905f, 3.28409f)
                curveTo(7.67774f, 2.95803f, 8.32214f, 2.95804f, 8.82082f, 3.28411f)
                lineTo(13.5972f, 6.39998f)
                lineTo(8.84078f, 9.62702f)
                curveTo(8.33293f, 9.97081f, 7.66695f, 9.97082f, 7.15909f, 9.62704f)
                lineTo(2.40239f, 6.40724f)
                lineTo(7.17905f, 3.28409f)
                close()
            }
        }.build()
        
        return _MortarBoard!!
    }

private var _MortarBoard: ImageVector? = null

