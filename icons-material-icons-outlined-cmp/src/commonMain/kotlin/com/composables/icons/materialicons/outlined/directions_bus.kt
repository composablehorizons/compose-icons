package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Directions_bus: ImageVector
    get() {
        if (_Directions_bus != null) return _Directions_bus!!
        
        _Directions_bus = ImageVector.Builder(
            name = "directions_bus",
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
                moveTo(12f, 2f)
                curveToRelative(-4.42f, 0f, -8f, 0.5f, -8f, 4f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.88f, 0.39f, 1.67f, 1f, 2.22f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0.61f, -0.55f, 1f, -1.34f, 1f, -2.22f)
                verticalLineTo(6f)
                curveToRelative(0f, -3.5f, -3.58f, -4f, -8f, -4f)
                close()
                moveToRelative(5.66f, 2.99f)
                horizontalLineTo(6.34f)
                curveTo(6.89f, 4.46f, 8.31f, 4f, 12f, 4f)
                reflectiveCurveToRelative(5.11f, 0.46f, 5.66f, 0.99f)
                close()
                moveToRelative(0.34f, 2f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(6.99f)
                horizontalLineToRelative(12f)
                close()
                moveToRelative(-0.34f, 9.74f)
                lineToRelative(-0.29f, 0.27f)
                horizontalLineTo(6.63f)
                lineToRelative(-0.29f, -0.27f)
                curveTo(6.21f, 16.62f, 6f, 16.37f, 6f, 16f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.37f, -0.21f, 0.62f, -0.34f, 0.73f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17f, 14.5f)
                close()
            }
        }.build()
        
        return _Directions_bus!!
    }

private var _Directions_bus: ImageVector? = null

