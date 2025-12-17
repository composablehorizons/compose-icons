package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CookieMan: ImageVector
    get() {
        if (_CookieMan != null) return _CookieMan!!
        
        _CookieMan = ImageVector.Builder(
            name = "cookie-man",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.007f, 1f)
                lineToRelative(0.238f, 0.005f)
                arcToRelative(6f, 6f, 0f, false, true, 5.405f, 3.974f)
                lineToRelative(0.078f, 0.233f)
                arcToRelative(6f, 6f, 0f, false, true, -0.182f, 4.08f)
                lineToRelative(-0.093f, 0.21f)
                lineToRelative(0.05f, -0.002f)
                arcToRelative(2.94f, 2.94f, 0f, false, true, 2.638f, 1.511f)
                lineToRelative(0.081f, 0.158f)
                arcToRelative(2.887f, 2.887f, 0f, false, true, -1.234f, 3.764f)
                lineToRelative(-0.19f, 0.096f)
                lineToRelative(-1.798f, 0.821f)
                verticalLineToRelative(0.963f)
                lineToRelative(1.166f, 1.166f)
                lineToRelative(0.14f, 0.154f)
                arcToRelative(2.96f, 2.96f, 0f, false, true, -0.17f, 4.002f)
                curveToRelative(-1.087f, 1.088f, -2.827f, 1.161f, -4.03f, 0.144f)
                lineToRelative(-0.16f, -0.146f)
                lineToRelative(-1.946f, -1.948f)
                lineToRelative(-1.946f, 1.947f)
                arcToRelative(2.96f, 2.96f, 0f, false, true, -3.95f, 0.22f)
                lineToRelative(-0.15f, -0.128f)
                curveToRelative(-1.17f, -1.073f, -1.284f, -2.879f, -0.234f, -4.12f)
                lineToRelative(0.146f, -0.158f)
                lineToRelative(1.134f, -1.134f)
                verticalLineToRelative(-0.962f)
                lineToRelative(-1.834f, -0.84f)
                lineToRelative(-0.181f, -0.093f)
                arcToRelative(2.88f, 2.88f, 0f, false, true, -1.205f, -3.75f)
                arcToRelative(2.93f, 2.93f, 0f, false, true, 2.646f, -1.661f)
                lineToRelative(0.13f, 0.003f)
                lineToRelative(-0.03f, -0.064f)
                arcToRelative(6.1f, 6.1f, 0f, false, true, -0.503f, -1.968f)
                lineToRelative(-0.017f, -0.26f)
                verticalLineToRelative(-0.217f)
                arcToRelative(6f, 6f, 0f, false, true, 5.775f, -5.996f)
                lineToRelative(0.224f, -0.004f)
                close()
                moveToRelative(0.003f, 15f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(0f, -3f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(0f, -5f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-2f, -3f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _CookieMan!!
    }

private var _CookieMan: ImageVector? = null

