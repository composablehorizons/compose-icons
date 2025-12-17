package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Home: ImageVector
    get() {
        if (_Home != null) return _Home!!
        
        _Home = ImageVector.Builder(
            name = "home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.707f, 2.293f)
                lineToRelative(9f, 9f)
                curveToRelative(0.63f, 0.63f, 0.184f, 1.707f, -0.707f, 1.707f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                arcToRelative(3f, 3f, 0f, false, false, -2.824f, -2.995f)
                lineToRelative(-0.176f, -0.005f)
                horizontalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.89f, 0f, -1.337f, -1.077f, -0.707f, -1.707f)
                lineToRelative(9f, -9f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                moveToRelative(0.293f, 11.707f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                close()
            }
        }.build()
        
        return _Home!!
    }

private var _Home: ImageVector? = null

