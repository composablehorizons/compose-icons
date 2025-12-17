package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sports_football: ImageVector
    get() {
        if (_Sports_football != null) return _Sports_football!!
        
        _Sports_football = ImageVector.Builder(
            name = "sports_football",
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
                        moveTo(3.02f, 15.62f)
                        curveToRelative(-0.08f, 2.42f, 0.32f, 4.34f, 0.67f, 4.69f)
                        reflectiveCurveToRelative(2.28f, 0.76f, 4.69f, 0.67f)
                        lineTo(3.02f, 15.62f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.08f, 3.28f)
                        curveTo(10.75f, 3.7f, 8.29f, 4.62f, 6.46f, 6.46f)
                        reflectiveCurveToRelative(-2.76f, 4.29f, -3.18f, 6.62f)
                        lineToRelative(7.63f, 7.63f)
                        curveToRelative(2.34f, -0.41f, 4.79f, -1.34f, 6.62f, -3.18f)
                        reflectiveCurveToRelative(2.76f, -4.29f, 3.18f, -6.62f)
                        lineTo(13.08f, 3.28f)
                        close()
                        moveTo(9.9f, 15.5f)
                        lineToRelative(-1.4f, -1.4f)
                        lineToRelative(5.6f, -5.6f)
                        lineToRelative(1.4f, 1.4f)
                        lineTo(9.9f, 15.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.98f, 8.38f)
                        curveToRelative(0.08f, -2.42f, -0.32f, -4.34f, -0.67f, -4.69f)
                        reflectiveCurveToRelative(-2.28f, -0.76f, -4.69f, -0.67f)
                        lineTo(20.98f, 8.38f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_football!!
    }

private var _Sports_football: ImageVector? = null

