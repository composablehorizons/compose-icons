package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Watch_later: ImageVector
    get() {
        if (_Watch_later != null) return _Watch_later!!
        
        _Watch_later = ImageVector.Builder(
            name = "watch_later",
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
                        curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                        reflectiveCurveToRelative(4.5f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.5f, 10f, -10f)
                        reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                        close()
                        moveTo(15.55f, 15.8f)
                        lineToRelative(-4.08f, -2.51f)
                        curveToRelative(-0.3f, -0.18f, -0.48f, -0.5f, -0.48f, -0.85f)
                        verticalLineTo(7.75f)
                        curveTo(11f, 7.34f, 11.34f, 7f, 11.75f, 7f)
                        reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                        verticalLineToRelative(4.45f)
                        lineToRelative(3.84f, 2.31f)
                        curveToRelative(0.36f, 0.22f, 0.48f, 0.69f, 0.26f, 1.05f)
                        curveTo(16.38f, 15.91f, 15.91f, 16.02f, 15.55f, 15.8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Watch_later!!
    }

private var _Watch_later: ImageVector? = null

