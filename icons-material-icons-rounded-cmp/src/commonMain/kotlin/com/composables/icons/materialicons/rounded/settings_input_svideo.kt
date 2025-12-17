package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_input_svideo: ImageVector
    get() {
        if (_Settings_input_svideo != null) return _Settings_input_svideo!!
        
        _Settings_input_svideo = ImageVector.Builder(
            name = "settings_input_svideo",
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                        reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                        reflectiveCurveTo(16.42f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 11.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 13f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 6f, 11.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 9f, 11.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 11.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 16.5f, 13f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 15f, 11.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 18f, 11.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 9f, 17.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 15f, 17.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 16.5f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 7.5f)
                        curveTo(15f, 6.67f, 14.33f, 6f, 13.5f, 6f)
                        horizontalLineToRelative(-3f)
                        curveTo(9.67f, 6f, 9f, 6.67f, 9f, 7.5f)
                        reflectiveCurveTo(9.67f, 9f, 10.5f, 9f)
                        horizontalLineToRelative(3f)
                        curveTo(14.33f, 9f, 15f, 8.33f, 15f, 7.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Settings_input_svideo!!
    }

private var _Settings_input_svideo: ImageVector? = null

