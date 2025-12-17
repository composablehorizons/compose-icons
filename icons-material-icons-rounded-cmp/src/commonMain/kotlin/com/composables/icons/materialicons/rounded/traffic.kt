package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Traffic: ImageVector
    get() {
        if (_Traffic != null) return _Traffic!!
        
        _Traffic = ImageVector.Builder(
            name = "traffic",
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
                moveTo(19.96f, 10.59f)
                curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f)
                horizontalLineTo(17f)
                verticalLineTo(8.86f)
                curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f)
                curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(4.54f)
                curveToRelative(-0.31f, 0f, -0.54f, 0.28f, -0.5f, 0.59f)
                curveTo(4.28f, 7.18f, 5.46f, 8.46f, 7f, 8.86f)
                verticalLineTo(10f)
                horizontalLineTo(4.54f)
                curveToRelative(-0.31f, 0f, -0.54f, 0.28f, -0.5f, 0.59f)
                curveToRelative(0.24f, 1.59f, 1.42f, 2.87f, 2.96f, 3.27f)
                verticalLineTo(15f)
                horizontalLineTo(4.54f)
                curveToRelative(-0.31f, 0f, -0.54f, 0.28f, -0.5f, 0.59f)
                curveToRelative(0.24f, 1.59f, 1.42f, 2.87f, 2.96f, 3.27f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f)
                curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f)
                horizontalLineTo(17f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.89f, -2f, 2f, -2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                close()
                moveToRelative(0f, -5f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.89f, -2f, 2f, -2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                close()
                moveToRelative(0f, -5f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.11f, 0.89f, -2f, 2f, -2f)
                curveToRelative(1.1f, 0f, 2f, 0.89f, 2f, 2f)
                curveToRelative(0f, 1.1f, -0.89f, 2f, -2f, 2f)
                close()
            }
        }.build()
        
        return _Traffic!!
    }

private var _Traffic: ImageVector? = null

