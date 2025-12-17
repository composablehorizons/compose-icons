package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.GiftCard: ImageVector
    get() {
        if (_GiftCard != null) return _GiftCard!!
        
        _GiftCard = ImageVector.Builder(
            name = "gift-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 4f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, 3.8f)
                lineToRelative(0.005f, 0.2f)
                verticalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, true, -3.8f, 3.995f)
                lineToRelative(-0.2f, 0.005f)
                horizontalLineToRelative(-12f)
                arcToRelative(4f, 4f, 0f, false, true, -3.995f, -3.8f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-8f)
                arcToRelative(4f, 4f, 0f, false, true, 3.8f, -3.995f)
                lineToRelative(0.2f, -0.005f)
                horizontalLineToRelative(12f)
                close()
                moveToRelative(-5.493f, 5f)
                lineToRelative(-0.19f, 0.004f)
                curveToRelative(-0.928f, 0.052f, -1.719f, 0.583f, -2.317f, 1.444f)
                curveToRelative(-0.56f, -0.805f, -1.288f, -1.322f, -2.139f, -1.428f)
                lineToRelative(-0.198f, -0.017f)
                lineToRelative(-0.164f, -0.003f)
                lineToRelative(-0.16f, 0.005f)
                curveToRelative(-1.28f, 0.086f, -2.339f, 1.179f, -2.339f, 2.495f)
                curveToRelative(0f, 1.226f, 1.222f, 2.211f, 2.453f, 2.447f)
                lineToRelative(0.16f, 0.026f)
                lineToRelative(-1.32f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.226f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.226f, 0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(2.293f, -2.292f)
                lineToRelative(2.293f, 2.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.403f, -1.403f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-1.32f, -1.32f)
                curveToRelative(1.229f, -0.169f, 2.502f, -1.11f, 2.606f, -2.315f)
                lineToRelative(0.007f, -0.158f)
                lineToRelative(-0.005f, -0.163f)
                curveToRelative(-0.08f, -1.189f, -1.02f, -2.162f, -2.175f, -2.316f)
                lineToRelative(-0.159f, -0.016f)
                lineToRelative(-0.154f, -0.005f)
                close()
                moveToRelative(-0.025f, 2f)
                lineToRelative(0.102f, 0.009f)
                curveToRelative(0.194f, 0.04f, 0.367f, 0.21f, 0.407f, 0.406f)
                lineToRelative(0.009f, 0.085f)
                lineToRelative(-0.012f, 0.031f)
                lineToRelative(-0.034f, 0.04f)
                curveToRelative(-0.13f, 0.135f, -0.513f, 0.369f, -0.836f, 0.42f)
                lineToRelative(-0.118f, 0.009f)
                horizontalLineToRelative(-0.602f)
                lineToRelative(0.052f, -0.1f)
                lineToRelative(0.088f, -0.156f)
                curveToRelative(0.27f, -0.444f, 0.574f, -0.696f, 0.852f, -0.738f)
                lineToRelative(0.092f, -0.006f)
                close()
                moveToRelative(-4.964f, 0f)
                lineToRelative(0.084f, 0.005f)
                lineToRelative(0.094f, 0.02f)
                curveToRelative(0.254f, 0.077f, 0.523f, 0.32f, 0.765f, 0.718f)
                lineToRelative(0.09f, 0.157f)
                lineToRelative(0.05f, 0.1f)
                horizontalLineToRelative(-0.601f)
                lineToRelative(-0.106f, -0.008f)
                curveToRelative(-0.398f, -0.057f, -0.894f, -0.4f, -0.894f, -0.492f)
                curveToRelative(0f, -0.23f, 0.194f, -0.446f, 0.416f, -0.491f)
                lineToRelative(0.102f, -0.01f)
                close()
            }
        }.build()
        
        return _GiftCard!!
    }

private var _GiftCard: ImageVector? = null

