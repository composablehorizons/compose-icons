package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Running_with_errors: ImageVector
    get() {
        if (_Running_with_errors != null) return _Running_with_errors!!
        
        _Running_with_errors = ImageVector.Builder(
            name = "running_with_errors",
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
                moveTo(21f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveTo(22f, 17.55f, 21.55f, 18f, 21f, 18f)
                close()
                moveTo(21f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveTo(21.55f, 20f, 21f, 20f)
                close()
                moveTo(18f, 17.29f)
                curveTo(16.53f, 18.95f, 14.39f, 20f, 12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                verticalLineToRelative(9f)
                lineToRelative(7.55f, -7.55f)
                curveTo(17.72f, 3.34f, 15.02f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                curveToRelative(2.25f, 0f, 4.33f, -0.74f, 6f, -2f)
                verticalLineTo(17.29f)
                close()
            }
        }.build()
        
        return _Running_with_errors!!
    }

private var _Running_with_errors: ImageVector? = null

