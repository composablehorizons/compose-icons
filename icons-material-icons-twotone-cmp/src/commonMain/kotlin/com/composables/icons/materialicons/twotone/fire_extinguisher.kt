package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Fire_extinguisher: ImageVector
    get() {
        if (_Fire_extinguisher != null) return _Fire_extinguisher!!
        
        _Fire_extinguisher = ImageVector.Builder(
            name = "fire_extinguisher",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 19f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(9f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(7f, 18f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-5f)
                    horizontalLineTo(7f)
                    verticalLineTo(18f)
                    close()
                    moveTo(17f, 3f)
                    verticalLineToRelative(6f)
                    lineToRelative(-3.15f, -0.66f)
                    curveToRelative(-0.01f, 0f, -0.01f, 0.01f, -0.02f, 0.02f)
                    curveToRelative(1.55f, 0.62f, 2.72f, 1.98f, 3.07f, 3.64f)
                    horizontalLineTo(7.1f)
                    curveToRelative(0.34f, -1.66f, 1.52f, -3.02f, 3.07f, -3.64f)
                    curveToRelative(-0.33f, -0.26f, -0.6f, -0.58f, -0.8f, -0.95f)
                    lineTo(5f, 6.5f)
                    verticalLineToRelative(-1f)
                    lineToRelative(4.37f, -0.91f)
                    curveTo(9.87f, 3.65f, 10.86f, 3f, 12f, 3f)
                    curveToRelative(0.7f, 0f, 1.34f, 0.25f, 1.85f, 0.66f)
                    lineTo(17f, 3f)
                    close()
                    moveTo(13f, 6f)
                    curveToRelative(-0.03f, -0.59f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    reflectiveCurveTo(13f, 6.55f, 13f, 6f)
                    close()
                }
            }
        }.build()
        
        return _Fire_extinguisher!!
    }

private var _Fire_extinguisher: ImageVector? = null

