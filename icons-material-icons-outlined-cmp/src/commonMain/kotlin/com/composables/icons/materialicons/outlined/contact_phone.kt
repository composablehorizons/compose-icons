package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Contact_phone: ImageVector
    get() {
        if (_Contact_phone != null) return _Contact_phone!!
        
        _Contact_phone = ImageVector.Builder(
            name = "contact_phone",
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
                moveTo(22f, 3f)
                horizontalLineTo(2f)
                curveTo(0.9f, 3f, 0f, 3.9f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(20f)
                curveToRelative(1.1f, 0f, 1.99f, -0.9f, 1.99f, -2f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-2.99f, -1.01f)
                lineTo(21f, 16f)
                lineToRelative(-1.51f, -2f)
                horizontalLineToRelative(-1.64f)
                curveToRelative(-0.22f, -0.63f, -0.35f, -1.3f, -0.35f, -2f)
                reflectiveCurveToRelative(0.13f, -1.37f, 0.35f, -2f)
                horizontalLineToRelative(1.64f)
                lineTo(21f, 8f)
                lineToRelative(-1.99f, -1.99f)
                curveToRelative(-1.31f, 0.98f, -2.28f, 2.37f, -2.73f, 3.99f)
                curveToRelative(-0.18f, 0.64f, -0.28f, 1.31f, -0.28f, 2f)
                reflectiveCurveToRelative(0.1f, 1.36f, 0.28f, 2f)
                curveToRelative(0.45f, 1.61f, 1.42f, 3.01f, 2.73f, 3.99f)
                close()
                moveTo(9f, 12f)
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
                moveToRelative(6f, 8.59f)
                curveToRelative(0f, -2.5f, -3.97f, -3.58f, -6f, -3.58f)
                reflectiveCurveToRelative(-6f, 1.08f, -6f, 3.58f)
                verticalLineTo(18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.41f)
                close()
                moveTo(5.48f, 16f)
                curveToRelative(0.74f, -0.5f, 2.22f, -1f, 3.52f, -1f)
                reflectiveCurveToRelative(2.77f, 0.49f, 3.52f, 1f)
                horizontalLineTo(5.48f)
                close()
            }
        }.build()
        
        return _Contact_phone!!
    }

private var _Contact_phone: ImageVector? = null

