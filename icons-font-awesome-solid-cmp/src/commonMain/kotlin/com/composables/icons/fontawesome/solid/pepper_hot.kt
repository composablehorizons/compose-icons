package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PepperHot: ImageVector
    get() {
        if (_PepperHot != null) return _PepperHot!!
        
        _PepperHot = ImageVector.Builder(
            name = "pepper-hot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(330.67f, 263.12f)
                verticalLineTo(173.4f)
                lineToRelative(-52.75f, -24.22f)
                curveTo(219.44f, 218.76f, 197.58f, 400f, 56f, 400f)
                arcToRelative(56f, 56f, 0f, false, false, 0f, 112f)
                curveToRelative(212.64f, 0f, 370.65f, -122.87f, 419.18f, -210.34f)
                lineToRelative(-37.05f, -38.54f)
                close()
                moveToRelative(131.09f, -128.37f)
                curveTo(493.92f, 74.91f, 477.18f, 26.48f, 458.62f, 3f)
                arcToRelative(8f, 8f, 0f, false, false, -11.93f, -0.59f)
                lineToRelative(-22.9f, 23f)
                arcToRelative(8.06f, 8.06f, 0f, false, false, -0.89f, 10.23f)
                curveToRelative(6.86f, 10.36f, 17.05f, 35.1f, -1.4f, 72.32f)
                arcTo(142.85f, 142.85f, 0f, false, false, 364.34f, 96f)
                curveToRelative(-28f, 0f, -54f, 8.54f, -76.34f, 22.59f)
                lineToRelative(74.67f, 34.29f)
                verticalLineToRelative(78.24f)
                horizontalLineToRelative(89.09f)
                lineTo(506.44f, 288f)
                curveToRelative(3.26f, -12.62f, 5.56f, -25.63f, 5.56f, -39.31f)
                arcToRelative(154f, 154f, 0f, false, false, -50.24f, -113.94f)
                close()
            }
        }.build()
        
        return _PepperHot!!
    }

private var _PepperHot: ImageVector? = null

