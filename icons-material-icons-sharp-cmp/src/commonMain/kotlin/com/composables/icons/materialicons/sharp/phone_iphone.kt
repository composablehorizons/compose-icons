package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phone_iphone: ImageVector
    get() {
        if (_Phone_iphone != null) return _Phone_iphone!!
        
        _Phone_iphone = ImageVector.Builder(
            name = "phone_iphone",
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
                moveTo(18f, 1f)
                horizontalLineTo(5f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(13f)
                verticalLineTo(1f)
                close()
                moveToRelative(-6.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveToRelative(4.5f, -4f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Phone_iphone!!
    }

private var _Phone_iphone: ImageVector? = null

