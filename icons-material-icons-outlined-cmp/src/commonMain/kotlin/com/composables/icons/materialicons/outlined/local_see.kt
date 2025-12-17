package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Local_see: ImageVector
    get() {
        if (_Local_see != null) return _Local_see!!
        
        _Local_see = ImageVector.Builder(
            name = "local_see",
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
                moveTo(20f, 4f)
                horizontalLineToRelative(-3.17f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7.17f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(4.05f)
                lineToRelative(0.59f, -0.65f)
                lineTo(9.88f, 4f)
                horizontalLineToRelative(4.24f)
                lineToRelative(1.24f, 1.35f)
                lineToRelative(0.59f, 0.65f)
                horizontalLineTo(20f)
                verticalLineToRelative(12f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveToRelative(0f, 8.2f)
                curveToRelative(-1.77f, 0f, -3.2f, -1.43f, -3.2f, -3.2f)
                curveToRelative(0f, -1.77f, 1.43f, -3.2f, 3.2f, -3.2f)
                reflectiveCurveToRelative(3.2f, 1.43f, 3.2f, 3.2f)
                curveToRelative(0f, 1.77f, -1.43f, 3.2f, -3.2f, 3.2f)
                close()
            }
        }.build()
        
        return _Local_see!!
    }

private var _Local_see: ImageVector? = null

