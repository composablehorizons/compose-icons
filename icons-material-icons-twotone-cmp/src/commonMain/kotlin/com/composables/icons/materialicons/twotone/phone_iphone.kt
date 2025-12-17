package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Phone_iphone: ImageVector
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
                moveTo(7f, 4f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(14f)
                horizontalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 1f)
                horizontalLineToRelative(-8f)
                curveTo(6.12f, 1f, 5f, 2.12f, 5f, 3.5f)
                verticalLineToRelative(17f)
                curveTo(5f, 21.88f, 6.12f, 23f, 7.5f, 23f)
                horizontalLineToRelative(8f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-17f)
                curveTo(18f, 2.12f, 16.88f, 1f, 15.5f, 1f)
                close()
                moveToRelative(-4f, 21f)
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

