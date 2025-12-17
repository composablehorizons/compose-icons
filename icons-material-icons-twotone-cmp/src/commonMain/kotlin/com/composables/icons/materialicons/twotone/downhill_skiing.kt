package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Downhill_skiing: ImageVector
    get() {
        if (_Downhill_skiing != null) return _Downhill_skiing!!
        
        _Downhill_skiing = ImageVector.Builder(
            name = "downhill_skiing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.5f, 4.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveTo(18.5f, 3.4f, 18.5f, 4.5f)
                close()
                moveTo(15.78f, 20.9f)
                lineToRelative(0.76f, 0.27f)
                curveToRelative(0.62f, 0.21f, 1.27f, 0.33f, 1.96f, 0.33f)
                curveToRelative(0.84f, 0f, 1.65f, -0.18f, 2.38f, -0.5f)
                lineTo(22f, 22.13f)
                curveTo(20.95f, 22.68f, 19.76f, 23f, 18.5f, 23f)
                curveToRelative(-0.86f, 0f, -1.68f, -0.14f, -2.45f, -0.41f)
                lineTo(2f, 17.47f)
                lineToRelative(0.5f, -1.41f)
                lineToRelative(6.9f, 2.51f)
                lineToRelative(1.72f, -4.44f)
                lineTo(7.55f, 10.4f)
                curveTo(6.66f, 9.46f, 6.88f, 7.93f, 8f, 7.28f)
                lineToRelative(3.48f, -2.01f)
                curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f)
                lineToRelative(0.33f, 1.08f)
                curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f)
                lineTo(18.07f, 9f)
                lineToRelative(1.43f, 0.46f)
                lineToRelative(-1.12f, 3.45f)
                curveToRelative(-2.45f, -0.4f, -4.48f, -2.07f, -5.38f, -4.32f)
                lineToRelative(-2.53f, 1.45f)
                lineToRelative(3.03f, 3.46f)
                lineToRelative(-2.22f, 5.76f)
                lineToRelative(3.09f, 1.12f)
                lineToRelative(2.1f, -6.44f)
                horizontalLineToRelative(0f)
                lineToRelative(0f, 0f)
                curveToRelative(0.46f, 0.18f, 0.94f, 0.31f, 1.44f, 0.41f)
                lineTo(15.78f, 20.9f)
                close()
            }
        }.build()
        
        return _Downhill_skiing!!
    }

private var _Downhill_skiing: ImageVector? = null

