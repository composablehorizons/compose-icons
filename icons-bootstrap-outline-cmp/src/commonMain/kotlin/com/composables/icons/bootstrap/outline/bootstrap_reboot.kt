package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BootstrapReboot: ImageVector
    get() {
        if (_BootstrapReboot != null) return _BootstrapReboot!!
        
        _BootstrapReboot = ImageVector.Builder(
            name = "bootstrap-reboot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.161f, 8f)
                arcToRelative(6.84f, 6.84f, 0f, true, false, 6.842f, -6.84f)
                arcToRelative(0.58f, 0.58f, 0f, true, true, 0f, -1.16f)
                arcToRelative(8f, 8f, 0f, true, true, -6.556f, 3.412f)
                lineToRelative(-0.663f, -0.577f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, 0.227f, -0.997f)
                lineToRelative(2.52f, -0.69f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, 0.728f, 0.633f)
                lineToRelative(-0.332f, 2.592f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, -0.956f, 0.364f)
                lineToRelative(-0.643f, -0.56f)
                arcTo(6.8f, 6.8f, 0f, false, false, 1.16f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.641f, 11.671f)
                verticalLineTo(8.843f)
                horizontalLineToRelative(1.57f)
                lineToRelative(1.498f, 2.828f)
                horizontalLineToRelative(1.314f)
                lineTo(9.377f, 8.665f)
                curveToRelative(0.897f, -0.3f, 1.427f, -1.106f, 1.427f, -2.1f)
                curveToRelative(0f, -1.37f, -0.943f, -2.246f, -2.456f, -2.246f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(7.352f)
                close()
                moveToRelative(0f, -3.75f)
                verticalLineTo(5.277f)
                horizontalLineToRelative(1.57f)
                curveToRelative(0.881f, 0f, 1.416f, 0.499f, 1.416f, 1.32f)
                curveToRelative(0f, 0.84f, -0.504f, 1.324f, -1.386f, 1.324f)
                close()
            }
        }.build()
        
        return _BootstrapReboot!!
    }

private var _BootstrapReboot: ImageVector? = null

