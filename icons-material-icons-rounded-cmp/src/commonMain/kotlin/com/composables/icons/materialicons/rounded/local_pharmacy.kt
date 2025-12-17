package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_pharmacy: ImageVector
    get() {
        if (_Local_pharmacy != null) return _Local_pharmacy!!
        
        _Local_pharmacy = ImageVector.Builder(
            name = "local_pharmacy",
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
                moveTo(18.89f, 5f)
                horizontalLineToRelative(-0.53f)
                lineToRelative(0.71f, -1.97f)
                curveToRelative(0.24f, -0.65f, -0.1f, -1.37f, -0.75f, -1.6f)
                curveToRelative(-0.65f, -0.24f, -1.37f, 0.1f, -1.61f, 0.75f)
                lineTo(15.69f, 5f)
                horizontalLineTo(5.1f)
                curveTo(3.73f, 5f, 2.77f, 6.34f, 3.2f, 7.63f)
                lineTo(5f, 13f)
                lineToRelative(-1.79f, 5.37f)
                curveTo(2.77f, 19.66f, 3.74f, 21f, 5.1f, 21f)
                horizontalLineToRelative(13.78f)
                curveToRelative(1.36f, 0f, 2.33f, -1.34f, 1.9f, -2.63f)
                lineTo(19f, 13f)
                lineToRelative(1.78f, -5.37f)
                curveTo(21.21f, 6.34f, 20.25f, 5f, 18.89f, 5f)
                close()
                moveTo(15f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Local_pharmacy!!
    }

private var _Local_pharmacy: ImageVector? = null

