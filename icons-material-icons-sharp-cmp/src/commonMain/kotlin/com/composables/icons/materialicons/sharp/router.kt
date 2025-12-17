package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Router: ImageVector
    get() {
        if (_Router != null) return _Router!!
        
        _Router = ImageVector.Builder(
            name = "router",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.2f, 5.9f)
                lineToRelative(0.8f, -0.8f)
                curveTo(19.6f, 3.7f, 17.8f, 3f, 16f, 3f)
                reflectiveCurveToRelative(-3.6f, 0.7f, -5f, 2.1f)
                lineToRelative(0.8f, 0.8f)
                curveTo(13f, 4.8f, 14.5f, 4.2f, 16f, 4.2f)
                reflectiveCurveToRelative(3f, 0.6f, 4.2f, 1.7f)
                close()
                moveToRelative(-0.9f, 0.8f)
                curveToRelative(-0.9f, -0.9f, -2.1f, -1.4f, -3.3f, -1.4f)
                reflectiveCurveToRelative(-2.4f, 0.5f, -3.3f, 1.4f)
                lineToRelative(0.8f, 0.8f)
                curveToRelative(0.7f, -0.7f, 1.6f, -1f, 2.5f, -1f)
                reflectiveCurveToRelative(1.8f, 0.3f, 2.5f, 1f)
                lineToRelative(0.8f, -0.8f)
                close()
                moveTo(21f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineTo(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineTo(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-8f)
                close()
                moveTo(8f, 18f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(3.5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(3.5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Router!!
    }

private var _Router: ImageVector? = null

