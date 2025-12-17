package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Girl: ImageVector
    get() {
        if (_Girl != null) return _Girl!!
        
        _Girl = ImageVector.Builder(
            name = "girl",
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
                        moveTo(12f, 7.5f)
                        curveToRelative(0.97f, 0f, 1.75f, -0.78f, 1.75f, -1.75f)
                        reflectiveCurveTo(12.97f, 4f, 12f, 4f)
                        reflectiveCurveToRelative(-1.75f, 0.78f, -1.75f, 1.75f)
                        reflectiveCurveTo(11.03f, 7.5f, 12f, 7.5f)
                        close()
                        moveTo(14f, 16f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(9.44f)
                        curveToRelative(-0.7f, 0f, -1.18f, -0.7f, -0.94f, -1.35f)
                        lineToRelative(1.88f, -5.03f)
                        curveTo(10.63f, 8.95f, 11.28f, 8.5f, 12f, 8.5f)
                        reflectiveCurveToRelative(1.37f, 0.45f, 1.62f, 1.12f)
                        lineToRelative(1.88f, 5.03f)
                        curveTo(15.74f, 15.3f, 15.26f, 16f, 14.56f, 16f)
                        horizontalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Girl!!
    }

private var _Girl: ImageVector? = null

