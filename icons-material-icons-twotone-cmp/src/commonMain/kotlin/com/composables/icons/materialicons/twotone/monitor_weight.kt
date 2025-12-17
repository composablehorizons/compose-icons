package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Monitor_weight: ImageVector
    get() {
        if (_Monitor_weight != null) return _Monitor_weight!!
        
        _Monitor_weight = ImageVector.Builder(
            name = "monitor_weight",
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
                        moveTo(13f, 8.5f)
                        horizontalLineTo(14f)
                        verticalLineTo(9.5f)
                        horizontalLineTo(13f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 8.5f)
                        horizontalLineTo(11f)
                        verticalLineTo(9.5f)
                        horizontalLineTo(10f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.5f, 8.5f)
                        horizontalLineTo(12.5f)
                        verticalLineTo(9.5f)
                        horizontalLineTo(11.5f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 19f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(5f)
                        horizontalLineTo(5f)
                        verticalLineTo(19f)
                        close()
                        moveTo(12f, 6f)
                        curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                        reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                        reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                        reflectiveCurveTo(10.34f, 6f, 12f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 12f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                        reflectiveCurveTo(9f, 7.34f, 9f, 9f)
                        reflectiveCurveTo(10.34f, 12f, 12f, 12f)
                        close()
                        moveTo(13f, 8.5f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(8.5f)
                        close()
                        moveTo(11.5f, 8.5f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(8.5f)
                        close()
                        moveTo(10f, 8.5f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(19f, 19f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Monitor_weight!!
    }

private var _Monitor_weight: ImageVector? = null

