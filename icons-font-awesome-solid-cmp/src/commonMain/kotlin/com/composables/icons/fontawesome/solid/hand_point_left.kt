package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandPointLeft: ImageVector
    get() {
        if (_HandPointLeft != null) return _HandPointLeft!!
        
        _HandPointLeft = ImageVector.Builder(
            name = "hand-point-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(44.8f, 155.826f)
                horizontalLineToRelative(149.234f)
                curveToRelative(-5.841f, -8.248f, -10.57f, -16.558f, -14.153f, -24.918f)
                curveTo(166.248f, 99.098f, 189.778f, 63.986f, 224f, 64f)
                curveToRelative(18.616f, 0.008f, 32.203f, 10.897f, 40f, 29.092f)
                curveToRelative(12.122f, 28.286f, 78.648f, 64.329f, 107.534f, 77.323f)
                curveToRelative(17.857f, 7.956f, 28.453f, 25.479f, 28.464f, 43.845f)
                lineToRelative(0.002f, 0.001f)
                verticalLineToRelative(171.526f)
                curveToRelative(0f, 11.812f, -8.596f, 21.897f, -20.269f, 23.703f)
                curveToRelative(-46.837f, 7.25f, -61.76f, 38.483f, -123.731f, 38.315f)
                curveToRelative(-2.724f, -0.007f, -13.254f, 0.195f, -16f, 0.195f)
                curveToRelative(-50.654f, 0f, -81.574f, -22.122f, -72.6f, -71.263f)
                curveToRelative(-18.597f, -9.297f, -30.738f, -39.486f, -16.45f, -62.315f)
                curveToRelative(-24.645f, -21.177f, -22.639f, -53.896f, -6.299f, -70.944f)
                horizontalLineTo(44.8f)
                curveToRelative(-24.15f, 0f, -44.8f, -20.201f, -44.8f, -43.826f)
                curveToRelative(0f, -23.283f, 21.35f, -43.826f, 44.8f, -43.826f)
                close()
                moveTo(440f, 176f)
                horizontalLineToRelative(48f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineToRelative(-48f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineTo(200f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                close()
                moveToRelative(24f, 212f)
                curveToRelative(11.046f, 0f, 20f, -8.954f, 20f, -20f)
                reflectiveCurveToRelative(-8.954f, -20f, -20f, -20f)
                reflectiveCurveToRelative(-20f, 8.954f, -20f, 20f)
                reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
                close()
            }
        }.build()
        
        return _HandPointLeft!!
    }

private var _HandPointLeft: ImageVector? = null

