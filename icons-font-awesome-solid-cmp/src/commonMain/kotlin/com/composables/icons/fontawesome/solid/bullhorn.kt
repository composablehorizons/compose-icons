package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bullhorn: ImageVector
    get() {
        if (_Bullhorn != null) return _Bullhorn!!
        
        _Bullhorn = ImageVector.Builder(
            name = "bullhorn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(576f, 240f)
                curveToRelative(0f, -23.63f, -12.95f, -44.04f, -32f, -55.12f)
                verticalLineTo(32.01f)
                curveTo(544f, 23.26f, 537.02f, 0f, 512f, 0f)
                curveToRelative(-7.12f, 0f, -14.19f, 2.38f, -19.98f, 7.02f)
                lineToRelative(-85.03f, 68.03f)
                curveTo(364.28f, 109.19f, 310.66f, 128f, 256f, 128f)
                horizontalLineTo(64f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(33.7f)
                curveToRelative(-1.39f, 10.48f, -2.18f, 21.14f, -2.18f, 32f)
                curveToRelative(0f, 39.77f, 9.26f, 77.35f, 25.56f, 110.94f)
                curveToRelative(5.19f, 10.69f, 16.52f, 17.06f, 28.4f, 17.06f)
                horizontalLineToRelative(74.28f)
                curveToRelative(26.05f, 0f, 41.69f, -29.84f, 25.9f, -50.56f)
                curveToRelative(-16.4f, -21.52f, -26.15f, -48.36f, -26.15f, -77.44f)
                curveToRelative(0f, -11.11f, 1.62f, -21.79f, 4.41f, -32f)
                horizontalLineTo(256f)
                curveToRelative(54.66f, 0f, 108.28f, 18.81f, 150.98f, 52.95f)
                lineToRelative(85.03f, 68.03f)
                arcToRelative(32.023f, 32.023f, 0f, false, false, 19.98f, 7.02f)
                curveToRelative(24.92f, 0f, 32f, -22.78f, 32f, -32f)
                verticalLineTo(295.13f)
                curveTo(563.05f, 284.04f, 576f, 263.63f, 576f, 240f)
                close()
                moveToRelative(-96f, 141.42f)
                lineToRelative(-33.05f, -26.44f)
                curveTo(392.95f, 311.78f, 325.12f, 288f, 256f, 288f)
                verticalLineToRelative(-96f)
                curveToRelative(69.12f, 0f, 136.95f, -23.78f, 190.95f, -66.98f)
                lineTo(480f, 98.58f)
                verticalLineToRelative(282.84f)
                close()
            }
        }.build()
        
        return _Bullhorn!!
    }

private var _Bullhorn: ImageVector? = null

