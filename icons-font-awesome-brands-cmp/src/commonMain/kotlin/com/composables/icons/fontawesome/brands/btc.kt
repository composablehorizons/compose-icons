package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Btc: ImageVector
    get() {
        if (_Btc != null) return _Btc!!
        
        _Btc = ImageVector.Builder(
            name = "btc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(310.204f, 242.638f)
                curveToRelative(27.73f, -14.18f, 45.377f, -39.39f, 41.28f, -81.3f)
                curveToRelative(-5.358f, -57.351f, -52.458f, -76.573f, -114.85f, -81.929f)
                verticalLineTo(0f)
                horizontalLineToRelative(-48.528f)
                verticalLineToRelative(77.203f)
                curveToRelative(-12.605f, 0f, -25.525f, 0.315f, -38.444f, 0.63f)
                verticalLineTo(0f)
                horizontalLineToRelative(-48.528f)
                verticalLineToRelative(79.409f)
                curveToRelative(-17.842f, 0.539f, -38.622f, 0.276f, -97.37f, 0f)
                verticalLineToRelative(51.678f)
                curveToRelative(38.314f, -0.678f, 58.417f, -3.14f, 63.023f, 21.427f)
                verticalLineToRelative(217.429f)
                curveToRelative(-2.925f, 19.492f, -18.524f, 16.685f, -53.255f, 16.071f)
                lineTo(3.765f, 443.68f)
                curveToRelative(88.481f, 0f, 97.37f, 0.315f, 97.37f, 0.315f)
                verticalLineTo(512f)
                horizontalLineToRelative(48.528f)
                verticalLineToRelative(-67.06f)
                curveToRelative(13.234f, 0.315f, 26.154f, 0.315f, 38.444f, 0.315f)
                verticalLineTo(512f)
                horizontalLineToRelative(48.528f)
                verticalLineToRelative(-68.005f)
                curveToRelative(81.299f, -4.412f, 135.647f, -24.894f, 142.895f, -101.467f)
                curveToRelative(5.671f, -61.446f, -23.32f, -88.862f, -69.326f, -99.89f)
                close()
                moveTo(150.608f, 134.553f)
                curveToRelative(27.415f, 0f, 113.126f, -8.507f, 113.126f, 48.528f)
                curveToRelative(0f, 54.515f, -85.71f, 48.212f, -113.126f, 48.212f)
                verticalLineToRelative(-96.74f)
                close()
                moveToRelative(0f, 251.776f)
                verticalLineTo(279.821f)
                curveToRelative(32.772f, 0f, 133.127f, -9.138f, 133.127f, 53.255f)
                curveToRelative(-0.001f, 60.186f, -100.355f, 53.253f, -133.127f, 53.253f)
                close()
            }
        }.build()
        
        return _Btc!!
    }

private var _Btc: ImageVector? = null

