package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandLinkedin: ImageVector
    get() {
        if (_BrandLinkedin != null) return _BrandLinkedin!!
        
        _BrandLinkedin = ImageVector.Builder(
            name = "brand-linkedin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                verticalLineToRelative(10f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineToRelative(-10f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                verticalLineToRelative(-10f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, -5f)
                close()
                moveToRelative(-9f, 8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(6f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -1.168f, 0.236f)
                lineToRelative(-0.125f, 0.057f)
                arcToRelative(1f, 1f, 0f, false, false, -1.707f, 0.707f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                moveToRelative(-6f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, 0.117f)
                lineToRelative(0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _BrandLinkedin!!
    }

private var _BrandLinkedin: ImageVector? = null

