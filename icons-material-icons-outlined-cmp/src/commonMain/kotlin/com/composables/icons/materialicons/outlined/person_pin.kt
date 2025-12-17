package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Person_pin: ImageVector
    get() {
        if (_Person_pin != null) return _Person_pin!!
        
        _Person_pin = ImageVector.Builder(
            name = "person_pin",
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
                moveTo(19f, 2f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-0.59f, 0.59f)
                lineTo(12f, 20.17f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(-0.58f, -0.58f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-7f, -7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveToRelative(0f, -4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(6f, 8.58f)
                curveToRelative(0f, -2.5f, -3.97f, -3.58f, -6f, -3.58f)
                reflectiveCurveToRelative(-6f, 1.08f, -6f, 3.58f)
                verticalLineTo(17f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.42f)
                close()
                moveTo(8.48f, 15f)
                curveToRelative(0.74f, -0.51f, 2.23f, -1f, 3.52f, -1f)
                reflectiveCurveToRelative(2.78f, 0.49f, 3.52f, 1f)
                horizontalLineTo(8.48f)
                close()
            }
        }.build()
        
        return _Person_pin!!
    }

private var _Person_pin: ImageVector? = null

