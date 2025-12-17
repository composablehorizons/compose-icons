package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Radio: ImageVector
    get() {
        if (_Radio != null) return _Radio!!
        
        _Radio = ImageVector.Builder(
            name = "radio",
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
                moveTo(20f, 13f)
                horizontalLineTo(4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-7f)
                close()
                moveTo(8f, 18.98f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 20f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                horizontalLineTo(8.3f)
                lineToRelative(8.26f, -3.34f)
                lineTo(15.88f, 1f)
                lineTo(3.24f, 6.15f)
                curveTo(2.51f, 6.43f, 2f, 7.17f, 2f, 8f)
                verticalLineToRelative(12f)
                close()
                moveTo(4f, 8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                close()
                moveToRelative(0f, 5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(7f)
                horizontalLineTo(4f)
                verticalLineToRelative(-7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 16.48f)
                arcTo(2.5f, 2.5f, 0f, false, true, 8f, 18.98f)
                arcTo(2.5f, 2.5f, 0f, false, true, 5.5f, 16.48f)
                arcTo(2.5f, 2.5f, 0f, false, true, 10.5f, 16.48f)
                close()
            }
        }.build()
        
        return _Radio!!
    }

private var _Radio: ImageVector? = null

