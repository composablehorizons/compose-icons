package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Corporate_fare: ImageVector
    get() {
        if (_Corporate_fare != null) return _Corporate_fare!!
        
        _Corporate_fare = ImageVector.Builder(
            name = "corporate_fare",
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
                moveTo(12f, 7f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(12f)
                close()
                moveTo(10f, 19f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineTo(19f)
                close()
                moveTo(10f, 15f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineTo(15f)
                close()
                moveTo(10f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineToRelative(6f)
                verticalLineTo(11f)
                close()
                moveTo(10f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineTo(7f)
                close()
                moveTo(20f, 19f)
                horizontalLineToRelative(-8f)
                verticalLineTo(9f)
                horizontalLineToRelative(8f)
                verticalLineTo(19f)
                close()
                moveTo(18f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineTo(11f)
                close()
                moveTo(18f, 15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        
        return _Corporate_fare!!
    }

private var _Corporate_fare: ImageVector? = null

