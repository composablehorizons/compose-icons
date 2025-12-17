package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Edit_attributes: ImageVector
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
                moveTo(7.24f, 14.46f)
                lineToRelative(-2.57f, -2.57f)
                lineToRelative(0.7f, -0.7f)
                lineToRelative(1.87f, 1.87f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(0.7f, 0.7f)
                lineToRelative(-4.22f, 4.22f)
                close()
            }
        }.build()
        
        return _Edit_attributes!!
    }

private var _Edit_attributes: ImageVector? = null

