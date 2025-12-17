package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) return _Megaphone!!
        
        _Megaphone = ImageVector.Builder(
            name = "megaphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.92f, 3.845f)
                arcToRelative(19.362f, 19.362f, 0f, false, true, -6.3f, 1.98f)
                curveTo(6.765f, 5.942f, 5.89f, 6f, 5f, 6f)
                arcToRelative(4f, 4f, 0f, false, false, -0.504f, 7.969f)
                arcToRelative(15.97f, 15.97f, 0f, false, false, 1.271f, 3.34f)
                curveToRelative(0.397f, 0.771f, 1.342f, 1f, 2.05f, 0.59f)
                lineToRelative(0.867f, -0.5f)
                curveToRelative(0.726f, -0.419f, 0.94f, -1.32f, 0.588f, -2.02f)
                curveToRelative(-0.166f, -0.331f, -0.315f, -0.666f, -0.448f, -1.004f)
                curveToRelative(1.8f, 0.357f, 3.511f, 0.963f, 5.096f, 1.78f)
                arcTo(17.964f, 17.964f, 0f, false, false, 15f, 10f)
                curveToRelative(0f, -2.162f, -0.381f, -4.235f, -1.08f, -6.155f)
                close()
                moveTo(15.243f, 3.097f)
                arcTo(19.456f, 19.456f, 0f, false, true, 16.5f, 10f)
                curveToRelative(0f, 2.43f, -0.445f, 4.758f, -1.257f, 6.904f)
                lineToRelative(-0.03f, 0.077f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.401f, 0.537f)
                arcToRelative(20.903f, 20.903f, 0f, false, false, 1.312f, -5.745f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -3.546f)
                arcToRelative(20.902f, 20.902f, 0f, false, false, -1.312f, -5.745f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.4f, 0.537f)
                lineToRelative(0.029f, 0.078f)
                close()
            }
        }.build()
        
        return _Megaphone!!
    }

private var _Megaphone: ImageVector? = null

