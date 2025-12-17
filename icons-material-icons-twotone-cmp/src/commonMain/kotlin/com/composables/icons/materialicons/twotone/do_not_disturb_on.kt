package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Do_not_disturb_on: ImageVector
    get() {
        if (_Do_not_disturb_on != null) return _Do_not_disturb_on!!
        
        _Do_not_disturb_on = ImageVector.Builder(
            name = "do_not_disturb_on",
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
                            moveTo(12f, 4f)
                            curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                            reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                            reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                            reflectiveCurveTo(16.41f, 4f, 12f, 4f)
                            close()
                            moveTo(17f, 13f)
                            horizontalLineTo(7f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(10f)
                            verticalLineTo(13f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(7f, 11f)
                            horizontalLineTo(17f)
                            verticalLineTo(13f)
                            horizontalLineTo(7f)
                            verticalLineTo(11f)
                            close()
                        }
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
                            curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                            reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                            reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                            reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Do_not_disturb_on!!
    }

private var _Do_not_disturb_on: ImageVector? = null

