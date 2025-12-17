package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Emergency_share: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 9f)
                    curveToRelative(-3.15f, 0f, -6f, 2.41f, -6f, 6.15f)
                    curveToRelative(0f, 2.49f, 2f, 5.44f, 6f, 8.85f)
                    curveToRelative(4f, -3.41f, 6f, -6.36f, 6f, -8.85f)
                    curveTo(18f, 11.41f, 15.15f, 9f, 12f, 9f)
                    close()
                    moveTo(12f, 16.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(12.83f, 16.5f, 12f, 16.5f)
                    close()
                    moveTo(12f, 4f)
                    curveToRelative(1.93f, 0f, 3.68f, 0.78f, 4.95f, 2.05f)
                    lineToRelative(-1.41f, 1.41f)
                    curveTo(14.63f, 6.56f, 13.38f, 6f, 12f, 6f)
                    reflectiveCurveTo(9.37f, 6.56f, 8.46f, 7.46f)
                    lineTo(7.05f, 6.05f)
                    curveTo(8.32f, 4.78f, 10.07f, 4f, 12f, 4f)
                    close()
                    moveTo(19.78f, 3.23f)
                    lineToRelative(-1.41f, 1.41f)
                    curveTo(16.74f, 3.01f, 14.49f, 2f, 12.01f, 2f)
                    reflectiveCurveTo(7.27f, 3.01f, 5.64f, 4.63f)
                    lineTo(4.22f, 3.22f)
                    curveTo(6.22f, 1.23f, 8.97f, 0f, 12.01f, 0f)
                    reflectiveCurveTo(17.79f, 1.23f, 19.78f, 3.23f)
                    close()
                }
            }
        }.build()
        
        return _Emergency_share!!
    }

private var _Emergency_share: ImageVector? = null

