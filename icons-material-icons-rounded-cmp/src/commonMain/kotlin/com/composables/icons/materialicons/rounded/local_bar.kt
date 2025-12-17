package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_bar: ImageVector
    get() {
        if (_Local_bar != null) return _Local_bar!!
        
        _Local_bar = ImageVector.Builder(
            name = "local_bar",
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
                moveTo(21f, 4.45f)
                curveToRelative(0f, -0.8f, -0.65f, -1.45f, -1.45f, -1.45f)
                horizontalLineTo(4.45f)
                curveTo(3.65f, 3f, 3f, 3.65f, 3f, 4.45f)
                curveToRelative(0f, 0.35f, 0.13f, 0.7f, 0.37f, 0.96f)
                lineTo(11f, 14f)
                verticalLineToRelative(5f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                lineToRelative(7.63f, -8.59f)
                curveToRelative(0.24f, -0.26f, 0.37f, -0.61f, 0.37f, -0.96f)
                close()
                moveTo(7.43f, 7f)
                lineTo(5.66f, 5f)
                horizontalLineToRelative(12.69f)
                lineToRelative(-1.78f, 2f)
                horizontalLineTo(7.43f)
                close()
            }
        }.build()
        
        return _Local_bar!!
    }

private var _Local_bar: ImageVector? = null

