package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Track_changes: ImageVector
    get() {
        if (_Track_changes != null) return _Track_changes!!
        
        _Track_changes = ImageVector.Builder(
            name = "track_changes",
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
                moveTo(19.07f, 4.93f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(19.1f, 7.79f, 20f, 9.79f, 20f, 12f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.58f, -8f, -8f)
                curveToRelative(0f, -4.08f, 3.05f, -7.44f, 7f, -7.93f)
                verticalLineToRelative(2.02f)
                curveTo(8.16f, 6.57f, 6f, 9.03f, 6f, 12f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -1.66f, -0.67f, -3.16f, -1.76f, -4.24f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(15.55f, 9.9f, 16f, 10.9f, 16f, 12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.86f, 1.28f, -3.41f, 3f, -3.86f)
                verticalLineToRelative(2.14f)
                curveToRelative(-0.6f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.4f, -1.38f, -1f, -1.72f)
                verticalLineTo(2f)
                horizontalLineToRelative(-1f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                curveToRelative(0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f)
                close()
            }
        }.build()
        
        return _Track_changes!!
    }

private var _Track_changes: ImageVector? = null

