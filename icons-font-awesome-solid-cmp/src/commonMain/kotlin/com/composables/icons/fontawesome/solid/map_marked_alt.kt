package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MapMarkedAlt: ImageVector
    get() {
        if (_MapMarkedAlt != null) return _MapMarkedAlt!!
        
        _MapMarkedAlt = ImageVector.Builder(
            name = "map-marked-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 0f)
                curveToRelative(-69.59f, 0f, -126f, 56.41f, -126f, 126f)
                curveToRelative(0f, 56.26f, 82.35f, 158.8f, 113.9f, 196.02f)
                curveToRelative(6.39f, 7.54f, 17.82f, 7.54f, 24.2f, 0f)
                curveTo(331.65f, 284.8f, 414f, 182.26f, 414f, 126f)
                curveTo(414f, 56.41f, 357.59f, 0f, 288f, 0f)
                close()
                moveToRelative(0f, 168f)
                curveToRelative(-23.2f, 0f, -42f, -18.8f, -42f, -42f)
                reflectiveCurveToRelative(18.8f, -42f, 42f, -42f)
                reflectiveCurveToRelative(42f, 18.8f, 42f, 42f)
                reflectiveCurveToRelative(-18.8f, 42f, -42f, 42f)
                close()
                moveTo(20.12f, 215.95f)
                arcTo(32.006f, 32.006f, 0f, false, false, 0f, 245.66f)
                verticalLineToRelative(250.32f)
                curveToRelative(0f, 11.32f, 11.43f, 19.06f, 21.94f, 14.86f)
                lineTo(160f, 448f)
                verticalLineTo(214.92f)
                curveToRelative(-8.84f, -15.98f, -16.07f, -31.54f, -21.25f, -46.42f)
                lineTo(20.12f, 215.95f)
                close()
                moveTo(288f, 359.67f)
                curveToRelative(-14.07f, 0f, -27.38f, -6.18f, -36.51f, -16.96f)
                curveToRelative(-19.66f, -23.2f, -40.57f, -49.62f, -59.49f, -76.72f)
                verticalLineToRelative(182f)
                lineToRelative(192f, 64f)
                verticalLineTo(266f)
                curveToRelative(-18.92f, 27.09f, -39.82f, 53.52f, -59.49f, 76.72f)
                curveToRelative(-9.13f, 10.77f, -22.44f, 16.95f, -36.51f, 16.95f)
                close()
                moveToRelative(266.06f, -198.51f)
                lineTo(416f, 224f)
                verticalLineToRelative(288f)
                lineToRelative(139.88f, -55.95f)
                arcTo(31.996f, 31.996f, 0f, false, false, 576f, 426.34f)
                verticalLineTo(176.02f)
                curveToRelative(0f, -11.32f, -11.43f, -19.06f, -21.94f, -14.86f)
                close()
            }
        }.build()
        
        return _MapMarkedAlt!!
    }

private var _MapMarkedAlt: ImageVector? = null

