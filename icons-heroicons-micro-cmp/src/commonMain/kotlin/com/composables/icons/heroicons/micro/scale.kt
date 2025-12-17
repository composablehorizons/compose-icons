package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Scale: ImageVector
    get() {
        if (_Scale != null) return _Scale!!
        
        _Scale = ImageVector.Builder(
            name = "scale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.75f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.508f)
                arcToRelative(32.661f, 32.661f, 0f, false, false, -4.624f, 0.434f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.246f, 1.48f)
                lineToRelative(0.13f, -0.021f)
                lineToRelative(-1.188f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.33f, 0.817f)
                arcTo(3.487f, 3.487f, 0f, false, false, 4f, 11f)
                curveToRelative(0.68f, 0f, 1.318f, -0.195f, 1.856f, -0.532f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.33f, -0.818f)
                lineToRelative(-1.25f, -5f)
                arcToRelative(31.31f, 31.31f, 0f, false, true, 2.314f, -0.141f)
                verticalLineTo(12.012f)
                curveToRelative(-0.882f, 0.027f, -1.752f, 0.104f, -2.607f, 0.226f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.213f, 1.485f)
                arcToRelative(22.188f, 22.188f, 0f, false, true, 6.288f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0.213f, -1.485f)
                arcToRelative(23.657f, 23.657f, 0f, false, false, -2.607f, -0.226f)
                verticalLineTo(4.509f)
                curveToRelative(0.779f, 0.018f, 1.55f, 0.066f, 2.314f, 0.14f)
                lineTo(9.814f, 9.65f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.329f, 0.818f)
                arcToRelative(3.487f, 3.487f, 0f, false, false, 1.856f, 0.532f)
                curveToRelative(0.68f, 0f, 1.318f, -0.195f, 1.856f, -0.532f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.33f, -0.818f)
                lineTo(12.997f, 4.9f)
                lineToRelative(0.13f, 0.022f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0.247f, -1.48f)
                arcToRelative(32.66f, 32.66f, 0f, false, false, -4.624f, -0.434f)
                verticalLineTo(2.5f)
                close()
                moveTo(3.42f, 9.415f)
                arcToRelative(2f, 2f, 0f, false, false, 1.16f, 0f)
                lineTo(4f, 7.092f)
                lineToRelative(-0.58f, 2.323f)
                close()
                moveTo(12f, 9.5f)
                arcToRelative(2f, 2f, 0f, false, true, -0.582f, -0.085f)
                lineTo(12f, 7.092f)
                lineToRelative(0.58f, 2.323f)
                arcTo(2f, 2f, 0f, false, true, 12f, 9.5f)
                close()
            }
        }.build()
        
        return _Scale!!
    }

private var _Scale: ImageVector? = null

