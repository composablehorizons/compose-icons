package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Contact_mail: ImageVector
    get() {
        if (_Contact_mail != null) return _Contact_mail!!
        
        _Contact_mail = ImageVector.Builder(
            name = "contact_mail",
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
                moveTo(21f, 8f)
                verticalLineTo(7f)
                lineToRelative(-3f, 2f)
                lineToRelative(-3f, -2f)
                verticalLineToRelative(1f)
                lineToRelative(3f, 2f)
                lineToRelative(3f, -2f)
                close()
                moveToRelative(3f, -5f)
                horizontalLineTo(0f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(23.99f)
                lineTo(24f, 3f)
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
                moveToRelative(8f, -6f)
                horizontalLineToRelative(-8f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Contact_mail!!
    }

private var _Contact_mail: ImageVector? = null

