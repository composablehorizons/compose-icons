package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Capsules: ImageVector
    get() {
        if (_Capsules != null) return _Capsules!!
        
        _Capsules = ImageVector.Builder(
            name = "capsules",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(555.3f, 300.1f)
                lineTo(424.2f, 112.8f)
                curveTo(401.9f, 81f, 366.4f, 64f, 330.4f, 64f)
                curveToRelative(-22.6f, 0f, -45.5f, 6.7f, -65.5f, 20.7f)
                curveToRelative(-19.7f, 13.8f, -33.7f, 32.8f, -41.5f, 53.8f)
                curveTo(220.5f, 79.2f, 172f, 32f, 112f, 32f)
                curveTo(50.1f, 32f, 0f, 82.1f, 0f, 144f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 61.9f, 50.1f, 112f, 112f, 112f)
                reflectiveCurveToRelative(112f, -50.1f, 112f, -112f)
                verticalLineTo(218.9f)
                curveToRelative(3.3f, 8.6f, 7.3f, 17.1f, 12.8f, 25f)
                lineTo(368f, 431.2f)
                curveToRelative(22.2f, 31.8f, 57.7f, 48.8f, 93.8f, 48.8f)
                curveToRelative(22.7f, 0f, 45.5f, -6.7f, 65.5f, -20.7f)
                curveToRelative(51.7f, -36.2f, 64.2f, -107.5f, 28f, -159.2f)
                close()
                moveTo(160f, 256f)
                horizontalLineTo(64f)
                verticalLineTo(144f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                verticalLineToRelative(112f)
                close()
                moveToRelative(194.8f, 44.9f)
                lineToRelative(-65.6f, -93.7f)
                curveToRelative(-7.7f, -11f, -10.7f, -24.4f, -8.3f, -37.6f)
                curveToRelative(2.3f, -13.2f, 9.7f, -24.8f, 20.7f, -32.5f)
                curveToRelative(8.5f, -6f, 18.5f, -9.1f, 28.8f, -9.1f)
                curveToRelative(16.5f, 0f, 31.9f, 8f, 41.3f, 21.5f)
                lineToRelative(65.6f, 93.7f)
                lineToRelative(-82.5f, 57.7f)
                close()
            }
        }.build()
        
        return _Capsules!!
    }

private var _Capsules: ImageVector? = null

