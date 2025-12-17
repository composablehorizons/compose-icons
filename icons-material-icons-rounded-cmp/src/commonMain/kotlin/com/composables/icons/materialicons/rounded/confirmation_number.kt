package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Confirmation_number: ImageVector
    get() {
        if (_Confirmation_number != null) return _Confirmation_number!!
        
        _Confirmation_number = ImageVector.Builder(
            name = "confirmation_number",
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
                moveTo(22f, 8.54f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.89f, -1.99f, 2f)
                verticalLineToRelative(2.54f)
                curveToRelative(0f, 0.69f, 0.33f, 1.37f, 0.94f, 1.69f)
                curveTo(3.58f, 10.58f, 4f, 11.24f, 4f, 12f)
                reflectiveCurveToRelative(-0.43f, 1.43f, -1.06f, 1.76f)
                curveToRelative(-0.6f, 0.33f, -0.94f, 1.01f, -0.94f, 1.7f)
                verticalLineTo(18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2.54f)
                curveToRelative(0f, -0.69f, -0.34f, -1.37f, -0.94f, -1.7f)
                curveToRelative(-0.63f, -0.34f, -1.06f, -1f, -1.06f, -1.76f)
                reflectiveCurveToRelative(0.43f, -1.42f, 1.06f, -1.76f)
                curveToRelative(0.6f, -0.33f, 0.94f, -1.01f, 0.94f, -1.7f)
                close()
                moveToRelative(-9f, 8.96f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Confirmation_number!!
    }

private var _Confirmation_number: ImageVector? = null

