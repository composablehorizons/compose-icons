package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Edit_location: ImageVector
    get() {
        if (_Edit_location != null) return _Edit_location!!
        
        _Edit_location = ImageVector.Builder(
            name = "edit_location",
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
                moveTo(12f, 2f)
                curveTo(8.14f, 2f, 5f, 5.14f, 5f, 9f)
                curveToRelative(0f, 5.25f, 7f, 13f, 7f, 13f)
                reflectiveCurveToRelative(7f, -7.75f, 7f, -13f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveToRelative(-1.56f, 10f)
                horizontalLineTo(9f)
                verticalLineToRelative(-1.44f)
                lineToRelative(3.35f, -3.34f)
                lineToRelative(1.43f, 1.43f)
                lineTo(10.44f, 12f)
                close()
                moveToRelative(4.45f, -4.45f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.15f, -0.15f, 0.39f, -0.15f, 0.54f, 0f)
                lineToRelative(0.9f, 0.9f)
                curveToRelative(0.15f, 0.15f, 0.15f, 0.39f, 0f, 0.54f)
                close()
            }
        }.build()
        
        return _Edit_location!!
    }

private var _Edit_location: ImageVector? = null

