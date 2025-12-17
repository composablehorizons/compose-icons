package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_parking: ImageVector
    get() {
        if (_Local_parking != null) return _Local_parking!!
        
        _Local_parking = ImageVector.Builder(
            name = "local_parking",
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
                moveTo(12.79f, 3f)
                horizontalLineTo(8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                curveToRelative(3.57f, 0f, 6.42f, -3.13f, 5.95f, -6.79f)
                curveTo(18.56f, 5.19f, 15.84f, 3f, 12.79f, 3f)
                close()
                moveToRelative(0.41f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineToRelative(3.2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.build()
        
        return _Local_parking!!
    }

private var _Local_parking: ImageVector? = null

