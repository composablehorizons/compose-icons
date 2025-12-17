package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Emergency_share: ImageVector
    get() {
        if (_Emergency_share != null) return _Emergency_share!!
        
        _Emergency_share = ImageVector.Builder(
            name = "emergency_share",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 9f)
                    curveToRelative(-3.15f, 0f, -6f, 2.41f, -6f, 6.15f)
                    curveToRelative(0f, 2.35f, 1.78f, 5.11f, 5.34f, 8.27f)
                    curveToRelative(0.37f, 0.33f, 0.95f, 0.33f, 1.33f, 0f)
                    curveTo(16.22f, 20.25f, 18f, 17.5f, 18f, 15.15f)
                    curveTo(18f, 11.41f, 15.15f, 9f, 12f, 9f)
                    close()
                    moveTo(12f, 16.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(12.83f, 16.5f, 12f, 16.5f)
                    close()
                    moveTo(16.18f, 6.82f)
                    curveToRelative(-0.35f, 0.35f, -0.89f, 0.38f, -1.3f, 0.09f)
                    curveTo(14.07f, 6.34f, 13.07f, 6f, 12f, 6f)
                    reflectiveCurveTo(9.93f, 6.34f, 9.12f, 6.91f)
                    curveToRelative(-0.41f, 0.28f, -0.95f, 0.26f, -1.3f, -0.09f)
                    curveToRelative(-0.43f, -0.43f, -0.39f, -1.15f, 0.09f, -1.5f)
                    curveTo(9.06f, 4.49f, 10.48f, 4f, 12f, 4f)
                    reflectiveCurveToRelative(2.94f, 0.49f, 4.09f, 1.32f)
                    curveTo(16.58f, 5.67f, 16.61f, 6.39f, 16.18f, 6.82f)
                    close()
                    moveTo(4.97f, 3.97f)
                    curveTo(4.55f, 3.54f, 4.59f, 2.85f, 5.05f, 2.47f)
                    curveTo(6.95f, 0.93f, 9.37f, 0f, 12.01f, 0f)
                    curveToRelative(2.64f, 0f, 5.06f, 0.93f, 6.95f, 2.48f)
                    curveToRelative(0.46f, 0.38f, 0.5f, 1.07f, 0.08f, 1.49f)
                    curveToRelative(-0.36f, 0.36f, -0.93f, 0.39f, -1.32f, 0.07f)
                    curveTo(16.16f, 2.77f, 14.17f, 2f, 12.01f, 2f)
                    curveTo(9.83f, 2f, 7.84f, 2.77f, 6.29f, 4.04f)
                    curveTo(5.9f, 4.36f, 5.33f, 4.32f, 4.97f, 3.97f)
                    close()
                }
            }
        }.build()
        
        return _Emergency_share!!
    }

private var _Emergency_share: ImageVector? = null

