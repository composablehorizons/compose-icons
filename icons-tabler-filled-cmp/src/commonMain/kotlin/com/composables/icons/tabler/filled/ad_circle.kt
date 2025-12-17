package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.AdCircle: ImageVector
    get() {
        if (_AdCircle != null) return _AdCircle!!
        
        _AdCircle = ImageVector.Builder(
            name = "ad-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                curveToRelative(-5.43f, 0f, -9.848f, -4.327f, -9.996f, -9.72f)
                lineToRelative(-0.004f, -0.28f)
                lineToRelative(0.004f, -0.28f)
                curveToRelative(0.148f, -5.393f, 4.566f, -9.72f, 9.996f, -9.72f)
                close()
                moveToRelative(-3.5f, 6f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.495f, 2.336f)
                lineToRelative(-0.005f, 0.164f)
                verticalLineToRelative(4.5f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-0.005f, -0.164f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.495f, -2.336f)
                close()
                moveToRelative(6.5f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
                moveToRelative(0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(-6.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.492f, 0.41f)
                lineToRelative(0.008f, 0.09f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                lineToRelative(0.008f, -0.09f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.492f, -0.41f)
                close()
            }
        }.build()
        
        return _AdCircle!!
    }

private var _AdCircle: ImageVector? = null

