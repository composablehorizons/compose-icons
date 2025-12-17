package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Low_priority: ImageVector
    get() {
        if (_Low_priority != null) return _Low_priority!!
        
        _Low_priority = ImageVector.Builder(
            name = "low_priority",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(0f, 5.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(0f, 5.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(-5.15f, 3.15f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-1.79f, -1.79f)
                curveToRelative(-0.31f, -0.32f, -0.85f, -0.1f, -0.85f, 0.35f)
                verticalLineToRelative(3.59f)
                curveToRelative(0f, 0.44f, 0.54f, 0.66f, 0.85f, 0.35f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(-0.3f)
                curveToRelative(-2.35f, 0f, -4.45f, -1.71f, -4.68f, -4.05f)
                curveTo(3.76f, 9.27f, 5.87f, 7f, 8.5f, 7f)
                horizontalLineTo(11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(8.5f)
                curveToRelative(-3.86f, 0f, -6.96f, 3.4f, -6.44f, 7.36f)
                curveTo(2.48f, 15.64f, 5.43f, 18f, 8.73f, 18f)
                horizontalLineTo(9f)
            }
        }.build()
        
        return _Low_priority!!
    }

private var _Low_priority: ImageVector? = null

