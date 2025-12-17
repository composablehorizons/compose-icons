package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Phone_missed: ImageVector
    get() {
        if (_Phone_missed != null) return _Phone_missed!!
        
        _Phone_missed = ImageVector.Builder(
            name = "phone_missed",
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
                moveTo(6.5f, 5.5f)
                lineTo(12f, 11f)
                lineToRelative(7f, -7f)
                lineToRelative(-1f, -1f)
                lineToRelative(-6f, 6f)
                lineToRelative(-4.5f, -4.5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(5.5f)
                close()
                moveToRelative(17.21f, 11.17f)
                curveTo(20.66f, 13.78f, 16.54f, 12f, 12f, 12f)
                curveTo(7.46f, 12f, 3.34f, 13.78f, 0.29f, 16.67f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f)
                reflectiveCurveToRelative(0.11f, 0.53f, 0.29f, 0.71f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.27f, 0f, 0.52f, -0.11f, 0.7f, -0.28f)
                curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f)
                curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveToRelative(1.45f, -0.48f, 3f, -0.73f, 4.6f, -0.73f)
                curveToRelative(1.6f, 0f, 3.15f, 0.25f, 4.6f, 0.72f)
                verticalLineToRelative(3.1f)
                curveToRelative(0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f)
                curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.67f, 1.85f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.28f, 0f, 0.53f, -0.11f, 0.71f, -0.29f)
                lineToRelative(2.48f, -2.48f)
                curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f)
                reflectiveCurveToRelative(-0.12f, -0.52f, -0.3f, -0.7f)
                close()
            }
        }.build()
        
        return _Phone_missed!!
    }

private var _Phone_missed: ImageVector? = null

