package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Bottle: ImageVector
    get() {
        if (_Bottle != null) return _Bottle!!
        
        _Bottle = ImageVector.Builder(
            name = "bottle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 1f)
                arcToRelative(2f, 2f, 0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.317f, 0.381f, 2.604f, 1.094f, 3.705f)
                lineToRelative(0.17f, 0.25f)
                lineToRelative(0.05f, 0.072f)
                arcToRelative(9.093f, 9.093f, 0f, false, true, 1.68f, 4.92f)
                lineToRelative(0.006f, 0.354f)
                verticalLineToRelative(6.199f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-6.2f)
                arcToRelative(9.1f, 9.1f, 0f, false, true, 1.486f, -4.982f)
                lineToRelative(0.2f, -0.292f)
                lineToRelative(0.05f, -0.069f)
                arcToRelative(6.823f, 6.823f, 0f, false, false, 1.264f, -3.957f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2f, 2f, 0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(0.362f, 5f)
                horizontalLineToRelative(-2.724f)
                arcToRelative(8.827f, 8.827f, 0f, false, true, -1.08f, 2.334f)
                lineToRelative(-0.194f, 0.284f)
                lineToRelative(-0.05f, 0.069f)
                arcToRelative(7.091f, 7.091f, 0f, false, false, -1.307f, 3.798f)
                lineToRelative(-0.003f, 0.125f)
                arcToRelative(3.33f, 3.33f, 0f, false, true, 1.975f, -0.61f)
                arcToRelative(3.4f, 3.4f, 0f, false, true, 2.833f, 1.417f)
                curveToRelative(0.27f, 0.375f, 0.706f, 0.593f, 1.209f, 0.583f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, 1.166f, -0.583f)
                arcToRelative(3.4f, 3.4f, 0f, false, true, 0.81f, -0.8f)
                lineToRelative(0.003f, 0.183f)
                curveToRelative(0f, -1.37f, -0.396f, -2.707f, -1.137f, -3.852f)
                lineToRelative(-0.228f, -0.332f)
                arcToRelative(8.827f, 8.827f, 0f, false, true, -1.273f, -2.616f)
                close()
            }
        }.build()
        
        return _Bottle!!
    }

private var _Bottle: ImageVector? = null

