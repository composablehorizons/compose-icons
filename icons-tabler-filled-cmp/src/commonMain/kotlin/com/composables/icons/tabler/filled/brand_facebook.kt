package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandFacebook: ImageVector
    get() {
        if (_BrandFacebook != null) return _BrandFacebook!!
        
        _BrandFacebook = ImageVector.Builder(
            name = "brand-facebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.991f, 1.131f)
                lineToRelative(-0.02f, 0.112f)
                lineToRelative(-1f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.858f, 0.75f)
                lineToRelative(-0.113f, 0.007f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                arcToRelative(6f, 6f, 0f, false, true, 5.775f, -5.996f)
                lineToRelative(0.225f, -0.004f)
                horizontalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _BrandFacebook!!
    }

private var _BrandFacebook: ImageVector? = null

