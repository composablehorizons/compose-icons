package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Location_off: ImageVector
    get() {
        if (_Location_off != null) return _Location_off!!
        
        _Location_off = ImageVector.Builder(
            name = "location_off",
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
                moveTo(12f, 4f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.06f, -0.39f, 2.32f, -1f, 3.62f)
                lineToRelative(1.49f, 1.49f)
                curveTo(18.37f, 12.36f, 19f, 10.57f, 19f, 9f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                curveToRelative(-1.84f, 0f, -3.5f, 0.71f, -4.75f, 1.86f)
                lineToRelative(1.43f, 1.43f)
                curveTo(9.56f, 4.5f, 10.72f, 4f, 12f, 4f)
                close()
                moveToRelative(0f, 2.5f)
                curveToRelative(-0.59f, 0f, -1.13f, 0.21f, -1.56f, 0.56f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.35f, -0.43f, 0.56f, -0.97f, 0.56f, -1.56f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(3.41f, 2.86f)
                lineTo(2f, 4.27f)
                lineToRelative(3.18f, 3.18f)
                curveTo(5.07f, 7.95f, 5f, 8.47f, 5f, 9f)
                curveToRelative(0f, 5.25f, 7f, 13f, 7f, 13f)
                reflectiveCurveToRelative(1.67f, -1.85f, 3.38f, -4.35f)
                lineTo(18.73f, 21f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.41f, 2.86f)
                close()
                moveTo(12f, 18.88f)
                curveToRelative(-2.01f, -2.58f, -4.8f, -6.74f, -4.98f, -9.59f)
                lineToRelative(6.92f, 6.92f)
                curveToRelative(-0.65f, 0.98f, -1.33f, 1.89f, -1.94f, 2.67f)
                close()
            }
        }.build()
        
        return _Location_off!!
    }

private var _Location_off: ImageVector? = null

