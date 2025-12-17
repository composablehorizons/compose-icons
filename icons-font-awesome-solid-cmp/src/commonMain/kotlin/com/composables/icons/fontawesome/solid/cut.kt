package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Cut: ImageVector
    get() {
        if (_Cut != null) return _Cut!!
        
        _Cut = ImageVector.Builder(
            name = "cut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(278.06f, 256f)
                lineTo(444.48f, 89.57f)
                curveToRelative(4.69f, -4.69f, 4.69f, -12.29f, 0f, -16.97f)
                curveToRelative(-32.8f, -32.8f, -85.99f, -32.8f, -118.79f, 0f)
                lineTo(210.18f, 188.12f)
                lineToRelative(-24.86f, -24.86f)
                curveToRelative(4.31f, -10.92f, 6.68f, -22.81f, 6.68f, -35.26f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                reflectiveCurveTo(0f, 74.98f, 0f, 128f)
                reflectiveCurveToRelative(42.98f, 96f, 96f, 96f)
                curveToRelative(4.54f, 0f, 8.99f, -0.32f, 13.36f, -0.93f)
                lineTo(142.29f, 256f)
                lineToRelative(-32.93f, 32.93f)
                curveToRelative(-4.37f, -0.61f, -8.83f, -0.93f, -13.36f, -0.93f)
                curveToRelative(-53.02f, 0f, -96f, 42.98f, -96f, 96f)
                reflectiveCurveToRelative(42.98f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -42.98f, 96f, -96f)
                curveToRelative(0f, -12.45f, -2.37f, -24.34f, -6.68f, -35.26f)
                lineToRelative(24.86f, -24.86f)
                lineTo(325.69f, 439.4f)
                curveToRelative(32.8f, 32.8f, 85.99f, 32.8f, 118.79f, 0f)
                curveToRelative(4.69f, -4.68f, 4.69f, -12.28f, 0f, -16.97f)
                lineTo(278.06f, 256f)
                close()
                moveTo(96f, 160f)
                curveToRelative(-17.64f, 0f, -32f, -14.36f, -32f, -32f)
                reflectiveCurveToRelative(14.36f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.36f, 32f, 32f)
                reflectiveCurveToRelative(-14.36f, 32f, -32f, 32f)
                close()
                moveToRelative(0f, 256f)
                curveToRelative(-17.64f, 0f, -32f, -14.36f, -32f, -32f)
                reflectiveCurveToRelative(14.36f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.36f, 32f, 32f)
                reflectiveCurveToRelative(-14.36f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _Cut!!
    }

private var _Cut: ImageVector? = null

