package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Set_meal: ImageVector
    get() {
        if (_Set_meal != null) return _Set_meal!!
        
        _Set_meal = ImageVector.Builder(
            name = "set_meal",
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
                moveTo(21.05f, 17.56f)
                lineTo(3.08f, 18.5f)
                lineTo(3f, 17f)
                lineToRelative(17.98f, -0.94f)
                lineTo(21.05f, 17.56f)
                close()
                moveTo(21f, 19.48f)
                horizontalLineTo(3f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(18f)
                verticalLineTo(19.48f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(16f)
                curveTo(21.1f, 3f, 22f, 3.9f, 22f, 5f)
                close()
                moveTo(20f, 6f)
                curveToRelative(-1.68f, 0f, -3.04f, 0.98f, -3.21f, 2.23f)
                curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f)
                curveToRelative(-4.67f, 0f, -6.75f, 3f, -6.75f, 3f)
                reflectiveCurveToRelative(2.08f, 3f, 6.75f, 3f)
                curveToRelative(3.81f, 0f, 5.9f, -2f, 6.54f, -2.73f)
                curveTo(16.96f, 10.02f, 18.32f, 11f, 20f, 11f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Set_meal!!
    }

private var _Set_meal: ImageVector? = null

