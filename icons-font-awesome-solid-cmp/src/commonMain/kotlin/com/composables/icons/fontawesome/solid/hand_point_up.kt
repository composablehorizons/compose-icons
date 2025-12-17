package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandPointUp: ImageVector
    get() {
        if (_HandPointUp != null) return _HandPointUp!!
        
        _HandPointUp = ImageVector.Builder(
            name = "hand-point-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(135.652f, 0f)
                curveToRelative(23.625f, 0f, 43.826f, 20.65f, 43.826f, 44.8f)
                verticalLineToRelative(99.851f)
                curveToRelative(17.048f, -16.34f, 49.766f, -18.346f, 70.944f, 6.299f)
                curveToRelative(22.829f, -14.288f, 53.017f, -2.147f, 62.315f, 16.45f)
                curveTo(361.878f, 158.426f, 384f, 189.346f, 384f, 240f)
                curveToRelative(0f, 2.746f, -0.203f, 13.276f, -0.195f, 16f)
                curveToRelative(0.168f, 61.971f, -31.065f, 76.894f, -38.315f, 123.731f)
                curveTo(343.683f, 391.404f, 333.599f, 400f, 321.786f, 400f)
                horizontalLineTo(150.261f)
                lineToRelative(-0.001f, -0.002f)
                curveToRelative(-18.366f, -0.011f, -35.889f, -10.607f, -43.845f, -28.464f)
                curveTo(93.421f, 342.648f, 57.377f, 276.122f, 29.092f, 264f)
                curveTo(10.897f, 256.203f, 0.008f, 242.616f, 0f, 224f)
                curveToRelative(-0.014f, -34.222f, 35.098f, -57.752f, 66.908f, -44.119f)
                curveToRelative(8.359f, 3.583f, 16.67f, 8.312f, 24.918f, 14.153f)
                verticalLineTo(44.8f)
                curveToRelative(0f, -23.45f, 20.543f, -44.8f, 43.826f, -44.8f)
                close()
                moveTo(136f, 416f)
                horizontalLineToRelative(192f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(136f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                close()
                moveToRelative(168f, 28f)
                curveToRelative(-11.046f, 0f, -20f, 8.954f, -20f, 20f)
                reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
                reflectiveCurveToRelative(20f, -8.954f, 20f, -20f)
                reflectiveCurveToRelative(-8.954f, -20f, -20f, -20f)
                close()
            }
        }.build()
        
        return _HandPointUp!!
    }

private var _HandPointUp: ImageVector? = null

