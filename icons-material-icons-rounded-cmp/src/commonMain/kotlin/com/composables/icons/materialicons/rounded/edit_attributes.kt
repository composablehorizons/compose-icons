package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Edit_attributes: ImageVector
    get() {
        if (_Edit_attributes != null) return _Edit_attributes!!
        
        _Edit_attributes = ImageVector.Builder(
            name = "edit_attributes",
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
                moveTo(17.63f, 7f)
                horizontalLineTo(6.37f)
                curveTo(3.96f, 7f, 2f, 9.24f, 2f, 12f)
                reflectiveCurveToRelative(1.96f, 5f, 4.37f, 5f)
                horizontalLineToRelative(11.26f)
                curveToRelative(2.41f, 0f, 4.37f, -2.24f, 4.37f, -5f)
                reflectiveCurveToRelative(-1.96f, -5f, -4.37f, -5f)
                close()
                moveToRelative(-6.52f, 3.6f)
                lineTo(7.6f, 14.11f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-1.86f, -1.86f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(1.51f, 1.51f)
                lineToRelative(3.16f, -3.16f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.17f, 0.51f, -0.02f, 0.71f)
                close()
            }
        }.build()
        
        return _Edit_attributes!!
    }

private var _Edit_attributes: ImageVector? = null

