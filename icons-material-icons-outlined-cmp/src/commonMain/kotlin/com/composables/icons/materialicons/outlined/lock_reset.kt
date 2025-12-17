package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Lock_reset: ImageVector
    get() {
        if (_Lock_reset != null) return _Lock_reset!!
        
        _Lock_reset = ImageVector.Builder(
            name = "lock_reset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(13f, 3f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                curveToRelative(0f, 0.06f, 0.01f, 0.12f, 0.01f, 0.19f)
                lineToRelative(-1.84f, -1.84f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(5f, 16f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.82f, 1.82f)
                curveTo(6.01f, 12.11f, 6f, 12.06f, 6f, 12f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                curveToRelative(-1.9f, 0f, -3.62f, -0.76f, -4.88f, -1.99f)
                lineTo(6.7f, 18.42f)
                curveTo(8.32f, 20.01f, 10.55f, 21f, 13f, 21f)
                curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
                reflectiveCurveTo(17.97f, 3f, 13f, 3f)
                close()
                moveTo(15f, 11f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveTo(16f, 11.45f, 15.55f, 11f, 15f, 11f)
                close()
                moveTo(14f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineTo(11f)
                close()
            }
        }.build()
        
        return _Lock_reset!!
    }

private var _Lock_reset: ImageVector? = null

