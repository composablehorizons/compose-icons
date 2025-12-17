package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Add_alert: ImageVector
    get() {
        if (_Add_alert != null) return _Add_alert!!
        
        _Add_alert = ImageVector.Builder(
            name = "add_alert",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 22f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            horizontalLineToRelative(-4f)
                            curveTo(10f, 21.1f, 10.9f, 22f, 12f, 22f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19f, 17f)
                            horizontalLineToRelative(-1f)
                            verticalLineToRelative(-7f)
                            curveToRelative(0f, -2.79f, -1.91f, -5.14f, -4.5f, -5.8f)
                            verticalLineTo(3.5f)
                            curveTo(13.5f, 2.67f, 12.83f, 2f, 12f, 2f)
                            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                            verticalLineToRelative(0.7f)
                            curveTo(7.91f, 4.86f, 6f, 7.21f, 6f, 10f)
                            verticalLineToRelative(7f)
                            horizontalLineTo(5f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(14f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            reflectiveCurveTo(19.55f, 17f, 19f, 17f)
                            close()
                            moveTo(14f, 13f)
                            horizontalLineToRelative(-1f)
                            verticalLineToRelative(1f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                            verticalLineToRelative(-1f)
                            horizontalLineToRelative(-1f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                            horizontalLineToRelative(1f)
                            verticalLineToRelative(-1f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                            verticalLineToRelative(1f)
                            horizontalLineToRelative(1f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            reflectiveCurveTo(14.55f, 13f, 14f, 13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Add_alert!!
    }

private var _Add_alert: ImageVector? = null

