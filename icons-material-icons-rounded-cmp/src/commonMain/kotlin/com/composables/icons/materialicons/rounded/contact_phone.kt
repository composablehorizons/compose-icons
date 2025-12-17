package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Contact_phone: ImageVector
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
                moveTo(8f, 6f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveToRelative(6f, 12f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2f, 4f, -3.1f, 6f, -3.1f)
                reflectiveCurveToRelative(6f, 1.1f, 6f, 3.1f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(3.85f, -4f)
                horizontalLineToRelative(1.39f)
                curveToRelative(0.16f, 0f, 0.3f, 0.07f, 0.4f, 0.2f)
                lineToRelative(1.1f, 1.45f)
                curveToRelative(0.15f, 0.2f, 0.13f, 0.48f, -0.05f, 0.65f)
                lineToRelative(-1.36f, 1.36f)
                curveToRelative(-0.18f, 0.18f, -0.48f, 0.2f, -0.67f, 0.04f)
                curveToRelative(-1.13f, -0.96f, -1.97f, -2.25f, -2.38f, -3.71f)
                curveToRelative(-0.18f, -0.63f, -0.28f, -1.3f, -0.28f, -1.99f)
                reflectiveCurveToRelative(0.1f, -1.36f, 0.28f, -2f)
                curveToRelative(0.41f, -1.47f, 1.25f, -2.75f, 2.38f, -3.71f)
                curveToRelative(0.2f, -0.17f, 0.49f, -0.14f, 0.67f, 0.04f)
                lineToRelative(1.36f, 1.36f)
                curveToRelative(0.18f, 0.18f, 0.2f, 0.46f, 0.05f, 0.65f)
                lineToRelative(-1.1f, 1.45f)
                curveToRelative(-0.09f, 0.13f, -0.24f, 0.2f, -0.4f, 0.2f)
                horizontalLineToRelative(-1.39f)
                curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2f)
                reflectiveCurveToRelative(0.13f, 1.38f, 0.35f, 2.01f)
                close()
            }
        }.build()
        
        return _Contact_phone!!
    }

private var _Contact_phone: ImageVector? = null

