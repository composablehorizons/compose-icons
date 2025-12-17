package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandPointRight: ImageVector
    get() {
        if (_HandPointRight != null) return _HandPointRight!!
        
        _HandPointRight = ImageVector.Builder(
            name = "hand-point-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 199.652f)
                curveToRelative(0f, 23.625f, -20.65f, 43.826f, -44.8f, 43.826f)
                horizontalLineToRelative(-99.851f)
                curveToRelative(16.34f, 17.048f, 18.346f, 49.766f, -6.299f, 70.944f)
                curveToRelative(14.288f, 22.829f, 2.147f, 53.017f, -16.45f, 62.315f)
                curveTo(353.574f, 425.878f, 322.654f, 448f, 272f, 448f)
                curveToRelative(-2.746f, 0f, -13.276f, -0.203f, -16f, -0.195f)
                curveToRelative(-61.971f, 0.168f, -76.894f, -31.065f, -123.731f, -38.315f)
                curveTo(120.596f, 407.683f, 112f, 397.599f, 112f, 385.786f)
                verticalLineTo(214.261f)
                lineToRelative(0.002f, -0.001f)
                curveToRelative(0.011f, -18.366f, 10.607f, -35.889f, 28.464f, -43.845f)
                curveToRelative(28.886f, -12.994f, 95.413f, -49.038f, 107.534f, -77.323f)
                curveToRelative(7.797f, -18.194f, 21.384f, -29.084f, 40f, -29.092f)
                curveToRelative(34.222f, -0.014f, 57.752f, 35.098f, 44.119f, 66.908f)
                curveToRelative(-3.583f, 8.359f, -8.312f, 16.67f, -14.153f, 24.918f)
                horizontalLineTo(467.2f)
                curveToRelative(23.45f, 0f, 44.8f, 20.543f, 44.8f, 43.826f)
                close()
                moveTo(96f, 200f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineTo(200f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(48f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                close()
                moveTo(68f, 368f)
                curveToRelative(0f, -11.046f, -8.954f, -20f, -20f, -20f)
                reflectiveCurveToRelative(-20f, 8.954f, -20f, 20f)
                reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
                reflectiveCurveToRelative(20f, -8.954f, 20f, -20f)
                close()
            }
        }.build()
        
        return _HandPointRight!!
    }

private var _HandPointRight: ImageVector? = null

