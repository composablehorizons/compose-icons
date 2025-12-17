package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Add_alert: ImageVector
    get() {
        if (_Add_alert != null) return _Add_alert!!
        
        _Add_alert = ImageVector.Builder(
            name = "add_alert",
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
                moveTo(10.01f, 21.01f)
                curveToRelative(0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f)
                reflectiveCurveToRelative(1.99f, -0.89f, 1.99f, -1.99f)
                horizontalLineToRelative(-3.98f)
                close()
                moveToRelative(8.87f, -4.19f)
                verticalLineTo(11f)
                curveToRelative(0f, -3.25f, -2.25f, -5.97f, -5.29f, -6.69f)
                verticalLineToRelative(-0.72f)
                curveTo(13.59f, 2.71f, 12.88f, 2f, 12f, 2f)
                reflectiveCurveToRelative(-1.59f, 0.71f, -1.59f, 1.59f)
                verticalLineToRelative(0.72f)
                curveTo(7.37f, 5.03f, 5.12f, 7.75f, 5.12f, 11f)
                verticalLineToRelative(5.82f)
                lineTo(3f, 18.94f)
                verticalLineTo(20f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1.06f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(16f, 13.01f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.01f)
                close()
            }
        }.build()
        
        return _Add_alert!!
    }

private var _Add_alert: ImageVector? = null

