package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Contact_phone: ImageVector
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
                moveTo(23.99f, 3f)
                horizontalLineTo(0f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(24f)
                lineToRelative(-0.01f, -18f)
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
                horizontalLineToRelative(1.64f)
                lineTo(21f, 16f)
                lineToRelative(-1.99f, 1.99f)
                curveToRelative(-1.31f, -0.98f, -2.28f, -2.38f, -2.73f, -3.99f)
                curveToRelative(-0.18f, -0.64f, -0.28f, -1.31f, -0.28f, -2f)
                reflectiveCurveToRelative(0.1f, -1.36f, 0.28f, -2f)
                curveToRelative(0.45f, -1.62f, 1.42f, -3.01f, 2.73f, -3.99f)
                lineTo(21f, 8f)
                lineToRelative(-1.51f, 2f)
                horizontalLineToRelative(-1.64f)
                curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2f)
                reflectiveCurveToRelative(0.13f, 1.37f, 0.35f, 2f)
                close()
            }
        }.build()
        
        return _Contact_phone!!
    }

private var _Contact_phone: ImageVector? = null

