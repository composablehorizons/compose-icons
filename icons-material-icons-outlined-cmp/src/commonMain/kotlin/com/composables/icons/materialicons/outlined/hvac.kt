package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hvac: ImageVector
    get() {
        if (_Hvac != null) return _Hvac!!
        
        _Hvac = ImageVector.Builder(
            name = "hvac",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 18f)
                        curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                        reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                        reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                        reflectiveCurveTo(8.69f, 18f, 12f, 18f)
                        close()
                        moveTo(15.44f, 10f)
                        curveToRelative(0.26f, 0.45f, 0.44f, 0.96f, 0.51f, 1.5f)
                        horizontalLineToRelative(-7.9f)
                        curveToRelative(0.07f, -0.54f, 0.24f, -1.05f, 0.51f, -1.5f)
                        horizontalLineTo(15.44f)
                        close()
                        moveTo(15.95f, 12.5f)
                        curveToRelative(-0.07f, 0.54f, -0.24f, 1.05f, -0.51f, 1.5f)
                        horizontalLineTo(8.56f)
                        curveToRelative(-0.26f, -0.45f, -0.44f, -0.96f, -0.51f, -1.5f)
                        horizontalLineTo(15.95f)
                        close()
                        moveTo(9.38f, 15f)
                        horizontalLineToRelative(5.24f)
                        curveToRelative(-0.7f, 0.61f, -1.61f, 1f, -2.62f, 1f)
                        reflectiveCurveTo(10.09f, 15.61f, 9.38f, 15f)
                        close()
                        moveTo(14.62f, 9f)
                        horizontalLineTo(9.38f)
                        curveToRelative(0.7f, -0.61f, 1.61f, -1f, 2.62f, -1f)
                        reflectiveCurveTo(13.91f, 8.39f, 14.62f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hvac!!
    }

private var _Hvac: ImageVector? = null

