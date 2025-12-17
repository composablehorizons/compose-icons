package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandPointer: ImageVector
    get() {
        if (_HandPointer != null) return _HandPointer!!
        
        _HandPointer = ImageVector.Builder(
            name = "hand-pointer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 240f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 3.084f, -0.356f, 6.159f, -1.063f, 9.162f)
                lineToRelative(-32f, 136f)
                curveTo(410.686f, 499.23f, 394.562f, 512f, 376f, 512f)
                horizontalLineTo(168f)
                arcToRelative(40.004f, 40.004f, 0f, false, true, -32.35f, -16.473f)
                lineToRelative(-127.997f, -176f)
                curveToRelative(-12.993f, -17.866f, -9.043f, -42.883f, 8.822f, -55.876f)
                curveToRelative(17.867f, -12.994f, 42.884f, -9.043f, 55.877f, 8.823f)
                lineTo(104f, 315.992f)
                verticalLineTo(40f)
                curveToRelative(0f, -22.091f, 17.908f, -40f, 40f, -40f)
                reflectiveCurveToRelative(40f, 17.909f, 40f, 40f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -22.091f, 17.908f, -40f, 40f, -40f)
                reflectiveCurveToRelative(40f, 17.909f, 40f, 40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -22.091f, 17.908f, -40f, 40f, -40f)
                reflectiveCurveToRelative(40f, 17.909f, 40f, 40f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, -22.091f, 17.908f, -40f, 40f, -40f)
                reflectiveCurveToRelative(40f, 17.909f, 40f, 40f)
                close()
                moveToRelative(-256f, 80f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-96f)
                close()
                moveToRelative(88f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-96f)
                close()
                moveToRelative(88f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-96f)
                close()
            }
        }.build()
        
        return _HandPointer!!
    }

private var _HandPointer: ImageVector? = null

