package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Tapas: ImageVector
    get() {
        if (_Tapas != null) return _Tapas!!
        
        _Tapas = ImageVector.Builder(
            name = "tapas",
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
                moveTo(22f, 10f)
                verticalLineTo(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineTo(21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.14f)
                curveTo(20.72f, 13.41f, 22f, 11.86f, 22f, 10f)
                close()
                moveTo(20f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                close()
                moveTo(16f, 10f)
                verticalLineTo(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveTo(16f, 11.1f, 16f, 10f)
                close()
                moveTo(10f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveTo(12.5f, 4.12f, 11.38f, 3f, 10f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                curveTo(2.62f, 3f, 1.5f, 4.12f, 1.5f, 5.5f)
                curveTo(1.5f, 6.88f, 2.62f, 8f, 4f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineTo(4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveTo(1.5f, 12.88f, 2.62f, 14f, 4f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveTo(12.5f, 10.12f, 11.38f, 9f, 10f, 9f)
                close()
                moveTo(4f, 6f)
                curveTo(3.72f, 6f, 3.5f, 5.78f, 3.5f, 5.5f)
                reflectiveCurveTo(3.72f, 5f, 4f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveTo(10.28f, 6f, 10f, 6f)
                horizontalLineTo(4f)
                close()
                moveTo(10f, 12f)
                horizontalLineTo(4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveTo(3.72f, 11f, 4f, 11f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveTo(10.28f, 12f, 10f, 12f)
                close()
            }
        }.build()
        
        return _Tapas!!
    }

private var _Tapas: ImageVector? = null

