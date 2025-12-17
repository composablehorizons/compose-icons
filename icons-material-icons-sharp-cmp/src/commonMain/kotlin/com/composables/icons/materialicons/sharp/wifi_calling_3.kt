package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wifi_calling_3: ImageVector
    get() {
        if (_Wifi_calling_3 != null) return _Wifi_calling_3!!
        
        _Wifi_calling_3 = ImageVector.Builder(
            name = "wifi_calling_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.49f, 3f)
                        curveToRelative(-2.21f, 0f, -4.21f, 0.9f, -5.66f, 2.34f)
                        lineToRelative(1.06f, 1.06f)
                        curveToRelative(1.18f, -1.18f, 2.8f, -1.91f, 4.59f, -1.91f)
                        reflectiveCurveToRelative(3.42f, 0.73f, 4.59f, 1.91f)
                        lineToRelative(1.06f, -1.06f)
                        curveTo(20.7f, 3.9f, 18.7f, 3f, 16.49f, 3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.03f, 7.46f)
                        curveTo(19.12f, 6.56f, 17.87f, 6f, 16.49f, 6f)
                        reflectiveCurveToRelative(-2.63f, 0.56f, -3.54f, 1.46f)
                        lineToRelative(1.06f, 1.06f)
                        curveToRelative(0.63f, -0.63f, 1.51f, -1.03f, 2.47f, -1.03f)
                        reflectiveCurveToRelative(1.84f, 0.39f, 2.47f, 1.03f)
                        lineTo(20.03f, 7.46f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.08f, 9.59f)
                        lineTo(16.49f, 11f)
                        lineToRelative(1.41f, -1.41f)
                        curveTo(17.54f, 9.22f, 17.04f, 9f, 16.49f, 9f)
                        reflectiveCurveTo(15.44f, 9.22f, 15.08f, 9.59f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 15f)
                        lineToRelative(-5f, -1f)
                        lineToRelative(-2.9f, 2.9f)
                        curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6f, -6f)
                        lineTo(10f, 8f)
                        lineTo(9f, 3f)
                        lineTo(3f, 3f)
                        curveToRelative(0f, 3.28f, 0.89f, 6.35f, 2.43f, 9f)
                        curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f)
                        curveToRelative(2.65f, 1.53f, 5.72f, 2.43f, 9f, 2.43f)
                        lineTo(21f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wifi_calling_3!!
    }

private var _Wifi_calling_3: ImageVector? = null

