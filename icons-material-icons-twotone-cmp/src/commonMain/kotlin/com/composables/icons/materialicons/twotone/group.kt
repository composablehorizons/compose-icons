package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Group: ImageVector
    get() {
        if (_Group != null) return _Group!!
        
        _Group = ImageVector.Builder(
            name = "group",
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
                moveTo(10.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.34f, 17f)
                horizontalLineToRelative(9.32f)
                curveToRelative(-0.84f, -0.58f, -2.87f, -1.25f, -4.66f, -1.25f)
                reflectiveCurveToRelative(-3.82f, 0.67f, -4.66f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(10.93f, 5f, 9f, 5f)
                reflectiveCurveTo(5.5f, 6.57f, 5.5f, 8.5f)
                reflectiveCurveTo(7.07f, 12f, 9f, 12f)
                close()
                moveToRelative(0f, -5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.83f, 10f, 9f, 10f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(8.17f, 7f, 9f, 7f)
                close()
                moveToRelative(0f, 6.75f)
                curveToRelative(-2.34f, 0f, -7f, 1.17f, -7f, 3.5f)
                verticalLineTo(19f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1.75f)
                curveToRelative(0f, -2.33f, -4.66f, -3.5f, -7f, -3.5f)
                close()
                moveTo(4.34f, 17f)
                curveToRelative(0.84f, -0.58f, 2.87f, -1.25f, 4.66f, -1.25f)
                reflectiveCurveToRelative(3.82f, 0.67f, 4.66f, 1.25f)
                horizontalLineTo(4.34f)
                close()
                moveToRelative(11.7f, -3.19f)
                curveToRelative(1.16f, 0.84f, 1.96f, 1.96f, 1.96f, 3.44f)
                verticalLineTo(19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.75f)
                curveToRelative(0f, -2.02f, -3.5f, -3.17f, -5.96f, -3.44f)
                close()
                moveTo(15f, 12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(16.93f, 5f, 15f, 5f)
                curveToRelative(-0.54f, 0f, -1.04f, 0.13f, -1.5f, 0.35f)
                curveToRelative(0.63f, 0.89f, 1f, 1.98f, 1f, 3.15f)
                reflectiveCurveToRelative(-0.37f, 2.26f, -1f, 3.15f)
                curveToRelative(0.46f, 0.22f, 0.96f, 0.35f, 1.5f, 0.35f)
                close()
            }
        }.build()
        
        return _Group!!
    }

private var _Group: ImageVector? = null

