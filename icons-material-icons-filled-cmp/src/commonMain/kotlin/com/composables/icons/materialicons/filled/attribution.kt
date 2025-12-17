package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Attribution: ImageVector
    get() {
        if (_Attribution != null) return _Attribution!!
        
        _Attribution = ImageVector.Builder(
            name = "attribution",
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
                            moveTo(12f, 8.5f)
                            curveToRelative(-0.91f, 0f, -2.75f, 0.46f, -2.75f, 1.38f)
                            verticalLineToRelative(4.62f)
                            horizontalLineToRelative(1.5f)
                            verticalLineTo(19f)
                            horizontalLineToRelative(2.5f)
                            verticalLineToRelative(-4.5f)
                            horizontalLineToRelative(1.5f)
                            verticalLineTo(9.88f)
                            curveTo(14.75f, 8.97f, 12.91f, 8.5f, 12f, 8.5f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 2f)
                            curveTo(6.47f, 2f, 2f, 6.47f, 2f, 12f)
                            reflectiveCurveToRelative(4.47f, 10f, 10f, 10f)
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
                            moveTo(13.5f, 6.5f)
                            arcTo(1.5f, 1.5f, 0f, false, true, 12f, 8f)
                            arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 6.5f)
                            arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 6.5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Attribution!!
    }

private var _Attribution: ImageVector? = null

