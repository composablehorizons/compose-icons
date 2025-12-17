package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Connect_without_contact: ImageVector
    get() {
        if (_Connect_without_contact != null) return _Connect_without_contact!!
        
        _Connect_without_contact = ImageVector.Builder(
            name = "connect_without_contact",
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
                moveTo(11f, 14f)
                horizontalLineTo(9f)
                curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
                verticalLineToRelative(2f)
                curveTo(14.13f, 7f, 11f, 10.13f, 11f, 14f)
                close()
                moveTo(18f, 11f)
                verticalLineTo(9f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(2f)
                curveTo(15f, 12.34f, 16.34f, 11f, 18f, 11f)
                close()
                moveTo(7f, 4f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                reflectiveCurveTo(3f, 2.89f, 3f, 4f)
                reflectiveCurveToRelative(0.89f, 2f, 2f, 2f)
                reflectiveCurveTo(7f, 5.11f, 7f, 4f)
                close()
                moveTo(11.45f, 4.5f)
                horizontalLineToRelative(-2f)
                curveTo(9.21f, 5.92f, 7.99f, 7f, 6.5f, 7f)
                horizontalLineToRelative(-3f)
                curveTo(2.67f, 7f, 2f, 7.67f, 2f, 8.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(6f)
                verticalLineTo(8.74f)
                curveTo(9.86f, 8.15f, 11.25f, 6.51f, 11.45f, 4.5f)
                close()
                moveTo(19f, 17f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                reflectiveCurveToRelative(-0.89f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.89f, -2f, 2f)
                reflectiveCurveTo(17.89f, 17f, 19f, 17f)
                close()
                moveTo(20.5f, 18f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.49f, 0f, -2.71f, -1.08f, -2.95f, -2.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(0.2f, 2.01f, 1.59f, 3.65f, 3.45f, 4.24f)
                verticalLineTo(22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2.5f)
                curveTo(22f, 18.67f, 21.33f, 18f, 20.5f, 18f)
                close()
            }
        }.build()
        
        return _Connect_without_contact!!
    }

private var _Connect_without_contact: ImageVector? = null

