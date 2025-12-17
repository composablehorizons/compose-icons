package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Speaker_phone: ImageVector
    get() {
        if (_Speaker_phone != null) return _Speaker_phone!!
        
        _Speaker_phone = ImageVector.Builder(
            name = "speaker_phone",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
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
                        moveTo(7.76f, 7.83f)
                        lineToRelative(0.02f, 0.02f)
                        curveToRelative(0.35f, 0.35f, 0.89f, 0.38f, 1.3f, 0.09f)
                        curveTo(9.91f, 7.37f, 10.92f, 7.02f, 12f, 7.02f)
                        reflectiveCurveToRelative(2.09f, 0.35f, 2.92f, 0.93f)
                        curveToRelative(0.4f, 0.29f, 0.95f, 0.26f, 1.3f, -0.09f)
                        lineToRelative(0.02f, -0.02f)
                        curveToRelative(0.42f, -0.42f, 0.39f, -1.14f, -0.09f, -1.49f)
                        curveTo(14.98f, 5.5f, 13.55f, 5f, 12f, 5f)
                        reflectiveCurveTo(9.02f, 5.5f, 7.86f, 6.34f)
                        curveTo(7.37f, 6.69f, 7.34f, 7.41f, 7.76f, 7.83f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 1f)
                        curveTo(9.38f, 1f, 6.97f, 1.93f, 5.08f, 3.47f)
                        curveTo(4.62f, 3.84f, 4.57f, 4.53f, 5f, 4.96f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.36f, 0.36f, 0.93f, 0.39f, 1.32f, 0.07f)
                        curveTo(7.86f, 3.76f, 9.85f, 3f, 12f, 3f)
                        reflectiveCurveToRelative(4.14f, 0.76f, 5.69f, 2.03f)
                        curveToRelative(0.39f, 0.32f, 0.96f, 0.29f, 1.32f, -0.07f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.42f, -0.42f, 0.38f, -1.11f, -0.08f, -1.49f)
                        curveTo(17.03f, 1.93f, 14.62f, 1f, 12f, 1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 10f)
                        lineToRelative(-6f, 0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(5.99f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        lineTo(16f, 11f)
                        curveTo(16f, 10.45f, 15.55f, 10f, 15f, 10f)
                        close()
                        moveTo(15f, 20f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-8f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Speaker_phone!!
    }

private var _Speaker_phone: ImageVector? = null

