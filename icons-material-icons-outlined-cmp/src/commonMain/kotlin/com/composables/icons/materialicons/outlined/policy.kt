package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Policy: ImageVector
    get() {
        if (_Policy != null) return _Policy!!
        
        _Policy = ImageVector.Builder(
            name = "policy",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 1f)
                        lineTo(3f, 5f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                        curveToRelative(5.16f, -1.26f, 9f, -6.45f, 9f, -12f)
                        verticalLineTo(5f)
                        lineTo(12f, 1f)
                        close()
                        moveTo(19f, 11f)
                        curveToRelative(0f, 1.85f, -0.51f, 3.65f, -1.38f, 5.21f)
                        lineToRelative(-1.45f, -1.45f)
                        curveToRelative(1.29f, -1.94f, 1.07f, -4.58f, -0.64f, -6.29f)
                        curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0f)
                        curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                        curveToRelative(1.71f, 1.71f, 4.35f, 1.92f, 6.29f, 0.64f)
                        lineToRelative(1.72f, 1.72f)
                        curveToRelative(-1.19f, 1.42f, -2.73f, 2.51f, -4.47f, 3.04f)
                        curveTo(7.98f, 19.69f, 5f, 15.52f, 5f, 11f)
                        verticalLineTo(6.3f)
                        lineToRelative(7f, -3.11f)
                        lineToRelative(7f, 3.11f)
                        verticalLineTo(11f)
                        close()
                        moveTo(12f, 15f)
                        curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                        reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                        reflectiveCurveTo(13.66f, 15f, 12f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Policy!!
    }

private var _Policy: ImageVector? = null

