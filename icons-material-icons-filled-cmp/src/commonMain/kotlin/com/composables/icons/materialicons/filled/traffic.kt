package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Traffic: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineTo(8.86f)
                curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
                horizontalLineToRelative(-3f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(4f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
                close()
                moveToRelative(-8f, 9f)
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

