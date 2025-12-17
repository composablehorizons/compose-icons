package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Science: ImageVector
    get() {
        if (_Science != null) return _Science!!
        
        _Science = ImageVector.Builder(
            name = "science",
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
                moveTo(20.54f, 17.73f)
                lineTo(15f, 11f)
                verticalLineTo(5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(8f)
                curveTo(7.45f, 3f, 7f, 3.45f, 7f, 4f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                lineToRelative(-5.54f, 6.73f)
                curveTo(3.14f, 18.12f, 3f, 18.56f, 3f, 19f)
                curveToRelative(0.01f, 1.03f, 0.82f, 2f, 2f, 2f)
                horizontalLineTo(19f)
                curveToRelative(1.19f, 0f, 2f, -0.97f, 2f, -2f)
                curveTo(21f, 18.56f, 20.86f, 18.12f, 20.54f, 17.73f)
                close()
            }
        }.build()
        
        return _Science!!
    }

private var _Science: ImageVector? = null

