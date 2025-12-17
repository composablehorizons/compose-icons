package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandPointDown: ImageVector
    get() {
        if (_HandPointDown != null) return _HandPointDown!!
        
        _HandPointDown = ImageVector.Builder(
            name = "hand-point-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(91.826f, 467.2f)
                verticalLineTo(317.966f)
                curveToRelative(-8.248f, 5.841f, -16.558f, 10.57f, -24.918f, 14.153f)
                curveTo(35.098f, 345.752f, -0.014f, 322.222f, 0f, 288f)
                curveToRelative(0.008f, -18.616f, 10.897f, -32.203f, 29.092f, -40f)
                curveToRelative(28.286f, -12.122f, 64.329f, -78.648f, 77.323f, -107.534f)
                curveToRelative(7.956f, -17.857f, 25.479f, -28.453f, 43.845f, -28.464f)
                lineToRelative(0.001f, -0.002f)
                horizontalLineToRelative(171.526f)
                curveToRelative(11.812f, 0f, 21.897f, 8.596f, 23.703f, 20.269f)
                curveToRelative(7.25f, 46.837f, 38.483f, 61.76f, 38.315f, 123.731f)
                curveToRelative(-0.007f, 2.724f, 0.195f, 13.254f, 0.195f, 16f)
                curveToRelative(0f, 50.654f, -22.122f, 81.574f, -71.263f, 72.6f)
                curveToRelative(-9.297f, 18.597f, -39.486f, 30.738f, -62.315f, 16.45f)
                curveToRelative(-21.177f, 24.645f, -53.896f, 22.639f, -70.944f, 6.299f)
                verticalLineTo(467.2f)
                curveToRelative(0f, 24.15f, -20.201f, 44.8f, -43.826f, 44.8f)
                curveToRelative(-23.283f, 0f, -43.826f, -21.35f, -43.826f, -44.8f)
                close()
                moveTo(112f, 72f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(192f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(136f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                close()
                moveToRelative(212f, -24f)
                curveToRelative(0f, -11.046f, -8.954f, -20f, -20f, -20f)
                reflectiveCurveToRelative(-20f, 8.954f, -20f, 20f)
                reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
                reflectiveCurveToRelative(20f, -8.954f, 20f, -20f)
                close()
            }
        }.build()
        
        return _HandPointDown!!
    }

private var _HandPointDown: ImageVector? = null

