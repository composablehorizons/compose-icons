package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FillDrip: ImageVector
    get() {
        if (_FillDrip != null) return _FillDrip!!
        
        _FillDrip = ImageVector.Builder(
            name = "fill-drip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 320f)
                reflectiveCurveToRelative(-64f, 92.65f, -64f, 128f)
                curveToRelative(0f, 35.35f, 28.66f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.65f, 64f, -64f)
                reflectiveCurveToRelative(-64f, -128f, -64f, -128f)
                close()
                moveToRelative(-9.37f, -102.94f)
                lineTo(294.94f, 9.37f)
                curveTo(288.69f, 3.12f, 280.5f, 0f, 272.31f, 0f)
                reflectiveCurveToRelative(-16.38f, 3.12f, -22.62f, 9.37f)
                lineToRelative(-81.58f, 81.58f)
                lineTo(81.93f, 4.76f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.62f, 0f)
                lineTo(36.69f, 27.38f)
                curveToRelative(-6.24f, 6.25f, -6.24f, 16.38f, 0f, 22.62f)
                lineToRelative(86.19f, 86.18f)
                lineToRelative(-94.76f, 94.76f)
                curveToRelative(-37.49f, 37.48f, -37.49f, 98.26f, 0f, 135.75f)
                lineToRelative(117.19f, 117.19f)
                curveToRelative(18.74f, 18.74f, 43.31f, 28.12f, 67.87f, 28.12f)
                curveToRelative(24.57f, 0f, 49.13f, -9.37f, 67.87f, -28.12f)
                lineToRelative(221.57f, -221.57f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.75f, 0.01f, -45.25f)
                close()
                moveToRelative(-116.22f, 70.97f)
                horizontalLineTo(65.93f)
                curveToRelative(1.36f, -3.84f, 3.57f, -7.98f, 7.43f, -11.83f)
                lineToRelative(13.15f, -13.15f)
                lineToRelative(81.61f, -81.61f)
                lineToRelative(58.6f, 58.6f)
                curveToRelative(12.49f, 12.49f, 32.75f, 12.49f, 45.24f, 0f)
                reflectiveCurveToRelative(12.49f, -32.75f, 0f, -45.24f)
                lineToRelative(-58.6f, -58.6f)
                lineToRelative(58.95f, -58.95f)
                lineToRelative(162.44f, 162.44f)
                lineToRelative(-48.34f, 48.34f)
                close()
            }
        }.build()
        
        return _FillDrip!!
    }

private var _FillDrip: ImageVector? = null

