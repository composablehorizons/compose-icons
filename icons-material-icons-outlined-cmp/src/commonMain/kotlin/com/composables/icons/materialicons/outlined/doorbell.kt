package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Doorbell: ImageVector
    get() {
        if (_Doorbell != null) return _Doorbell!!
        
        _Doorbell = ImageVector.Builder(
            name = "doorbell",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11f, 16.5f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveTo(11f, 17.05f, 11f, 16.5f)
                    close()
                    moveTo(15f, 15f)
                    verticalLineToRelative(-2.34f)
                    curveToRelative(0f, -1.54f, -0.81f, -2.82f, -2.25f, -3.16f)
                    verticalLineTo(9.25f)
                    curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                    reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                    verticalLineTo(9.5f)
                    curveTo(9.82f, 9.84f, 9f, 11.12f, 9f, 12.66f)
                    verticalLineTo(15f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(15f)
                    close()
                    moveTo(12f, 5.5f)
                    lineTo(6f, 10f)
                    verticalLineToRelative(9f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-9f)
                    lineTo(12f, 5.5f)
                    moveTo(12f, 3f)
                    lineToRelative(8f, 6f)
                    verticalLineToRelative(12f)
                    horizontalLineTo(4f)
                    verticalLineTo(9f)
                    lineTo(12f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Doorbell!!
    }

private var _Doorbell: ImageVector? = null

