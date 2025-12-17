package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Flight_class: ImageVector
    get() {
        if (_Flight_class != null) return _Flight_class!!
        
        _Flight_class = ImageVector.Builder(
            name = "flight_class",
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
                moveTo(16f, 4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveTo(18f, 4.9f, 17.1f, 4f, 16f, 4f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(11f)
                close()
                moveTo(9.5f, 16f)
                horizontalLineTo(18f)
                verticalLineToRelative(2f)
                horizontalLineTo(9.49f)
                curveToRelative(-0.88f, 0f, -1.66f, -0.58f, -1.92f, -1.43f)
                lineTo(5f, 8f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                lineTo(9.5f, 16f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                close()
            }
        }.build()
        
        return _Flight_class!!
    }

private var _Flight_class: ImageVector? = null

